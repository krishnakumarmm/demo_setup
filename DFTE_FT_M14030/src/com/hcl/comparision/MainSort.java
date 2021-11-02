package com.hcl.comparision;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class MainSort {

	public MainSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        
        e1.setEmpId(1);
        e1.setEmpName("Krishna");
        e1.setEmpSalary(10000.0);
        
        e2.setEmpId(2);
        e2.setEmpName("kumar");
        e2.setEmpSalary(13000.0);
        
        e3.setEmpId(3);
        e3.setEmpName("Ganesh");
        e3.setEmpSalary(11000.0);
        
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        
        Collections.sort(empList);  //for arranging the elements
        
        for(Employee e : empList) {
        	System.out.println(e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSalary());
        }
	}

}
