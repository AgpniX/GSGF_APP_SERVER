package com.ebring.gsgfAppServer.entity;

/**
 * CycleCheck entity. @author MyEclipse Persistence Tools
 * 
 * 周检实体类
 */

public class CycleCheck implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cycleCheckId;
	private Gauges gauges;
	private Engineer engineer;
	private String checkDate;
	private String isQualified;
	private String relationData;
	private String isAdjust;
	private String adjustResult;
	private String gauFaceState;
	private String gauFaceResult;
	private String gauMovState;
	private String gauMovResult;
	private String isCharge;
	private String money;
	private String noFeeReason;
	private String dealResult;
	private String maintainProcDesc;
	private Integer abluentCount;
	private String isLowerCapacityRight;
	private String adjustLowerCapacity;
	private String isPressSensorRight;
	private String adjustPressSensor;
	private String isTempSensorRight;
	private String adjustTempSensor;
	private String isCorrectorRight;
	private String adjustCorrector;
	private String oilState;
	private String isAddOil;
	private String isChargeOil;
	private String oilMoney;
	private String noOilFeeReason;
	private String noAddOilReason;
	private String meterCellState;
	private String isChangeMeterCell;
	private String isChargeMeterCell;
	private String meterCellMoney;
	private String noMeterFeeReason;
	private String meterDealAdvice;
	private String contCellState;
	private String isChangeContCell;
	private String isChargeContCell;
	private String contCellMoney;
	private String noContFeeReason;
	private String contDealAdvice;
	private String fieldMaintainTime;

	private String gasNochangeReason;
	// Constructors

	/** default constructor */
	public CycleCheck() {
	}

	/** minimal constructor */
	public CycleCheck(String cycleCheckId) {
		this.cycleCheckId = cycleCheckId;
	}

	/** full constructor */
	public CycleCheck(String cycleCheckId, Gauges gauges, Engineer engineer,
			String checkDate, String isQualified, String relationData,
			String isAdjust, String adjustResult, String gauFaceState,
			String gauFaceResult, String gauMovState, String gauMovResult,
			String isCharge, String money, String noFeeReason,
			String dealResult, String maintainProcDesc, Integer abluentCount,
			String isLowerCapacityRight, String adjustLowerCapacity,
			String isPressSensorRight, String adjustPressSensor,
			String isTempSensorRight, String adjustTempSensor,
			String isCorrectorRight, String adjustCorrector, String oilState,
			String isAddOil, String isChargeOil, String oilMoney,
			String noOilFeeReason, String noAddOilReason,
			String meterCellState, String isChangeMeterCell,
			String isChargeMeterCell, String meterCellMoney,
			String noMeterFeeReason, String meterDealAdvice,
			String contCellState, String isChangeContCell,
			String isChargeContCell, String contCellMoney,
			String noContFeeReason, String contDealAdvice,
			String fieldMaintainTime,String gasNochangeReason) {
		this.cycleCheckId = cycleCheckId;
		this.gauges = gauges;
		this.engineer = engineer;
		this.checkDate = checkDate;
		this.isQualified = isQualified;
		this.relationData = relationData;
		this.isAdjust = isAdjust;
		this.adjustResult = adjustResult;
		this.gauFaceState = gauFaceState;
		this.gauFaceResult = gauFaceResult;
		this.gauMovState = gauMovState;
		this.gauMovResult = gauMovResult;
		this.isCharge = isCharge;
		this.money = money;
		this.noFeeReason = noFeeReason;
		this.dealResult = dealResult;
		this.maintainProcDesc = maintainProcDesc;
		this.abluentCount = abluentCount;
		this.isLowerCapacityRight = isLowerCapacityRight;
		this.adjustLowerCapacity = adjustLowerCapacity;
		this.isPressSensorRight = isPressSensorRight;
		this.adjustPressSensor = adjustPressSensor;
		this.isTempSensorRight = isTempSensorRight;
		this.adjustTempSensor = adjustTempSensor;
		this.isCorrectorRight = isCorrectorRight;
		this.adjustCorrector = adjustCorrector;
		this.oilState = oilState;
		this.isAddOil = isAddOil;
		this.isChargeOil = isChargeOil;
		this.oilMoney = oilMoney;
		this.noOilFeeReason = noOilFeeReason;
		this.noAddOilReason = noAddOilReason;
		this.meterCellState = meterCellState;
		this.isChangeMeterCell = isChangeMeterCell;
		this.isChargeMeterCell = isChargeMeterCell;
		this.meterCellMoney = meterCellMoney;
		this.noMeterFeeReason = noMeterFeeReason;
		this.meterDealAdvice = meterDealAdvice;
		this.contCellState = contCellState;
		this.isChangeContCell = isChangeContCell;
		this.isChargeContCell = isChargeContCell;
		this.contCellMoney = contCellMoney;
		this.noContFeeReason = noContFeeReason;
		this.contDealAdvice = contDealAdvice;
		this.fieldMaintainTime = fieldMaintainTime;
		this.gasNochangeReason = gasNochangeReason;
	}

	// Property accessors

	public String getCycleCheckId() {
		return this.cycleCheckId;
	}

	public void setCycleCheckId(String cycleCheckId) {
		this.cycleCheckId = cycleCheckId;
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

	public String getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}

	public String getIsQualified() {
		return this.isQualified;
	}

	public void setIsQualified(String isQualified) {
		this.isQualified = isQualified;
	}

	public String getRelationData() {
		return this.relationData;
	}

	public void setRelationData(String relationData) {
		this.relationData = relationData;
	}

	public String getIsAdjust() {
		return this.isAdjust;
	}

	public void setIsAdjust(String isAdjust) {
		this.isAdjust = isAdjust;
	}

	public String getAdjustResult() {
		return this.adjustResult;
	}

	public void setAdjustResult(String adjustResult) {
		this.adjustResult = adjustResult;
	}

	public String getGauFaceState() {
		return this.gauFaceState;
	}

	public void setGauFaceState(String gauFaceState) {
		this.gauFaceState = gauFaceState;
	}

	public String getGauFaceResult() {
		return this.gauFaceResult;
	}

	public void setGauFaceResult(String gauFaceResult) {
		this.gauFaceResult = gauFaceResult;
	}

	public String getGauMovState() {
		return this.gauMovState;
	}

	public void setGauMovState(String gauMovState) {
		this.gauMovState = gauMovState;
	}

	public String getGauMovResult() {
		return this.gauMovResult;
	}

	public void setGauMovResult(String gauMovResult) {
		this.gauMovResult = gauMovResult;
	}

	public String getIsCharge() {
		return this.isCharge;
	}

	public void setIsCharge(String isCharge) {
		this.isCharge = isCharge;
	}

	public String getMoney() {
		return this.money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getNoFeeReason() {
		return this.noFeeReason;
	}

	public void setNoFeeReason(String noFeeReason) {
		this.noFeeReason = noFeeReason;
	}

	public String getDealResult() {
		return this.dealResult;
	}

	public void setDealResult(String dealResult) {
		this.dealResult = dealResult;
	}

	public String getMaintainProcDesc() {
		return this.maintainProcDesc;
	}

	public void setMaintainProcDesc(String maintainProcDesc) {
		this.maintainProcDesc = maintainProcDesc;
	}

	public Integer getAbluentCount() {
		return this.abluentCount;
	}

	public void setAbluentCount(Integer abluentCount) {
		this.abluentCount = abluentCount;
	}

	public String getIsLowerCapacityRight() {
		return this.isLowerCapacityRight;
	}

	public void setIsLowerCapacityRight(String isLowerCapacityRight) {
		this.isLowerCapacityRight = isLowerCapacityRight;
	}

	public String getAdjustLowerCapacity() {
		return this.adjustLowerCapacity;
	}

	public void setAdjustLowerCapacity(String adjustLowerCapacity) {
		this.adjustLowerCapacity = adjustLowerCapacity;
	}

	public String getIsPressSensorRight() {
		return this.isPressSensorRight;
	}

	public void setIsPressSensorRight(String isPressSensorRight) {
		this.isPressSensorRight = isPressSensorRight;
	}

	public String getAdjustPressSensor() {
		return this.adjustPressSensor;
	}

	public void setAdjustPressSensor(String adjustPressSensor) {
		this.adjustPressSensor = adjustPressSensor;
	}

	public String getIsTempSensorRight() {
		return this.isTempSensorRight;
	}

	public void setIsTempSensorRight(String isTempSensorRight) {
		this.isTempSensorRight = isTempSensorRight;
	}

	public String getAdjustTempSensor() {
		return this.adjustTempSensor;
	}

	public void setAdjustTempSensor(String adjustTempSensor) {
		this.adjustTempSensor = adjustTempSensor;
	}

	public String getIsCorrectorRight() {
		return this.isCorrectorRight;
	}

	public void setIsCorrectorRight(String isCorrectorRight) {
		this.isCorrectorRight = isCorrectorRight;
	}

	public String getAdjustCorrector() {
		return this.adjustCorrector;
	}

	public void setAdjustCorrector(String adjustCorrector) {
		this.adjustCorrector = adjustCorrector;
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

	public String getIsChargeOil() {
		return this.isChargeOil;
	}

	public void setIsChargeOil(String isChargeOil) {
		this.isChargeOil = isChargeOil;
	}

	public String getOilMoney() {
		return this.oilMoney;
	}

	public void setOilMoney(String oilMoney) {
		this.oilMoney = oilMoney;
	}

	public String getNoOilFeeReason() {
		return this.noOilFeeReason;
	}

	public void setNoOilFeeReason(String noOilFeeReason) {
		this.noOilFeeReason = noOilFeeReason;
	}

	public String getNoAddOilReason() {
		return this.noAddOilReason;
	}

	public void setNoAddOilReason(String noAddOilReason) {
		this.noAddOilReason = noAddOilReason;
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

	public String getNoContFeeReason() {
		return this.noContFeeReason;
	}

	public void setNoContFeeReason(String noContFeeReason) {
		this.noContFeeReason = noContFeeReason;
	}

	public String getContDealAdvice() {
		return this.contDealAdvice;
	}

	public void setContDealAdvice(String contDealAdvice) {
		this.contDealAdvice = contDealAdvice;
	}

	public String getFieldMaintainTime() {
		return this.fieldMaintainTime;
	}

	public void setFieldMaintainTime(String fieldMaintainTime) {
		this.fieldMaintainTime = fieldMaintainTime;
	}

	public String getGasNochangeReason() {
		return gasNochangeReason;
	}

	public void setGasNochangeReason(String gasNochangeReason) {
		this.gasNochangeReason = gasNochangeReason;
	}
   
	
}