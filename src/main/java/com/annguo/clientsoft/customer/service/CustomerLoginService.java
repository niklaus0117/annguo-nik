package com.annguo.clientsoft.customer.service;

import com.annguo.clientsoft.customer.entity.CustomerLogin;
import com.annguo.clientsoft.exceptionutil.CustomerException;

public interface CustomerLoginService {
	
	Integer insertCustomerInf(CustomerLogin customerLogin);
	
	CustomerLogin customerLogin(String loginName,String password) throws CustomerException;
}
