/**
 * @Project_Name 32_AnhNH_Ex2_Quan Ly Diem Hoc Vien
 */
package com.luvina.test.user;

/**
 * @author Hoang Anh
 * @since 9 thg 1, 2021
 * @version 1.0
 */
public class Student extends User {
	private String mathScore;
	private String literatureScore;
	private String englishScore;
	private String grade;
	private String diemTB;


	/**
	 * 
	 */
	public Student(String 	   userID, 
				   String 	   name, 
				   String 	   date, 
				   String 	   account, 
				   String	   pass,
				   String 	   mathScore, 
				   String 	   literatureScore,
				   String 	   grade, 
				   String 	   englishScore) {

		super(userID, name, date, account, pass, "STUDENT");
		this.mathScore 		 = mathScore;
		this.literatureScore = literatureScore;
		this.englishScore 	 = englishScore;
		this.grade 			 = grade; 
	}

	// ------------------ User Interface -----------------	
	@Override
	public Student signIn(String account, String pass) {
		return (Student) super.signIn(account, pass);
	}

	// ------------------ Student Method -----------------	

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String toAccountFile() {
		return super.toAccountFile() 
					+ "_" + mathScore 
					+ "_" + literatureScore 
					+ "_" + englishScore + "\n";
	}


	@Override
	public String showData() {
		return super.showData() 
			+ "\n   Lớp    : " + grade
			+ "\nĐiểm Toán : " + mathScore
			+ "\nĐiểm Văn  : " + mathScore
			+ "\nĐiểm Anh  : " + englishScore
			+ "\nĐiểm TB   : " + diemTB;
	}

	/**
	 * @param diemTB the diemTB to set
	 */
	public void setDiemTB(String diemTB) {
		this.diemTB = diemTB;
	}

}
