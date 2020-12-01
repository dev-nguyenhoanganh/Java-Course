/**
 * @Project_Name 32_Ex2_ReverseInt Program
 * @author Hoang Anh
 * @date 1 thg 12, 2020
 * @version 1.0
 */
package com.luvina.reverseint.reverseint;

public class ReverseInt {
	private int number;
	
	/**
	 * Phương thức khởi tạo của đối tượng 
	 */
	public ReverseInt(int number) {
		this.number = number;
	}
	
	/**
	 * Phương thức tìm số nguyên nghịch đảo của đối tượng
	 * @return trả về số nguyên nghịch đảo - kiểu dữ liệu <b>int</b>
	 */
	public int reverseInt() {
		int result  = 0;
		String temp = toReverseBinary();
			   temp = reverseString(temp);
		for(int i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) == '1') {
				result += Math.pow(2, i);
			}
		}
		return result;
	}
	
	/**
	 * Phương thức tìm kiếm chuỗi nhị phân nghịch đảo của giá trị số nguyên
	 * bên trong đối tượng
	 * @return một chuỗi chứa giá trị các bit nhị phân được nghịch đảo vị trí
	 */
	private String toReverseBinary() {
		String result = "";
		int temp = this.number;
		
		while(temp > 0) {
			result += (temp % 2);
			temp /= 2;
		}
		
		return result;
	}
	
	/**
	 * Phương thức nghịch đảo một chuỗi ký tự truyền vào
	 * @param txt - chuỗi truyền vào
	 * @return một chuỗi đã nghịch đảo vị trí của từng phần tử với nhau
	 */
	private String reverseString(String txt) {
		String result = "";
		for(int i = txt.length() - 1; i >= 0; i--) {
			result += txt.charAt(i);
		}
		return result;
	}
	
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
}
