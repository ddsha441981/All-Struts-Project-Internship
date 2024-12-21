package org.spring.dto;

public class ShiftScheduledBeans {

	private int shiftId;
	private String departmentName;
	private String empName;
	private String totalEmp;
	private String shiftName;
	private String startingPoint;
	private String dispatchName;
	private String shiftdate;
	private int routeId;
	private int empId;

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getShiftId() {
		return shiftId;
	}

	public void setShiftId(int shiftId) {
		this.shiftId = shiftId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getTotalEmp() {
		return totalEmp;
	}

	public void setTotalEmp(String totalEmp) {
		this.totalEmp = totalEmp;
	}

	public String getShiftName() {
		return shiftName;
	}

	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getDispatchName() {
		return dispatchName;
	}

	public void setDispatchName(String dispatchName) {
		this.dispatchName = dispatchName;
	}

	public String getShiftdate() {
		return shiftdate;
	}

	public void setShiftdate(String shiftdate) {
		this.shiftdate = shiftdate;
	}

}
