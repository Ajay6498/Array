package com.java.array0910;

import java.util.HashMap;
import java.util.Map;

public class Occurrence {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 6, 5, 6 };

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> i : hm.entrySet()) {
			System.out.println(i.getKey() + ":" + i.getValue());
		}
		
		/************************************************************************/
		
		 int maxElement = Integer.MIN_VALUE;
	        for (int element : arr) {
	            maxElement = Math.max(maxElement, element);
	        }

	        // Create an array to store the count of each element
	        int[] elementCounts = new int[maxElement + 1];

	        // Count the occurrences of each element in the array
	        for (int element : arr) {
	            elementCounts[element]++;
	        }

	        // Print the occurrences of each element
	        for (int i = 0; i < elementCounts.length; i++) {
	            if (elementCounts[i] > 0) {
	                System.out.println("Element " + i + " occurs " + elementCounts[i] + " times.");
	            }
	        }
		

	}
}
