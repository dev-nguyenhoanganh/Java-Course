/**
 * @Project_Name Ex1 - Tong So Tu Nhien Chan
 * @author Hoang Anh
 * @date 19 thg 11, 2020
 * @version 1.0
 */
package com.luvina.tongsotunhienchan.main;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		tongTuNhienChan();
	}
	
	
	/**
	 * Phương thức tính tổng các số tự nhiên chẵn nhỏ hơn 1000
	 */
	public static void tongTuNhienChan() {
		int sum = 0;
		for(int i = 0; i < 1000; i += 2) {
				sum += i;
		}
		System.out.println("Tổng các số tự nhiên chẵn nhỏ hơn 1000 là: " + sum);
	} 
}
