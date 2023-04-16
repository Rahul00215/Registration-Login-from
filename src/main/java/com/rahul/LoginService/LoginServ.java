package com.rahul.LoginService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.Model.StudentMod;
import com.rahul.Repository.StudentRepo;

@Service
public class LoginServ {

	@Autowired
	StudentRepo sr;

	public String login( String username,int password) {
		
		Optional<StudentMod> user= sr.findByusername(username);
		
//		Optional <StudentMod>pass = sr.findBypassword(std.getPassword());
		
		if(user.isPresent()) {
		
			if(user.get().getPassword()==password) {
				return "welcome";
				
			}
			else {
				return "wrong password";
			}
		}
		else {
			return "user is not avilable";
		}
		
	}
	
	
}
