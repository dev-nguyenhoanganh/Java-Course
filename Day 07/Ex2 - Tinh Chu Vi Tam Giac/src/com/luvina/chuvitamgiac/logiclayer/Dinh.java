/**
 * @Project Ex2 - Tinh Chu Vi Tam Giac
 * @author Hoang Anh
 * @version 1.0
 * @since 12 thg 11, 2020
 */
package com.luvina.chuvitamgiac.logiclayer;

import java.util.Scanner;

public class Dinh {
	private double x;
	private double y;
	private boolean closeInputStream;
	
	// Constructor
	public Dinh() {
		x = 0;
		y = 0;
		closeInputStream = false;
	}
	
	/**
	 * <p> Nhập giá trị cho một đỉnh
	 */
	protected void nhapGiaTriDinh() {
		Scanner input = new Scanner(System.in);
		System.out.print("* Nhập giá trị của x: ");
		this.x = input.nextDouble();
		input.nextLine();
		System.out.print("* Nhập giá trị của y: ");
		this.y = input.nextDouble();
		input.nextLine();
		
		if(closeInputStream) {
			input.close();			
		}
	}
	
	/**
	 * <p> Tính khoảng cách giữa đỉnh 1 và đỉnh 2
	 * @param dinh1 - Đỉnh 1
	 * @param dinh2 - Đỉnh 2
	 * @return Khoảng cách giữa đỉnh 1 và đỉnh 2
	 */
	protected double tinhKhoangCach(Dinh dinh1, Dinh dinh2) {
		 double tempX =	dinh1.x - dinh2.x;
		 double tempY = dinh1.y - dinh2.y;
		 
		 return Math.sqrt((tempX * tempX) + (tempY * tempY));
	}
	
	/**
	 * <p> Đóng luồng dữ liệu nhập từ bàn phím
	 */
	protected void closeInputStream() {
		this.closeInputStream = true;
	}
	
	protected String displayDinh(String tenDinh) {
		return "* Tọa độ đỉnh" + tenDinh + "là: (" + x + ", " + y + ')' ; 
	}
}
