/**
 * @author Hoang Anh
 * @version 1.0
 * @since 1 - 11 -2020
 */
public class HinhVuong extends TuGiac {
	double doDaiCanh;
	
	@Override
	double tinhChuVi() {
		return doDaiCanh * 4;
	}
	
	@Override
	double tinhDienTich() {
		return doDaiCanh * doDaiCanh;
	}
	
	@Override
	void inThongTin() {
		super.inThongTin();
		// Noi dung phuong thuc inThongTin() cua lop HinhVuong;
		// In thong tin "doDaiCanh", "Tu giac la hinh vuong"
	}
	
	@Override
	void nhapToaDoDinh() {
		super.nhapToaDoDinh(danhSachDinh);
	}
}
