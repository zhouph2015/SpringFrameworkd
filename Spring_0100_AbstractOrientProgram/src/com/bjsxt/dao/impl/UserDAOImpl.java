package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public void save(User user) {
		System.out.println("a user is saved with mysql");
		
	}
	
	

}
