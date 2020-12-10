/**
 * @Project_Name 32_Ex4_Phonebook Management
 */
package com.luvina.phonebook.management;

import java.util.regex.Pattern;
import com.luvina.phonebook.phonebook.Phonebook;

/**
 * @author Hoang Anh
 * @since 4 thg 12, 2020
 * @version 1.0
 */
public class Management {
	private Phonebook listPhoneNumber[];
	private int index;

	/**
	 * Phương thức khởi tạo giá trị mặc định cho thuộc tính của đối tượng
	 */
	public Management() {
		listPhoneNumber = new Phonebook[50];
		listPhoneNumber[0] = new Phonebook("Vuong Anh Tu"    , "0123456");
		listPhoneNumber[1] = new Phonebook("Vuong Quoc Tuan" , "1023456");
		listPhoneNumber[2] = new Phonebook("Nguyen Thi Huong", "1203456");
		listPhoneNumber[3] = new Phonebook("Nguyen The Bao"  , "1230456");
		listPhoneNumber[4] = new Phonebook("Nguyen Van Hoang", "1234056");
		listPhoneNumber[5] = new Phonebook("Nguyen Hoang Anh", "1234506");
		listPhoneNumber[6] = new Phonebook("Dinh Manh Ninh"  , "1234560");

		listPhoneNumber[8] = new Phonebook("Nguyen Hoang Anh", "5560");
		// index = 0;
	}

	/**
	 * Phương thức in ra console danh sách các số điện thoại tồn tại trong danh bạ
	 */
	public void showList() {
		String printToConsole = "";

		for (int i = 0; i < listPhoneNumber.length; i++) {
			if (listPhoneNumber[i] == null) {
				continue;
			} else {
				printToConsole += "[" + i + "] " + listPhoneNumber[i].toString() + "\n";
			}
		}
		System.out.println("Danh bạ số điện thoại: ");
		System.out.println(printToConsole);
	}

	/**
	 * Phương thức kiểm tra sự tồn tại của số điện thoại trong danh bạ
	 * 
	 * @param phoneNumber - số điện thoại cần kiểm tra
	 * @return false - chưa tồn tại
	 *    <li> true - đã tồn tại
	 */
	public boolean isExist(String phoneNumber) {
		for (int i = 0; i < listPhoneNumber.length; i++) {
			if (listPhoneNumber[i] == null) {
				continue;
			} else {
				if (phoneNumber.equals(listPhoneNumber[i].getPhoneNumber())) {
					this.index = i;
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Phương thức thêm số điện thoại vào danh bạ 
	 * @param index - vị trí mà số điện thoại được thêm vào
	 * @param name - tên người sở hữu số điện thoại
	 * @param phoneNumber - số điện thoại
	 */
	public void addPhoneNumber(int index, String name, String phoneNumber) {
		if (isExist(phoneNumber)) {
			System.out.println("Danh bạ này đã tồn tại!");
		} else {
			listPhoneNumber[index] = new Phonebook(name, phoneNumber);
			System.out.println("Đã thêm danh bạ thành công!");
		}
	}

	/**
	 * Phương thức sửa số điện thoại
	 * @param phoneNumber - số điện thoại cũ
	 * @param newPhoneNumber - số điện thoại mới
	 */
	public void modifyPhonebook(String phoneNumber, String newPhoneNumber) {
		if (!isExist(phoneNumber)) {
			System.out.println("Số điện thoại " + phoneNumber + " chưa tồn tại!");
		} else if (isExist(newPhoneNumber)) {
			System.out.println("Số điện thoại mới này đã tồn tại!");
		} else {
			listPhoneNumber[this.index].setPhoneNumber(newPhoneNumber);
			System.out.println("Sửa thành công");
		}
	}

	/**
	 * Phương thức tìm kiếm theo tên
	 * @param name - tên người cần tìm
	 * @return Danh sách những người có cùng tên
	 */
	public String findByName(String name) {
		String result = "";
		String regex = ".*";
		String listName = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			regex += "[" + Character.toUpperCase(ch) + "|" + Character.toLowerCase(ch) + "].*";
		}

		for (int i = 0; i < listPhoneNumber.length; i++) {
			if (listPhoneNumber[i] == null) {
				continue;
			}
			listName = listPhoneNumber[i].getName();
			if (Pattern.matches(regex, listName)) {
				result += "[" + i + "] " + listPhoneNumber[i].toString() + "\n";
			}
		}

		return result;
	}

//	private boolean validPhoneNumber(String phoneNumber) {
//		return Pattern.matches("^[0-9]{0,10}$", phoneNumber);
//	}
}
