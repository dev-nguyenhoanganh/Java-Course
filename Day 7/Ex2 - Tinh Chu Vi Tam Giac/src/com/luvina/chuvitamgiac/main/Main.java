/**
 * @Project Ex2 - Tinh Chu Vi Tam Giac
 * @author Hoang Anh
 * @version 1.0
 * @since 12 thg 11, 2020
 */
package com.luvina.chuvitamgiac.main;

import com.luvina.chuvitamgiac.logiclayer.TamGiac;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		excuteProgram();
	}
	
	/**
	 * <p> Phương thức thực thi chương trình tính chu vi tam giác
	 */
	public static void excuteProgram() {
		TamGiac tamGiac = new TamGiac();
		tamGiac.programTitle();
		tamGiac.nhapGiaTriDinh();
		tamGiac.tinhChuVi();
		tamGiac.display();
	}
}
