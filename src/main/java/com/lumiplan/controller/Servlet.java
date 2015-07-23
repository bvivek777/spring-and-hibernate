package com.lumiplan.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lumiplan.dao.Applications;
import com.lumiplan.entity.Country;

@SuppressWarnings("serial")
public class Servlet extends HttpServlet{
	
	static ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-config.xml");
	static private Applications app = (Applications) context.getBean("load");
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		 response.setContentType("text/html");	
		 PrintWriter out = response.getWriter();
		 List<Country> allCountries = app.displayCountry(0);
		 out.println("<center><h1>List Of All Countries in the Database</h1><br>");
		 for( int i=0;i<allCountries.size();i++){
			 out.println("<h2>"+(i+1)+". "+allCountries.get(i).getCountryName()+"</h2><br>");
		 }
		 out.println("</center>");
	}
	public void destroy(){
		
	}
}
