/**
 * @Project_Name 32_AnhNH_Tuyen Sinh
 */
package com.luvina.tuyensinh.thisinh;

/**
 * @author Hoang Anh
 * @since 21 thg 12, 2020
 * @version 1.0
 */
public class ThiSinhKhoiC extends ThiSinh {
	private double diemVan;
	private double diemSu;
	private double diemDia;

	/**
	 * 
	 */
	public ThiSinhKhoiC(String sBD, String hoTen, String diaChi, String uuTien, double diemVan, double diemSu,
			double diemDia) {
		super(sBD, hoTen, diaChi, uuTien);
		this.diemVan = diemVan;
		this.diemSu = diemSu;
		this.diemDia = diemDia;
		this.setTongDiem(diemVan + diemSu + diemDia);
		this.setKhoi("C");
	}

	@Override
	public String toString() {
		return super.toString() + "_" + diemVan + "_" + diemSu + "_" + diemDia;
	}

}
