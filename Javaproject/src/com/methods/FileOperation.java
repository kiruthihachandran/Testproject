package com.methods;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileOperation {
	public static String stringPresentInTheFile(String input, String findstring) throws Throwable {
		FileReader fr = new FileReader(input);
		BufferedReader br = new BufferedReader(fr);
		int count = 0;
		while ((input = br.readLine()) != null) {
			String[] array = input.split(" ");
			for (int i = 0; i < array.length; i++) {
				if (array[i].equalsIgnoreCase(findstring)) {
					count++;
				}
			}
		}
		fr.close();
		br.close();

		String result = Integer.toString(count);
		return result;
	}

	public static void main(String[] args) throws Throwable {
		String name = stringPresentInTheFile("D:\\virat.txt", "kohli");
		System.out.println(name);
	}
}