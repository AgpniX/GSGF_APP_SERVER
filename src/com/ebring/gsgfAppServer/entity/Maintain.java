package com.ebring.gsgfAppServer.entity;

/**
 * Maintain entity. @author MyEclipse Persistence Tools
 */

public class Maintain implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mainId;
	private Gauges gauges;
	private Engineer engineer;
	private String washTime;
	private String gauState;
	private String stopReason;
	private String gauFaceState;
	private String gauFaceResult;
	private String gauMovState;
	private String gauMovResult;
	private String isCharge;
	private String money;
	private String noFeeReason;
	private String noChangeReason;
	private String dealResult;
	private String maintainProcDesc;
	private String abluentCount;
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
	// Constructors

	/** default constructor */
	public Maintain() {
	}

	/** minimal constructor */
	public Maintain(String mainId) {
		this.mainId = mainId;
	}

	/** full constructor */
	public Maintain(String mainId, Gauges gauges, Engineer engineer,
			String washTime, String gauState, String stopReason,
			String gauFaceState, String gauFaceResult, String gauMovState,
			String gauMovResult, String isCharge, String money,
			String noFeeReason, String noChangeReason, String dealResult,
			String maintainProcDesc, String abluentCount, String oilState,
			String isAddOil, String isChargeOil, String oilMoney,
			String noOilFeeReason, String noAddOilReason,
			String meterCellState, String isChangeMeterCell,
			String isChargeMeterCell, String meterCellMoney,
			String noMeterFeeReason, String meterDealAdvice,
			String contCellState, String isChangeContCell,
			String isChargeContCell, String contCellMoney,
			String noContFeeReason, String contDealAdvice,
			String fieldMaintainTime) {
		this.mainId = mainId;
		this.gauges = gauges;
		this.engineer = engineer;
		this.washTime = washTime;
		this.gauState = gauState;
		this.stopReason = stopReason;
		this.gauFaceState = gauFaceState;
		this.gauFaceResult = gauFaceResult;
		this.gauMovState = gauMovState;
		this.gauMovResult = gauMovResult;
		this.isCharge = isCharge;
		this.money = money;
		this.noFeeReason = noFeeReason;
		this.noChangeReason = noChangeReason;
		this.dealResult = dealResult;
		this.maintainProcDesc = maintainProcDesc;
		this.abluentCount = abluentCount;
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
	}

	// Property accessors

	public String getMainId() {
		return this.mainId;
	}

	public void setMainId(String mainId) {
		this.mainId = mainId;
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
 
	public String getWashTime() {
		return this.washTime;
	}

	public void setWashTime(String washTime) {
		this.washTime = washTime;
	}

	public String getGauState() {
		return this.gauState;
	}

	public void setGauState(String gauState) {
		this.gauState = gauState;
	}

	public String getStopReason() {
		return this.stopReason;
	}

	public void setStopReason(String stopReason) {
		this.stopReason = stopReason;
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

	public String getNoChangeReason() {
		return this.noChangeReason;
	}

	public void setNoChangeReason(String noChangeReason) {
		this.noChangeReason = noChangeReason;
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

	public String getAbluentCount() {
		return this.abluentCount;
	}

	public void setAbluentCount(String abluentCount) {
		this.abluentCount = abluentCount;
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

}