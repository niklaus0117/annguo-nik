package com.annguo.clientsoft.user.dao;

import org.springframework.stereotype.Repository;

import com.annguo.clientsoft.user.entity.User;

public interface UserDao {
	public User selectUser();
}
