package com.wwwStreamApi15sep;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver1 {

	public static void main(String[] args) {
		
		//List<Integer> inPut = Arrays.asList(1,2,3,43,43,32,1,23,456,7,87,5,4,3,4,55,56,7,7,8,8,9,7);
		
		//Map<Boolean,List<Integer>> outPut=inPut.stream().
		//collect(Collectors.partitioningBy(n->n%2==0));
		
		//System.out.println(outPut);
		
		//String name = "bibek";
		//List<Character> input = name.chars().mapToObj(c->(char)c).
		//collect(Collectors.toList());
		
		String name = "swiss";
		Map<Character, Long> input = name.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(c->c,Collectors.counting()));

		System.out.println(input);
	}

}
