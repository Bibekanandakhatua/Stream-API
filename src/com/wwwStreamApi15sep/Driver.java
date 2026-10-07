package com.wwwStreamApi15sep;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		
		List<String> cities = Arrays.asList(" Bengaluru","Mumbai"," Delhi","Hyderabad","Chennai","Kolkata","Pune","Ahmedabad");
		
		//Long count = cities.stream().collect(Collectors.counting());
		//System.out.println(count);
		
		Map<Object,List<String>> output = cities.stream().collect(Collectors.groupingBy(c->c.length()));
		
		System.out.println(output);
	}

}
