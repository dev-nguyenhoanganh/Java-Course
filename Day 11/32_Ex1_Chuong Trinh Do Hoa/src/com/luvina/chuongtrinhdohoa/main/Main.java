/**
 * @Project_Name 32_Ex1_Chuong Trinh Do Hoa
 * @author Hoang Anh
 * @date 27 thg 11, 2020
 * @version 1.0
 */
package com.luvina.chuongtrinhdohoa.main;

import com.luvina.chuongtrinhdohoa.hinh.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape circle 	= new CircleShape("màu đỏ");
		Shape rectangle = new RectangleShape("màu xanh");
		Shape triangle  = new TriangleShape("màu đỏ");

		circle.draw();
		rectangle.draw();
		triangle.draw();
	}

}
