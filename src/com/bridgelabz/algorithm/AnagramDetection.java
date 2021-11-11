package com.bridgelabz.algorithm;

import java.util.Arrays;

public class AnagramDetection {
	public static void checkAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\S", "");
		String s2 = str1.replaceAll("\\S", "");
		boolean value = true;
		if (s1.length() != s2.length()) {
			value = false;
		} else {
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			value = Arrays.equals(ArrayS1, ArrayS2);
		}
		if (value) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}
	}

	public static void main(String[] args) {
		checkAnagram("Abcd", "Dcba");
		checkAnagram("Abcd", "Pqrs");
	}
}
