package com.wwwStreamApi10sepQuestion;

import java.nio.file.DirectoryStream.Filter;
import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class product{
	 
	int price;
	String name;
	public double getPrice;
	
	
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public product(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
}
public class Driver3
{
	public static void main(String[] args) {
		
		List<product> list = Arrays.asList(new product(1200,"Fan"),
				new product(1400,"Refrigerator"),
				new product(200,"Iron"),
				new product(800,"Washing Machine"),
				new product(1900,"Water Filter"));
		
		List<Double> outPut = list.stream().filter(n->n.getPrice()>1000).map(n->n.getPrice()*0.9).collect(Collectors.toList());
	
		System.out.println(outPut);
		
		}

	}


