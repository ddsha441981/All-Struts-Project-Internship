package org.spring.dto;

public class VehicleAllocatedBeans {

	private int allocateId;
	private String vehicleNo;
	private int empId;
	private int driverId;
	private int routeId;
	private String pickPoint;
	private String dropPoint;
	private String allocatedDate;
	private String allocatedTime;

	public int getAllocateId() {
		return allocateId;
	}

	public void setAllocateId(int allocateId) {
		this.allocateId = allocateId;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public String getPickPoint() {
		return pickPoint;
	}

	public void setPickPoint(String pickPoint) {
		this.pickPoint = pickPoint;
	}

	public String getDropPoint() {
		return dropPoint;
	}

	public void setDropPoint(String dropPoint) {
		this.dropPoint = dropPoint;
	}

	public String getAllocatedDate() {
		return allocatedDate;
	}

	public void setAllocatedDate(String allocatedDate) {
		this.allocatedDate = allocatedDate;
	}

	public String getAllocatedTime() {
		return allocatedTime;
	}

	public void setAllocatedTime(String allocatedTime) {
		this.allocatedTime = allocatedTime;
	}

	@Override
	public String toString() {
		return "VehicleAllocatedBeans [allocateId=" + allocateId + ", vehicleNo=" + vehicleNo + ", empId=" + empId
				+ ", driverId=" + driverId + ", routeId=" + routeId + ", pickPoint=" + pickPoint + ", dropPoint="
				+ dropPoint + ", allocatedDate=" + allocatedDate + ", allocatedTime=" + allocatedTime + "]";
	}
	

	
}
