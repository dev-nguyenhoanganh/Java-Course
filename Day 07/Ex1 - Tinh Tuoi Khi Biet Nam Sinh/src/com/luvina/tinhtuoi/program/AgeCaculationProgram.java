/**
 * @Project Ex1 - Tính Tuổi Khi Biết Năm Sinh
 * @author Hoang Anh
 * @version 1.0
 * @since 12 thg 11, 2020
 */
package com.luvina.tinhtuoi.program;

import java.util.Scanner;

public class AgeCaculationProgram {
	private int  	thisYear;
	private int 	personYear;
	
	/**
	 * <p> In ra tiêu đề của chương trình
	 */
	public void programTitle() {
		System.out.println("-------- Chương trình tính tuổi khi biết năm sinh --------");
	} 
	
	/**
	 * <p> Lấy giá trị nhập vào từ bàn phím
	 */
	public void getInputValue() {
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("* Năm nay là: ");
			thisYear   = input.nextInt();
			System.out.print("* Bạn sinh năm: ");
			personYear = input.nextInt();
		} while (!isValidNumber());
		input.close();
	}
	
	/**
	 * <p> Hiển thị kết quả
	 */
	public void display() {
		System.out.println("* Tuổi của bạn là: " + ageCaculation());
		System.out.println("*\n-------- Thank you for choosing us!! --------");
	}
	
	/**
	 * <p> Tính tổng tuổi hiện tại
	 * @return tuổi sau khi đã tính
	 */
	private int ageCaculation() {
		return thisYear - personYear;
	}
	
	/**
	 * <p> Kiểm tra năm sinh nhập vào có hợp lệ hay không
	 * @return true nếu năm sinh nhập vào hợp lệ
	 * 		   false nếu năm sinh nhập vào không hợp lệ
	 */
	private boolean isValidNumber() {
		if(thisYear <= personYear) {
			System.out.print("=> Giá trị nhập vào không đúng, mời nhập lại\n");
			return false;
		}	
		else { 
			return true;
		}
	}
}
