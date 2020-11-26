/**
 * @Project_Name Example Project
 * @author Hoang Anh
 * @date 26 thg 11, 2020
 * @version 1.0
 */
package com.luvina.example.main;

import com.luvina.example.tugiac.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TuGiac tg1 = new TuGiac();
		TuGiac tg2 = new HinhVuong();
		TuGiac tg3 = new HinhChuNhat();
		
		tg1.inTT();
		tg2.inTT();
		tg3.inTT();
		
		HinhVuong hv = (HinhVuong) tg2;
		hv.tinhDoDaiCanh();
	}
}
