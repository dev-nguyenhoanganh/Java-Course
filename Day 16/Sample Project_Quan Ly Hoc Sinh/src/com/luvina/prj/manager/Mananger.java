/**
 * @Project_Name Sample Project_Quan Ly Hoc Sinh
 */
package com.luvina.prj.manager;

import java.util.ArrayList;

import com.luvina.prj.student.Student;

/**
 * @author Hoang Anh
 * @since 14 thg 12, 2020
 * @version 1.0
 */
public class Mananger {
	private ArrayList<Student> listStu;
	/**
	 * 
	 */
	public Mananger() {
		this.listStu = new ArrayList<Student>();
	}
	
	public void addStudent(Student newStu) {
//		for(Student element : listStu) {
//			if(element.getID().equals(newStu.getID())) {
//				System.out.println("ID này đã tồn tại");
//				return;
//			}
//		}
		
		if(listStu.contains(newStu)) {
			System.out.println("Đã tồn tại ID của học sinh này");
			return;
		} 
		
		this.listStu.add(newStu);
		System.out.println("Đã thêm học sinh thành công");
	}
	
	public void editStudent(Student newStu) {
		int idx = listStu.indexOf(newStu);
		if(idx == -1) {
			System.out.println("Không tồn tại học sinh cần sửa");
		} else {
			listStu.set(idx,  newStu);
			System.out.println("Đã sửa thành công");
		}
	}
	
	public void clearStudent(Student newStu) {
		int idx = listStu.indexOf(newStu);
		if(idx == -1) {
			System.out.println("Không tồn tại học sinh cần sửa");
		} else {
			listStu.remove(idx);
		}
	}
	
	public ArrayList<Student> findStudent(String name) {
		ArrayList<Student> result = new ArrayList<Student>();
		for (Student ele : listStu) {
			if(ele.getName().contains(name)) {
				result.add(ele);
//				System.out.println(ele.toString());
			}
		}
		
		return result;
	}
	
	public void display() {
		System.out.println(listStu.toString());
	}
	
}
