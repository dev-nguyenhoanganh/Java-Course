/**
 * @Project_Name Sample
 */
package com.luvina.sample;

import java.util.Scanner;

/**
 * @author Hoang Anh
 * @since 5 thg 1, 2021
 * @version 1.0
 */
public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double sum = getDouble(input, "A") + getDouble(input, "B");
		System.out.println("Tổng A và B là: " + sum);

		input.close();
	}

	public static double getDouble(Scanner input, String numberName) {
		while (true) {
			try {
				System.out.print("Mời nhập số " + numberName + " : ");
				return Double.parseDouble(input.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Bạn đã nhập sai số " + numberName + " mời nhập lại");
			}
		}
	}

	public String checkInput(String str) {

		return "";
	}

//	public int first() {
//		
//	}

}
