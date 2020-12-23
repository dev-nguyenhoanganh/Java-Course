/**
 * @Project_Name 32_AnhNH_Tuyen Sinh
 */
package com.luvina.tuyensinh.main;

import com.luvina.tuyensinh.quanly.QuanHocSinh;
import com.luvina.tuyensinh.thisinh.ThiSinh;
import com.luvina.tuyensinh.thisinh.ThiSinhKhoiA;
import com.luvina.tuyensinh.thisinh.ThiSinhKhoiB;
import com.luvina.tuyensinh.thisinh.ThiSinhKhoiC;

/**
 * @author Hoang Anh
 * @since 21 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QuanHocSinh manager = new QuanHocSinh();

		ThiSinh tS1 = new ThiSinhKhoiA("01", "Nguyen Hoang An", "Cau giay, Ha Noi", "01", 8, 8, 8);
		ThiSinh tS2 = new ThiSinhKhoiA("02", "Dang Thuy Hong", "Nam Tu Liem, Ha Noi", "01", 8, 8, 8);
		ThiSinh tS3 = new ThiSinhKhoiB("03", "Doan Hung Quan", "Quan Gia Lam, Ha Noi", "01", 8, 8, 8);
		ThiSinh tS4 = new ThiSinhKhoiC("04", "Duong Khac Chi", "Thanh Tri, Ha Noi", "01", 8, 8, 8);

		manager.themThiSinh(tS1);
		manager.themThiSinh(tS2);
		manager.themThiSinh(tS3);
		manager.themThiSinh(tS4);

		manager.hienThi();
		System.out.println("\nTìm Kiếm: ");
		manager.hienThi(manager.timKiem("01"));

		System.out.println("Kiểm tra thí sinh đỗ: ");
		manager.hienThi(manager.timKiem("C", 20));

	}

}
