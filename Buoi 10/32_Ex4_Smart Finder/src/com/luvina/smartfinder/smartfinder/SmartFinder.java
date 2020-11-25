/**
 * @Project_Name 32_Ex4_Smart Finder
 * @author Hoang Anh
 * @date 25 thg 11, 2020
 * @version 1.0
 */
package com.luvina.smartfinder.smartfinder;

public class SmartFinder {
	private long number;
	
	public SmartFinder() {
		this.number = 0;
	}
	
	public SmartFinder(long number) {
		this.number = number;
	}
	
	// TODO Kiểm tra lại hàm tính đối xứng
	public boolean checkSymmetry() {
		if(number < 10) return false;
		int length = lengthOfNumber(number);
		int first, last;
		
		for(int i = length; i > length / 2; i -= 2) {
			first =  (int)(number / Math.pow(10, i));
			last  =  (int)(number % 10);
			if( first != last) {
				return false;
			} else {
				number /= 10;
				
			}
		}
		if(number < 10) return true;
		else return false;
	}
	
	public void result() {
		System.out.println(checkSymmetry());
	}
	
	private int lengthOfNumber(long number) {
		int length = 0;
		while (number >= 10) {
			number /= 10;
			length++;
		}
		return length;
	}
	
	
}
