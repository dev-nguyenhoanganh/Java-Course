/**
 * @Project_Name 32_Ex1_Chuong Trinh Do Hoa
 * @author Hoang Anh
 * @date 27 thg 11, 2020
 * @version 1.0
 */
package com.luvina.chuongtrinhdohoa.hinh;

import com.luvina.chuongtrinhdohoa.butve.DrawPen;

public class CircleShape extends Shape{
	
	/**
	 * Phương thức khởi tạo thực thể hình tròn
	 * @param color - Màu sắc của bút vẽ
	 */
	public CircleShape(String color) {
		super(color);
	}
	

	/**
	 * Phương thức vẽ của hình tròn
	 */
	@Override
	public void draw() {
		System.out.print("\nHình tròn" + " được vẽ bằng ");
		super.draw();
	}
}
