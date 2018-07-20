package com.marlabs.test1;

import java.util.HashSet;
import java.util.Set;

public class Q8MinimalMissingPositiveNumber {

	public static int MinimalPositiveInteger(int[] A) {
		int max = Integer.MIN_VALUE;

		if (A.length == 0) {
			return 1;
		}

		Set<Integer> hashSet = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				hashSet.add(A[i]);
			}

			if (A[i] > max) {
				max = A[i];
			}
		}

		if (max < 0) {
			return 1;
		}

		for (int i = 1; i <= max; i++) {
			if (hashSet.contains(i) == false) {
				return i;
			}
		}

		return max + 1;
	}

	public static void main(String[] args) {
		int[] A = { 1, 3, 6, 4, 1, 2 };
		int result = MinimalPositiveInteger(A);
		System.out.println(result);
	}

}
