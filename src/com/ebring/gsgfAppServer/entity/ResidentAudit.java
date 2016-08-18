package com.ebring.gsgfAppServer.entity;

/**
 * ResidentAudit entity. @author MyEclipse Persistence Tools
 */

public class ResidentAudit implements java.io.Serializable {

	// Fields
	private String dailyAuditId;
	private Gauges gauges;
	private Engineer engineer;
	private String testTime;
	private String isGauFacade;
	private String isGauCarSeal;
	private String isCell;
	private String baseNum;
	private String sumGas;
	private String surplusGas;
	private String gauState;
	private String malfDesc;
	private String dealState;
	private String dealMethod;
	private String dealResult;
	private String notDealReason;
	private String dealAdvice;
	private String isDanger;
	private String dangerDesc;
	private String isInformService;

	// Constructors

	/** default constructor */
	public ResidentAudit() {
	}
	
	/** minimal constructor */
	public ResidentAudit(String dailyAuditId) {
		this.dailyAuditId = dailyAuditId;
	}

	/** full constructor 
	 * @param dailyAuditId  民用户日常巡检主键
	 * @param gauges   计量表
	 * @param engineer   巡检人员【工程师】
	 * @param testTime   巡检日期
	 * @param isGauFacade   计量表外观是否完好（0--是，1---否）
	 * @param isGauCarSeal   计量表铅封是否完好（0--是，1---否）
	 * @param isCell   电池电量是否正常（0--是，1---否）
	 * @param baseNum   计量表基表读数
	 * @param sumGas   计量表累计气量
	 * @param surplusGas   计量表剩余气量
	 * @param gauState   计量表运行状态（0-正常，1-故障）
	 * @param malfDesc   故障描述
	 * @param dealState   故障是否处理（0--是，1---否）
	 * @param dealMethod   处理方法（0：现场维护，1；更换新表）
	 * @param dealResult   处理结果（0：正常，1待处理）
	 * @param notDealReason   未处理原因
	 * @param dealAdvice   处理意见
	 * @param isDanger   是否存在安全隐患（0--是，1---否）
	 * @param dangerDesc   安全隐患描述
	 * @param isInformService   是否通知客服（0--是，1---否）
	 */
	public ResidentAudit(String dailyAuditId, Gauges gauges, Engineer engineer,
			String testTime, String isGauFacade, String isGauCarSeal,
			String isCell, String baseNum, String sumGas, String surplusGas,
			String gauState, String malfDesc, String dealState,
			String dealMethod, String dealResult, String notDealReason,
			String dealAdvice, String isDanger, String dangerDesc,
			String isInformService) {
		this.dailyAuditId = dailyAuditId;
		this.gauges = gauges;
		this.engineer = engineer;
		this.testTime = testTime;
		this.isGauFacade = isGauFacade;
		this.isGauCarSeal = isGauCarSeal;
		this.isCell = isCell;
		this.baseNum = baseNum;
		this.sumGas = sumGas;
		this.surplusGas = surplusGas;
		this.gauState = gauState;
		this.malfDesc = malfDesc;
		this.dealState = dealState;
		this.dealMethod = dealMethod;
		this.dealResult = dealResult;
		this.notDealReason = notDealReason;
		this.dealAdvice = dealAdvice;
		this.isDanger = isDanger;
		this.dangerDesc = dangerDesc;
		this.isInformService = isInformService;
	}
	
	// Property accessors

	public String getDailyAuditId() {
		return this.dailyAuditId;
	}

	public void setDailyAuditId(String dailyAuditId) {
		this.dailyAuditId = dailyAuditId;
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

	public String getTestTime() {
		return this.testTime;
	}

	public void setTestTime(String testTime) {
		this.testTime = testTime;
	}

	public String getIsGauFacade() {
		return this.isGauFacade;
	}

	public void setIsGauFacade(String isGauFacade) {
		this.isGauFacade = isGauFacade;
	}

	public String getIsGauCarSeal() {
		return this.isGauCarSeal;
	}

	public void setIsGauCarSeal(String isGauCarSeal) {
		this.isGauCarSeal = isGauCarSeal;
	}

	public String getIsCell() {
		return this.isCell;
	}

	public void setIsCell(String isCell) {
		this.isCell = isCell;
	}

	public String getBaseNum() {
		return this.baseNum;
	}

	public void setBaseNum(String baseNum) {
		this.baseNum = baseNum;
	}

	public String getSumGas() {
		return this.sumGas;
	}

	public void setSumGas(String sumGas) {
		this.sumGas = sumGas;
	}

	public String getSurplusGas() {
		return this.surplusGas;
	}

	public void setSurplusGas(String surplusGas) {
		this.surplusGas = surplusGas;
	}

	public String getGauState() {
		return this.gauState;
	}

	public void setGauState(String gauState) {
		this.gauState = gauState;
	}

	public String getMalfDesc() {
		return this.malfDesc;
	}

	public void setMalfDesc(String malfDesc) {
		this.malfDesc = malfDesc;
	}

	public String getDealState() {
		return this.dealState;
	}

	public void setDealState(String dealState) {
		this.dealState = dealState;
	}

	public String getDealMethod() {
		return this.dealMethod;
	}

	public void setDealMethod(String dealMethod) {
		this.dealMethod = dealMethod;
	}

	public String getDealResult() {
		return this.dealResult;
	}

	public void setDealResult(String dealResult) {
		this.dealResult = dealResult;
	}

	public String getNotDealReason() {
		return this.notDealReason;
	}

	public void setNotDealReason(String notDealReason) {
		this.notDealReason = notDealReason;
	}

	public String getDealAdvice() {
		return this.dealAdvice;
	}

	public void setDealAdvice(String dealAdvice) {
		this.dealAdvice = dealAdvice;
	}

	public String getIsDanger() {
		return this.isDanger;
	}

	public void setIsDanger(String isDanger) {
		this.isDanger = isDanger;
	}

	public String getDangerDesc() {
		return this.dangerDesc;
	}

	public void setDangerDesc(String dangerDesc) {
		this.dangerDesc = dangerDesc;
	}

	public String getIsInformService() {
		return this.isInformService;
	}

	public void setIsInformService(String isInformService) {
		this.isInformService = isInformService;
	}

}