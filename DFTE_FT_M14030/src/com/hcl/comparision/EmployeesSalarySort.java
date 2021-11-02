package com.hcl.comparision;

import java.util.Comparator;

public class EmployeesSalarySort implements Comparator<Employees>{

	public EmployeesSalarySort() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Employees o1, Employees o2) {
		// TODO Auto-generated method stub
		if (o1.getEmpSalary() > o2.getEmpSalary())
			return 1;
		if (o1.getEmpSalary() < o2.getEmpSalary())
			return -1;
		return 0;
	}

}
