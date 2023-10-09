package com.java.array0910;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arrayWithDuplicates = { 1, 2, 2, 3, 4, 4, 5 };
		Arrays.sort(arrayWithDuplicates);

		int length = arrayWithDuplicates.length;
		int j = 0;
		for (int i = 0; i < length - 1; i++) {
			if (arrayWithDuplicates[i] != arrayWithDuplicates[i + 1]) {
				arrayWithDuplicates[j++] = arrayWithDuplicates[i];
			}
		}
		arrayWithDuplicates[j++] = arrayWithDuplicates[length - 1]; 
		int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, j);
		System.out.println(Arrays.toString(arrayWithoutDuplicates));
	}
}
