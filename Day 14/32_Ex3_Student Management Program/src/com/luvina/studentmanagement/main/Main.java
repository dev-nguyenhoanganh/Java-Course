/**
 * @Project_Name 32_Ex3_Student Management Program
 */
package com.luvina.studentmanagement.main;

import com.luvina.studentmanagement.studentmanager.StudentManager;

/**
 * @author Hoang Anh
 * @since 8 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		manager.printList();

		int score = 10;
		String result = manager.findStudentByScore(score);
		System.out.println("Danh sách sinh viên có điểm " + score + " là: ");
		System.out.println(result);
	}

}
