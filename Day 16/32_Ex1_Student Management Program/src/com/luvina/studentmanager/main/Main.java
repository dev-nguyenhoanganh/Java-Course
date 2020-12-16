/**
 * @Project_Name 32_Ex1_Student Management Program
 */
package com.luvina.studentmanager.main;

import com.luvina.studentmanager.manager.Manager;
import com.luvina.studentmanager.student.Student;

/**
 * @author Hoang Anh
 * @since 16 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.addStudent(new Student("nam", "Nguyen Viet Hung", 10, 20));
		manager.addStudent(new Student("nam", "Nguyen Viet Hưng", 10, 20));
		manager.addStudent(new Student("nữ" , "Nguyen Thi Huong", 10, 20));
		manager.addStudent(new Student("nữ" , "Nguyen Van Anh"  , 10, 20));

		System.out.println("Danh sách học sinh: ");
		manager.display();

		// Xóa bạn Nguyễn Việt Hùng
		String result = manager.removeStudent(new Student("", "Nguyen Viet Hung", 0, 20));
		System.out.println(result);
		manager.display();

		// Thêm mới bạn Hoàng Anh
		result = manager.addStudent(new Student("nam", "Nguyen Hoang Anh", 8, 19));
		System.out.println(result);
		manager.display();

		// Sửa tuổi của bạn Hoàng Anh
		result = manager.modifyStudent(new Student("nam", "Nguyen Hoang Anh", 10, 19));
		System.out.println(result);
		manager.display();

		// Tìm kiếm những bạn có tuổi bằng 20
		System.out.println("\nKết quả tìm kiếm:");
		manager.display(manager.findStudent(20));
	}
}
