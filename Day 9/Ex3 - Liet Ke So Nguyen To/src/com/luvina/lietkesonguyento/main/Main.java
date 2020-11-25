/**
 * @Project_Name Ex3 - Liet Ke So Nguyen To
 * @author Hoang Anh
 * @date 19 thg 11, 2020
 * @version 2.0
 */
package com.luvina.lietkesonguyento.main;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		lietKeSoNT(100);
	}
	
	/**
	 * Phương thức liệt kê các số nguyên tố nhỏ hơn number
	 * @param number - Số nguyên 
	 */
	public static void lietKeSoNT(int number) {
		System.out.print("Số nguyên tố nhỏ hơn " + number + " là: 2");
		for(int i = 3; i < number; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(", " + i);
			}
		}
	}
	
	/**
	 * Phương thức kiểm tra số nguyên tố
	 * @param number - Số nguyên nhập vào từ bàn phím
	 * @return <li> true : Là số nguyên tố
	 * <li> false : Không phải là số nguyên tố
	 */
	private static boolean isPrimeNumber(int number) {
		if(number < 2) return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) return false;
		}
		return true;
	}
}
