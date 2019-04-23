package com.annguo.clientsoft.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.annguo.clientsoft.user.entity.User;
import com.annguo.clientsoft.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/selectUser")
	public User selectUser(){
		return userService.selectUser();
	}
}
