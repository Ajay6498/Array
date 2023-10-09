package com.java.array0910;

public class SecondLarge {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 33, 66, 77, 98, 55 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					max = arr[j];
					arr[j] = arr[i];
					arr[i] = max;
				}
			}

		}
		System.out.println(arr[1]);

	}
}
