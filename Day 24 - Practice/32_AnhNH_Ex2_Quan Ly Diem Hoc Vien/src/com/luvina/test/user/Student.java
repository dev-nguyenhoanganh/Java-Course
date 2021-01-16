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
				   String 	   englishScore,
				   String 	   grade) {

		super(userID, name, date, account, pass, "STUDENT");
		this.mathScore 		 = mathScore;
		this.literatureScore = literatureScore;
		this.englishScore 	 = englishScore;
		this.grade 			 = grade; 

		setDiemTB();
	}

	/**
	 * Khởi tạo tự tạo ID
	 * @param name
	 * @param date
	 * @param account
	 * @param pass
	 * @param mathScore
	 * @param literatureScore
	 * @param grade
	 * @param englishScore
	 */
	public Student(String 	   name, 
				   String 	   date, 
				   String 	   account, 
				   String	   pass,
				   String 	   mathScore, 
				   String 	   literatureScore,
				   String 	   englishScore,
				   String 	   grade) { 

		super(name, date, account, pass, "STUDENT");
		this.mathScore 		 = mathScore;
		this.literatureScore = literatureScore;
		this.englishScore 	 = englishScore;
		this.grade 			 = grade; 
		setDiemTB();
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
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toAccountFile() {
		return super.toAccountFile() 
					+ "_" + mathScore 
					+ "_" + literatureScore
					+ "_" + englishScore 
					+ "_" + grade + "\n";
	}

	@Override
	public String showData() {
		return super.showData() 
			+ "\n- Lớp         : " + grade
			+ "\n- Điểm Toán   : " + mathScore
			+ "\n- Điểm Văn    : " + literatureScore
			+ "\n- Điểm Anh    : " + englishScore
			+ "\n- Điểm TB     : " + diemTB;
	}

	/**
	 * 
	 */
	public void setDiemTB() {
		double sum = Double.parseDouble(mathScore) + 
			  Double.parseDouble(literatureScore)  +  
			  Double.parseDouble(englishScore);
		this.diemTB = "" + sum / 3;
	}

}
