package com.example.railwayreservationsystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.railwayreservationsystem.entity.Admin;
import com.example.railwayreservationsystem.service.AdminService;


@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class AdminRestController {
	
	private AdminService adminService;

	@Autowired
	public AdminRestController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}
	
	
	@GetMapping("/findAdminByUsernameAndPassword/{userName}/{password}")
	public List<Admin>  findAdminByUsernameAndPassword(@PathVariable String userName,@PathVariable String password) {
		
		return adminService.findAdminByUserNameAndPassword(userName, password);
		
	}
	
	
	
	@GetMapping("/admins")
	public List<Admin> findAll()
	{
		return adminService.findAll();
	}
	
	
	@PostMapping("/admins")
	public Admin addEmployee(@Valid @RequestBody Admin theAdmin)
	{
		
		theAdmin.setId(0);
		adminService.save(theAdmin);
		return theAdmin;
	}
	@PutMapping("/admins")
	public Admin updateEmployee(@Valid @RequestBody Admin theAdmin)
	{
		adminService.save(theAdmin);
		return theAdmin;
	}
	
	
	
	@DeleteMapping("/admins/{theId}")
	public String deleteEmployee(@PathVariable int theId)
	{
	
		String msg = "";
		try {
			msg = adminService.deleteById(theId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg;
	}
	

}
