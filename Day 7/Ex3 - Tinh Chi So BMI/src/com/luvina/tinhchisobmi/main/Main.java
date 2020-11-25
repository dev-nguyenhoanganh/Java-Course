/**
 * @Project Ex3 - Tinh Chi So BMI
 * @author Hoang Anh
 * @version 1.0
 * @since 13 thg 11, 2020
 */
package com.luvina.tinhchisobmi.main;

import com.luvina.tinhchisobmi.logiclayer.TinhChiSoBMI;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		excuteProgram();
	}
	
	/**
	 * <p> Phương thức thực thi chương trình tính chỉ số BMI
	 */
	public static void excuteProgram() {
		TinhChiSoBMI program = new TinhChiSoBMI();
		program.programTitle();
		program.getInputValue();
		program.caculateBMI();
		program.display();
	}
}
