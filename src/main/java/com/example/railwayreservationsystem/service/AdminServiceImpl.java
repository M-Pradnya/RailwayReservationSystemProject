package com.example.railwayreservationsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.railwayreservationsystem.entity.Admin;
import com.example.railwayreservationsystem.repository.AdminRepository;


@Service
public class AdminServiceImpl implements AdminService {
	
	private AdminRepository adminRepository;
	
	
	@Autowired
	public AdminServiceImpl(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}




	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		
		return adminRepository.findAll();
	}



	@Override
	public Admin findById(int theId) throws Exception {
		// TODO Auto-generated method stub
	Optional<Admin> result = adminRepository.findById(theId);
		
		Admin theEmployee =null;
		if(result.isPresent())
		{
			theEmployee = result.get();
		}
		else {
			throw new Exception("employee id not found : "+theId);
		}
		return theEmployee;
	}
	
	

	@Override
	public Admin save(Admin theAdmin) {
		return adminRepository.save(theAdmin);
		
	}
	
	



	@Override
	public String deleteById(int theId) throws Exception {
		// TODO Auto-generated method stub
	Admin employee= findById(theId);
		
		if(employee==null)
		{
			throw new Exception("Employee id not found: "+theId);
		}
		adminRepository.deleteById(theId);
		
		return "Delete Employee Id : "+theId;	
		}




	@Override
	public List<Admin> findAdminByUserNameAndPassword(String userName,String password) {
		
		return adminRepository.findAdminByUserNameAndPassword(userName, password);
	}
	

}
