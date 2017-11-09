package com.bjsxt.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.bjsxt.dao.UserDAO;


import com.bjsxt.model.User;

@Component
public class UserDAOImpl implements UserDAO {
	
	
	private DataSource dataSource;
	

	public DataSource getDataSource() {
		return dataSource;
	}

    @Resource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	@Override
	public void save(User user) {
		
		try {
			Connection conn = dataSource.getConnection();
			conn.createStatement().executeUpdate("insert into user values(null,'Zhangsha')");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" a user is saved with mysql");

		
	}
	
	

}
