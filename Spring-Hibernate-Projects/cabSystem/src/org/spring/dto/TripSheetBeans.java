package org.spring.dto;

public class TripSheetBeans {

	private int tripsheetId;
	private String vehicleNo;
	private int allocateId;
	private String rateKm;
	private String totalKm;
	private String totalAmt;

	public int getTripsheetId() {
		return tripsheetId;
	}

	public void setTripsheetId(int tripsheetId) {
		this.tripsheetId = tripsheetId;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public int getAllocateId() {
		return allocateId;
	}

	public void setAllocateId(int allocateId) {
		this.allocateId = allocateId;
	}

	public String getRateKm() {
		return rateKm;
	}

	public void setRateKm(String rateKm) {
		this.rateKm = rateKm;
	}

	public String getTotalKm() {
		return totalKm;
	}

	public void setTotalKm(String totalKm) {
		this.totalKm = totalKm;
	}

	public String getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}

}
