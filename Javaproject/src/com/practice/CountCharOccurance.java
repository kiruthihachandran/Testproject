package com.practice;

import java.util.HashMap;
import java.util.Map;

public class CountCharOccurance {
	public static void getCharCount(String name) {
		Map<Character, Integer> hash = new HashMap<>();
		char input[] = name.toCharArray();
		for (char c : input) {
			if (hash.containsKey(c)) {
				hash.put(c, hash.get(c) + 1);
			} else {
				hash.put(c, 1);
			}
		}

		System.out.println(name + "= " + hash);
	}

	public static void main(String[] args) {
		getCharCount("SELENIUM");
	}
}
