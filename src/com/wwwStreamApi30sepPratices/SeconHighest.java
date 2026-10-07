package com.wwwStreamApi30sepPratices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SeconHighest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2000,3000,3700,3700,5000,5000,3400);
		
		Integer sh =list.stream().distinct().sorted((a,b)->(b-a)).skip(1).findFirst().get();
		
		System.out.println(sh);

	}

}
