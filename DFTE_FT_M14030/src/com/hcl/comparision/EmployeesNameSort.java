package com.hcl.comparision;

import java.util.Comparator;

public class EmployeesNameSort implements Comparator<Employees> {

	public EmployeesNameSort() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Employees o1, Employees o2) {
		// TODO Auto-generated method stub
		return o1.getEmpName().compareTo(o2.getEmpName());
	}

}
