package com.bjsxt.services;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.dao.impl.UserDAOImpl;
import com.bjsxt.model.User;

public class UserService {
	
	public UserService(UserDAO userDAO){
		this.userDAO= userDAO;
	}
	
	private UserDAO userDAO;
	
	public void init(){
		System.out.println("bean is initialed");
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public void add(User u){
		this.userDAO.save(u);
	}
	
	public void destroy(){
		System.out.println("bean is destoried");
	}

}
