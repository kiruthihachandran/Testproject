package com.stringmethods;

public class EscapeSequence {

	public static void main(String[] args) {
		String array[] = new String[5];
		String input = "Moon sun \"Jupiter is a largest planet \" pluto saturn";
		String temp = "";
		int arrayIndex = 0;
		int doublequotescounter = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '"') {
				
				doublequotescounter++;
			} else if (doublequotescounter % 2 == 0 && input.charAt(i) == ' ') {
				array[arrayIndex++] = temp;
				temp = "";

			} else {
				temp = temp + input.charAt(i);
			}

		}
		array[arrayIndex] = temp;
		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}

	}
}
