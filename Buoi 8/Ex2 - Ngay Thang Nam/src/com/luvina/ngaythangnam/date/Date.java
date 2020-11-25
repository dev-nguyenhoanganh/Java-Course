/**
 * @Project_Name Ex2 - Ngay Thang Nam
 * @author Hoang Anh
 * @date 17 thg 11, 2020
 * @version 1.0
 */
package com.luvina.ngaythangnam.date;

public class Date {
	private int month;
	private int year;

	// Constructor không tham số
	public Date() {
		this.month = 1;
		this.year = 2020;
	}

	// Constructor có tham số
	public Date(int month, int year) {
		this.month = month;
		this.year = year;
	}
	
	/**
	 * Phương thức hiển thị kết quả ra console log
	 */
	public void displayResult() {
		int day = dateCaculate();
		if (day == -1) {
			System.out.println("Giá trị nhập vào không đúng -_-");
		} else {
			System.out.println("Tháng " + this.month + " của năm " + this.year + " có " + day + " (ngày)");
		}
	}
	
	//------------------- Private Method -------------------
	
	/**
	 * Phương thức tính số ngày trong tháng
	 * @return <li><b>Một số nguyên</b> : là số ngày trong tháng
	 * <li><b>-1</b> : Giá trị nhập vào không đúng
	 */
	private int dateCaculate() {
		if ((this.year > 0) && (this.month > 0)) {
			if(this.month <= 12) {
				switch (this.month) {
				case 2: {
					if (this.year / 4 == 0) 
						 return 29;
					else return 28;
				}
				case 4 : return 30;
				case 6 : return 30;
				case 9 : return 30;
				case 11: return 30;
				default: return 31;
				}
			}
		}
		return -1;
	}
}
