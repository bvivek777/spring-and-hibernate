package com.lumiplan.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class City {
	@Id @GeneratedValue
	private int cityId;
	@Column (name="CityName")
	private String cityName;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn (name = "StateId")
	private State state;
	
	public State getState(){
		return state;
	}
	
	public int getCityId(){
		return cityId;
	}
	
	public String getCityName(){
		return cityName;
	}
	
	public void setCityName(String CityName){
		this.cityName = CityName;
	}
	
	public void setCityId(int CityId){
		this.cityId = CityId;
	}
	
	public void setStateId(State state){
		this.state = state;
	}
	
}