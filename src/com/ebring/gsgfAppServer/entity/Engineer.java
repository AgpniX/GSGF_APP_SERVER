package com.ebring.gsgfAppServer.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Engineer entity. @author MyEclipse Persistence Tools
 */

public class Engineer implements java.io.Serializable {

	// Fields

	private String engId;
	private String engName;
	private String idCard;
	private String phone;
	private String remark;
	private String engPassword;
	private Set residentAudits = new HashSet(0);
	private Set firmAudits = new HashSet(0);
	private Set repairs = new HashSet(0);
	private Set cycleChecks = new HashSet(0);
	private Set maintains = new HashSet(0);

	// Constructors

	/** default constructor */
	public Engineer() {
	}
	
	/** minimal constructor */
	public Engineer(String engId) {
		this.engId = engId;
	}

	/** full constructor */
	public Engineer(String engId, String engName, String idCard, String phone,
			String remark, String engPassword, Set residentAudits,
			Set firmAudits, Set repairs, Set cycleChecks, Set maintains) {
		this.engId = engId;
		this.engName = engName;
		this.idCard = idCard;
		this.phone = phone;
		this.remark = remark;
		this.engPassword = engPassword;
		this.residentAudits = residentAudits;
		this.firmAudits = firmAudits;
		this.repairs = repairs;
		this.cycleChecks = cycleChecks;
		this.maintains = maintains;
	}
	
	/**
	 * 
	 * @param engId 工程师主键
	 * @param engName  工程师姓名
	 * @param idCard 工程师身份证
	 * @param phone  工程师电话
	 * @param remark 工程师备注
	 * @param engPassword  工程师密码
	 */
	public Engineer(String engId, String engName, String idCard, String phone,
			String remark, String engPassword) {
		this.engId = engId;
		this.engName = engName;
		this.idCard = idCard;
		this.phone = phone;
		this.remark = remark;
		this.engPassword = engPassword;
	}

	// Property accessors

	public String getEngId() {
		return this.engId;
	}

	public void setEngId(String engId) {
		this.engId = engId;
	}

	public String getEngName() {
		return this.engName;
	}

	public void setEngName(String engName) {
		this.engName = engName;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getEngPassword() {
		return this.engPassword;
	}

	public void setEngPassword(String engPassword) {
		this.engPassword = engPassword;
	}

	public Set getResidentAudits() {
		return this.residentAudits;
	}

	public void setResidentAudits(Set residentAudits) {
		this.residentAudits = residentAudits;
	}

	public Set getFirmAudits() {
		return this.firmAudits;
	}

	public void setFirmAudits(Set firmAudits) {
		this.firmAudits = firmAudits;
	}

	public Set getRepairs() {
		return this.repairs;
	}

	public void setRepairs(Set repairs) {
		this.repairs = repairs;
	}

	public Set getCycleChecks() {
		return this.cycleChecks;
	}

	public void setCycleChecks(Set cycleChecks) {
		this.cycleChecks = cycleChecks;
	}

	public Set getMaintains() {
		return this.maintains;
	}

	public void setMaintains(Set maintains) {
		this.maintains = maintains;
	}

}