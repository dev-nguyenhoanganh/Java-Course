/**
 * @Project_Name 32_AnhNH_Smart String
 */
package com.luvina.main;

import com.luvina.ss.SmartString;

/**
 * @author Hoang Anh
 * @since 21 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartString str = new SmartString();
		
		String text = "bca   dgh";
		System.out.println("Chuỗi đầu vào: \t\t\"" + text + "\"");
		System.out.print("Chuối sau khi xếp: \t");
		System.out.println(str.sortUpEachWord("bca   dgh"));
		text = "lap_trinh_huong_doi_tuong";
		System.out.println("Chuỗi đầu vào: \t\t" + text);
		System.out.print("Chuối sau khi chuyển: \t");
		System.out.println(str.convertSnakeCaseToCamelCase("lap_trinh_huong_doi_tuong"));
	}

}
