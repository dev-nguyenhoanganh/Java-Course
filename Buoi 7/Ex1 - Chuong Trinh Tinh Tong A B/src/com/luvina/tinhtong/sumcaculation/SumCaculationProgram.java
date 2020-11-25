/**
 * @Project Chuong Trinh Tinh Tong A B
 * @author Hoang Anh
 * @version 1.0
 * @since 12 thg 11, 2020
 */
package com.luvina.tinhtong.sumcaculation;

import java.util.Scanner;

public class SumCaculationProgram {
	private double numberA;
	private double numberB;
	
	/**
	 * <blockquote> In ra tiêu đề của chương trình
	 */
	public void programTitle() {
		System.out.println("-------- Chương trình tính tổng hai số A và B --------");
	}
	
	/**
	 * <blockquote> Lấy giá trị nhập vào từ bàn phím
	 */
	public void getInputNumber() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mời nhập số A và B: ");
		numberA = input.nextDouble();
		numberB = input.nextDouble();
		
		input.close();
	}
	
	/**
	 * <blockquote> Tính tổng của 2 số A và B
	 * @return tổng của 2 số A và B
	 */
	private double sumCaculate() {
		return numberA + numberB;
	}
	
	/**
	 * <blockquote> Hiển thị kết quả
	 */
	public void display() {
		System.out.println("Tổng của " + numberA + " và " + numberB + " bằng: " + sumCaculate());
	}
}
