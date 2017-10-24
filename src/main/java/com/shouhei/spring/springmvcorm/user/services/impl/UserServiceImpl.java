package com.shouhei.spring.springmvcorm.user.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shouhei.spring.springmvcorm.user.dao.UserDao;
import com.shouhei.spring.springmvcorm.user.entity.User;
import com.shouhei.spring.springmvcorm.user.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public int save(User user) {
		return dao.create(user);
	}

}
