/**
 * @Project_Name 32_Ex2_Quan Ly Doan Vien
 */
package com.luvina.doanvien.doanvien;

/**
 * @author Hoang Anh
 * @since 16 thg 12, 2020
 * @version 1.0
 */
public class DoanVien {
	private String name;
	private String chiDoan;
	private double score;
	private int index;

	/**
	 * Phương thức khởi tạo của đối tượng
	 */
	public DoanVien(String name, String chiDoan, double score) {
		this.name    = name;
		this.chiDoan = chiDoan;
		this.score 	 = score;
	}

	@Override
	public boolean equals(Object obj) {
		// 2 Đoàn viên bằng nhau khi tên giống nhau
		return ((DoanVien) obj).getName().equals(this.name);
	}

	@Override
	public String toString() {
		return "[" + index + "] " + name + " " + chiDoan + " | " + score;
	}

	// -------------------- GETTER & SETTER --------------------

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
	 * @return the chiDoan
	 */
	public String getChiDoan() {
		return chiDoan;
	}

	/**
	 * @param chiDoan the chiDoan to set
	 */
	public void setChiDoan(String chiDoan) {
		this.chiDoan = chiDoan;
	}

	/**
	 * @return the score
	 */
	public double getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(double score) {
		this.score = score;
	}

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
}
