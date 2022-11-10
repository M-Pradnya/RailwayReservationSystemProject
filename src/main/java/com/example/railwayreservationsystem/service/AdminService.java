package com.example.railwayreservationsystem.service;

import java.util.List;

import com.example.railwayreservationsystem.entity.Admin;


public interface AdminService {
	
	public List<Admin> findAll();
	
	public Admin findById(int theId) throws Exception;
	
	public Admin save(Admin theAdmin);
	
	public String deleteById(int theId) throws Exception;
	
	public List<Admin> findAdminByUserNameAndPassword(String userName,String password);
	
	

}
