package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaptoListConvert {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		ArrayList<Integer> keyValue = new ArrayList<Integer>(map.keySet());
		ArrayList<String> Valuelist = new ArrayList<String>(map.values());
		System.out.println(keyValue);
		System.out.println(Valuelist);
	}
}
