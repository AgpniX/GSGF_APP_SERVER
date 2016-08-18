package com.ebring.gsgfAppServer.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Provinces entity. @author MyEclipse Persistence Tools
 */

public class Provinces implements java.io.Serializable {

	// Fields

	private String provinceid;
	private String id;
	private String province;
	private Set citieses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Provinces() {
	}

	/** minimal constructor */
	public Provinces(String provinceid) {
		this.provinceid = provinceid;
	}

	/** full constructor */
	public Provinces(String provinceid, String id, String province, Set citieses) {
		this.provinceid = provinceid;
		this.id = id;
		this.province = province;
		this.citieses = citieses;
	}

	// Property accessors

	public String getProvinceid() {
		return this.provinceid;
	}

	public void setProvinceid(String provinceid) {
		this.provinceid = provinceid;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Set getCitieses() {
		return this.citieses;
	}

	public void setCitieses(Set citieses) {
		this.citieses = citieses;
	}

}