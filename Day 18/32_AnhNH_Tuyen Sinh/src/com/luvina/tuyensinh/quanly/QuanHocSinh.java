/**
 * @Project_Name 32_AnhNH_Tuyen Sinh
 */
package com.luvina.tuyensinh.quanly;

import java.util.ArrayList;

import com.luvina.tuyensinh.thisinh.ThiSinh;

/**
 * @author Hoang Anh
 * @since 21 thg 12, 2020
 * @version 1.0
 */
public class QuanHocSinh {
	private ArrayList<ThiSinh> dsThiSinh;

	/**
	 * 
	 */
	public QuanHocSinh() {
		this.dsThiSinh = new ArrayList<ThiSinh>();
	}

	public void themThiSinh(ThiSinh thiSinh) {
		if (dsThiSinh.contains(thiSinh)) {
			System.out.println("Đã tồn tại thí sinh này");
			return;
		}
		dsThiSinh.add(thiSinh);
		System.out.println("Thêm thành công");
	}

	public void hienThi() {
		System.out.println("\nDanh sách gồm các thí sinh sau:");
		for (ThiSinh thiSinh : dsThiSinh) {
			System.out.println(thiSinh.toString());
		}
	}

	public void hienThi(ArrayList<ThiSinh> dsThiSinh) {
		for (ThiSinh thiSinh : dsThiSinh) {
			System.out.println(thiSinh.toString());
		}
	}

	public ArrayList<ThiSinh> timKiem(String sBD) {
		sBD = sBD.trim();
		if (sBD.isEmpty()) {
			System.out.println("Không tồn tại thí sinh nào");
			return null;
		}
		ArrayList<ThiSinh> result = new ArrayList<ThiSinh>();

		for (ThiSinh thiSinh : dsThiSinh) {
			if (thiSinh.getsBD().contains(sBD)) {
				result.add(thiSinh);
			}
		}
		if (result.isEmpty()) {
			System.out.println("Không tồn tại thí sinh nào");
		}
		return result;
	}

	public ArrayList<ThiSinh> timKiem(String khoi, double diemChuan) {
		ArrayList<ThiSinh> result = new ArrayList<ThiSinh>();
		if (khoi.isEmpty()) {
			System.out.println("Dữ liệu nhập vào chưa đầy đủ");
			return null;
		}
		
		String condition = "";

		if (khoi.contains("C") || khoi.contains("c")) {
			condition = "C";
		} else if (khoi.contains("B") || khoi.contains("b")) {
			condition = "B";
		} else if (khoi.contains("A") || khoi.contains("a")) {
			condition = "A";
		}

		for (ThiSinh thiSinh : dsThiSinh) {
			if (thiSinh.getKhoi().equals(condition)) {
				if (thiSinh.getTongDiem() >= diemChuan) {
					result.add(thiSinh);
				}
			}
		}
		if (result.isEmpty()) {
			System.out.println("Không có thí sinh nào đỗ");
		}
		return result;
	}

}
