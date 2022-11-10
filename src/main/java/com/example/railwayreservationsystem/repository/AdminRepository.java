package com.example.railwayreservationsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.railwayreservationsystem.entity.Admin;


public interface AdminRepository extends JpaRepository<Admin, Integer> {

	
	List<Admin>  findAdminByUserNameAndPassword(String userName,String password);
	
	

}
