package com.collections;

import java.util.TreeSet;

public class AddStringUsingTreeSet {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("bat");
		ts.add("ball");
		ts.add("pen");
		ts.add("pencil");
		ts.add("ink");
		ts.add(null);
		System.out.println(ts);
		

	}

}
