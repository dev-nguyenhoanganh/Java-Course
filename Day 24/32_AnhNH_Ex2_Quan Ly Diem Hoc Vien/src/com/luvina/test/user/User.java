/**
 * @Project_Name 32_AnhNH_Ex2_Quan Ly Diem Hoc Vien
 */
package com.luvina.test.user;

/**
 * @author Hoang Anh
 * @since 9 thg 1, 2021
 * @version 1.0
 */
public class User {
	private String userID;
	private String name;
	private String date;
	private String account;
	private String pass;
	private String priorityLevel;

	private IUserAction event;

	/**
	 * 
	 */
	public User(String 		userID, 
				String 		name, 
				String 		date, 
				String 		account, 
				String 		pass,
				String 		priorityLevel) {
					
		this.userID	 = userID;
		this.name	 = name;
		this.date	 = date;
		this.account = account;
		this.pass 	 = pass;

		this.priorityLevel = priorityLevel;
	}

	/**
	 * 
	 */
	public void addEvent(IUserAction event) {
		this.event = event;
	}

	// ------------------ Interface -----------------
	public boolean signUp() {
		return event.signUp(userID, name, date, account, pass, priorityLevel);
	}

	public User signIn(String account, String pass) {
		return event.signIn(account, pass);
	}

	// ----------------- User Method -----------------
	@Override
	public boolean equals(Object obj) {
		User user = (User) obj;
		return userID.equals(user.getUserID());
	}

	@Override
	public String toString() {
		return "\n    ID    : "  + userID 
			+  "\n  Họ Tên  : "  + name 
			+  "\nNgày sinh : "  + date;
	}

	/**
	 * @return
	 */
	public String toFile() {
		return userID  + "_" 
			+  name    + "_" 
			+  date    + "_" 
			+  account + "_" 
			+  pass	   + "\n";
	}

	/**
	 * 
	 */
	public String showData() {
		return  "Tên       : " + name 
			+ "\nNgày sinh : " + date; 
	}

	/**
	 * @param newStudent
	 * @return
	 */
	public String addStudent(Student newStudent) {
		// TODO Auto-generated method stub
		return null;
	}

	// ----------------- Getter & Setter -----------------

	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
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
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
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


}
