package com.wwwStreamApi10sep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1 {

	public static void main(String[] args) {
		
		List<String> cities = Arrays.asList("Bangalore","Chennia","Hydrabad","Ahmedabad","Bhubaneswar");
		
		List<String> outPut = cities.stream().filter(w->w.startsWith("B")).map(word ->word.toUpperCase()).collect(Collectors.toList());
		System.out.println(outPut);

	}

}
