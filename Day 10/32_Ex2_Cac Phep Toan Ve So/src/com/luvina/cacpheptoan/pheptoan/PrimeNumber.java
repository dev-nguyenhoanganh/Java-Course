/**
 * @Project_Name 32_Ex2_Cac Phep Toan Ve So
 * @author Hoang Anh
 * @date 24 thg 11, 2020
 * @version 1.0
 */
package com.luvina.cacpheptoan.pheptoan;

public class PrimeNumber {
	private int number;
	
	/**
	 * Phương thức khởi tạo không tham số
	 */
	public PrimeNumber() {
		number = 0;
	}
	
	/**
	 * Phương thức khởi tạo có tham số
	 * @param number - Giá trị khởi tạo cho thuộc tính của đối tượng
	 */
	public PrimeNumber(int number) {
		this.number = number;
	}
	
	/**
	 * Phương thức thực hiện hành vi phân tích thuộc tính <b>number</b>
	 * thành các thừa số nguyên tố
	 */
	public void phanTichThuaSo() {
		String 	factor  	  = "";
		boolean isFirstNumber = true;
		int 	tempNumber    = number;
		
		for (int i = 2; i <= number/2; i++) 
		{
			if(tempNumber % i == 0) {
				if(isFirstNumber) {
					isFirstNumber = false;
					tempNumber 	  = tempNumber / i;
					factor 		 += i--;
					continue;
				}
				tempNumber = tempNumber / i;
				factor 	  += " * "  + i--; 
			}
		}
		if(factor == "") factor = "1 * " + number;

		System.out.print("Thừa số nguyên tố của " + number + " là: ");
		System.out.println(factor);
	}
	
	/**
	 * Phương thức in ra console kết quả xem thuộc tính <b>number</b>
	 * có phải số nguyên tố hay không
	 */
	public void display() {
		if(kiemTraSNT(number)) {
			System.out.println(this.number + " là số nguyên tố.");
		}
		else
			System.out.println(this.number + " không phải số nguyên tố.");
	}
	
	/**
	 * Phương thức kiểm tra xem số nguyên nhập vào có phải là
	 * số nguyên tố hay không 
	 * @param number - Giá trị số nguyên cần kiểm tra
	 * @return <ul><li>true - Là số nguyên tố</li>
	 * <li>false - Không phải số nguyên tố</li></ul>
	 */
	private boolean kiemTraSNT(int number) {
		if(number < 2) return false;
		for(int i = 2; i < number; i++) {
			if(number % i == 0) return false;
		}
		return true;
	}
	
	
}
