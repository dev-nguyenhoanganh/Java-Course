/**
 * @Project_Name 32_Ex1_Text Program
 * @author Hoang Anh
 * @date 30 thg 11, 2020
 * @version 1.0
 */
package com.luvina.textprogram.main;

import com.luvina.textprogram.text.Text;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Text myString = new Text("a123af312 fcBbCaD");
		
		// Method 1
		int sum = myString.sumContainNumber();
		System.out.println("Tổng các chữ số có trong chuỗi: " + sum);
		
		// Method 2
		char lowest = myString.findLowestChar();
		if(lowest == ' ') {
			System.out.println("Chữ cái có mã ACSII nhỏ nhất: " + "Space");
		}
		else {
			System.out.println("Chữ cái có mã ACSII nhỏ nhất: " + lowest);
		}
		
		// Method 3
		String result = myString.findUpperCase();
		System.out.println("Các ký tự in hoa trong chuỗi: " + result);
		
		// Method 4
		result = myString.upperFirstChar();
		System.out.println("Viết hoa các chữ cái đầu tiên: "+ result);
		
		// Method 5
		result = myString.reverseString();
		System.out.println("Đảo ngược string: " + result);
	}

}
