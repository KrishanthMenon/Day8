package com.day8;

import java.util.*;  
class AgeComparator implements Comparator{ 
	class Student{  
		int rollno;  
		String name;  
		int age;  
		Student(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
}  
public int compare(Object o1,Object o2){  
	Student s1=(Student)o1;  
	Student s2=(Student)o2;  
	  
	if(s1.age==s2.age)  
	return 0;  
	else if(s1.age>s2.age)  
	return 1;  
	else  
	return -1;  
}  
}  