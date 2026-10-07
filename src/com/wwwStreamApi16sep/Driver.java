package com.wwwStreamApi16sep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("CHE","DL","HYD","BLR","AHM","BBSR");

		List<String> out = list.stream().filter(w->w.startsWith("B")).collect(Collectors.toList());
		
		System.out.println(out);
		
		List<String> out1 = list.parallelStream().filter(w->w.startsWith("B")).collect(Collectors.toList());
		
		System.out.println(out1);
		
		
	}

}
