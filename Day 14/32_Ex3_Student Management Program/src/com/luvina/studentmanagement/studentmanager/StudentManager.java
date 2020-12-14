/**
 * @Project_Name 32_Ex3_Student Management Program
 */
package com.luvina.studentmanagement.studentmanager;

import java.util.Arrays;
import java.util.Comparator;

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
		students = new Student[] {
			new Student("20165739", "Nguyen Hoang Anh"  , 5 ),
			new Student("20166123", "Pham Thu Hoai"     , 8 ),
			new Student("20166122", "Hoang Thi Hoai"    , 7 ),
			new Student("20165768", "Trinh Tuan Anh"    , 10),
			new Student("20170569", "Bui Thi Phuong Hoa", 10)
		};
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

	Comparator <Student> orderByName = new Comparator <Student>() {
		@Override
		public int compare(Student o1, Student o2) {

			return o1.getName().compareTo(o2.getName());
		};
	};

	public void Sort() {
		Arrays.sort(students, orderByName);
	}

	public Student[] findStudentByScore(int score) {
		Student[] resultList = new Student[students.length];
		for (int i = 0; i < students.length; i++) {
			if (score == students[i].getScore()) {
				resultList[i] = students[i];
			}
		}

		return resultList;
	}

	// Tìm cái gì thì trả về dạng cấu trúc dữ liệu đó
}
