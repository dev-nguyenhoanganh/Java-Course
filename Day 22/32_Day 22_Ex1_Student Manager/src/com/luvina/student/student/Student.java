/**
 * @Project_Name 32_Day 23_Ex1_Student Manager
 */
package com.luvina.student.student;

/**
 * @author Hoang Anh
 * @since 8 thg 1, 2021
 * @version 2.0
 */
public class Student {
	private String studentName;
	private String studentID;
	private String score;
	private String dateOfBirth;

	/**
	 * 
	 */
	public Student(String studentName, String studentID, String score, String dateOfBirth) {
		this.studentName = studentName;
		this.studentID = studentID;
		this.score 		 = score;
		this.dateOfBirth = dateOfBirth;
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
	 * @return the idx
	 */
	public String getStudentID() {
		return studentID;
	}

	/**
	 * @param idx the idx to set
	 */
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
