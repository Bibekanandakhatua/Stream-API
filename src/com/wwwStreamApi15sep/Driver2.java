package com.wwwStreamApi15sep;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver2 {

	public static void main(String[] args) {
		
		
		String name = "swiss";
		//List<Character> input = name.chars().mapToObj(c->(char)c)
				//.filter(ch->name.indexOf(ch)==name.lastIndexOf(ch)).collect(Collectors.toList());
		Character input = name.chars().mapToObj(c->(char)c)
				.filter(ch->name.indexOf(ch)==name.lastIndexOf(ch)).findFirst().get();
		System.out.println(input);

	}

}
