package com.marlabs.test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q2MeanMedianModefromFile {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		BufferedReader b = new BufferedReader(new FileReader(
				"C:\\\\Users\\\\vc286.DESKTOP-16OAEE8\\\\MarlabsTraining\\\\JavaTest1\\\\src\\\\com\\\\marlabs\\\\test1\\\\ExampleFile.txt"));
		String l;
		int sum = 0;
		int count = 0;
		double Mean = 0.0;
		double Median = 0.0;
		double Mode = 0.0;

		while ((l = b.readLine()) != null) {
			sum += Integer.parseInt(l);
			count++;
		}
		b.close();
		Mean = (double) sum / count;
		System.out.println("Sum of the number in the file is: " + sum + " Number of integers in the file are: " + count
				+ " So the Mean is: " + Mean);
	}

}
