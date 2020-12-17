package com.sorting;

import java.util.Arrays;

public class BubbleSortImpl {

	public static void main(String[] args) {

		int[] intArray = { -15, 10, 47, 4, 67, 12 };

		sortArray(intArray);
		System.out.println(Arrays.toString(intArray));
	}

	public static int[] sortArray(int[] intArray) {

		if (intArray.length == 1) {
			return intArray;
		}
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[i + 1]) {
					swap(intArray, i, i + 1);
				}

			}
		}

		return intArray;
	}

	public static void swap(int[] intArray, int i, int j) {

		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;

	}

}
