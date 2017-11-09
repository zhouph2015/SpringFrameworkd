package com.bjsxt.services;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() {
		
		BeanFactory applicatonContext = new ClassPathXmlApplicationContext("beans.xml");
		UserService userservice = (UserService)applicatonContext.getBean("userService");
		userservice.add(new User());
		
		System.out.println(userservice.getClass());
		
		//((AbstractApplicationContext) applicatonContext).destroy();
	}

}
