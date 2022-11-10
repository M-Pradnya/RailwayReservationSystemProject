package com.example.railwayreservationsystem.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.railwayreservationsystem.dao.PassangerRepository;
import com.example.railwayreservationsystem.entity.Passanger;

@Service
public class PassangerServiceImpl implements PassangerService {
	
	PassangerRepository passangerRepository;
	
	@Autowired //injecting EmployeeRepository dependency
	public PassangerServiceImpl( PassangerRepository passangerRepository) {
		super();
		this.passangerRepository = passangerRepository;
	}

	
	@Override
	public List<Passanger> findAll() {
		// TODO Auto-generated method stub
		return passangerRepository.findAll();
	}

	
	@Override
	public Passanger findById(long passangerId) throws Exception {
		// TODO Auto-generated method stub
		Optional<Passanger> result = passangerRepository.findById(passangerId);
		
		Passanger thePassanger;
		if(result.isPresent())
		{
			thePassanger = result.get();
		}
		else {
			throw new Exception("user id not found : "+passangerId);
		}
		return thePassanger;
	}

	
	@Override
	public Passanger save(Passanger thePassanger) {
		return passangerRepository.save(thePassanger);

	}

	@Override
	public String deleteById(long passangerId)throws Exception {
		
		Passanger passanger= findById(passangerId);
		
		if(passanger == null) {
			
			throw new Exception("Passanger id not found : "+passangerId);
			
		}
		passangerRepository.deleteById(passangerId);
		return "Deleted ID : "+passangerId;
		// TODO Auto-generated method stub

	}


	public List<Passanger> findAdminByUserNameAndPassword(String passangeruserName, String passangerpassword) {
		// TODO Auto-generated method stub
		return passangerRepository.findAdminByUserNameAndPassword(passangeruserName, passangerpassword);
	}

}
