/**
 * @Project_Name Ex2 - Liet Ke Uoc
 * @author Hoang Anh
 * @date 19 thg 11, 2020
 * @version 1.0
 */
package com.luvina.lietkeuoc.main;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		lietKeUoc(500);
	}

	/**
	 * Phương thức liệt kê cách ước của số tự nhiên number
	 * @param number - số tự nhiên cần tìm ước
	 */
	public static void lietKeUoc(int number) {
		String listNumber = "";
		System.out.print("\nƯớc của " + number + " là: [");
		for(int i = 1; i < number; i++) {
			if(number % i == 0) {
				listNumber += (i + ", ");
			}
		}
		listNumber += (number + "]"); 
		System.out.println(listNumber);
	}
}
