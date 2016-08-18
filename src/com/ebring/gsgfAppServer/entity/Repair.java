package com.ebring.gsgfAppServer.entity;

/**
 * 维修表bean
 * @author MyEclipse Persistence Tools
 */

public class Repair implements java.io.Serializable {

	// Fields

	private String id;
	private Users users;
	private Gauges gauges;
	private Engineer engineer;
	private String repairTime;
	private String appointmentTime;
	private String malfDesc;
	private String startRepairTime;
	private String endRepairTime;
	private String startRepairTimeSys;
	private String endRepairTimeSys;
	private String sceneMalfDesc;
	private String malfModule;
	private String malfResult;
	private String repairMethod;
	private String dealMethod;
	private String isEmerge;
	private String isChangePart;
	private String isCharge;
	private String repairedState;
	private String isRepConfirm;
	private String visitTime;
	private String isSatisfade;
	private String advice;
	private String isVisitConfirm;
	private String isVisit;
	private String userDirector;
	private String userPhone;
	private String gauAddress;
	private String repairedFailMethod; //维修处理意见
	private String partCharge;//更换配件收费情况


	// Constructors

	/** default constructor */
	public Repair() {
	}

	/** minimal constructor */
	public Repair(String id, Engineer engineer) {
		this.id = id;
		this.engineer = engineer;
	}

