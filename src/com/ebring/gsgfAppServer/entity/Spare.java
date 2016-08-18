package com.ebring.gsgfAppServer.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Spare entity. @author MyEclipse Persistence Tools
 */

public class Spare implements java.io.Serializable {

	// Fields

	private String id;
	private String spareName;
	private Integer spareSum;
	private String sparePrice;
	private Set registers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Spare() {
	}

	/** minimal constructor */
	public Spare(String id) {
		this.id = id;
	}

	/** full constructor */
	public Spare(String id, String spareName, Integer spareSum,
			String sparePrice, Set registers) {
		this.id = id;
		this.spareName = spareName;
		this.spareSum = spareSum;
		this.sparePrice = sparePrice;
		this.registers = registers;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSpareName() {
		return this.spareName;
	}

	public void setSpareName(String spareName) {
		this.spareName = spareName;
	}

	public Integer getSpareSum() {
		return this.spareSum;
	}

	public void setSpareSum(Integer spareSum) {
		this.spareSum = spareSum;
	}

	public String getSparePrice() {
		return this.sparePrice;
	}

	public void setSparePrice(String sparePrice) {
		this.sparePrice = sparePrice;
	}

	public Set getRegisters() {
		return this.registers;
	}

	public void setRegisters(Set registers) {
		this.registers = registers;
	}

}