package com.wwwStreamApi10sep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver2 {

	public static void main(String[] args) {

		List<List<String>> cities = Arrays.asList(Arrays.asList("Bangalore", "Chennia"),
				Arrays.asList("Hydrabad", "Ahmedabad"), Arrays.asList("Bhubaneswar"));
		
		

		List<String> outPut = cities.stream().flatMap(list -> list.stream()).filter(w -> w.startsWith("B"))
				.map(word -> word.toUpperCase()).collect(Collectors.toList());
		System.out.println(outPut);

	}

}
