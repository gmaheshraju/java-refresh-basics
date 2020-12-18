package com.sorting;

import java.util.Arrays;

public class BubbleSortRecursive {

	// A function to implement bubble sort
	static void bubbleSort(int arr[], int n) {
		// Base case
		if (n == 1){
			return;
		}

		// One pass of bubble sort. After
		// this pass, the largest element
		// is moved (or bubbled) to end.
		for (int i = 0; i < n - 1; i++)
			if (arr[i] > arr[i + 1]) {
				swap(arr, i, i+1);
			}

		// Largest element is fixed,
		// recur for remaining array
		bubbleSort(arr, n - 1);
	}

	// Driver Method
	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };

		bubbleSort(arr, arr.length);

		System.out.println("Sorted array : ");
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int[] intArray, int i, int j) {

		if(i == j){
			return;
		}
		
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;

	}
}
