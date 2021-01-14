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
	 * Phương thức khởi tạo nhập ID
	 */
	public Teacher (String userID, 
					String name, 
					String date, 
					String account, 
					String pass) {

		super(userID, name, date, account, pass, "TEACHER");
		listStudent = new ArrayList<Student>();
	}

	/**
	 * Phương thức khởi tạo dùng thông tin của 1 user và 1 list học sinh
	 */
	public Teacher (User user, ArrayList<Student> list) {
		this.userID  = user.getUserID();
		this.name 	 = user.getName();
		this.date	 = user.getDate();
		this.account = user.getAccount();
		this.pass    = user.getPass();
		
		this.priorityLevel = "TEACHER";
		this.listStudent   = (ArrayList<Student>) list.clone();
	}

	/**
	 * Phương thức khởi tạo tự tạo ID
	 * @param name
	 * @param date
	 * @param account
	 * @param pass
	 */
	public Teacher (String name, 
					String date, 
					String account, 
					String pass) {

		super(name, date, account, pass, "TEACHER");
		listStudent = new ArrayList<Student>();
	}

	// ------------------ User Interface -----------------	
	@Override
	public String signUp() {
		listStudent = new ArrayList<Student>();
		return super.signUp();
	}

	@Override
	public Teacher signIn(String account, String pass) {
		return (Teacher) super.signIn(account, pass);
	}

	@Override
	public boolean addStudent(Student newStudent) {
		if (listStudent.contains(newStudent)) {
			return false;
		} else {
			listStudent.add(newStudent);
		}
		super.addStudent(newStudent);
		return true;
	}

	public boolean removeStudent(String studentID) {
		if (studentID.isEmpty()) {
			return false;
		}
		int index = -1;
		for (Student student : listStudent) {
			if (studentID.equals(student.getUserID())) {
				index = listStudent.indexOf(student);
			}
		}
		if (index == -1) {
			return false;
		}
		listStudent.remove(index);
		return super.removeStudent(studentID);
	}

	// ------------------ Teacher Method -----------------	
	@Override
	public String toAccountFile() {
		String result = "";
		for (Student student : listStudent) {
			result += student.toAccountFile();
		}
		return result;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String showData() {
		String result = "\nSố lượng học sinh quản lý - " + listStudent.size();
		for (Student student : listStudent) {
			result += "\n" + student.getName() + "\n";
			result += student.showData() + "\n";
		}
		if (result.isEmpty()) {
			return "Danh sách rỗng";
		}
		return result;
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
