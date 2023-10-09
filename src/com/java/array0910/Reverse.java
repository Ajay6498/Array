package com.java.array0910;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 9,8,7,6,5,3 };
		System.out.println(Arrays.toString(arr));
		for (int i = arr.length - 1;i>0; i--) {
			System.out.print(arr[i]+",");
		}
		
		
	}

}
