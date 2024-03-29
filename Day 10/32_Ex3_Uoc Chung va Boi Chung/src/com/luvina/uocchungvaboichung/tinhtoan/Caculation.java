/**
 * @Project_Name 32_Ex3_Uoc Chung va Boi Chung
 * @author Hoang Anh
 * @date 25 thg 11, 2020
 * @version 1.0
 */
package com.luvina.uocchungvaboichung.tinhtoan;

public class Caculation {
	private int num1;
	private int num2;
	
	/**
	 * Phương thức khởi tạo không tham số
	 */
	public Caculation() {
		this.num1 = 0;
		this.num2 = 0;
	}
	
	/**
	 * Phương thức khởi tạo có tham số
	 * @param num1 - Giá trị của số thứ nhất 
	 * @param num2 - Giá trị của số thứ hai
	 */
	public Caculation (int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	/**
	 * Phương thức tìm ước chung lớn nhất của 2 số num1 và num2
	 * @return - Ước chung lớn nhất của 2 số num1 và num2
	 */
	public int timUCLN() {
		int max  = (num1 <= num2) ? num2 : num1;
		int UCLN = 1;
		for(int i = 1; i <= max; i++) {
			if((num1 % i == 0) && (num2 % i == 0)) {
				UCLN = i;
			}
		}
		return UCLN;
	}
	
	/**
	 * Phương thức tìm bội chung nhỏ nhất của 2 số num1 và num2
	 * @return - Bội chung nhỏ nhất của 2 số num1 và num2
	 */
	public int timBCNN() {
		int UCLN = timUCLN();
		return num1 * num2 / UCLN;
	}
	
	/**
	 * Phương thức hiển thị kết quả tính ra màn hình console
	 */
	public void result() {
		System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " + timUCLN());
		System.out.println("Bội chung nhỏ nhất của " + num1 + " và " + num2 + " là: " + timBCNN());
	}
}
