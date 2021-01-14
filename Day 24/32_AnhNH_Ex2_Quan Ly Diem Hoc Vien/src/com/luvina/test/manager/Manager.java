/**
 * @Project_Name 32_AnhNH_Ex2_Quan Ly Diem Hoc Vien
 */
package com.luvina.test.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import com.luvina.test.user.IUserAction;
import com.luvina.test.user.Student;
import com.luvina.test.user.Teacher;
import com.luvina.test.user.User;

/**
 * @author Hoang Anh
 * @since 9 thg 1, 2021
 * @version 1.0
 */
public class Manager implements IUserAction {
	private ArrayList<User> listUser = new ArrayList<User>();

	private static final String SRC_ACCOUNT  = ".\\data\\account.txt";
	private static final String SRC			 = ".\\data\\";

	/**
	 * 
	 */
	public Manager() {
		listUser = convertFileToList();

	}
	
	// ----------------- User Interface -----------------
	public String signUp( String name, 
						  String date, 
						  String account, 
						  String pass,
						  String priorityLevel ) {

		User user = new Teacher(name, date, account, pass);
		
		if (listUser.contains(user)) {
			return "Tài khoản đã tồn tại";
		}

		// Thêm vào list và Ghi File
		listUser.add(user);
		boolean result1 = convertListToFile();
		boolean result2 = writeToFile("", SRC + user.getAccount() + ".txt");

		// Xử lý kết quả và trả về
		if (result1 && result2) {
			return "Tạo tài khoản thành công";
		} else {
			return "Lỗi hệ thống !!!";
		}
	}

	public User signIn(String account, String pass) {
		for (User user : listUser) {
			if (user.getAccount().equals(account)) {
				if (user.getPass().equals(pass)) {
					if("TEACHER".equals(user.getPriorityLevel())) {
						return new Teacher(user, convertFileToTeacher(account));
					} else if ("STUDENT".equals(user.getPriorityLevel())) {
						return convertFileToStudent(account);
					}
				}
			}
		}
		return new User();
	}

	// ----------------- Manager Method -----------------

	/**
	 * 
	 */
	public String addUser(User newUser) {
		if (listUser.contains(newUser)) {
			return "Thêm không thành công\nĐã tồn tại người dùng này";
		}

		listUser.add(newUser);

		// Tạo file riêng cho từng tài khoản
		boolean condition1 = writeToFile(newUser.toAccountFile(), SRC + newUser.getAccount() + ".txt");

		// Thêm tài khoản mới vào file account tổng
		boolean condition2 = convertListToFile();
		if(condition1 && condition2) {
			return "Thêm thành công";
		} 
		return "Lỗi hệ thống !!!";
	}
	
	/**
	 * 
	 */
	public boolean addStudent(Student newStudent, User teacher) {
		listUser.add(newStudent);
		convertListToFile();
		writeToFile(newStudent.toAccountFile(), SRC + newStudent.getAccount() + ".txt");
		return writeToFile(teacher.toAccountFile(), SRC + teacher.getAccount() + ".txt");
	}

	public boolean removeStudent(String studentID, User teacher) {
		int idx = listUser.indexOf(new User(studentID, "", "", "", "", ""));
		String fileName = listUser.get(idx).getAccount() + ".txt";
		
		// Check trong file account.txt
		if (idx == -1) {
			return false;
		}
		listUser.remove(idx);

		// Cập nhật lại danh sách User và danh sách học sinh bên trong Teacher
		if (convertListToFile()) {
			if (writeToFile(teacher.toAccountFile(), SRC + teacher.getAccount() + ".txt")) {
				if (deleteFile(SRC + fileName)) {
					return true;
				}
			}
		}
		return false;
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
				User student = new User(studentInfor[0], 
										studentInfor[1], 
										studentInfor[2], 
										studentInfor[3],
										studentInfor[4], 
										studentInfor[5]);
				
				list.add(student);
			}
			return list;
		} catch (Exception e) {
			return new ArrayList<User>();
		}
	}

	private ArrayList<Student> convertFileToTeacher(String account) {
		try {
			String data = readFile(SRC + account + ".txt");
			if(data != null) {
				String[] dataLine = data.split("\n");
				ArrayList<Student> list = new ArrayList<Student>();
				for (int i = 0; i < dataLine.length; i++) {
					String[] student = dataLine[i].split("_");
					Student stu = new Student(student[0],
											  student[1], 
											  student[2],
											  student[3], 
											  student[4],
											  student[6],
											  student[7],
											  student[8], 
											  student[9]);
					list.add(stu);
				}
				return list;
			}
			return new ArrayList<Student>();
		} catch (Exception e) {
			return new ArrayList<Student>();
		}
	}

	private Student convertFileToStudent(String account) {
		try {
			String data = readFile(SRC + account + ".txt");
			if (!data.isEmpty()) {
				data = data.trim();
				String[] student = data.split("_");
					return new Student( student[0],
										student[1], 
										student[2],
										student[3], 
										student[4],
										student[6],
										student[7],
										student[8], 
										student[9]);
			}
			return new Student("", "", "", "", "", "", "", "");
		} catch (Exception e) {
			return new Student("", "", "", "", "", "", "", "");
		}
	}

	public boolean convertListToFile() {
		String data = "";
		for (User user : listUser) {
			data += user.toString();
		}
		return writeToFile(data, SRC_ACCOUNT);
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

	private boolean writeToFile(String input, String path) {
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
			return false;
		}
		return true;
	}
	
	private boolean deleteFile(String path) {
		try {
			File file = new File(path);
			return file.delete();
		}  
		catch(Exception e)  
		{  
			return false;
		}
	}
}
