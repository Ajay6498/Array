package com.java.array0910;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 8, 4, 6, 8, 2 };
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		/******************************************************************************/
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					max = arr[i];
					arr[i] = arr[j];
					arr[j] = max;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
