/**
 * @Project_Name Example Project
 * @author Hoang Anh
 * @date 26 thg 11, 2020
 * @version 1.0
 */
package com.luvina.example.main;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// equalsAndOperator();
		String txt ="abcdacdhc ad hda c";
		checkChar(txt);
		txt.compareTo("a");

	}

	public static void equalsAndOperator() {
		String heap1 = new String("Nam");
		String heap2 = new String("Nam");

		String pool1 = "Nam";
		String pool2 = "Nam";

		System.out.println("\tToán tử == ");
		System.out.print("So sánh heap - heap: ");
		System.out.println(heap1 == heap2);
		System.out.print("So sánh heap - StringPool: ");
		System.out.println(heap1 == pool1);
		System.out.print("So sánh StringPool - StringPool: ");
		System.out.println(pool1 == pool2);

		System.out.println("\n\tDùng equals");
		System.out.print("So sánh heap - heap: ");
		System.out.println(heap1.equals(heap2));
		System.out.print("So sánh heap - StringPool: ");
		System.out.println(pool1.equals(heap1));
		System.out.print("So sánh StringPool - StringPool: ");
		System.out.println(pool1.equals(pool2));
	}

	public static void defaultStringValue() {
		String text = new String();
		if("".equals(text)) System.out.println("\"\"");
	}

	public static void checkChar(String txt) {
		int count = 0;
		for(int i = 0; i < txt.length(); i++) {
			if(txt.charAt(i) == 'a') 
			{ 
				count++;
			}
		}
		System.out.println("Số ký tự 'a' có trong xâu là: " + count);
	}

	
}
