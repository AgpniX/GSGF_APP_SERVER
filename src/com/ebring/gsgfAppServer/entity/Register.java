package com.ebring.gsgfAppServer.entity;

/**
 * Register entity. @author MyEclipse Persistence Tools
 */

public class Register implements java.io.Serializable {

	// Fields

	private String repId;
	private Spare spare;
	private String inOrOut;
	private Integer inOutCount;
	private String takeMan;
	private String inOutTime;
	private String charge;
	private String replaceResult;
	private String userId;

	// Constructors

	/** default constructor */
	public Register() {
	}

	/** minimal constructor */
	public Register(String repId, Spare spare) {
		this.repId = repId;
		this.spare = spare;
	}

	/** full constructor */
	public Register(String repId, Spare spare, String inOrOut,
			Integer inOutCount, String takeMan, String inOutTime,
			String charge, String replaceResult, String userId) {
		this.repId = repId;
		this.spare = spare;
		this.inOrOut = inOrOut;
		this.inOutCount = inOutCount;
		this.takeMan = takeMan;
		this.inOutTime = inOutTime;
		this.charge = charge;
		this.replaceResult = replaceResult;
		this.userId = userId;
	}

	// Property accessors

	public String getRepId() {
		return this.repId;
	}

	public void setRepId(String repId) {
		this.repId = repId;
	}

	public Spare getSpare() {
		return this.spare;
	}

	public void setSpare(Spare spare) {
		this.spare = spare;
	}

	public String getInOrOut() {
		return this.inOrOut;
	}

	public void setInOrOut(String inOrOut) {
		this.inOrOut = inOrOut;
	}

	public Integer getInOutCount() {
		return this.inOutCount;
	}

	public void setInOutCount(Integer inOutCount) {
		this.inOutCount = inOutCount;
	}

	public String getTakeMan() {
		return this.takeMan;
	}

	public void setTakeMan(String takeMan) {
		this.takeMan = takeMan;
	}

	public String getInOutTime() {
		return this.inOutTime;
	}

	public void setInOutTime(String inOutTime) {
		this.inOutTime = inOutTime;
	}

	public String getCharge() {
		return this.charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String getReplaceResult() {
		return this.replaceResult;
	}

	public void setReplaceResult(String replaceResult) {
		this.replaceResult = replaceResult;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}