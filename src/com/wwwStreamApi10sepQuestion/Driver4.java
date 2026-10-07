package com.wwwStreamApi10sepQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver4 {

	public static void main(String[] args) {
		
		List<List<Integer>> list = Arrays.asList(Arrays.asList(10,20),(Arrays.asList(70,40)),(Arrays.asList(40,70)));
		
		List<Integer> outPut = list.stream().flatMap(lis->lis.stream()).collect(Collectors.toList());
		
		System.out.println(outPut);
	}

}
