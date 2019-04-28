package com.annguo.clientsoft.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.annguo.clientsoft.customer.dao.CustomerLoginDao;
import com.annguo.clientsoft.customer.entity.CustomerLogin;
import com.annguo.clientsoft.customer.service.CustomerLoginService;
import com.annguo.clientsoft.exceptionutil.CustomerException;

@Service
public class CustomerLoginServiceImpl implements CustomerLoginService{
	
	@Autowired
	private CustomerLoginDao customerLoginDao;
	
	@Override
	public Integer insertCustomerInf(CustomerLogin customerLogin) {
		return null;
	}

	@Override
	public CustomerLogin customerLogin(String loginName, String password) throws CustomerException {
		if(loginName.equals("")){
			throw new CustomerException("用户名不能为空");
		}
		if(password.equals("")){
			throw new CustomerException("密码不能为空");
		}
		
		CustomerLogin customer = customerLoginDao.validaCustomerLogin(loginName);
		if(customer == null){
			System.out.println("用户名错误");
		}
		if(customer.getPassword().equals(password)){
			return customer;
		} else {
			System.out.println("密码错误");
		}
		
		return null;
	}

}
