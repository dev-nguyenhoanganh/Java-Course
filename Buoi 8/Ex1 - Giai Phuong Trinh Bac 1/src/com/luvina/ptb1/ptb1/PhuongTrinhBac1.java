/**
 * @Project_Name Ex1 - Giai Phuong Trinh Bac 1
 * @author Hoang Anh
 * @date 16 thg 11, 2020
 * @version 1.0
 */
package com.luvina.ptb1.ptb1;

public class PhuongTrinhBac1 {
	private double a;
	private double b;
	
	// Constructor không tham số
	public PhuongTrinhBac1() {
		a = 0;
		b = 0;
	}
	
	// Constructor có tham số
	public PhuongTrinhBac1(double a, double b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * Phương thức giải phương trình ax + b = 0
	 */
	public void giaiPT() {
		if(this.a == 0) {
			if(this.b == 0) {
				System.out.println("Phương trình có vô số nghiệm");
			}
			else {
				System.out.println("Phương trình vô nghiệm");
			}
		}
		else {
			System.out.println("Phương trình có 1 nghiệm x: " + (double)(-b / a));
		}
	}
	
//	/**
//	 * @return the a
//	 */
//	public double getA() {
//		return a;
//	}
//
//	/**
//	 * @return the b
//	 */
//	public double getB() {
//		return b;
//	}
//
//	/**
//	 * @return the x
//	 */
//	public double getX() {
//		return x;
//	}
//
//	/**
//	 * @return the correct
//	 */
//	public boolean isCorrect() {
//		return correct;
//	}
}
