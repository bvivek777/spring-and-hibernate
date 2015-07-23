package com.lumiplan.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Country {
	@Id @GeneratedValue 
	private int countryId;
	@Column (name = "CountryName")
	private String countryName;
	@OneToMany(mappedBy = "country")
	private List<State> states;
		
	public List<State> getState(){
		return states;
	}
	
	public int getCountryId(){
		return countryId;
	}
	
	public String getCountryName(){
		return countryName;
	}
	
	public void setCountryName(String CountryName){
		this.countryName = CountryName;
	}
		
	public void setStates(List<State> states){
		this.states = states;
	}
	
	public void setCountryId(int CountryId){
		this.countryId = CountryId;
	}
}
