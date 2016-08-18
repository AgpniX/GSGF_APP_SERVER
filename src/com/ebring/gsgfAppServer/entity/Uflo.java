package com.ebring.gsgfAppServer.entity;

/**
 * Uflo entity. @author MyEclipse Persistence Tools
 */

public class Uflo implements java.io.Serializable {

	// Fields

	private String title;
	private Integer dayCount;
	private String cmnt;

	// Constructors

	/** default constructor */
	public Uflo() {
	}

	/** minimal constructor */
	public Uflo(String title) {
		this.title = title;
	}

	/** full constructor */
	public Uflo(String title, Integer dayCount, String cmnt) {
		this.title = title;
		this.dayCount = dayCount;
		this.cmnt = cmnt;
	}

	// Property accessors

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getDayCount() {
		return this.dayCount;
	}

	public void setDayCount(Integer dayCount) {
		this.dayCount = dayCount;
	}

	public String getCmnt() {
		return this.cmnt;
	}

	public void setCmnt(String cmnt) {
		this.cmnt = cmnt;
	}

}