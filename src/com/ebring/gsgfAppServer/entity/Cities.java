package com.ebring.gsgfAppServer.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Cities entity. @author MyEclipse Persistence Tools
 */

public class Cities implements java.io.Serializable {

	// Fields

	private String cityid;
	private Provinces provinces;
	private String id;
	private String city;
	private Set areases = new HashSet(0);

	// Constructors

	/** default constructor */
	public Cities() {
	}

	/** minimal constructor */
	public Cities(String cityid) {
		this.cityid = cityid;
	}

	/** full constructor */
	public Cities(String cityid, Provinces provinces, String id, String city,
			Set areases) {
		this.cityid = cityid;
		this.provinces = provinces;
		this.id = id;
		this.city = city;
		this.areases = areases;
	}

	// Property accessors

	public String getCityid() {
		return this.cityid;
	}

	public void setCityid(String cityid) {
		this.cityid = cityid;
	}

	public Provinces getProvinces() {
		return this.provinces;
	}

	public void setProvinces(Provinces provinces) {
		this.provinces = provinces;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set getAreases() {
		return this.areases;
	}

	public void setAreases(Set areases) {
		this.areases = areases;
	}

}