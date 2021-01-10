/**
 * @Project_Name 32_AnhNH_Ex2_Quan Ly Diem Hoc Vien
 */
package com.luvina.test.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import com.luvina.test.user.Student;
import com.luvina.test.user.Teacher;
import com.luvina.test.user.User;

/**
 * @author Hoang Anh
 * @since 9 thg 1, 2021
 * @version 1.0
 */
public class Manager {
	private ArrayList<User> listUser;

	private static final String SRC_ACCOUNT = ".\\data\\account.txt";
	private static final String SRC = ".\\data\\";

	/**
	 * 
	 */
	public Manager() {
		listUser = new ArrayList<User>();
	}
	
	// ----------------- User Interface -----------------
	public boolean signUp(String userID, 
						  String name, 
						  String date, 
						  String account, 
						  String pass,
						  String priorityLevel) {

		User user = new Teacher(userID, name, date, account, pass);
		
		if (listUser.contains(user)) {
			System.err.println("Tài khoản đã tồn tại");
			return false;
		}
		listUser.add(user);
		String result = convertListToFile(SRC + account + ".txt");
		if ("Ghi thành công".equals(result)) {
			System.out.println("Tạo tài khoản thành công");
		} else if ("Lỗi hệ thống !!!".equals(result)) {
			System.err.println("Lỗi hệ thống !!!");
		}
		return false;
	}

	public User signIn(String account, String pass) {
		for (User user : listUser) {
			if (user.getPass().equals(pass)) {
				if (user.getUserID().equals(account)) {
					return user;
				}
			}
		}
		return null;
	}

	// ----------------- Manager Method -----------------

	/**
	 * 
	 */
	public String addTeacher(User newUser) {
		if (listUser.contains(newUser)) {
			return "Thêm không thành công\nĐã tồn tại học sinh này";
		} else {
			listUser.add(newUser);
		}
		writeToFile(newUser.toFile(), SRC + newUser.getAccount() + ".txt");
		return "Thêm thành công";
	}
	
	/**
	 * 
	 */
	public String addStudent(Student newStudent, String userID) {
		for (User user : listUser) {
			if (userID.equals(user.getUserID())) {
				String result = user.addStudent(newStudent);
				if ("Thêm thành công".equals(result)) {
					writeToFile(newStudent.toFile(), SRC + newStudent.getName() + ".txt");
				}
			}
		}
		listUser.add(newStudent);
		convertListToFile(SRC_ACCOUNT);

		return "Thêm không thành công";
	}

	public User findStudentByAccount(String account) {
		for (User student : listUser) {
			if (account.equals(student.getUserID())) {
				return student;
			}
		}
		return null;
	}

	public String removeStudent(String studentID, String account) {
		int idx = listUser.indexOf(new User(studentID, "", "", "", "", ""));
		if (idx == -1) {
			return "Không tồn tại học sinh cần xóa";
		}
		listUser.remove(idx);
		convertListToFile(SRC_ACCOUNT);
		return "Xóa thành công";
	}

	// ----------------- Read and Write File -----------------



	/**
	 * 
	 */
	private ArrayList<User> convertFileToList() {
		try {
			String data = readFile(SRC_ACCOUNT);
			String[] dataLine = data.split("\n");
			ArrayList<User> list = new ArrayList<User>();
			for (int i = 0; i < dataLine.length; i++) {
				String[] studentInfor = dataLine[i].split("_");
				User student = new User(studentInfor[0], studentInfor[1], studentInfor[2], studentInfor[3],
						studentInfor[4], studentInfor[5]);
				list.add(student);
			}
			return list;
		} catch (Exception e) {
			return new ArrayList<User>();
		}
	}


	public String convertListToFile(String path) {
		String data = "";
		for (User user : listUser) {
			data += user.toFile();
		}
		return writeToFile(data, path);
	}

	private ArrayList<User> convertFileToUser(String path) {
		try {
			String data = readFile(path);
			String[] dataLine = data.split("\n");
			ArrayList<User> listStudent = new ArrayList<User>();
			for (int i = 0; i < dataLine.length; i++) {
				String[] userInfor = dataLine[i].split("_");
				User user = new User(userInfor[0], userInfor[1], userInfor[2], userInfor[3],
						userInfor[4], userInfor[5]);
				listStudent.add(user);
			}
			return listStudent;
		} catch (Exception e) {
			return new ArrayList<User>();
		}
	}

	/**
	 * @param path
	 * @return
	 */
	private String readFile(String path) {
		String data = "";
		try {
			// 1 trỏ vào file
			File file = new File(path);
			// 2. Kiểm tra tồn tại
			if (!file.exists()) {
				System.out.println("File cần đọc không tồn tại.");
				return null;
			}
			// 3. Mở File để đọc
			FileInputStream fI = new FileInputStream(file);
			byte[] arrByte = new byte[8192];
			int length = fI.read(arrByte);
			while (length != -1) {
				data += new String(arrByte, 0, length);
				length = fI.read(arrByte);
			}
			fI.close();
		} catch (IOException e) {
			System.out.println("Lỗi Hệ Thống");
		}
		return data;
	}

	private String writeToFile(String input, String path) {
		try {
			// 1 trỏ vào file
			File file = new File(path);
			// 2. Kiểm tra tồn tại
			if (!file.exists()) {
				file.getParentFile().mkdirs();
				file.createNewFile();
			}
			// 3. Mở File để ghi
			FileOutputStream fO = new FileOutputStream(file);
			byte[] byteArr = input.getBytes();
			fO.write(byteArr);
			// close
			fO.close();
		} catch (IOException e) {
			return "Lỗi hệ thống !!!";
		}
		return "Ghi thành công";
	}
}
