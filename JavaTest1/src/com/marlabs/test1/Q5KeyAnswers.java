package com.marlabs.test1;

public class Q5KeyAnswers {
	public static int ScoreUp(String[] key, String[] answers) {
		int score = 0;
		for (int i = 0; i < key.length; i++) {
			if (key[i].equals(answers[i])) {
				score += 4;
			}
			if (!key[i].equals(answers[i]) && (!answers[i].equals("?"))) {
				score += -1;
			}
		}
		return score;
	}

	public static void main(String[] args) {
		String str[] = { "a", "a", "b", "b" };
		String str1[] = { "a", "c", "b", "c" };
		int result = ScoreUp(str, str1);
		System.out.println(result);
	}

}
