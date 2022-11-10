package com.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class EachWordCount {
	public static Map<String, Integer> findEachWordCount(String textfile) {

		Map<String, Integer> word = new HashMap<String, Integer>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(textfile));
			String eachline;
			while ((eachline = br.readLine()) != null) {

				String[] arr = eachline.split(" ");
				for (int i = 0; i < arr.length; i++) {
					if (word.containsKey(arr[i])) {
						int value = word.get(arr[i]);
						word.put(arr[i], value + 1);

					} else {
						word.put(arr[i], 1);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return word;

	}

	public static void main(String[] args) {
		Map<String, Integer> wordCountMap = findEachWordCount("E:\\virat.txt");
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
