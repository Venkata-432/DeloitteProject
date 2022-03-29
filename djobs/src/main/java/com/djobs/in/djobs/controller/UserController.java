package com.djobs.in.djobs.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.djobs.in.djobs.entity.FreeLancer;
import com.djobs.in.djobs.service.FreelancerService;

@RestController
public class UserController {
	
	@Autowired
	private FreelancerService frService;
	

	@GetMapping("/login/{username}/{password}")
	public HashMap<String,Object> login(@PathVariable String userName,@PathVariable String password) {
		FreeLancer fr=frService.findByCredentials(userName,password);
		String msg="";
		String status="";
		HashMap<String,Object> hm=new HashMap<String,Object> ();
		if(fr!=null) {
			msg= "User Logged in Successfully";
			status="success";
		}else {
			msg= "User credentials are invalid";
			status="error";
		}
		
		hm.put("status",status);
		hm.put("msg",msg);
		
		return hm;
	}
}
 