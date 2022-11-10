package com.collections;

import java.util.HashMap;
import java.util.Map;

public class GetVowelCount {

	public static Map<Character, Integer> VowelIsPresent(String name) {
		Map<Character, Integer> hash = new HashMap<>();
		char input[] = name.toCharArray();
		hash.put('a', 0);
		hash.put('e', 0);
		hash.put('i', 0);
		hash.put('o', 0);
		hash.put('u', 0);
		for (int i = 0; i < input.length; i++) {
			if (hash.containsKey(input[i])) {
				int value = hash.get(input[i]);
				hash.put(input[i], value + 1);
			}

		}
		return hash;

	}

	public static void main(String[] args) {
		Map<Character, Integer> charCountMap = VowelIsPresent("Selenium");
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

	}

}
