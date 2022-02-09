package com.day8;

import java.util.*;

public class MyMap {
		
	public static void main(String args[])
	{
		  Map<Integer,Employee> map3=new TreeMap<Integer,Employee>(); 
		  map3.put(1000,new Employee(101,"X",1000f));
		  System.out.println(map3);
		  
		  Map<Integer,Employee> map4=new TreeMap<Integer,Employee>(); 
		  map4.put(1000,new Employee(102,"Y",2000f));
		  System.out.println(map4);		
	}

}
