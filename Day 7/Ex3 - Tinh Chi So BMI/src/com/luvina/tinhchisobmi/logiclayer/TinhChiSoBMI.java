/**
 * @Project Ex3 - Tính Chỉ Số BMI
 * @author Hoang Anh
 * @version 1.0
 * @since 13 thg 11, 2020
 */
package com.luvina.tinhchisobmi.logiclayer;

import java.util.Scanner;

public class TinhChiSoBMI {
	private double height; // Đơn vị mét
	private double weight; // Đơn vị kg
	private double BMI;
	
	/**
	 * <p> Constructor
	 */
	public TinhChiSoBMI() {
		this.BMI 	= 0;
		this.height = 0;
		this.weight = 0;
	}
	
	/**
	 * <p> In ra tiêu đề của chương trình
	 */
	public void programTitle() {
		System.out.println("-------- Chương trình tính chỉ số BMI --------");
		System.out.println("*\n* GUIDE:");
		System.out.println("* Chiều cao nhập vào phải nằm trong dải từ 0 ~ 2,5 (m)");
		System.out.println("* Cân nặng nhập vào phải nằm trong dải từ 0 ~ 500 (kg)\n*");
	} 
	
	/**
	 * <p> Lấy giá trị chiều cao, cân nặng từ bàn phím
	 */
	public void getInputValue() {
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("* Chiều cao của bạn là: ");
			this.height = input.nextDouble();
			input.nextLine();
			System.out.print("* Cân nặng của bạn là: ");
			this.weight = input.nextDouble();
			input.nextLine();
		} while (!isValidNumber());
		input.close();
	}
	
	/**
	 * <p> Phương thức tính chỉ số BMI
	 */
	public void caculateBMI() {
		this.BMI = (double) Math.round(this.weight / (this.height * this.height) * 100) / 100;
	}
	/**
	 * <p> Phương thức hiển thị kết quả ra màn hình
	 */
	public void display() {
		System.out.println("* Chỉ số BMI hiện tại của bạn là: " + this.BMI);
		System.out.println(textResult());
		System.out.println("*\n-------- Thank you for choosing us!! --------");
	}
	
	/**
	 * <p> Phương thức kiểm tra tính hợp lệ của dữ liệu đầu vào
	 * @return 
	 * true  - Nếu giá trị nhập vào hợp lệ
	 * flase - Nếu giá trị nhập vào không hợp lệ
	 */
	private boolean isValidNumber() {
		if ((this.height > 0) && (this.height < 2.5)) {
			if((this.weight > 0) && (this.weight < 500)) {
				return true;
			}		
		}
		System.out.println("*\n* Số bạn nhập vào không đúng, mời nhập lại!!");
		return false;
	}
	
	/**
	 * <p> Phương thức trả về kết quả dưới dạng Text cho người dùng
	 * @return Đánh giá về thể trạng của người dùng thông qua chỉ số BMI
	 */
	private String textResult() {
		if (this.BMI > 0) {
			if (BMI < 18.5) {
				return "*\n* Theo tiêu chuẩn của tổ chức WHO thì bạn hơi gầy rồi.";
			}
			else {
				if (BMI < 24.9) {
					return "*\n* Theo tiêu chuẩn của tổ chức WHO thì bạn là\n* người có thể trạng bình thường đấy.";
				}
				else {
					return "*\n* Bạn bị thừa cân không nhẹ đâu :v";
				}
			}
		}
		else return null;
	}
}
