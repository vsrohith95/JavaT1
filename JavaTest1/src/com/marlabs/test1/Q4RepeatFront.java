package com.marlabs.test1;

public class Q4RepeatFront {

	public static String RepeatFront(String str, int n) {
		String result = "";
		while (n > 0) {
			result = result + str.substring(0, n);
			n--;
		}
		return result;
	}

	public static void main(String[] args) {
		String str = RepeatFront("Chocolate", 4);
		System.out.println(str);
		str = RepeatFront("Chocolate", 3);
		System.out.println(str);
	}

}
