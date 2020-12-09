/**
 * @Project_Name 32_Ex4_Phonebook Management
 */
package com.luvina.phonebook.phonebook;

/**
 * @author Hoang Anh
 * @since 4 thg 12, 2020
 * @version 1.0
 */
public class Phonebook {
	private String name;
	private String phoneNumber;

	/**
	 * Phương thức khởi tạo giá trị cho các thuộc tính của đối tượng
	 * @param name - tên
	 * @param phoneNumber - số điện thoại
	 */
	public Phonebook(String name, String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.name 		 = name;
	}

	@Override
	public String toString() {
		return this.name + " " + this.phoneNumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
