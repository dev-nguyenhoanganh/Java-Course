/**
 * @Project_Name 32_AnhNH_Tuyen Sinh
 */
package com.luvina.tuyensinh.thisinh;

/**
 * @author Hoang Anh
 * @since 21 thg 12, 2020
 * @version 1.0
 */
public class ThiSinh {
	private String sBD;
	private String hoTen;
	private String diaChi;
	private String uuTien;
	private String khoi;
	private double tongDiem;


	/**
	 * 
	 */
	public ThiSinh(String sBD, String hoTen, String diaChi, String uuTien) {
		this.sBD = sBD;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.uuTien = uuTien;
	}

	@Override
	public String toString() {
		return sBD + "\t" + hoTen + "\t\t" + diaChi + "\t" + uuTien;
	}

	@Override
	public boolean equals(Object obj) {
		ThiSinh tempObj = (ThiSinh) obj;
		boolean isHoTen = tempObj.getHoTen().equals(hoTen);
		boolean isDiaChi = tempObj.getDiaChi().equals(diaChi);
		boolean isSBD = tempObj.getsBD().equals(sBD);
		return isSBD || (isHoTen && isDiaChi);
	}

	/**
	 * @return the sBD
	 */
	public String getsBD() {
		return sBD;
	}

	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}

	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}

	/**
	 * @return the uuTien
	 */
	public String getUuTien() {
		return uuTien;
	}

	/**
	 * @return the tongDiem
	 */
	public double getTongDiem() {
		return tongDiem;
	}

	/**
	 * @param tongDiem the tongDiem to set
	 */
	public void setTongDiem(double tongDiem) {
		this.tongDiem = tongDiem;
	}

	/**
	 * @return the khoi
	 */
	public String getKhoi() {
		return khoi;
	}

	/**
	 * @param khoi the khoi to set
	 */
	public void setKhoi(String khoi) {
		this.khoi = khoi;
	}

}
