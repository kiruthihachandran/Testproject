package com.exception;

public class exceptionTutorial {
	public void printNumber() {
		try {
			System.out.println("Before Exception");
			int i = 10 / 0;
			System.out.println("After Exception");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally block");

		}
	}

	public static void main(String[] args) {
		exceptionTutorial e = new exceptionTutorial();
		e.printNumber();

		System.out.println("hey");
	}

}
