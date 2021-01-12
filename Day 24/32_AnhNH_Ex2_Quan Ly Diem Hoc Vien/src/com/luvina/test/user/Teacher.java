/**
 * @Project_Name 32_AnhNH_Ex2_Quan Ly Diem Hoc Vien
 */
package com.luvina.test.user;

import java.util.ArrayList;

/**
 * @author Hoang Anh
 * @since 9 thg 1, 2021
 * @version 1.0
 */
public class Teacher extends User {
	ArrayList<Student> listStudent;

	/**
	 * 
	 */
	public Teacher (String userID, 
					String name, 
					String date, 
					String account, 
					String pass) {

		super(userID, name, date, account, pass, "TEACHER");
		listStudent = new ArrayList<Student>();
	}

	// ------------------ User Interface -----------------	
	@Override
	public boolean signUp() {
		listStudent = new ArrayList<Student>();
		return super.signUp();
	}

	@Override
	public Teacher signIn(String account, String pass) {
		return (Teacher) super.signIn(account, pass);
	}

	// ------------------ Teacher Method -----------------	
	@Override
	public String toAccountFile() {
		String result = "";
		for (Student student : listStudent) {
			result += student.toAccountFile() + "\n";
		}
		return result;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String addStudent(Student newStudent) {
		if (listStudent.contains(newStudent)) {
			return "Thêm không thành công\nĐã tồn tại học sinh này";
		} else {
			listStudent.add(newStudent);
		}
		return "Thêm thành công";
	}

	// ----------------- Getter & Setter -----------------
	/**
	 * @return the listStudent
	 */
	public ArrayList<Student> getListStudent() {
		return listStudent;
	}

	/**
	 * @param listStudent the listStudent to set
	 */
	public void setListStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}

	
	
}
