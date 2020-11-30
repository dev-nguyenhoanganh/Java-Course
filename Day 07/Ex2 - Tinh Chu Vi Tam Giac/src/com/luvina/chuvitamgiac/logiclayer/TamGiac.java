/**
 * @Project Ex2 - Tinh Chu Vi Tam Giac
 * @author Hoang Anh
 * @version 1.0
 * @since 12 thg 11, 2020
 */
package com.luvina.chuvitamgiac.logiclayer;

public class TamGiac extends Dinh {
	private Dinh 		dinh1	;
	private Dinh 		dinh2	;
	private Dinh 		dinh3	;
	private double[] 	dSDoDai	;
	private double 		chuVi	;
	
	// Constructor
	public TamGiac() {
		dinh1 	= new Dinh()	;
		dinh2 	= new Dinh()	;
		dinh3 	= new Dinh()	;
		dSDoDai = new double[3]	;
		chuVi 	= 		0		;
	}
	
	/**
	 * <p> Hiển thị tên chương trình
	 */
	public void programTitle() {
		System.out.println("-------- Chương trình tính chu vi tam giác --------");
	}
	
	/**
	 * <p> Phương thức nhập giá trị cho các đỉnh của tam giác
	 */
	@Override
	public void nhapGiaTriDinh() {
		System.out.println("* Nhập giá trị cho đỉnh A");
		dinh1.nhapGiaTriDinh();
		System.out.println("* Nhập giá trị cho đỉnh B");
		dinh2.nhapGiaTriDinh();
		System.out.println("* Nhập giá trị cho đỉnh C");
		dinh3.closeInputStream();
		dinh3.nhapGiaTriDinh();
	}
	
	/**
	 * <p> Phương thức tính chu vi của tam giác
	 */
	public void tinhChuVi() {
		dSDoDai[0] = (double) Math.round(tinhKhoangCach(dinh1, dinh2) * 100) / 100;
		dSDoDai[1] = (double) Math.round(tinhKhoangCach(dinh2, dinh3) * 100) / 100;
		dSDoDai[2] = (double) Math.round(tinhKhoangCach(dinh3, dinh1) * 100) / 100;
		
		this.chuVi = dSDoDai[0] + dSDoDai[1] + dSDoDai[2];
	}
	
	/**
	 * <p> Phương thức hiển thị kết quả ra màn hình Console Log
	 */
	public void display() {
		System.out.println("*\n-------- Các thông số sau khi tính của tam giác --------");
		hienThiDinh();
		hienThiDoDaiCanh();
		System.out.println("* Chu vi của tam giác là: " + chuVi);
		System.out.println("*\n-------- Thank you for choosing us!! --------");
	}
	
	/**
	 * <p> In thông tin của từng đỉnh ra màn hình Console log
	 */
	private void hienThiDinh() {
		System.out.println(dinh1.displayDinh(" A "));
		System.out.println(dinh2.displayDinh(" B "));
		System.out.println(dinh3.displayDinh(" C "));
	}
	
	/**
	 * <p> Hiển thị độ dài các cạnh của tam giác
	 */
	private void hienThiDoDaiCanh() {
		System.out.println("*\n* Độ dài các cạnh tương ứng: ");
		System.out.println("* AB = " + dSDoDai[0]);
		System.out.println("* BC = " + dSDoDai[1]);
		System.out.println("* CA = " + dSDoDai[2]);
	}
}
