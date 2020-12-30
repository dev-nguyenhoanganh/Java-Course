/**
 * @Project_Name 32_Ex1_Study English Game
 */
package com.luvina.english.main;

import com.luvina.english.manager.WordManager;

/**
 * @author Hoang Anh
 * @since 23 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WordManager manager = new WordManager("Thể thao");

		String result = "";
		manager.addWord("Sport"   , "Thể thao");
		manager.addWord("Soccer"  , "Bóng đá");
		manager.addWord("Football", "Bóng đá");
		manager.addWord("Defender", "Hậu vệ");
		manager.addWord("Leg"	  , "Cái chân");
		manager.display();

		// Test phương thức thêm
		result = manager.addWord("Goallll", "Vàoooooo");
		System.out.println(result);
		
		// Test phương thức lấy 2 phần tử
		System.out.println("\nLấy 2 phần tử random:");
		manager.display(manager.getTwoWordRandom());

		// Test phương thức xóa
		result = manager.remove("Goallll");
		System.out.println(result);
		result = manager.remove("Goallll");
		System.out.println(result);

		result = manager.remove("Leg");
		System.out.println(result);

		// Chốt đơn
		manager.display();
	}

}
