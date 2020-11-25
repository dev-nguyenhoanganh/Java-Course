/**
 * @Project_Name Ex4 - In So Nguyen To Thu 25
 * @author Hoang Anh
 * @date 19 thg 11, 2020
 * @version 2.0
 */
package com.luvina.songuyento.main;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		inSNT();
	}
	
	/**
	 * Phương thức in ra màn hình số nguyên tố thứ 25 
	 * trong khoảng giá trị từ 1 - 500
	 */
	public static void inSNT() {
		int counter = 0;
		for (int i = 0; i < 500; i++) {
			if(isPrimeNumber(i)) {
				if(++counter == 25) {
					System.out.println("Số nguyên tố thứ 25 là: " + i);
					break;
				}
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
