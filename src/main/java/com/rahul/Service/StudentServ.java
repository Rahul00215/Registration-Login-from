package com.rahul.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.Model.StudentMod;
import com.rahul.Repository.StudentRepo;

@Service
public class StudentServ {
   @Autowired
	StudentRepo sr;
	
	public String useradd(StudentMod std) {
		
		Optional<StudentMod> user= sr.findByusername(std.getUsername());
		
		if(user.isPresent()) {
			return "user  is already exit";
		}
		else
			sr.save(std);
		return "user register succefully";
		
	}

	
	
}
