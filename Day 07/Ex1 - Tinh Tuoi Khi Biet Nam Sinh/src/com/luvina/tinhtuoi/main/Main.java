/**
 * @Project Ex1 - Tính Tuổi Khi Biết Năm Sinh
 * @author Hoang Anh
 * @version 2.0
 * @since 18 thg 11, 2020
 */
package com.luvina.tinhtuoi.main;

import com.luvina.tinhtuoi.program.AgeCaculationProgram;

public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		excuteProgram();
	}
	
	/**
	 * <p> Phương thức thực thi chương trình tính tuổi 
	 */
	public static void excuteProgram() {
		AgeCaculationProgram program = new AgeCaculationProgram();
		program.programTitle();
		program.getInputValue();
		program.display();
	}
}
