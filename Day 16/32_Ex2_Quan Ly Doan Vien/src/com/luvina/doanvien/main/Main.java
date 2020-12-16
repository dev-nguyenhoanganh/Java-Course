/**
 * @Project_Name 32_Ex2_Quan Ly Doan Vien
 */
package com.luvina.doanvien.main;

import com.luvina.doanvien.doanvien.DoanVien;
import com.luvina.doanvien.quanly.QuanLy;

/**
 * @author Hoang Anh
 * @since 16 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QuanLy manager = new QuanLy();

		manager.addDoanVien(new DoanVien("Nguyen Van Chung", "Ha Noi", 10));
		manager.addDoanVien(new DoanVien("Le Van Tam", "Hue", 8));
		manager.addDoanVien(new DoanVien("Trinh Thang Binh", "HCM", 7));
		manager.addDoanVien(new DoanVien("Nguyen Thi Huong", "Ha Giang", 8));
		manager.addDoanVien(new DoanVien("Do Thi Ngoc", "Ha Noi", 9));

		System.out.println("Danh sách đoàn viên: ");
		manager.display();
		System.out.println();

		System.out.println("Danh sách đoàn viên điểm xếp loại lớn hơn hoặc bằng 8:");
		manager.display(manager.findStudent(8));

	}

}
