/**
 * @Project_Name 32_Ex3_Uoc Chung va Boi Chung
 * @author Hoang Anh
 * @date 25 thg 11, 2020
 * @version 1.0
 */
package com.luvina.uocchungvaboichung.main;

import com.luvina.uocchungvaboichung.tinhtoan.Caculation;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Caculation program = new Caculation(150 , 240);
		program.timUCLN();
		program.timBCNN();
		program.result() ;
	}

}
