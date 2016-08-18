package com.ebring.gsgfAppServer.entity;

/**
 * Areas entity. @author MyEclipse Persistence Tools
 */

public class Areas implements java.io.Serializable {

	// Fields

	private String areaid;
	private Cities cities;
	private String id;
	private String area;

	// Constructors

	/** default constructor */
	public Areas() {
	}

	/** minimal constructor */
	public Areas(String areaid) {
		this.areaid = areaid;
	}

	/** full constructor */
	public Areas(String areaid, Cities cities, String id, String area) {
		this.areaid = areaid;
		this.cities = cities;
		this.id = id;
		this.area = area;
	}

	// Property accessors

	public String getAreaid() {
		return this.areaid;
	}

	public void setAreaid(String areaid) {
		this.areaid = areaid;
	}

	public Cities getCities() {
		return this.cities;
	}

	public void setCities(Cities cities) {
		this.cities = cities;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}