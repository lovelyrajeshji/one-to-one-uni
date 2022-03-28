package com.ty.one_to_many.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Sim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private  String simType;
	private  String simProvider;
	@ManyToOne
	private Mobile mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSimType() {
		return simType;
	}
	public void setSimType(String simType) {
		this.simType = simType;
	}
	public String getSimProvider() {
		return simProvider;
	}
	public void setSimProvider(String simProvider) {
		this.simProvider = simProvider;
	}
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

}
