package com.app.org;

public class Emp {

	/*
	 * 3.1 Emp state--- id(int), name, deptId , basic(double) Accept all of above in
	 * constructor arguments. Behaviour ---1. get emp details -- override toString.
	 * 2. compute net salary ---ret 0 (eg : public double computeNetSalary(){return
	 * 0;})
	 */

	private int id;
	private String name;
	private int deptId;
	private double basic;

	public Emp(int id, String name, int deptId, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.basic = basic;
	}

	public String toString() {
		return "Emp_Details: " + id + " " + name + " " + deptId + " " + basic;
	}

	public double computeNetSalary() {
		return 0;
	}

	public double getBasic() {
		return basic;
	}

	
	

}
