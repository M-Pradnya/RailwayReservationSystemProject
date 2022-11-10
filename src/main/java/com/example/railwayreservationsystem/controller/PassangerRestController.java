package com.example.railwayreservationsystem.controller;

import java.util.List;


import javax.annotation.PostConstruct;
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

import com.example.railwayreservationsystem.entity.Passanger;
import com.example.railwayreservationsystem.service.PassangerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class PassangerRestController {
		
	
		 private PassangerService passangerService;

		 
		 @Autowired
		 public PassangerRestController (PassangerService passangerService) {
			 
			 this.passangerService = passangerService;
		 }
		 
	
		 @GetMapping("/passangers")
		 public List<Passanger> findAll(){
			
			 return passangerService.findAll();
			 
		 }
		
		 
		 @GetMapping("/passangers/{passangerId}")
		 public Passanger findById(@PathVariable long passangerId)
		 {
			 Passanger passanger = null;
			 try {
				 passanger = passangerService.findById(passangerId);
			}catch (Exception e) {
				e.printStackTrace();
			}
			 
			 return passanger;
		 }


		 @GetMapping("/passangers/{passangeruserName}/{passangerpassword}")
			public List<Passanger> findAdminByUsernameAndPassword(@PathVariable String passangeruserName,@PathVariable String passangerpassword) {
				
				return passangerService.findAdminByUserNameAndPassword(passangeruserName, passangerpassword);
				
			}
	    
	     @PostMapping("/passangers")
	     public Passanger addPassanger( @Valid @RequestBody  Passanger thePassanger)
	     {
	    	 thePassanger.setId(0);
	    	 System.out.println(thePassanger);
	    	  Passanger passangerThe = passangerService.save(thePassanger);
	    	  System.out.println(passangerThe);
	    	 return passangerThe;
	    	 
	    }
	  
	    
	 	@PutMapping("/passangers")
	 	public Passanger updatePassanger(@RequestBody @Valid Passanger thePassanger)
	 	{
	 		passangerService.save(thePassanger);
	 		return thePassanger;
	 	}
	 	
	     
	 	
	 		@DeleteMapping("passangers/{passangerId}")
	 		public String deletePassanger(@PathVariable long passangerId)//theId=5
	 		{
	 			String msg="";
	 			try {
	 				msg = passangerService.deleteById(passangerId);
	 			} catch (Exception e) {
	 				// TODO Auto-generated catch block
	 				e.printStackTrace();
	 			}
	 			return msg;
	 		} 
	     
	       
	     
	     
}   


