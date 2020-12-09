/**
 * @Project_Name 32_Ex3_Student Management Program
 */
package com.luvina.studentmanagement.student;

/**
 * @author Hoang Anh
 * @since 8 thg 12, 2020
 * @version 1.0
 */
public class Student {
	private String id;
	private String name;
	private int score;

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

//	/**
//	 * Phương thức thiết lập giá trị cho các thuộc tính của đối tượng
//	 * @param id - mã học sinh
//	 * @param name - tên học sinh
//	 * @param score - điểm số của học sinh
//	 */
//	public void setData(String id, String name, int score) {
//		this.id 	= id;
//		this.name 	= name;
//		this.score 	= score;
//	}
	
	@Override
	public String toString() {
		return "[" + id + "_" + name + "_" + score + "]";
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
