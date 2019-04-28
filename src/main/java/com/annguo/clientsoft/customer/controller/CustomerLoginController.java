package com.annguo.clientsoft.customer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.annguo.clientsoft.commonapi.Response;
import com.annguo.clientsoft.customer.entity.CustomerLogin;
import com.annguo.clientsoft.customer.service.CustomerLoginService;
import com.annguo.clientsoft.exceptionutil.CustomerException;

@RestController
@RequestMapping("/login")
public class CustomerLoginController {
	
	@Autowired
	private CustomerLoginService customerLoginService;
	
	@RequestMapping(value="/customerLogin",method=RequestMethod.POST)
	public Response<CustomerLogin> Login(HttpServletRequest request,@RequestBody CustomerLogin customerLogin) throws CustomerException{
		CustomerLogin customer = customerLoginService.customerLogin(customerLogin.getLoginName(), customerLogin.getPassword());
		return new Response<CustomerLogin>("0", "TRUE", "SUCCESS", customer);
	}
}
