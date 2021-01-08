/**
 * @Project_Name 32_Day 22_Ex1_Student Manager
 */
package com.luvina.student.manager;

import java.util.ArrayList;
import java.util.Comparator;

import com.luvina.student.student.Student;

/**
 * @author Hoang Anh
 * @since 6 thg 1, 2021
 * @version 1.0
 */
public class Manager {
	private ArrayList<Student> listStudent;

	/**
	 * 
	 */
	public Manager() {
		listStudent = new ArrayList<Student>();
	}

	Comparator<Student> sortByScore = new Comparator<Student>(){
		public int compare(Student o1, Student o2) {
			double result = Double.parseDouble(o2.getScore()) - Double.parseDouble(o1.getScore());
			if(result > 0) {
				return 1;
			}
			if(result < 0) {
				return -1;
			}
			return o1.getStudentName().compareTo(o2.getStudentName());
		};
	};

	/**
	 * 
	 * @param list
	 * @param name
	 */
	public void display(ArrayList<Student> list, String name) {
		if(list.isEmpty()) {
			if (name.isEmpty()) {
				System.out.println("Danh sách rỗng");
			} else {
				System.out.println("Không tìm thấy học sinh có tên " + name);
			}
		} else {
			for (Student student : list) {
				System.out.println(student.toString());
			}
		}
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Student> sortByScore() {
		listStudent.sort(sortByScore);
		return listStudent;
	}

	/**
	 * 
	 * @param newStudent
	 * @return
	 */
	public String addStudent(Student newStudent) {
		if(listStudent.contains(newStudent)) {
			return "Thêm không thành công\nĐã tồn tại học sinh này";
		} else {
			listStudent.add(newStudent);
		}
		return "Thêm thành công";
	}
	
	/**
	 * 
	 * @param removeStudent
	 * @return
	 */
	public String removeStudent (Student removeStudent) {
		int idx = listStudent.indexOf(removeStudent);
		if(idx == -1) {
			return "Không tồn tại học sinh cần xóa";
		}
		listStudent.remove(idx);
		return "Xóa thành công";
	}

	/**
	 * 
	 * @param studentName
	 * @return
	 */
	public ArrayList<Student> findStudent(String studentName) {
		ArrayList<Student> result = new ArrayList<Student>();

		for (Student student : listStudent) {
			if(student.getStudentName().contains(studentName)) {
				result.add(student);
			}
		}

		return result;
	}
}
