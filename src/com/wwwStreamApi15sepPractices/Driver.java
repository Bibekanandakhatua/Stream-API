package com.wwwStreamApi15sepPractices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Account{
	
	private int salary;
	private String name;
	
	public int getSalary(){
		return salary;
	}
	public String getName() {
		return name;
	}
	
	public Account(int salary,String name) {
		this.salary = salary;
		this.name = name;
		
	}
	
}
public class Driver {

	public static void main(String[] args) {
		
		List<Account> accounts = Arrays.asList(new Account(230,"Bibek"),new Account(530,"Bikash"),new Account(940,"Soumya"),new Account(679,"udit"),new Account(210,"Binayak"));
		
		Account secondHS = accounts.stream().sorted((n1,n2)->n2.getSalary()-n1.getSalary()).skip(1).findFirst().get();
		
		System.out.println(secondHS.getName()+" and "+ secondHS.getSalary());
	
	}

}
