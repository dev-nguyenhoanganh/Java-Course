/**
 * @Project_Name 32_Ex1_Factorial Number
 */
package com.luvina.factorial.main;

import java.util.Scanner;

/**
 * @author Hoang Anh
 * @since 3 thg 1, 2021
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;
		long result = 0;
		boolean inputValidate = false;
		while (!inputValidate) {
			try {
				number = getInput(inputValidate);
				inputValidate = true;
				result = factorialCaculation(number);
			} catch (NumberFormatException exception) {

				switch (exception.getMessage()) {
				case "Chuỗi nhập vào không chứa số":
					System.out.println("Chuỗi nhập vào không chứa số");
					break;
				case "Chuỗi nhập vào có chứa ký tự không phải số":
					System.out.println("Chuỗi nhập vào có chứa ký tự không phải số");
					break;
				case "Số nhập vào bị âm":
					System.out.println("Số nhập vào bị âm");
					break;
				case "Số không có định dạng nguyên":
					System.out.println("Số không có định dạng nguyên");
					break;
				}
				inputValidate = false;
			}
		}
		System.out.println("Giai thừa của " + number + " là: " + result);
	}

	public static long factorialCaculation(int number) {
		if (number == 1 || number == 0) {
			return 1;
		}
		return number * factorialCaculation(number - 1);
	}

	public static int getInput(boolean closeInputStream) {
		Scanner input = new Scanner(System.in);
		System.out.println("\n---------------------------");
		System.out.print("Mời nhập vào một số nguyên: ");
		String number = input.next();
		try {
			if (isAnIntNumber(number)) {
				return Integer.parseInt(number);
			}
		} catch (NumberFormatException exception) {
			switch (exception.getMessage()) {
				case "Chuỗi nhập vào không chứa số":
					throw new NumberFormatException("Chuỗi nhập vào không chứa số");
				case "Chuỗi nhập vào có chứa ký tự không phải số":
					throw new NumberFormatException("Chuỗi nhập vào có chứa ký tự không phải số");
				case "Số không có định dạng nguyên":
					throw new NumberFormatException("Số không có định dạng nguyên");
				case "Số nhập vào bị âm":
					throw new NumberFormatException("Số nhập vào bị âm");
			}
		} finally {
			if (closeInputStream) {
				input.close();
			}
		}

		return 0;
	}

	private static boolean isAnIntNumber(String input) {
		if (input.matches("-\\d+")) {
			throw new NumberFormatException("Số nhập vào bị âm");
		}

		if (input.matches("-?\\d+\\.\\d+")) {
			throw new NumberFormatException("Số không có định dạng nguyên");
		}

		if (input.matches("\\D+")) {
			throw new NumberFormatException("Chuỗi nhập vào không chứa số");
		}

		if (input.matches(".*\\D.*")) {
			throw new NumberFormatException("Chuỗi nhập vào có chứa ký tự không phải số");
		}

		return true;
	}

	/**
	 * Viết phương thức nhân 2 String với nhau để giải quyết vấn đề tràn
	 * số "456" x "123"
	 * 
	 */
}
