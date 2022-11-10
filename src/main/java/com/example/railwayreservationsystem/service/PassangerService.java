package com.example.railwayreservationsystem.service;

import java.util.List;

import com.example.railwayreservationsystem.entity.Passanger;

public interface PassangerService {
	
		public List<Passanger> findAll();
		
		public Passanger findById(long passangerId) throws Exception;
		
		public Passanger save(Passanger thePassanger);
		
		public String deleteById(long passangerId) throws Exception;

		public List<Passanger> findAdminByUserNameAndPassword(String passangeruserName, String passangerpassword);

	}





