package com.wwwStreamApi10sepQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1 {

	public static void main(String[] args) {
		
		List<String> lists = Arrays.asList("Bibek","Bikash","Binayak","Abhijeet");
		
		List<String> output = lists.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(output);
	}

}
