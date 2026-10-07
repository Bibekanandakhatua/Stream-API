package com.wwwStreamApi11sep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("CH","DL","HYD","BLR","AHM","HYD","BLR","AHM");
		
		List<String> out = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(out);

	}

}
