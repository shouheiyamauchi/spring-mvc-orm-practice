package com.shouhei.spring.springmvcorm.user.controller;

import org.springframework.stereotype.Controller;

import com.shouhei.spring.springmvcorm.user.services.UserService;

@Controller
public class UserController {
	private UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

}
