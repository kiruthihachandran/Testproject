package com.collections;

import java.util.HashSet;

public class AddElementsUsingHashset {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(12);
		hs.add(12);
		hs.add(78);
		hs.add(23);
		hs.add(98);
		hs.add(89);

		for (Integer integer : hs) {
			System.out.println(integer);
		}

	}
}
