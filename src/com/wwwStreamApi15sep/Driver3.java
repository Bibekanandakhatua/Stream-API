package com.wwwStreamApi15sep;

import java.util.Arrays;
import java.util.List;

class Account{
	private int salary;
	private String name;
	public Account(int salary, String name) {
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
public class Driver3 {

	public static void main(String[] args) {
		
		List<Account> account = Arrays.asList(new Account(1200,"bibek"), new Account(800,"raza"),new Account(650,"Rajesh"),new Account(3400,"rahul"),new Account(170,"rajat"));
		
		Account output = account.stream().sorted((n1,n2)->Integer.compare(n2.getSalary(), n1.getSalary())).skip(1).findFirst().get();
		
		System.out.println(output.getName()+" and "+output.getSalary());
		
		
	}

}
