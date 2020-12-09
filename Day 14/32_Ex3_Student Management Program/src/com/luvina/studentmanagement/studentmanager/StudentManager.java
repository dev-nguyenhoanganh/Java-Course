/**
 * @Project_Name 32_Ex3_Student Management Program
 */
package com.luvina.studentmanagement.studentmanager;

import com.luvina.studentmanagement.student.Student;

/**
 * @author Hoang Anh
 * @since 8 thg 12, 2020
 * @version 1.0
 */
public class StudentManager {
	Student[] students;

	/**
	 * Phương thức khởi tạo các giá trị mặc định cho từng thuộc tính 
	 * của đối tượng
	 */
	public StudentManager() {
		students = new Student[5];
		students[0] = new Student("20165739", "Nguyen Hoang Anh"  , 5 );
		students[1] = new Student("20166123", "Pham Thu Hoai"     , 8 );
		students[2] = new Student("20166122", "Hoang Thi Hoai"    , 7 );
		students[3] = new Student("20165768", "Trinh Tuan Anh"    , 10);
		students[4] = new Student("20170569", "Bui Thi Phuong Hoa", 10);
	}

	/**
	 * Phương thức in ra thông tin cụ thể của danh sách học sinh 
	 * đang được quản lý
	 */
	public void printList() {
		System.out.println("Thông tin các học sinh: ");
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString());
		}
	}

	/**
	 * Phương thức tìm kiếm học sinh thông qua số điểm 
	 * @param score - điểm số 
	 * @return - danh sách học sinh có điểm bằng với *score*
	 */
	public String findStudentByScore(int score) {
		String result = "";
		for(int i = 0; i < students.length; i++) {
			if(score == students[i].getScore()) {
				result += students[i].getName() + "\n"; 
			}
		}

		if(result.isEmpty()) {
			return null;
		} else {
			return result;
		}
	}
}
