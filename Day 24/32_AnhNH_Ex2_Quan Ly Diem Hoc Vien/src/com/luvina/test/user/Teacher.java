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
		return super.signUp();
	}

	@Override
	public Teacher signIn(String account, String pass) {
		return (Teacher) super.signIn(account, pass);
	}

	// ------------------ Teacher Method -----------------	
	@Override
	public String toFile() {
		String result = "";
//		for (Student student : listStudent) {
//			result += "\n" + student.toFile();
//		}
		return super.toFile() + result;
	}

	@Override
	public String toString() {

		return super.toString()
			+ ""
		;
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
}
