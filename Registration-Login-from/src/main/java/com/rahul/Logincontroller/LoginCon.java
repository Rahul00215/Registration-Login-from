package com.rahul.Logincontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.LoginService.LoginServ;
import com.rahul.Model.StudentMod;

@RestController
public class LoginCon {
	@Autowired
	LoginServ ls;

	@GetMapping("/login")
	public String login(@RequestParam("username") String username,
			
			@RequestParam("password") int password) {

		return ls.login(username, password);
	}

}
