package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class MinAndMaxValues {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(21);
		al.add(23);
		al.add(56);
		al.add(78);
		al.add(34);
		al.add(87);
		al.add(90);
		for (int i = 0; i < al.size(); i++) {
			System.out.println("values  at index ("+i+")" +  al.get(i));
		}
		int max = Collections.max(al);
			System.out.println(" Maximum value "+ max);
			int min = Collections.min(al);
			System.out.println("Minimum value" + min);
			
			
		}

	}

