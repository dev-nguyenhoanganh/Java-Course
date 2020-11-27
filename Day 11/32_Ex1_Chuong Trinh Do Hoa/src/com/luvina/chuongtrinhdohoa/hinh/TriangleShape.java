/**
 * @Project_Name 32_Ex1_Chuong Trinh Do Hoa
 * @author Hoang Anh
 * @date 27 thg 11, 2020
 * @version 1.0
 */
package com.luvina.chuongtrinhdohoa.hinh;

public class TriangleShape extends Shape {

    /**
     * Phương thức khởi tạo thực thể hình tam giác
     * @param color - Màu sắc của bút vẽ
     */
	public TriangleShape(String color) {
		super(color);
	}
    
    /**
     * Phương thức vẽ của đối tượng hình tam giác
     */
    @Override
	public void draw() {
		System.out.print("\nHình tam giác" + " được vẽ bằng ");
		super.draw();
	}
}
