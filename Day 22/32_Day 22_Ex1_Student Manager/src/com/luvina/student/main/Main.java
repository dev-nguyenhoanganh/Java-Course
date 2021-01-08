/**
 * @Project_Name 32_Day 22_Ex1_Student Manager
 */
package com.luvina.student.main;

import java.util.Scanner;

import com.luvina.student.manager.Manager;
import com.luvina.student.student.Student;

/**
 * @author Hoang Anh
 * @since 6 thg 1, 2021
 * @version 1.0
 */
public class Main {
	private static Scanner input;
	private static Manager manager;

	private static final String REGEX_NAME = "[\\D|\\W]+";
	private static final String REGEX_SCORE = "\\d+(\\.\\d+)?";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		input = new Scanner(System.in);
		manager = new Manager();
		getStudentInfor();
		allTask();
		System.out.println("Chương trình đã đóng");
		System.out.println("-------------------------------------------------");
		input.close();
	}

	public static void allTask () {
		while (true) {
			System.out.println("-------------------------------------------------");
			System.out.println("Mời chọn: ");
			System.out.println(
							   "[1] Tìm kiếm học sinh\r\n" 
							+  "[2] Sắp xếp danh sách học sinh theo điểm giảm dần\r\n"
							+  "[3] Thêm học sinh\r\n"
							+  "[4] Xóa học sinh\r\n"
							+  "[0] Thoát chương trình"
			);

			String choose = getInput("[0-4]", "[0-4]");
			switch (choose) {
			case "1":
				findStudent();
				break;
			case "2":
				arrangeStudent();
				break;
			case "3":
				getStudentInfor();
				break;
			case "4":
				removeStudent();
				break;
			case "0":
				return;
			}
		}
	}

	// ----------------------- Private Layer -----------------------

	private static String getInput(String regex, String name) {
		String result = "";
		while (true) {
			result = input.nextLine().trim();
			if(result.matches(regex)) {
				return result;
			}
			System.out.print( "Bạn nhập sai định dạng " + name 
							+ "\nMời nhập lại " + name + ": ");
		}
	}

	private static void getStudentInfor() {
		while (true) {
			System.out.print("Nhập tên học sinh: ");
			String name = getInput(REGEX_NAME, "tên học sinh");
			System.out.print("Nhập điểm của học sinh: ");
			String score = getInput(REGEX_SCORE, "điểm");

			System.out.println(manager.addStudent(new Student(name, score)));
			System.out.print("Bạn có muốn nhập tiếp không [Y|N]? ");
			String result = getInput("[Y|N|n|y]", "câu trả lời [Y|N]");
			if ("N".equals(result) || "n".equals(result)) {
				return;
			}
		}
	}

	private static void removeStudent() {
		System.out.print("Tên học sinh muốn xóa: ");
		String name = getInput(REGEX_NAME, "tên học sinh");
		System.out.println(manager.removeStudent(new Student(name, "")));
	}

	private static void arrangeStudent() {
		System.out.println("Danh sách học sinh sau khi sắp xếp");
		manager.display(manager.sortByScore(), "");
	}

	private static void findStudent() {
		System.out.println("Vui lòng nhập tên học sinh muốn tìm: ");
		String name = getInput(REGEX_NAME, "tên");
		System.out.println("Kết quả tìm kiếm");
		manager.display(manager.findStudent(name), name);
	}
}
