package com.java.array0910;

public class Largest {
	
	public static void main(String[] args) {
		int arr[]= {1,2,6,3,8,9};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					max=arr[j];
				}
			}
		}
		System.out.println(max);
	}

}
