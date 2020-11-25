package com.luvina.hinhvuong.tugiac;
import com.luvina.hinhvuong.dinh.Dinh;

/**
 * @author Hoang Anh
 * @version 1.0
 * @since 1 - 11 -2020
 */
public class HinhChuNhat extends TuGiac {
	double chieuDai;
	double chieuRong;
	Dinh[] danhSachDinh;
	
	@Override
	double tinhChuVi() {
		return (chieuDai + chieuRong) * 2;
	}
	
	@Override
	double tinhDienTich() {
		return chieuDai * chieuRong;
	}
	
	@Override
	void inThongTin() {
		super.inThongTin();
		// Noi dung phuong thuc inThongTin() cua lop HinhChuNhat;
		// In thong tin "chieuDai", "chieuRong", "Tu giac la hinh chu nhat"
	}

	@Override
	public void nhapToaDoDinh() {
		// TODO Auto-generated method stub

	}

}
