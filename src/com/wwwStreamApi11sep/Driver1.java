package com.wwwStreamApi11sep;

import java.util.Arrays;
import java.util.List;

public class Driver1 {

	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("CH","DL","HYD","BLR");
		
		//list.stream().filter(e->e.startsWith("C")).limit(1).forEach(l->System.out.println(l));
		
		//list.stream().sorted().forEach(e->System.out.println(e));
		
		list.stream().skip(2).forEach(e->System.out.println(e)  );
	}

}
