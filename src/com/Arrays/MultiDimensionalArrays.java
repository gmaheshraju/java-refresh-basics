package com.Arrays;

public class MultiDimensionalArrays {

	public static void main(String args[]) {
		// declaring and initializing 2D array
		int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
		
		//00,01,02
		//10,11,12
		//20,21,22

		// printing 2D array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++){
				System.out.print(arr[i][j] + " ");
				
				//positions
				//00,01,02
				//10,11,12
				//20,21,22
				
			}
			System.out.println();
		}
		int [][] multiDimArray= {{1,2,3},{4,5,6},{7,8,9}};
		
		
		for(int i =0 ; i<3 ; i++){
			
			for(int j=0;j<3;j++){
				
				System.out.print(multiDimArray[i][j] + " ");
				
			}
			System.out.println();
			
			
		}
		int[][] arr2d = new int[10][20];
		arr2d[0][0] = 10;
	}

	
	
}

