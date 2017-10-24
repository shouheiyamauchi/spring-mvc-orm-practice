package com.shouhei.spring.springmvcorm.user.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shouhei.spring.springmvcorm.user.dao.UserDao;

@Service
public class UserServiceImpl {
	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

}
