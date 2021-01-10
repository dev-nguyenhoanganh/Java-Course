/**
 * @Project_Name 32_Day 22_Ex1_Student Manager
 */
package com.luvina.student.student;

/**
 * @author Hoang Anh
 * @since 6 thg 1, 2021
 * @version 1.0
 */
public class Student {
	private String studentName;
	private String score;
	private boolean validate;

	/**
	 * 
	 */
	public Student(String studentName, String score) {
		this.studentName = studentName;
		this.score 		 = score;
		return;
	}

	@Override
	public String toString() {
		
		return "Tên: " + studentName + "\t\tĐiểm: " + score;
	}

	@Override
	public boolean equals(Object obj) {
		Student object = (Student) obj;
		boolean nameCondition  = this.studentName.equals(object.getStudentName());
		return nameCondition;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the score
	 */
	public String getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(String score) {
		this.score = score;
	}

	/**
	 * @return the validate
	 */
	public boolean isValidate() {
		return validate;
	}

	/**
	 * @param validate the validate to set
	 */
	public void setValidate(boolean validate) {
		this.validate = validate;
	}
}
