package com.vishnu.secure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String ShowHome() {
		return "HomePage";
	}
	
	@GetMapping("/welcome")
	public String ShowWelcome() {
		return "WelcomePage";
	}
	
	@GetMapping("/admin")
	public String ShowAdmin() {
		return "AdminPage";
	}
	
	@GetMapping("/emp")
	public String ShowEmp() {
		return "EmployeePage";
	}
	
	@GetMapping("/std")
	public String ShowStd() {
		return "StudentPage";
	}
	
	@GetMapping("/denied")
	public String ShowDenied() {
		return "DeniedPage";
	}

}
