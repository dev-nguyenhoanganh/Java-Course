/**
 * @Project_Name 32_Ex1_Student Management Program
 */
package com.luvina.studentmanager.manager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Pattern;

import com.luvina.studentmanager.student.Student;

/**
 * @author Hoang Anh
 * @since 16 thg 12, 2020
 * @version 1.0
 */
public class Manager {
	ArrayList<Student> list;
	
	/**
	 * 
	 */
	public Manager() {
		list = new ArrayList<Student>();
	}

	/**
	 * 
	 * @param listStudent
	 */
	public void display(ArrayList<Student> listStudent) {
		for (Student student : listStudent) {
			student.setId(list.indexOf(student));
			System.out.println(student.toString());
		}
	}

	/**
	 * 
	 */
	public void display() {
		for (Student student : list) {
			student.setId(list.indexOf(student));
			System.out.println(student.toString());
		}
	}

	/**
	 * 
	 */
	Comparator<Student> orderByName = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			if (o1.getName().equals(o2.getName())) {
				return o1.getAge() - o2.getAge();
			} else {
				return o1.getName().compareTo(o2.getName());
			}
		}
	};

	/**
	 * 
	 * @param newStu
	 * @return
	 */
	public String addStudent(Student newStu) {
		if (list.contains(newStu)) {
			return "\nĐã tồn tại học sinh này";
		} else {
			this.list.add(newStu);
			return "\nThêm thành công";
		}
	}

	/**
	 * 
	 * @param newStu
	 * @return
	 */
	public String modifyStudent(Student newStu) {
		int index = list.indexOf(newStu);
		if (index == -1) {
			return "\nKhông tồn tại học sinh cần sửa";
		} else {
			this.list.set(index, newStu);
			return "\nSửa thành công";
		}
	}

	/**
	 * 
	 * @param newStu
	 * @return
	 */
	public String removeStudent(Student newStu) {
		int idx = list.indexOf(newStu);
		if (idx == -1) {
			return "\nKhông tồn tại học sinh cần xóa";
		} else {
			list.remove(idx);
			return "\nXóa thành công";
		}
	}

	/**
	 * 
	 * @param age
	 * @return
	 */
	public ArrayList<Student> findStudent(int age) {
		ArrayList<Student> result = new ArrayList<Student>();
		for (Student student : list) {
			if (student.getAge() == age) {
				result.add(student);
			}
		}
		return result;
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	public ArrayList<Student> findStudent(String name) {
		ArrayList<Student> result = new ArrayList<Student>();
		String regex = buildRegex(name);
		for (Student ele : list) {
			if (Pattern.matches(regex, ele.getName())) {
				result.add(ele);
			}
		}
		return result;
	}

	// -------------------- PRIVATE LAYER --------------------

	/**
	 * 
	 * @param name
	 * @return
	 */
	private String buildRegex(String name) {
		String result = "*.";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			result += "[" + Character.toUpperCase(ch) + "|" + Character.toLowerCase(ch) + "]";
		}
		return result + ".*";
	}

}
