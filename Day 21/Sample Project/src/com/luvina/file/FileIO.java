/**
 * @Project_Name Sample Project
 */
package com.luvina.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Hoang Anh
 * @since 4 thg 1, 2021
 * @version 1.0
 */
public class FileIO {

	/**
	 * 
	 */
	public FileIO() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		File file = new File("D:\\Java Programing Language\\BTVN Project\\Day 21\\README.md");
//		File file = new File(".\\src\\com\\luvina\\file\\data\\sample.txt");
		File file = new File("..\\README.md");
		System.out.println("File tồn tại: " + file.exists());
		System.out.println("Tên File: " + file.getName());
		
		System.out.println(file.toString());

		File createFile = new File(".\\File\\cap2\\cap3\\create.txt");

		try {
			createFile.getParentFile().mkdirs();
			if (!createFile.exists()) {
				createFile.createNewFile();
			} else {
				createFile.delete();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		File fileSrc = new File("src\\com\\luvina\\file");

		System.out.println(fileSrc.exists());
		System.out.println(Arrays.toString(fileSrc.listFiles()));

		System.out.println(fileSrc.length());
	}

}
