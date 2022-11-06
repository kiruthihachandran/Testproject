package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class AddElementsUsingLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> Lhs = new LinkedHashSet<Integer>();
		Lhs.add(23);
		Lhs.add(90);
		Lhs.add(89);
		Lhs.add(67);
		Lhs.add(67);
		Lhs.add(89);
		Lhs.add(76);
		for (Iterator iterator = Lhs.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			Lhs.remove(2);

			System.out.println(integer);

		}

		System.out.println(Lhs);

	}

}
