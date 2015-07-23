package com.lumiplan.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.sql.JoinType;

import com.lumiplan.entity.*;

public class Applications {
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	public List<Country> displayCountry(int a){
		List<Country> allCountries = new ArrayList<Country>();
		Session session = sessionFactory.openSession();
		Criteria crit = session.createCriteria(Country.class);
		try {
		allCountries = crit.list();
		} catch(Exception e) {
			e.printStackTrace();
		}
		if(a==1)
			for( int i=0;i<allCountries.size();i++){
				System.out.println(allCountries.get(i).getCountryId()+"   "+allCountries.get(i).getCountryName());
			}
		session.close();
		return allCountries;
	}
	
	@SuppressWarnings("unchecked")
	public void displayState(){
		List<State> allStates = new ArrayList<State>();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(State.class,"states")
				.createAlias("states.country", "scountry",JoinType.INNER_JOIN);
		allStates = (List<State>)criteria.list();
		for( int i=0;i<allStates.size();i++){
			System.out.println(allStates.get(i).getStateId()+"  "+allStates.get(i).getStateName()+"  "+allStates.get(i).getCountry().getCountryName());
		}
	session.close();		
	}
}
