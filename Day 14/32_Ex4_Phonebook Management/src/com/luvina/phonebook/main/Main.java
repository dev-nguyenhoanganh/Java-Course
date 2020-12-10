/**
 * @Project_Name 32_Ex4_Phonebook Management
 */
package com.luvina.phonebook.main;

import com.luvina.phonebook.management.Management;

/**
 * @author Hoang Anh
 * @since 4 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Management list = new Management();
		String phoneNumber = "0123456";
		
		list.addPhoneNumber(10, "Trần Quốc Vượng", phoneNumber);
		list.addPhoneNumber(10, "Trần Quốc Vượng", "0912684");
		
		phoneNumber = "0969656";
		list.modifyPhonebook(phoneNumber, "0123457");

		String result = list.findByName("Nguyen");
		System.out.println("Giá trị tìm được : ");
		System.out.println(result);

		list.showList();
	}
}
