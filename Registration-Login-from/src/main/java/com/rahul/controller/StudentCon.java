package com.rahul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.Model.StudentMod;
import com.rahul.Service.StudentServ;

@RestController
public class StudentCon {

	@Autowired
	StudentServ ss;
	
	
	@PostMapping("/student")
   public String useradd(@RequestBody StudentMod std) {
		
	return ss.useradd(std);
	   
		
   }
}
