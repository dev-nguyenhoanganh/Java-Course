/**
 * @Project_Name 32_Ex1_Chuong Trinh Do Hoa
 * @author Hoang Anh
 * @date 27 thg 11, 2020
 * @version 1.0
 */
package com.luvina.chuongtrinhdohoa.hinh;

import jdk.vm.ci.hotspot.SharedHotSpotSpeculationLog;

public class RectangleShape extends Shape {

    /**
     * Phương thức khởi tạo hình chữ nhật
     * @param color - Màu sắc của bút vẽ
     */
	public RectangleShape(String color) {
		super(color);
	}
    
    /**
     * Phương thức vẽ của hình chữ nhật
     */
    @Override
	public void draw() {
		System.out.print("\nHình chữ nhật" + " được vẽ bằng ");
		super.draw();
	}
}
