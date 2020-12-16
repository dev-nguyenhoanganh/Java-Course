/**
 * @Project_Name 32_Ex2_Quan Ly Doan Vien
 */
package com.luvina.doanvien.quanly;

import java.util.ArrayList;

import com.luvina.doanvien.doanvien.DoanVien;

/**
 * @author Hoang Anh
 * @since 16 thg 12, 2020
 * @version 1.0
 */
public class QuanLy {
	ArrayList<DoanVien> list;

	/**
	 * Phương thức khởi tạo cho đối tượng
	 */
	public QuanLy() {
		list = new ArrayList<DoanVien>();
	}

	/**
	 * Phương thức hiển thị danh sách ra console
	 */
	public void display() {
		for (DoanVien doanVien : list) {
			doanVien.setIndex(list.indexOf(doanVien));
			System.out.println(doanVien.toString());
		}
	}

	/**
	 * Hiển thị danh sách ra console
	 * @param list - danh sách cần hiển thị
	 */
	public void display(ArrayList<DoanVien> list) {
		for (DoanVien doanVien : list) {
			doanVien.setIndex(list.indexOf(doanVien));
			System.out.println(doanVien.toString());
		}
	}

	/**
	 * Thêm mới một đoàn viên vào danh sách
	 * @param newDV - đoàn viên mới
	 * @return chuỗi trả về kết quả, thêm thành công hoặc không thành công
	 */
	public String addDoanVien(DoanVien newDV) {
		if (list == null) {
			this.list.add(newDV);
			return "\nThêm thành công";
		} else if (list.contains(newDV)) {
			return "\nĐã tồn tại đoàn viên này";
		} else {
			this.list.add(newDV);
			return "\nThêm thành công";
		}
	}

	/**
	 * Sửa đoàn viên trong danh sách
	 * @param newDV - Đoàn viên mới
	 * @return Sửa thành công hoặc không thành công
	 */
	public String modifyDoanVien(DoanVien newDV) {
		int index = list.indexOf(newDV);
		if (index == -1) {
			return "\nKhông tồn tại đoàn viên cần sửa";
		} else {
			this.list.set(index, newDV);
			return "\nSửa thành công";
		}
	}

	/**
	 * Xóa một đoàn viên khỏi danh sách
	 * @param newDV - đoàn viên cần xóa
	 * @return Kết quả xóa thành công hoặc không thành công
	 */
	public String removeDoanVien(DoanVien newDV) {
		int idx = list.indexOf(newDV);
		if (idx == -1) {
			return "\nKhông tồn tại đoàn viên cần xóa";
		} else {
			list.remove(idx);
			return "\nXóa thành công";
		}
	}

	/**
	 * Tìm kiếm đoàn viên trong danh sách
	 * @param score - Điểm rèn luyện của đoàn viên
	 * @return danh sách trả về là các đoàn viên cần tìm
	 */
	public ArrayList<DoanVien> findStudent(int score) {
		ArrayList<DoanVien> result = new ArrayList<DoanVien>();
		for (DoanVien doanVien : list) {
			if (doanVien.getScore() >= score) {
				result.add(doanVien);
			}
		}
		return result;
	}
}
