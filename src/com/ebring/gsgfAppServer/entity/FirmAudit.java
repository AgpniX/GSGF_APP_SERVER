package com.ebring.gsgfAppServer.entity;

/**
 * FirmAudit entity. @author MyEclipse Persistence Tools
 */

public class FirmAudit implements java.io.Serializable {

	// Fields
	private String dailyAuditId;		//公福日常巡检  主键
	private Gauges gauges;		//计量表
	private Engineer engineer;		//工程师
	private String testTime;		//巡检日期
	private String isGauFacade;		//计量表外观是否完好(0---是    1---否)
	private String isGauCarSeal;		//计量表铅封是否完好(0---是    1---否)
	private String gauState;		//计量表运行状态（0；正常，1：故障）
	private String meterFlowRate;		//气表瞬时流量
	private String meterTemp;		//气表温度
	private String meterPres;		//气表压力
	private String contSumGas;		//控制器累计气量
	private String contSurplusGas;		//控制器剩余气量
	private String oilState;		//计量表润滑油状况（0--标准   1---缺油）
	private String isAddOil;		//是否加油(0---是    1---否)
	private String noAddReason;		//未加油原因
	private String oilResult;		//缺油处理结果
	private String meterCellState;		//气表电池状态（0--正常   1---缺电）
	private String isChangeMeterCell;		//是否更换气表电池(0---是    1---否)
	private String isChargeMeterCell;		//更换气表电池是否收费(0---是    1---否)
	private String meterCellMoney;		//更换气表电池收费金额
	private String noMeterFeeReason;		//更换气表电池未收费原因
	private String meterDealAdvice;		//处理意见
	private String isDanger;		//是否存在安全隐患(0---是    1---否)
	private String dangerDesc;		//隐患描述
	private String isInformService;		//是否通知客服(0---是    1---否)
	private String contCellState;		//控制器电池状态（0--正常   1---缺电）
	private String isChangeContCell;		//是否更换控制器电池(0---是    1---否)
	private String isChargeContCell;		//更换控制器电池是否收费(0---是    1---否)
	private String contCellMoney;		//更换控制器电池收费金额
	private String noContFeeReasion;		//更换控制器电池未收费原因
	private String contDealAdvice;		//控制器处理意见
	private String gauFaultDesc;		//计量表故障描述
	private String gauFaultDeal;		//计量表故障处理
	private String gauFaultDealResult;		//计量表故障处理结果
	private String sumGas;		//气表累计气量

	// Constructors

	/** default constructor */
	public FirmAudit() {
	}

	/** minimal constructor */
	public FirmAudit(String dailyAuditId) {
		this.dailyAuditId = dailyAuditId;
	}

