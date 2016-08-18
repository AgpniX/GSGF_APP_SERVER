package com.ebring.gsgfAppServer.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private String userId;
	private String userNum;
	private String userType;
	private String companyName;
	private String companyAddress;
	private String userName;
	private String userAddress;
	private String userPhone;
	private String registerTime;
	private String userDirector;
	private String gauId;
	private String installTime;
	private Set repairs = new HashSet(0);
	private Set gaugeses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(String userId) {
		this.userId = userId;
	}

	/** full constructor */
	public Users(String userId, String userNum, String userType,
			String companyName, String companyAddress, String userName,
			String userAddress, String userPhone, String registerTime,
			String userDirector, String gauId, String installTime, Set repairs,
			Set gaugeses) {
		this.userId = userId;
		this.userNum = userNum;
		this.userType = userType;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userPhone = userPhone;
		this.registerTime = registerTime;
		this.userDirector = userDirector;
		this.gauId = gauId;
		this.installTime = installTime;
		this.repairs = repairs;
		this.gaugeses = gaugeses;
	}

	// Property accessors

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserNum() {
		return this.userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return this.companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress() {
		return this.userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}

	public String getUserDirector() {
		return this.userDirector;
	}

	public void setUserDirector(String userDirector) {
		this.userDirector = userDirector;
	}

	public String getGauId() {
		return this.gauId;
	}

	public void setGauId(String gauId) {
		this.gauId = gauId;
	}

	public String getInstallTime() {
		return this.installTime;
	}

	public void setInstallTime(String installTime) {
		this.installTime = installTime;
	}

	public Set getRepairs() {
		return this.repairs;
	}

	public void setRepairs(Set repairs) {
		this.repairs = repairs;
	}

	public Set getGaugeses() {
		return this.gaugeses;
	}

	public void setGaugeses(Set gaugeses) {
		this.gaugeses = gaugeses;
	}

}