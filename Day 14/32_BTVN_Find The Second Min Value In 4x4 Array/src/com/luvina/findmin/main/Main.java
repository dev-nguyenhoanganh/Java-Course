/**
 * @Project_Name 32_BTVN_Find The Second Min Value In 4x4 Array
 */
package com.luvina.findmin.main;

/**
 * @author Hoang Anh
 * @since 8 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[][] = new int[][] {
			{0, 2, 1 , 3, 4},
			{0, 1, 2 , 3, 4},
			{0, 1, 3 , 2, 4},
			{0, 1, 3 , 4, 2}
		};

		int 	min 	  = findMin(arr); 
		int 	count     = 0;
		int	 	secondMin = arr[0][0] + arr[0][1];
		String  result 	  = "";
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] != min) {

					if(secondMin > arr[i][j]) {
						secondMin 	= arr[i][j];
						result 	  	= "(" + i + ", " + j + ")\n";
						count 		= 1;
					} else if (secondMin == arr[i][j]) {
						result += "(" + i + ", " + j + ")\n";
						count++;
					}
				}
			}
		}
		System.out.println("2nd Min Value: " + secondMin);
		System.out.println("Time sequence: " + count);
		System.out.println("Position of 2nd Min Value: \n" + result);
	}

	public static int findMin(int arr[][]) {
		int min = arr[0][0];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		return min;
	}

}