	/**
	 * full constructor
	 * @param dailyAuditId		公福日常巡检  主键
	 * @param gauges		计量表
	 * @param engineer		工程师
	 * @param testTime		巡检日期
	 * @param isGauFacade		计量表外观是否完好(0---是    1---否)
	 * @param isGauCarSeal		计量表铅封是否完好(0---是    1---否)
	 * @param gauState		计量表运行状态（0；正常，1：故障）
	 * @param meterFlowRate		气表瞬时流量
	 * @param meterTemp		气表温度
	 * @param meterPres		气表压力
	 * @param contSumGas		控制器累计气量
	 * @param contSurplusGas		控制器剩余气量
	 * @param oilState		计量表润滑油状况（0--标准   1---缺油）
	 * @param isAddOil		是否加油(0---是    1---否)
	 * @param noAddReason		未加油原因
	 * @param oilResult		缺油处理结果
	 * @param meterCellState		气表电池状态（0--正常   1---缺电）
	 * @param isChangeMeterCell		是否更换气表电池(0---是    1---否)
	 * @param isChargeMeterCell		更换气表电池是否收费(0---是    1---否)
	 * @param meterCellMoney		更换气表电池收费金额
	 * @param noMeterFeeReason		更换气表电池未收费原因
	 * @param meterDealAdvice		处理意见
	 * @param isDanger		是否存在安全隐患(0---是    1---否)
	 * @param dangerDesc		隐患描述
	 * @param isInformService		是否通知客服(0---是    1---否)
	 * @param contCellState		控制器电池状态（0--正常   1---缺电）
	 * @param isChangeContCell		是否更换控制器电池(0---是    1---否)
	 * @param isChargeContCell		更换控制器电池是否收费(0---是    1---否)
	 * @param contCellMoney		更换控制器电池收费金额
	 * @param noContFeeReasion		更换控制器电池未收费原因
	 * @param contDealAdvice		控制器处理意见
	 * @param gauFaultDesc		计量表故障描述
	 * @param gauFaultDeal		计量表故障处理
	 * @param gauFaultDealResult		计量表故障处理结果
	 * @param sumGas		气表累计气量
	 */
	public FirmAudit(String dailyAuditId, Gauges gauges, Engineer engineer,
			String testTime, String isGauFacade, String isGauCarSeal,
			String gauState, String meterFlowRate, String meterTemp,
			String meterPres, String contSumGas, String contSurplusGas,
			String oilState, String isAddOil, String noAddReason,
			String oilResult, String meterCellState, String isChangeMeterCell,
			String isChargeMeterCell, String meterCellMoney,
			String noMeterFeeReason, String meterDealAdvice, String isDanger,
			String dangerDesc, String isInformService, String contCellState,
			String isChangeContCell, String isChargeContCell,
			String contCellMoney, String noContFeeReasion,
			String contDealAdvice, String gauFaultDesc, String gauFaultDeal,
			String gauFaultDealResult, String sumGas) {
		this.dailyAuditId = dailyAuditId;
		this.gauges = gauges;
		this.engineer = engineer;
		this.testTime = testTime;
		this.isGauFacade = isGauFacade;
		this.isGauCarSeal = isGauCarSeal;
		this.gauState = gauState;
		this.meterFlowRate = meterFlowRate;
		this.meterTemp = meterTemp;
		this.meterPres = meterPres;
		this.contSumGas = contSumGas;
		this.contSurplusGas = contSurplusGas;
		this.oilState = oilState;
		this.isAddOil = isAddOil;
		this.noAddReason = noAddReason;
		this.oilResult = oilResult;
		this.meterCellState = meterCellState;
		this.isChangeMeterCell = isChangeMeterCell;
		this.isChargeMeterCell = isChargeMeterCell;
		this.meterCellMoney = meterCellMoney;
		this.noMeterFeeReason = noMeterFeeReason;
		this.meterDealAdvice = meterDealAdvice;
		this.isDanger = isDanger;
		this.dangerDesc = dangerDesc;
		this.isInformService = isInformService;
		this.contCellState = contCellState;
		this.isChangeContCell = isChangeContCell;
		this.isChargeContCell = isChargeContCell;
		this.contCellMoney = contCellMoney;
		this.noContFeeReasion = noContFeeReasion;
		this.contDealAdvice = contDealAdvice;
		this.gauFaultDesc = gauFaultDesc;
		this.gauFaultDeal = gauFaultDeal;
		this.gauFaultDealResult = gauFaultDealResult;
		this.sumGas = sumGas;
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

	public String getGauState() {
		return this.gauState;
	}

	public void setGauState(String gauState) {
		this.gauState = gauState;
	}

	public String getMeterFlowRate() {
		return this.meterFlowRate;
	}

	public void setMeterFlowRate(String meterFlowRate) {
		this.meterFlowRate = meterFlowRate;
	}

	public String getMeterTemp() {
		return this.meterTemp;
	}

	public void setMeterTemp(String meterTemp) {
		this.meterTemp = meterTemp;
	}

	public String getMeterPres() {
		return this.meterPres;
	}

	public void setMeterPres(String meterPres) {
		this.meterPres = meterPres;
	}

	public String getContSumGas() {
		return this.contSumGas;
	}

	public void setContSumGas(String contSumGas) {
		this.contSumGas = contSumGas;
	}

	public String getContSurplusGas() {
		return this.contSurplusGas;
	}

	public void setContSurplusGas(String contSurplusGas) {
		this.contSurplusGas = contSurplusGas;
	}

	public String getOilState() {
		return this.oilState;
	}

	public void setOilState(String oilState) {
		this.oilState = oilState;
	}

	public String getIsAddOil() {
		return this.isAddOil;
	}

	public void setIsAddOil(String isAddOil) {
		this.isAddOil = isAddOil;
	}

	public String getNoAddReason() {
		return this.noAddReason;
	}

	public void setNoAddReason(String noAddReason) {
		this.noAddReason = noAddReason;
	}

	public String getOilResult() {
		return this.oilResult;
	}

	public void setOilResult(String oilResult) {
		this.oilResult = oilResult;
	}

	public String getMeterCellState() {
		return this.meterCellState;
	}

	public void setMeterCellState(String meterCellState) {
		this.meterCellState = meterCellState;
	}

	public String getIsChangeMeterCell() {
		return this.isChangeMeterCell;
	}

	public void setIsChangeMeterCell(String isChangeMeterCell) {
		this.isChangeMeterCell = isChangeMeterCell;
	}

	public String getIsChargeMeterCell() {
		return this.isChargeMeterCell;
	}

	public void setIsChargeMeterCell(String isChargeMeterCell) {
		this.isChargeMeterCell = isChargeMeterCell;
	}

	public String getMeterCellMoney() {
		return this.meterCellMoney;
	}

	public void setMeterCellMoney(String meterCellMoney) {
		this.meterCellMoney = meterCellMoney;
	}

	public String getNoMeterFeeReason() {
		return this.noMeterFeeReason;
	}

	public void setNoMeterFeeReason(String noMeterFeeReason) {
		this.noMeterFeeReason = noMeterFeeReason;
	}

	public String getMeterDealAdvice() {
		return this.meterDealAdvice;
	}

	public void setMeterDealAdvice(String meterDealAdvice) {
		this.meterDealAdvice = meterDealAdvice;
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

	public String getContCellState() {
		return this.contCellState;
	}

	public void setContCellState(String contCellState) {
		this.contCellState = contCellState;
	}

	public String getIsChangeContCell() {
		return this.isChangeContCell;
	}

	public void setIsChangeContCell(String isChangeContCell) {
		this.isChangeContCell = isChangeContCell;
	}

	public String getIsChargeContCell() {
		return this.isChargeContCell;
	}

	public void setIsChargeContCell(String isChargeContCell) {
		this.isChargeContCell = isChargeContCell;
	}

	public String getContCellMoney() {
		return this.contCellMoney;
	}

	public void setContCellMoney(String contCellMoney) {
		this.contCellMoney = contCellMoney;
	}

	public String getNoContFeeReasion() {
		return this.noContFeeReasion;
	}

	public void setNoContFeeReasion(String noContFeeReasion) {
		this.noContFeeReasion = noContFeeReasion;
	}

	public String getContDealAdvice() {
		return this.contDealAdvice;
	}

	public void setContDealAdvice(String contDealAdvice) {
		this.contDealAdvice = contDealAdvice;
	}

	public String getGauFaultDesc() {
		return this.gauFaultDesc;
	}

	public void setGauFaultDesc(String gauFaultDesc) {
		this.gauFaultDesc = gauFaultDesc;
	}

	public String getGauFaultDeal() {
		return this.gauFaultDeal;
	}

	public void setGauFaultDeal(String gauFaultDeal) {
		this.gauFaultDeal = gauFaultDeal;
	}

	public String getGauFaultDealResult() {
		return this.gauFaultDealResult;
	}

	public void setGauFaultDealResult(String gauFaultDealResult) {
		this.gauFaultDealResult = gauFaultDealResult;
	}

	public String getSumGas() {
		return this.sumGas;
	}

	public void setSumGas(String sumGas) {
		this.sumGas = sumGas;
	}

}