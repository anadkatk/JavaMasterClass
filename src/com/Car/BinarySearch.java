package com.Car;
import java.util.Arrays;

public class BinarySearch {
	public void search() {
		int arr[] = {10,20,35,44,52,67,78,88,95};
		Arrays.sort(arr);
		
		int key = 22;
		int res= Arrays.binarySearch(arr, key);
		if (res >0) {
			System.out.println(key + " Found at index = " + res);
			
		}
		else {
			System.out.println(key + " not found");
		}
		
	}
}
