package com.cheermorning.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

public class DemeterImprove {

	public static void main(String[] args) {
		System.out.println("~~~使用迪米特原则改进~~~");
		// TODO Auto-generated method stub
		SchoolManager schoolManager = new SchoolManager();
		schoolManager.printAllEmployee(new CollegeManager());

	}

}


class Employee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}


class CollegeEmployee {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}


class CollegeManager {
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
		for (int i = 0; i < 10; i++) {
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("学院员工id= " + i);
			list.add(emp);
		}
		return list;
	}

	public void printEmployee(){
		List<CollegeEmployee> list1 = getAllEmployee();
		System.out.println("------------学院员工------------");
		for (CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
	}
}

/**
 * 分析：CollegeEmployee不是SchoolManager的直接朋友
 */
class SchoolManager {
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		
		for (int i = 0; i < 5; i++) {
			Employee emp = new Employee();
			emp.setId("总部员工id= " + i);
			list.add(emp);
		}
		return list;
	}

	void printAllEmployee(CollegeManager sub) {

		//使用迪米特原则
		sub.printEmployee();

		List<Employee> list2 = this.getAllEmployee();
		System.out.println("------------总部员工-----------");
		for (Employee e : list2) {
			System.out.println(e.getId());
		}
	}
}
