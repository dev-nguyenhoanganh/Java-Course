/**
 * @Project_Name Ex2_Matrix Fun
 */
package com.luvina.mf.main;

import java.util.Arrays;
import java.util.Comparator;

import com.luvina.mf.matrix.MatrixFun;

/**
 * @author Hoang Anh
 * @since 19 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MatrixFun matrix = new MatrixFun();
		matrix.init();
		System.out.println(matrix.findMax());
		Integer arr[] = new Integer[] { 1, 2, 3 };
		Arrays.sort(arr, giam);
		System.out.println(Arrays.toString(arr));
	}

	static Comparator<Integer> giam = new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	};

}
