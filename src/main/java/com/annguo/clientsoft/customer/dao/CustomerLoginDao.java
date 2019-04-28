package com.annguo.clientsoft.customer.dao;

import org.apache.ibatis.annotations.Param;

import com.annguo.clientsoft.customer.entity.CustomerLogin;

public interface CustomerLoginDao {
	
	Integer insertCustomerInf(CustomerLogin customerLogin);
	
	CustomerLogin validaCustomerLogin(@Param("loginName")String loginName);
	
}
