/**
 * @Project_Name 32_AnhNH_Tuyen Sinh
 */
package com.luvina.tuyensinh.thisinh;

/**
 * @author Hoang Anh
 * @since 21 thg 12, 2020
 * @version 1.0
 */
public class ThiSinhKhoiA extends ThiSinh
{
	private double diemToan;
	private double diemLi;
	private double diemHoa;

	/**
	 * 
	 */
	public ThiSinhKhoiA(String sBD, String hoTen, String diaChi, String uuTien, double diemToan, double diemLi,
			double diemHoa) {
		super(sBD, hoTen, diaChi, uuTien);
		this.diemToan = diemToan;
		this.diemLi = diemLi;
		this.diemHoa = diemHoa;
		this.setTongDiem(diemToan + diemLi + diemHoa);
		this.setKhoi("A");
	}

	@Override
	public String toString() {
		return super.toString() + "_" + diemToan + "_" + diemLi + "_" + diemHoa;
	}
}
