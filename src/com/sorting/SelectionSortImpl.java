package com.sorting;

import java.util.Arrays;

public class SelectionSortImpl {

	public static void main(String[] args) {

		int[] intArray = { 10, 20, -30, 5, 40, 6 };

		
		for (int larestUnsortedIndex = intArray.length - 1; larestUnsortedIndex > 0; larestUnsortedIndex--) {

			int largest = 0;

			for (int i = 1; i <= larestUnsortedIndex; i++) {

				if (intArray[i] > intArray[largest]) {
					largest = i;
				}
			}

			swap(intArray, largest, larestUnsortedIndex);

		}

		System.out.println(Arrays.toString(intArray));

	}

	// swap

	public static void swap(int[] intArr, int i, int j) {
		if (i == j) {
			return;
		}

		int temp = intArr[i];
		intArr[i] = intArr[j];
		intArr[j] = temp;

	}
}
