package com.wwwStreamApi10sepQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(12,34,56,78,76,54);
		
		List<Integer> outPut = integers.stream().filter(I->I > 50).collect(Collectors.toList());
		
		System.out.println(outPut);
	}

}
