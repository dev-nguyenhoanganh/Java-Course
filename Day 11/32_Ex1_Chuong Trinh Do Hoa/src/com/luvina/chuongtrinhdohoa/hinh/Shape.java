/**
 * @Project_Name 32_Ex1_Chuong Trinh Do Hoa
 * @author Hoang Anh
 * @date 27 thg 11, 2020
 * @version 1.0
 */
package com.luvina.chuongtrinhdohoa.hinh;

import com.luvina.chuongtrinhdohoa.butve.DrawPen;

public class Shape {
	private DrawPen pen;

	/**
	 * Phương thức khởi tạo đối tượng hình dạng
	 * @param penColor - Màu sắc của bút vẽ
	 */
	public Shape(String penColor) {
		pen.setDrawColor(penColor);
	}
	
	/**
	 * Phương thức vẽ của đối tượng hình dạng
	 */
	@Override
	public void draw() {
		System.out.print("\nHình dạng" + " được vẽ bằng ");
		super.draw();
	}
}
