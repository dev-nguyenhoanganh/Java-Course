/**
 * @Project_Name 32_AnhNH_Tuyen Sinh
 */
package com.luvina.tuyensinh.thisinh;

/**
 * @author Hoang Anh
 * @since 21 thg 12, 2020
 * @version 1.0
 */
public class ThiSinhKhoiB extends ThiSinh {
	private double diemToan;
	private double diemHoa;
	private double diemSinh;

	/**
	 * 
	 */
	public ThiSinhKhoiB(String sBD, String hoTen, String diaChi, String uuTien, double diemToan, double diemHoa,
			double diemSinh) {
		super(sBD, hoTen, diaChi, uuTien);
		this.diemToan = diemToan;
		this.diemHoa = diemHoa;
		this.diemSinh = diemSinh;
		this.setTongDiem(diemToan + diemHoa + diemSinh);
		this.setKhoi("B");
	}

	@Override
	public String toString() {
		return super.toString() + "_" + diemToan + "_" + diemHoa + "_" + diemSinh;
	}

}
