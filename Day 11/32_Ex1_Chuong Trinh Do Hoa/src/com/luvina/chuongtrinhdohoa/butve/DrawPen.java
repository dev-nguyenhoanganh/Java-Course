/**
 * @Project_Name 32_Ex1_Chuong Trinh Do Hoa
 * @author Hoang Anh
 * @date 27 thg 11, 2020
 * @version 1.0
 */
package com.luvina.chuongtrinhdohoa.butve;

public class DrawPen {
	private String color;

	/**
	 * Phương thức khởi tạo đối tượng bút vẽ
	 */
	public DrawPen(String color) {
		this.color = color;
	}
	
	/**
	 * Phương thức vẽ của đối tượng bút vẽ
	 */
	public void draw() {
		System.out.println(color);
	}

	/**
	 * @param drawColor the drawColor to set
	 */
	public void setDrawColor(String drawColor) {
		this.color = drawColor;
	}	
}
