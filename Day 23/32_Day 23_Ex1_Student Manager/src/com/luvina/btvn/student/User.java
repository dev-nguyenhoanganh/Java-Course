/**
 * @Project_Name 32_Day 23_Ex1_Student Manager
 */
package com.luvina.btvn.student;

import java.util.ArrayList;

/**
 * @author Hoang Anh
 * @since 8 thg 1, 2021
 * @version 1.0
 */
public class User {
	private String studentName;
	private String studentID;
	private String dateOfBirth;
	private String score;
	private String pass;

	private String priorityLevel;

	private IUserAction event;

	/**
	 * 
	 */
	public User(String studentName, 
				   String studentID, 
				   String dateOfBirth, 
				   String score, 
				   String pass,
				   String priorityLevel) {
		
		this.studentName = studentName;
		this.studentID   = studentID;
		this.dateOfBirth = dateOfBirth;
		this.pass		 = pass;
		// Phân quyền
		this.priorityLevel = priorityLevel;

		if (score.isEmpty()) {
			this.score = "0";
		} else {
			this.score = score;
		}
	}

	/**
	 * 
	 */
	public User() {
		this.studentName  = "";
		this.studentID 	  = "";
		this.dateOfBirth  = "";
		this.pass 		  = "";
		// Phân quyền
		this.priorityLevel = "0";
	}

	// ----------------- Interface Method -----------------
	public void addEvent(IUserAction event) {
		this.event = event;
	}

	public boolean signUp(String studentName, 
						  String studentID, 
						  String dateOfBirth, 
						  String score, 
						  String pass,
						  String priorityLevel) {
		
		return event.signUp(studentName, 
							studentID, 
							dateOfBirth, 
							pass, 
							priorityLevel)
		;
	}

	public User findStudentByAccount(String account) {
		return event.findStudentByAccount(account);
	}

	public ArrayList<User> findStudent(String studentName) {
		return event.findStudent(studentName);
	}

	public String signIn(String studentID, String pass) {
		return event.signIn(studentID, pass);
	}

	// ----------------- Object Method -----------------

	@Override
	public boolean equals(Object obj) {
		User student = (User) obj;
		return studentID.equals(student.getStudentID());
	}

	@Override
	public String toString() {
		return studentName   + "_"
			+  studentID 	 + "_"
			+  dateOfBirth   + "_"
			+  score		 + "_"
			+  pass		     + "_"
			+  priorityLevel + "\n"
		;
	}

	public String showData() {
		return "Tên       : " + studentName
			+  "\nNgày sinh : " + dateOfBirth
			+  "\nĐiểm      : " + score
			+  "\nTài khoản : "	+ studentID
		;
	}

	// ----------------- Getters & Setters -----------------

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
	 * @return the studentID
	 */
	public String getStudentID() {
		return studentID;
	}

	/**
	 * @param studentID the studentID to set
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
	 * @return the priorityLevel
	 */
	public String getPriorityLevel() {
		return priorityLevel;
	}

	/**
	 * @param priorityLevel the priorityLevel to set
	 */
	public void setPriorityLevel(String priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

}
