package com.ebring.gsgfAppServer.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Gauges entity. @author MyEclipse Persistence Tools
 */

public class Gauges implements java.io.Serializable {

	// Fields

	private String gauId;
	private Users users;
	private String devType;
	private String meterType;
	private String meterNum;
	private String meterProduceDate;
	private String contModel;
	private String contNum;
	private String contProduceDate;
	private String gauType;
	private String meterModel;
	private String address;
	private String exceptArriveTime;
	private String nfcFlag;
	private String installTime;
	private Set repairs = new HashSet(0);
	private Set cycleChecks = new HashSet(0);
	private Set residentAudits = new HashSet(0);
	private Set maintains = new HashSet(0);
	private Set firmAudits = new HashSet(0);

	// Constructors

	/** default constructor */
	public Gauges() {
	}

	/** minimal constructor */
	public Gauges(String gauId) {
		this.gauId = gauId;
	}
	
	/** full constructor */
	public Gauges(String gauId, Users users, String devType, String meterType,
			String meterNum, String meterProduceDate, String contModel,
			String contNum, String contProduceDate, String gauType,
			String meterModel, String address, String exceptArriveTime,
			String nfcFlag, String installTime, Set repairs, Set cycleChecks,
			Set residentAudits, Set maintains, Set firmAudits) {
		this.gauId = gauId;
		this.users = users;
		this.devType = devType;
		this.meterType = meterType;
		this.meterNum = meterNum;
		this.meterProduceDate = meterProduceDate;
		this.contModel = contModel;
		this.contNum = contNum;
		this.contProduceDate = contProduceDate;
		this.gauType = gauType;
		this.meterModel = meterModel;
		this.address = address;
		this.exceptArriveTime = exceptArriveTime;
		this.nfcFlag = nfcFlag;
		this.installTime = installTime;
		this.repairs = repairs;
		this.cycleChecks = cycleChecks;
		this.residentAudits = residentAudits;
		this.maintains = maintains;
		this.firmAudits = firmAudits;
	}
	
	

	// Property accessors

	public String getGauId() {
		return this.gauId;
	}

	public void setGauId(String gauId) {
		this.gauId = gauId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getDevType() {
		return this.devType;
	}

	public void setDevType(String devType) {
		this.devType = devType;
	}

	public String getMeterType() {
		return this.meterType;
	}

	public void setMeterType(String meterType) {
		this.meterType = meterType;
	}

	public String getMeterNum() {
		return this.meterNum;
	}

	public void setMeterNum(String meterNum) {
		this.meterNum = meterNum;
	}

	public String getMeterProduceDate() {
		return this.meterProduceDate;
	}

	public void setMeterProduceDate(String meterProduceDate) {
		this.meterProduceDate = meterProduceDate;
	}

	public String getContModel() {
		return this.contModel;
	}

	public void setContModel(String contModel) {
		this.contModel = contModel;
	}

	public String getContNum() {
		return this.contNum;
	}

	public void setContNum(String contNum) {
		this.contNum = contNum;
	}

	public String getContProduceDate() {
		return this.contProduceDate;
	}

	public void setContProduceDate(String contProduceDate) {
		this.contProduceDate = contProduceDate;
	}

	public String getGauType() {
		return this.gauType;
	}

	public void setGauType(String gauType) {
		this.gauType = gauType;
	}

	public String getMeterModel() {
		return this.meterModel;
	}

	public void setMeterModel(String meterModel) {
		this.meterModel = meterModel;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getExceptArriveTime() {
		return this.exceptArriveTime;
	}

	public void setExceptArriveTime(String exceptArriveTime) {
		this.exceptArriveTime = exceptArriveTime;
	}

	public String getNfcFlag() {
		return this.nfcFlag;
	}

	public void setNfcFlag(String nfcFlag) {
		this.nfcFlag = nfcFlag;
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

	public Set getCycleChecks() {
		return this.cycleChecks;
	}

	public void setCycleChecks(Set cycleChecks) {
		this.cycleChecks = cycleChecks;
	}

	public Set getResidentAudits() {
		return this.residentAudits;
	}

	public void setResidentAudits(Set residentAudits) {
		this.residentAudits = residentAudits;
	}

	public Set getMaintains() {
		return this.maintains;
	}

	public void setMaintains(Set maintains) {
		this.maintains = maintains;
	}

	public Set getFirmAudits() {
		return this.firmAudits;
	}

	public void setFirmAudits(Set firmAudits) {
		this.firmAudits = firmAudits;
	}

}