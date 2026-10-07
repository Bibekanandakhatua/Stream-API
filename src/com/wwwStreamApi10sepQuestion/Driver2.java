package com.wwwStreamApi10sepQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	
	private int salary;
	private String name;
	
	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}
	
	
}
public class Driver2 {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(new Employee(12, "Bibek"),
				new Employee(15, "Bikash"),
				new Employee(34, "Udit"),
				new Employee(9, "Somya"),
				new Employee(2, "Rajat"));
		
		List<String> outPut = list.stream().filter(i->i.getSalary()>10).map(word->word.getName()).collect(Collectors.toList());
		
		System.out.println(outPut);
		

	}

}
