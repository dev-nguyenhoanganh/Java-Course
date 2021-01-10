/**
 * @Project_Name 32_AnhNH_Ex1_Num Data
 */
package com.luvnia.text.user;

/**
 * @author Hoang Anh
 * @since 9 thg 1, 2021
 * @version 1.0
 */
public class User {
	private String name;
	private String age;
	private String phone;
	private String userID;

	/**
	 * 
	 */
	public User(String name, String age, String phone, String userID) {
		this.name = name;
		this.age = age;
		this.userID = userID;
		this.phone = phone;
	}



	@Override
	public String toString() {
		return "Name : " + name + "\nTuổi : " + age + "\nĐiện thoại : " + phone + "\nMã người dùng : "
				+ userID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

}
