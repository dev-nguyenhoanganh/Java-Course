/**
 * @Project_Name 32_Ex2_Cac Phep Toan Ve So
 * @author Hoang Anh
 * @date 24 thg 11, 2020
 * @version 1.0
 */
package com.luvina.cacpheptoan.main;

import com.luvina.cacpheptoan.pheptoan.PrimeNumber;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrimeNumber number = new PrimeNumber(14);
		number.display();
		number.phanTichThuaSo();
	}

}
