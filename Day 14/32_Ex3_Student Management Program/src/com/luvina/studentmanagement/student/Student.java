/**
 * @Project_Name 32_Ex3_Student Management Program
 */
package com.luvina.studentmanagement.student;

/**
 * @author Hoang Anh
 * @since 8 thg 12, 2020
 * @version 1.0
 */
public class Student implements Comparable <Student> {
	private String id;
	private String name;
	private int score;
	// private int age;

	/**
	 * Phương thức khởi tạo giá trị cho các thuộc tính của đối tượng
	 * @param id - mã học sinh
	 * @param name - tên học sinh
	 * @param score - điểm số của học sinh
	 */
	public Student(String id, String name, int score) {
		this.id 	= id;
		this.name 	= name;
		this.score  = score;
	}
	
	@Override
	public String toString() {
		return "[" + id + "_" + name + "_" + score + "]";
	}


	// @Override
	// public int compareTo(Student spObj) {
	// 	// Xếp tăng dần
	// 	return this.age - spObj.age;

	// 	// Xếp giảm dần
	// 	// return spObj.age - this.age;
	// }

	// @Override
	// public int compareTo(Student obj) {

	// 	return obj.getName().compareTo(this.name);
	// }

	// So sánh kiểu dữ liệu double
	// @Override
	// public int compareTo(Student obj) {
	// 	double result = this.score - obj.score; 
	// 	return result > 0 ? 1 : (result < 0 ? 0 : -1) ;
	// }

	// So sánh 2 tiêu chí điểm -> tên
	@Override
	public int compareTo(Student obj) {
		double result = this.score - obj.score; 
		
		if(result > 0) {
			return 1;
		} else if (result < 0) {
			return - 1;
		}

		return - obj.getName().compareTo(this.name);
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
}
