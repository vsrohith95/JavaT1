package com.marlabs.test1;

public class Q3SequenceNumbers123True {
	public static boolean seq(int[] n) {

		for (int i = 0; i < n.length - 1; i++) {
			if (n[i] == 1 && n[i + 1] == 2 && n[i + 2] == 3) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		int Arr1[] = { 1, 1, 2, 3, 1 };
		int Arr2[] = { 1, 1, 2, 4, 1 };
		int Arr3[] = { 1, 1, 2, 1, 2, 3 };

		boolean result = seq(Arr1);
		boolean result1 = seq(Arr2);
		boolean result2 = seq(Arr3);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}

}
