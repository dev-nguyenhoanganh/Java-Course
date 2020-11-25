/**
 * @Project Chuong Trinh Tinh Tong A B
 * @author Hoang Anh
 * @version 1.0
 * @since 12 thg 11, 2020
 */
package com.luvina.tinhtong.main;

import com.luvina.tinhtong.sumcaculation.SumCaculationProgram;

public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		excuteProgram();
		
	}
	
	/**
	 * <blockquote> Hàm thực thi chương trình
	 */
	public static void excuteProgram() {
		SumCaculationProgram program = new SumCaculationProgram();
		program.programTitle();
		program.getInputNumber();
		program.display();
	}
}
