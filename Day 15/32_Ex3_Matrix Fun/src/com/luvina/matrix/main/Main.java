/**
 * @Project_Name 32_Ex3_Matrix Fun
 */
package com.luvina.matrix.main;

import java.util.Arrays;

import com.luvina.matrix.fun.MatrixFun;

/**
 * @author Hoang Anh
 * @since 11 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] tempArray = new int[][] { 
			{ 1, 2, 3, 4, 5, 6, 7, 8 }, 
			{ 7, 8, 2, 3, 6, 4, 3, 2 },
			{ 8, 9, 3, 2, 4, 3, 4, 9 },
			{ 0, 4, 7, 3, 4, 2, 3, 4 },
			{ 9, 8, 7, 4, 3, 2, 3, 8 },
			{ 8, 7, 3, 4, 3, 3, 2, 3 },
			{ 9, 7, 4, 5, 4, 1, 8, 3 },
			{ 9, 8, 4, 3, 7, 5, 9, 8 }
		};

		MatrixFun array = new MatrixFun(tempArray);

		int secondMax = array.findSecondMax();
		System.out.println("Second Max: " + secondMax);

		int[] sum = array.calcSumArea();
		System.out.println("Diện tổng của mỗi vùng lần lượt là:");
		System.out.println(Arrays.toString(sum));

	}

	/**
	   `1.  2   3   4   5   6   7  .8`
		7  `8.  2   3   6   4  .3`  2
		8   9  `3.  2   4  .3`  4   9
		0   4   7  `3. .4`  2   3   4
		9   8   7  .4` `3.  2   3   8
		8   7  .3`  4   3  `3.  2   3
		9  .7`  4   5   4   1  `8.  3
	   .9`  8   4   3   7   5   9  `8.
	 */

}
