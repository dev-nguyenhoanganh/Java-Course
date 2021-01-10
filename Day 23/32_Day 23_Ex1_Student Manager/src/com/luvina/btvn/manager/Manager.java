/**
 * @Project_Name 32_Day 23_Ex1_Student Manager
 */
package com.luvina.btvn.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

import com.luvina.btvn.student.User;

/**
 * @author Hoang Anh
 * @since 8 thg 1, 2021
 * @version 1.0
 */
public class Manager {
	private ArrayList<User> studentList;
	private final String PATH = ".\\data\\database.txt";

	private final static String STUDENT = "1";

	/**
	 * 
	 */
	public Manager() {
		this.studentList = convertFileToUser();
	}

	// ----------------- User Interface -----------------
	public boolean signUp(String userName, 
						  String userID, 
						  String dateOfBirth,
						  String pass, 
						  String priorityLevel) {
		
		User user = new User(userName, 
								   userID, 
								   dateOfBirth, "", 
								   pass, 
								   priorityLevel);
		
		if (studentList.contains(user)) {
			System.err.println("Tài khoản đã tồn tại");
			return false;
		}
		studentList.add(user);
		String result = convertListToFile();
		if ("Ghi thành công".equals(result)) {
			System.out.println("Tạo tài khoản thành công");
		} else if ("Lỗi hệ thống !!!".equals(result)) {
			System.err.println("Lỗi hệ thống !!!");
		}
		return false;
	}

	public String signIn(String userName, String pass) {
		for (User user : studentList) {
			if (user.getPass().equals(pass)) {
				if (user.getStudentID().equals(userName)) {
					return user.getPriorityLevel();
				}
			}
		}
		return null;
	}

	// ----------------- Manager Method -----------------
	/**
	 * 
	 * @param newStudent
	 * @return
	 */
	public String addStudent(User newStudent) {
		if (studentList.contains(newStudent)) {
			return "Thêm không thành công\nĐã tồn tại học sinh này";
		} else {
			studentList.add(newStudent);
		}
		convertListToFile();
		return "Thêm thành công";
	}

	/**
	 * 
	 * @param removeStudent
	 * @return
	 */
	public String removeStudent(String studentID) {
		int idx = studentList.indexOf(new User("", studentID, "", "", "", ""));
		if (idx == -1) {
			return "Không tồn tại học sinh cần xóa";
		}
		studentList.remove(idx);
		convertListToFile();
		return "Xóa thành công";
	}

	/**
	 * 
	 * @param studentName
	 * @return
	 */
	public ArrayList<User> findStudent(String studentName) {
		ArrayList<User> result = new ArrayList<User>();

		for (User student : studentList) {
			if (student.getStudentName().contains(studentName)) {
				if (STUDENT.equals(student.getPriorityLevel())) {
					result.add(student);
				}
			}
		}
		return result;
	}

	public User findStudentByAccount(String account) {
		for (User student : studentList) {
			if (account.equals(student.getStudentID())) {
				return student;
			}
		}
		return null;
	}

	/**
	 * 
	 */
	public void display() {
		if (studentList.isEmpty()) {
			System.err.println("Danh sách rỗng");
		} else {
			for (User student : studentList) {
				System.out.println("\n---------- Học sinh " + student.getStudentName());
				System.out.println(student.showData());
			}
		}
	}

	/**
	 * 
	 * @param list
	 * @param name
	 */
	public void display(ArrayList<User> list, String name) {
		if (list.isEmpty()) {
			if (name.isEmpty()) {
				System.err.println("Danh sách rỗng");
			} else {
				System.err.println("Không tìm thấy học sinh có tên " + name);
			}
		} else {
			for (User student : list) {
				System.out.println();
				System.out.println(student.showData());
			}
		}
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<User> sortByScore() {
		studentList.sort(sortByScore);
		convertListToFile();
		return studentList;
	}

	public String convertListToFile() {
		String data = "";
		for (User user : studentList) {
			data += user.toString();
		}
		return writeToFile(data, PATH);
	}

	// ----------------- Comparator -----------------

	Comparator<User> sortByScore = new Comparator<User>() {
		public int compare(User o1, User o2) {
			double result = Double.parseDouble(o2.getScore()) 
						  - Double.parseDouble(o1.getScore());
			if (result > 0) {
				return 1;
			}
			if (result < 0) {
				return -1;
			}
			return o1.getStudentName().compareTo(o2.getStudentName());
		};
	};

	// ----------------- Private Method -----------------

	/**
	 * @return
	 */
	private ArrayList<User> convertFileToUser() {
		try {
			String   data     = readFile(PATH);
			String[] dataLine = data.split("\n");
			ArrayList<User> listStudent = new ArrayList<User>();
			for (int i = 0; i < dataLine.length; i++) {
				String[] studentInfor = dataLine[i].split("_");
				User student = new User(studentInfor[0], 
											  studentInfor[1], 
											  studentInfor[2], 
											  studentInfor[3],
											  studentInfor[4],
											  studentInfor[5]);
				listStudent.add(student);
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
				return "Tạo file thành công";
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
