package com.bridgelabz.algorithm;

import java.util.Scanner;

public class PrimeNumber_GivenRange {
	public void PrimeNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Starting Number : ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Number : ");
		int end = sc.nextInt();
		System.out.println("Prime numbers between " + start + " and " + end + " are : ");
		int count;
		/*
		 * loop for finding and printing all prime numbers between given range. logic
		 * for checking number is prime or not
		 */
		for (int i = start; i <= end; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count = count + 1;
			}
			if (count == 2)
				System.out.println(i);
		}
		sc.close();
	}

	public static void main(String[] args) {
		PrimeNumber_GivenRange obj = new PrimeNumber_GivenRange();
		obj.PrimeNum();
	}
}
