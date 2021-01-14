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
	protected String userID;
	protected String name;
	protected String date;
	protected String account;
	protected String pass;
	protected String priorityLevel;

	private IUserAction event;

	/**
	 * Khởi tạo có tham số đầy đủ
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
	 * Khởi tạo tự tạo ID
	 * @param name
	 * @param date
	 * @param account
	 * @param pass
	 * @param priorityLevel
	 */
	public User(String 	name, 
				String 	date, 
				String 	account, 
				String 	pass,
				String 	priorityLevel) {
					
		this.userID	 = "ID-2021-" + account;
		this.name	 = name;
		this.date	 = date;
		this.account = account;
		this.pass 	 = pass;

		this.priorityLevel = priorityLevel;
	}

	/**
	 * Khởi tạo không tham số
	 */
	public User() {
		this.userID	 = "";
		this.name	 = "";
		this.date	 = "";
		this.account = "";
		this.pass 	 = "";

		this.priorityLevel = "";
	}
	
	
	// ------------------ Interface -----------------
	/**
	 * 
	 */
	public void addEvent(IUserAction event) {
		this.event = event;
	}

	public String signUp() {
		return event.signUp(name, date, account, pass, priorityLevel);
	}

	public User signIn(String account, String pass) {
		return event.signIn(account, pass);
	}

	/**
	 * @param newStudent
	 * @return
	 */
	public boolean addStudent(Student newStudent) {
		return event.addStudent(newStudent, this);
	}

	public boolean removeStudent(String studentID) {
		return event.removeStudent(studentID, this);
	}

	// ----------------- User Method -----------------
	@Override
	public boolean equals(Object obj) {
		User user = (User) obj;
		return userID.equals(user.getUserID());
	}

	@Override
	public String toString() {
		return userID 		 + "_" 
			+  name   		 + "_" 
			+  date   		 + "_" 
			+  account		 + "_" 
			+  pass	   		 + "_"
			+  priorityLevel + "\n";
	}

	/**
	 * @return
	 */
	public String toAccountFile() {
		return userID 		 + "_" 
			+  name   		 + "_" 
			+  date   		 + "_" 
			+  account		 + "_" 
			+  pass	   		 + "_"
			+ priorityLevel;
	}

	/**
	 * 
	 */
	public String showData() {
		return  "- Tên         : " + name 
			+ "\n- Ngày sinh   : " + date
			+ "\n- ID          : " + userID
			+ "\n- Tài khoản   : " + account
			+ "\n- Phân quyền  : " + priorityLevel
		
		; 
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
