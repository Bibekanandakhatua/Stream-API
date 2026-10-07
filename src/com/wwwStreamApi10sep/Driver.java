package com.wwwStreamApi10sep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		// Storing the data
		List<String> cities = Arrays.asList("Bangalore", "Chennia", "Hydrabad", "Ahmedabad", "Bhubaneswar", "Ajmir");

		// processing --->Task(Find the name starting with "B" )

		// 1.Convert the collection to stream object
		Stream<String> inStream = cities.stream();

		// 2.find the name starting with "B" -->use filter
		Stream<String> filStream = inStream.filter(city -> city.startsWith("A"));

		Stream<String> convert = filStream.map(word -> word.toUpperCase());

		// 3. collect or print the city name
		List<String> citystartwithB = convert.collect(Collectors.toList());

		System.out.println(citystartwithB);

		
		
		/*
		 * List<String> citystartwithB1 =
		 * cities.stream().filter(w->w.startsWith("B")).collect(Collectors.toList());
		 * System.out.println(citystartwithB1);
		 */
		 
		 
	}

}
