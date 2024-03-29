/**
 * @Project_Name 32_Ex1_Utils Program
 * @author Hoang Anh
 * @date 24 thg 11, 2020
 * @version 1.0
 */
package com.luvina.utils.main;

import com.luvina.utils.utils.Utils;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Utils program = new Utils(10);
		System.out.println(program.isPrimeNumber(9));
		program.listPrimeLessThanNumber(10);
		program.listSquareEdge(200);
		program.listTriangleEdge(4);
	}

}
