/**
 * @Project_Name 32_Ex1_Single Dimension Array
 */
package com.luvina.single_dimension_array.main;

import java.util.Arrays;

import com.luvina.single_dimension_array.array.ArrayInt;

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
		int[] defaultArr = {1, 1, 1, 4, 5, 2, 3, 1, 5, 4, 1, 4, 5, 3, 2};
		
		ArrayInt arr = new ArrayInt(defaultArr);
		int max = arr.findMax();
		System.out.println("Max value: " + max);

		int primeArr[] = arr.findPrimeNumber(); 
		System.out.println("Prime Number: " + Arrays.toString(primeArr));

		int secondMinimum = arr.findSecondMinimum();
		System.out.println("Second Minimum Value: " + secondMinimum);

		String result = arr.findTotalBy5();
		System.out.println("Total by 5: " + result);
	}
}
