package com.example.railwayreservationsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.railwayreservationsystem.entity.Passanger;

public interface PassangerRepository extends JpaRepository<Passanger, Long>{

	
	List<Passanger> findAdminByUserNameAndPassword(String passangeruserName, String passangerpassword);


}


