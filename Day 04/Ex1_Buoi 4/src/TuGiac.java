/**
 * @author Hoang Anh
 * @version 1.0
 * @since 1 - 11 -2020
 */
public abstract class TuGiac extends Dinh {
	// Khai báo các thuộc tính
	Dinh[] danhSachDinh;
	double chuVi;
	double dienTich;
	double[] doDaiCanh;
	
	// Khai báo các phương thức
	void nhapToaDoDinh(Dinh[] danhSachDinh) {
		// Nhap toa do cho 4 dinh
	}
	
	abstract double tinhChuVi();
	abstract double tinhDienTich();	
	
	void inThongTin() {
		// Hien thi ra man hinh
	}
}
