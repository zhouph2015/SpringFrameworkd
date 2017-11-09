package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

public class UserDAOImpl implements UserDAO {
	
	private int daoId;
	private String daoStatus;
	
	

	public int getDaoId() {
		return daoId;
	}



	public void setDaoId(int daoId) {
		this.daoId = daoId;
	}



	public String getDaoStatus() {
		return daoStatus;
	}



	public void setDaoStatus(String daoStatus) {
		this.daoStatus = daoStatus;
	}



	@Override
	public void save(User user) {
		System.out.println(user.getName() + " a user is saved with mysql");
		
	}
	
	

}
