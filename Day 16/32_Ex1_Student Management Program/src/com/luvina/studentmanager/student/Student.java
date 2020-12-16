/**
 * @Project_Name 32_Ex1_Student Management Program
 */
package com.luvina.studentmanager.student;

/**
 * @author Hoang Anh
 * @since 16 thg 12, 2020
 * @version 1.0
 */
public class Student {
	private String gender;
	private String name;
	private String id;
	private int score;
	private int age;

	/**
	 * 
	 */
	public Student(String gender, String name, String id, int score, int age) {
		this.gender = gender;
		this.name 	= name;
		this.id 	= id;
		this.score 	= score;
		this.age 	= age;
	}

	@Override
	public boolean equals(Object obj) {
		Student object = (Student) obj;
		if((object.getName().equals(this.name))) {
			// return 
		}
		return super.equals(obj);
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
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
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
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
}
