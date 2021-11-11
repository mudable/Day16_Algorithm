package com.bridgelabz.algorithm;

public class InsertionSort {
	public static void main(String[] args) {
		String[] a = { "abc", "xyz", "pqr", "mno" };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (a[j].compareTo(a[j - 1]) < 0) {
					String temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
