package com.app.org;

public class Worker extends Emp {

	/*
	 * 3.3 Worker state --id,name,basic,deptId,hoursWorked,hourlyRate Behaviour---
	 * 1. get worker details -- : override toString. 2. compute net salary (formula:
	 * = basic+(hoursWorked*hourlyRate) --override computeNetSalary 3. get hrlyRate
	 * of the worker -- add a new method to return hourly rate of a worker.(getter)
	 */

	private double hoursWorked;
	private double hourlyRate;

	public Worker(int id, String name, int deptId, double basic, double hoursWorked, double hourlyRate) {

		super(id, name, deptId, basic);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;

	}

	@Override
	public String toString() {
		return "Worker_Details: " + super.toString() + " " + hoursWorked + " " + hourlyRate;
	}

	public double computeNetSalary() {
		return super.getBasic() + (hoursWorked * hourlyRate);
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

}
