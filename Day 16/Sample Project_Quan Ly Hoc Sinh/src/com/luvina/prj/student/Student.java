/**
 * @Project_Name Sample Project_Quan Ly Hoc Sinh
 */
package com.luvina.prj.student;

/**
 * @author Hoang Anh
 * @since 14 thg 12, 2020
 * @version 1.0
 */
public class Student {
	private String ID;
	private String name;
	private double score;
	private int age;

	/**
	 * 
	 */
	public Student(String ID, String name, double score, int age) {
		this.ID = ID;
		this.age = age;
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return this.ID + "_" + this.name + "_" + this.score;
	}

	// Override phương thức này mới dùng contains được
	@Override
	public boolean equals(Object obj) {
		Student object = (Student) obj;
		return this.ID.equals(object.getID());
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the score
	 */
	public double getScore() {
		return score;
	}

	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(double score) {
		this.score = score;
	}

}
