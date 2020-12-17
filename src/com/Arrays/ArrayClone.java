package com.Arrays;

public class ArrayClone {

	public static void main(String args[]) {
		int[] intArray = { 1, 2, 3 };

		int[] cloneArray = intArray.clone();

		// will print false as deep copy is created
		// for one-dimensional array
		System.out.println(intArray == cloneArray);

		System.out.println(intArray.equals(cloneArray));

		for (int i = 0; i < cloneArray.length; i++) {
			System.out.print(cloneArray[i] + " ");
		}

		int[][] intArray2 = { { 1, 2, 3 }, { 4, 5 } };

		int[][] cloneArray2 = intArray2.clone();

		// will print false
		System.out.println(intArray2 == cloneArray2);
		
		//print false
		System.out.println(intArray2.equals(cloneArray2));

		// will print true as shallow copy is created
		// i.e. sub-arrays are shared
		System.out.println(intArray2[0] == cloneArray2[0]);
		System.out.println(intArray2[1] == cloneArray2[1]);

	}
}
