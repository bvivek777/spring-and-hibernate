package com.lumiplan.controller;

import com.lumiplan.dao.Applications;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:Spring/application-config.xml");  
	    Applications dao=(Applications)context.getBean("load");  
	    dao.displayState();
	}
}
