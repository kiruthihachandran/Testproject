package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class AddStringsUsingArrayList {

	public static void main(String[] args) {
		ArrayList<String> als = new ArrayList<>();
		als.add("apple");
		als.add("banana");
		als.add("kiwi");
		als.add("grapes");
		for (String string : als) {
			System.out.println(string);
		}
		}

	}