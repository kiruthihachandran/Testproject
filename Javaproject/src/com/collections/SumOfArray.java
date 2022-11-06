package com.collections;

import java.util.ArrayList;
import java.util.List;

public class SumOfArray {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		al.add(21);
		al.add(32);
		al.add(56);
		al.add(87);
		al.add(76);
		al.add(98);
		int total = 0;

		for (Integer integer : al) {
			total = total + integer;
		}

					System.out.println(total);

				
		}
	}

