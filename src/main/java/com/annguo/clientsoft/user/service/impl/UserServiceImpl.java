package com.annguo.clientsoft.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.annguo.clientsoft.user.dao.UserDao;
import com.annguo.clientsoft.user.entity.User;
import com.annguo.clientsoft.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public User selectUser() {
		// TODO Auto-generated method stub
		
		return userDao.selectUser();
	}

}
