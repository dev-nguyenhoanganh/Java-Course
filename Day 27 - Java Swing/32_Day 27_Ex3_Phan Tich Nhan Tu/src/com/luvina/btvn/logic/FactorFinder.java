/**
 * @Project_Name 32_Day 27_Ex3_Phan Tich Nhan Tu
 */
package com.luvina.btvn.logic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Hoang Anh
 * @since 20 thg 1, 2021
 * @version 1.0
 */
public class FactorFinder {
	private int number;
	private String factor = "";

	public static final String PATH = ".\\data\\database.txt";

	/**
	 * 
	 */
	public FactorFinder(String number) {
		if (validateInputString(number)) {
			this.number = Integer.parseInt(number);
		} else {
			throw new NumberFormatException("Không có định dạng số nguyên");
		}
	}

	public FactorFinder() {

	}

	/**
	 * Phương thức thực hiện hành vi phân tích thuộc tính <b>number</b>
	 * thành các thừa số nguyên tố
	 */
	public String findFactor() {
		boolean isFirstNumber = true;
		int tempNumber = number;

		for (int i = 2; i <= number / 2; i++) {
			if (tempNumber % i == 0) {
				if (isFirstNumber) {
					isFirstNumber = false;
					tempNumber = tempNumber / i;
					factor += i--;
					continue;
				}
				tempNumber = tempNumber / i;
				factor += " * " + i--;
			}
		}
		if (factor == "") {
			factor = "1 * " + number;
		}

		System.out.println("factor tính - " + factor);
		return factor;
	}

	/**
	 * 
	 */
	public boolean writeToFile() {
		factor = number + " : " + factor + "\n";
		System.out.println("factor ghi file - " + factor);
		return writeToFile(factor, PATH);
	}

	public boolean writeToFile(String data) {
		return writeToFile(data, PATH);
	}

	/**
	 * @param number the number to set
	 */
	public boolean setNumber(String number) {
		if (validateInputString(number)) {
			this.number = Integer.parseInt(number);
			return true;
		}
		return false;
	}

	// ------------------------ Private layer ------------------------

	/**
	 * 
	 */
	private boolean validateInputString(String number) {
		if (number.matches("\\d+")) {
			return true;
		}
		return false;
	}


	private boolean writeToFile(String input, String path) {
		try {
			// 1 trỏ vào file
			File file = new File(path);
			// 2. Kiểm tra tồn tại
			if (!file.exists()) {
				file.getParentFile().mkdirs();
				file.createNewFile();
			}
			// 3. Mở File để ghi
			FileOutputStream fO = new FileOutputStream(file);
			byte[] byteArr = input.getBytes();
			fO.write(byteArr);
			// close
			fO.close();
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	private boolean deleteFile(String path) {
		try {
			File file = new File(path);
			return file.delete();
		} catch (Exception e) {
			return false;
		}
	}

}