	/** full constructor */
	public Repair(String id, Users users, Gauges gauges, Engineer engineer,
			String repairTime, String appointmentTime, String malfDesc,
			String startRepairTime, String endRepairTime,
			String startRepairTimeSys, String endRepairTimeSys,
			String sceneMalfDesc, String malfModule, String malfResult,
			String repairMethod, String dealMethod, String isEmerge,
			String isChangePart, String isCharge, String repairedState,
			String isRepConfirm, String visitTime, String isSatisfade,
			String advice, String isVisitConfirm, String isVisit,
			String userDirector, String userPhone, String gauAddress ,String repairedFailMethod ,String partCharge) {
		this.id = id;
		this.users = users;
		this.gauges = gauges;
		this.engineer = engineer;
		this.repairTime = repairTime;
		this.appointmentTime = appointmentTime;
		this.malfDesc = malfDesc;
		this.startRepairTime = startRepairTime;
		this.endRepairTime = endRepairTime;
		this.startRepairTimeSys = startRepairTimeSys;
		this.endRepairTimeSys = endRepairTimeSys;
		this.sceneMalfDesc = sceneMalfDesc;
		this.malfModule = malfModule;
		this.malfResult = malfResult;
		this.repairMethod = repairMethod;
		this.dealMethod = dealMethod;
		this.isEmerge = isEmerge;
		this.isChangePart = isChangePart;
		this.isCharge = isCharge;
		this.repairedState = repairedState;
		this.isRepConfirm = isRepConfirm;
		this.visitTime = visitTime;
		this.isSatisfade = isSatisfade;
		this.advice = advice;
		this.isVisitConfirm = isVisitConfirm;
		this.isVisit = isVisit;
		this.userDirector = userDirector;
		this.userPhone = userPhone;
		this.gauAddress = gauAddress;
		this.repairedFailMethod = repairedFailMethod;
		this.partCharge = partCharge;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Gauges getGauges() {
		return this.gauges;
	}

	public void setGauges(Gauges gauges) {
		this.gauges = gauges;
	}

	public Engineer getEngineer() {
		return this.engineer;
	}

	public void setEngineer(Engineer engineer) {
		this.engineer = engineer;
	}

	public String getRepairTime() {
		return this.repairTime;
	}

	public void setRepairTime(String repairTime) {
		this.repairTime = repairTime;
	}

	public String getAppointmentTime() {
		return this.appointmentTime;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getMalfDesc() {
		return this.malfDesc;
	}

	public void setMalfDesc(String malfDesc) {
		this.malfDesc = malfDesc;
	}

	public String getStartRepairTime() {
		return this.startRepairTime;
	}

	public void setStartRepairTime(String startRepairTime) {
		this.startRepairTime = startRepairTime;
	}

	public String getEndRepairTime() {
		return this.endRepairTime;
	}

	public void setEndRepairTime(String endRepairTime) {
		this.endRepairTime = endRepairTime;
	}

	public String getStartRepairTimeSys() {
		return this.startRepairTimeSys;
	}

	public void setStartRepairTimeSys(String startRepairTimeSys) {
		this.startRepairTimeSys = startRepairTimeSys;
	}

	public String getEndRepairTimeSys() {
		return this.endRepairTimeSys;
	}

	public void setEndRepairTimeSys(String endRepairTimeSys) {
		this.endRepairTimeSys = endRepairTimeSys;
	}

	public String getSceneMalfDesc() {
		return this.sceneMalfDesc;
	}

	public void setSceneMalfDesc(String sceneMalfDesc) {
		this.sceneMalfDesc = sceneMalfDesc;
	}

	public String getMalfModule() {
		return this.malfModule;
	}

	public void setMalfModule(String malfModule) {
		this.malfModule = malfModule;
	}

	public String getMalfResult() {
		return this.malfResult;
	}

	public void setMalfResult(String malfResult) {
		this.malfResult = malfResult;
	}

	public String getRepairMethod() {
		return this.repairMethod;
	}

	public void setRepairMethod(String repairMethod) {
		this.repairMethod = repairMethod;
	}

	public String getDealMethod() {
		return this.dealMethod;
	}

	public void setDealMethod(String dealMethod) {
		this.dealMethod = dealMethod;
	}

	public String getIsEmerge() {
		return this.isEmerge;
	}

	public void setIsEmerge(String isEmerge) {
		this.isEmerge = isEmerge;
	}

	public String getIsChangePart() {
		return this.isChangePart;
	}

	public void setIsChangePart(String isChangePart) {
		this.isChangePart = isChangePart;
	}

	public String getIsCharge() {
		return this.isCharge;
	}

	public void setIsCharge(String isCharge) {
		this.isCharge = isCharge;
	}

	public String getRepairedState() {
		return this.repairedState;
	}

	public void setRepairedState(String repairedState) {
		this.repairedState = repairedState;
	}

	public String getIsRepConfirm() {
		return this.isRepConfirm;
	}

	public void setIsRepConfirm(String isRepConfirm) {
		this.isRepConfirm = isRepConfirm;
	}

	public String getVisitTime() {
		return this.visitTime;
	}

	public void setVisitTime(String visitTime) {
		this.visitTime = visitTime;
	}

	public String getIsSatisfade() {
		return this.isSatisfade;
	}

	public void setIsSatisfade(String isSatisfade) {
		this.isSatisfade = isSatisfade;
	}

	public String getAdvice() {
		return this.advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public String getIsVisitConfirm() {
		return this.isVisitConfirm;
	}

	public void setIsVisitConfirm(String isVisitConfirm) {
		this.isVisitConfirm = isVisitConfirm;
	}

	public String getIsVisit() {
		return this.isVisit;
	}

	public void setIsVisit(String isVisit) {
		this.isVisit = isVisit;
	}

	public String getUserDirector() {
		return this.userDirector;
	}

	public void setUserDirector(String userDirector) {
		this.userDirector = userDirector;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getGauAddress() {
		return this.gauAddress;
	}

	public void setGauAddress(String gauAddress) {
		this.gauAddress = gauAddress;
	}
	
	

	public String getRepairedFailMethod() {
		return repairedFailMethod;
	}

	public void setRepairedFailMethod(String repairedFailMethod) {
		this.repairedFailMethod = repairedFailMethod;
	}

	

	public String getPartCharge() {
		return partCharge;
	}

	public void setPartCharge(String partCharge) {
		this.partCharge = partCharge;
	}

	@Override
	public String toString() {
		return "Repair [id=" + id + ", users=" + users + ", gauges=" + gauges
				+ ", engineer=" + engineer + ", repairTime=" + repairTime
				+ ", appointmentTime=" + appointmentTime + ", malfDesc="
				+ malfDesc + ", startRepairTime=" + startRepairTime
				+ ", endRepairTime=" + endRepairTime + ", startRepairTimeSys="
				+ startRepairTimeSys + ", endRepairTimeSys=" + endRepairTimeSys
				+ ", sceneMalfDesc=" + sceneMalfDesc + ", malfModule="
				+ malfModule + ", malfResult=" + malfResult + ", repairMethod="
				+ repairMethod + ", dealMethod=" + dealMethod + ", isEmerge="
				+ isEmerge + ", isChangePart=" + isChangePart + ", isCharge="
				+ isCharge + ", repairedState=" + repairedState
				+ ", isRepConfirm=" + isRepConfirm + ", visitTime=" + visitTime
				+ ", isSatisfade=" + isSatisfade + ", advice=" + advice
				+ ", isVisitConfirm=" + isVisitConfirm + ", isVisit=" + isVisit
				+ ", userDirector=" + userDirector + ", userPhone=" + userPhone
				+ ", gauAddress=" + gauAddress + ", repairedFailMethod="
				+ repairedFailMethod + ", partCharge=" + partCharge + "]";
	}
	
	

}