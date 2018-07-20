package com.marlabs.test1;

public class Q7ArrayRotation {
	public static int[] rotation(int A[], int k) {

		int size = A.length;
		int[] ret = new int[size];
		if (k < 0 || k > 100 || size == 0) {
			return ret;
		}

		if (size == 1) {
			return A;
		}

		for (int i = 0; i < size; i++) {
			ret[(i + k) % size] = A[i];
		}

		return ret;
	}

	public static void main(String[] args) {
		int b[] = { 3, 8, 9, 7, 6 };
		int k = 3;
		int result[] = rotation(b, k);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}

}
