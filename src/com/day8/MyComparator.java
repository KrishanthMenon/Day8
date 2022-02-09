package com.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class MyComparator {

	
	public static void main(String args[])
	{

		Set<Employee> employeeList=new TreeSet<Employee>();
		employeeList.add(new Employee(10, "X", 101.0f));
		employeeList.add(new Employee(1, "Z", 50.0f));
		employeeList.add(new Employee(2, "A", 10.0f));
		employeeList.add(new Employee(100, "B", 5.0f));
		employeeList.add(new Employee(5, "E", 60.0f));
		System.out.println("Before sort");
		employeeList.forEach(System.out::println);
		System.out.println("After sort");
	}
}
