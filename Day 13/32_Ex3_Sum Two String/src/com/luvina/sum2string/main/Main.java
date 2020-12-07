/**
 * @Project_Name 32_Ex3_Sum Two String
 */
package com.luvina.sum2string.main;

/**
 * @author Hoang Anh
 * @since 4 thg 12, 2020
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String numA = "0129";
		String numB = "1235";
		System.out.println("NumA: " + numA);
		System.out.println("NumB: " + numB);

		System.out.println("Sum of them: " + sum2String(numA, numB));
	}

	public static int sum2String(String numA, String numB) {
		int result = 0;
		int maxLength = numB.length();
		int check = numA.length() - maxLength;

		// Nếu Num A > Num B thì đổi giá trị 2 số cho nhau
		if (check > 0) {
			String temp = numA;
			numA = numB;
			numB = temp;
		} else if (check != 0) {
			
			// Chèn thêm giá các số 0 đằng trước số bé hơn
			maxLength = numB.length();
			StringBuilder newNumA = new StringBuilder(numA);
			newNumA.insert(0, newString(check));
			numA = newNumA.toString();
		}
		
		// Cộng 2 xâu
		for (int i = maxLength - 1; i >= 0; i--) {
			int digitA = Integer.parseInt("" + numA.charAt(i));
			int digitB = Integer.parseInt("" + numB.charAt(i));

			result += (int) ((digitA + digitB) * Math.pow(10, maxLength - i - 1));
		}

		return result;
	}
	
	// Phương thức tạo mới một xâu chứa các số "00..0" 
	public static String newString(int number) {
		String result = "";
		number = (int) Math.abs(number);
		for (int i = 0; i < number; i++) {
			result += "0";
		}
		return result;
	}
}
