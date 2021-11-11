package com.bridgelabz.algorithm;

public class BubbleSort {
	public void Sorting() {
		/* declare array. loop to check adjustant numbers */
		int[] a = { 36, 19, 29, 12, 5 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			//
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		// To print array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		obj.Sorting();
	}
}
