/**
 * @Project_Name Ex4 - Triangle
 * @author Hoang Anh
 * @date 17 thg 11, 2020
 * @version 1.0
 */
package com.luvina.triangle.triangle;

public class Triangle {
	private double a;	// Độ dài cạnh 1 của tam giác
	private double b;	// Độ dài cạnh 2 của tam giác
	private double c;	// Độ dài cạnh 3 của tam giác
	
	private double chuVi	;
	private double dienTich ;
	
	// Constructor không tham số
	public Triangle() {
		a = 3;
		b = 4;
		c = 5;
	}
	
	// Constructor có tham số
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	 * Phương thức hiển thị kết quả tính toán ra Console Log
	 */
	public void displayResult() {
		if(isValueOK()) {
			caculate();
			System.out.printf("* Chu vi của tam giác	: %.3f" , this.chuVi);
			System.out.printf("\n* Diện tích của tam giác: %.3f", this.dienTich);
		}
		else {
			System.out.println("Đây không phải là độ dài 3 cạnh của 1 tam giác -_-");
		}
	}
	
	/**
	 * Phương thức tính chu vi, diện tích của tam giác
	 * Giá trị sau khi tính được trả về cho this.chuVi, this.dienTich
	 */
	private void caculate() {
		this.chuVi 	  = this.a + this.b + this.c;
		double 	p 	  = (double) chuVi / 2;
		this.dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c)); 
	}
	
	/**
	 * Kiểm tra xem các giá trị nhập vào có thỏa mãn điều kiện
	 * là 3 cạnh tam giác hay không
	 * @return <li><b>true</b> - Thỏa mãn điều kiện.
	 * <li><b>false</b> - Không thỏa mãn điều kiện
	 */
	private boolean isValueOK() {
		if((a > 0) && (b > 0) && (c > 0)) {
			boolean condition1 = (a + b) >= c;
			boolean condition2 = (b + c) >= a;
			boolean condition3 = (c + a) >= b;
			
			if(condition1 && condition2 && condition3)
				return true;
			else 
				return false;
		}
		else 
			return false;
	}
}
