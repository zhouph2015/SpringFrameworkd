package com.bjsxt.dao.impl;

import com.bjsxt.aop.LogInterceptor;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

public class UserDAOImpl3 implements UserDAO {
	
	private UserDAO userDAO = new UserDAOImpl();

	@Override
	public void save(User user) {
		
		new LogInterceptor().beforeMethod();
		
		userDAO.save(user);
		
	}
	
	

}
