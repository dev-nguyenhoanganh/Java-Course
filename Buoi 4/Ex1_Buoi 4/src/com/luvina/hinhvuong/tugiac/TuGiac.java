/**
 * @author Hoang Anh
 * @version 1.0
 * @since 1 - 11 -2020
 */

package com.luvina.hinhvuong.tugiac;
import com.luvina.hinhvuong.dinh.Dinh;

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

	public Dinh[] getDanhSachDinh() {
		return danhSachDinh;
	}

	public void setDanhSachDinh(Dinh[] danhSachDinh) {
		this.danhSachDinh = danhSachDinh;
	}

	public double getChuVi() {
		return chuVi;
	}

	public void setChuVi(double chuVi) {
		this.chuVi = chuVi;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public double[] getDoDaiCanh() {
		return doDaiCanh;
	}

	public void setDoDaiCanh(double[] doDaiCanh) {
		this.doDaiCanh = doDaiCanh;
	}
	
	
}
