package com.collections;

import java.util.HashMap;

import java.util.Map;

public class AddElementsInHashmap {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(12,"Krithi");
		m.put(23, "Kiki");
		m.put(20, "ramyaa");
		m.put(20, "Priya");
		m.put(29, "kiki");
		for (Map.Entry<Integer, String> entry : m.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
		
		}
		}
}

