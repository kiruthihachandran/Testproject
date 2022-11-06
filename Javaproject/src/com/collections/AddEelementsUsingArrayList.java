package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class AddEelementsUsingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(12);
		al.add(23);
		al.add(12);
		al.add(12);
		al.add(9);
		al.add(889);
		al.remove(3);

		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		System.out.println(al);
		System.out.println("array size:" + al.size());
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			// for (Integer integer : al) {

			// System.out.println("array Elements are:" + integer);

		}
	}

}
