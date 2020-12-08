/**
 * @Project_Name 32_Ex4_Phonebook Management
 */
package com.luvina.phonebook.main;

import java.util.Arrays;

// import sun.jvm.hotspot.utilities.IntArray;

/**
 * @author Hoang Anh
 * @since 4 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array[] = new int[] {9,8,4,56,8,4,2};
		// int min = array[0];
		int temp = array[0];
		for(int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(array));

		// Code quy hoạch động
		// int arr[][] = new int[][] {
		// 	{1,2,3,0},
		// 	{2,1,3,0},
		// 	{2,3,1,0},
		// 	{2,3,0,1}
		// };

		// int min   = arr[0][0];
		// int count = 0;
		// String listIndex = "";
		
		// for (int i = 0; i < arr.length; i++) {
		// 	for (int j = 0; j < arr[0].length; j++) {
		// 		if(min > arr[i][j]) {
		// 			count = 1;
		// 			min   = arr[i][j];
		// 			listIndex = "(" + i + "," + j + ")\n"; 
		// 		} else if(min == arr[i][j]) {
		// 			count++;
		// 			listIndex += "(" + i + "," + j + ")\n";
		// 		}
		// 	}
		// }
		
		// System.out.println("Min value: " + min);
		// System.out.println("So lan xuat hien: " + count);
		// System.out.println("Vi Tri: \n" + listIndex);

	}

	
}
