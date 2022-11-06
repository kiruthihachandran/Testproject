package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class AddStringsUsingHashset {
	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		hs.add("carrot");
		hs.add("beetroot");
		hs.add("beans");
		hs.add("carrot");
		hs.add("pumkin");
		hs.add(null);
		for (String string : hs) {
			System.out.println(string);

		}

	}

}
