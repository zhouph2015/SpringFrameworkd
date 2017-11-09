package com.bjsxt.services;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bjsxt.model.User;

public class UserServiceTest {

	@Test
	public void test() {
		UserService userservice = new UserService();
		
		User u = new User();
		userservice.add(u);
	}

}
