/**
 * @Project_Name Sample Project
 */
package com.luvina.sample.main;

import com.luvina.sample.exception.TriangleException;

/**
 * @author Hoang Anh
 * @since 28 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			checkTriangle(-1, 5, 6);
		} catch (TriangleException exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
		System.out.println("Check Triangle");
	}

//	public static boolean checkTriangle(double a, double b, double c) {
//		if (a < 0 || b < 0 || c < 0) {
//			throw new NumberFormatException();
//		}
//		return (a + b > c) && (b + c > a) && (c + a > b);
//	}

//	public static void in(Integer b, Integer ...) {
//		
//	}

	public static boolean checkTriangle(double a, double b, double c) throws TriangleException {
		if (a < 0 || b < 0 || c < 0) {
			throw new TriangleException("Cạnh bị âm");
		}
		return (a + b > c) && (b + c > a) && (c + a > b);
	}
}
