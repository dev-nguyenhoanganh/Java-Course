/**
 * @Project_Name 32_Day 28_Ex3_TimeTable
 */
package com.luvina.btvn.logic;

/**
 * @author Hoang Anh
 * @since 23 thg 1, 2021
 * @version 1.0
 */
public class Subject {
	private String time;
	private String subject;

	/**
	 * 
	 */
	public Subject(String time, String subject) {
		this.time = time;
		this.subject = subject;
	}

	@Override
	public boolean equals(Object obj) {
		Subject object = (Subject) obj;
		return this.subject.equals(object.getSubject());
	}

	@Override
	public String toString() {
		return this.time;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

}
