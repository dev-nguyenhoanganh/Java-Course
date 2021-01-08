/**
 * @Project_Name 32_Ex2_FileManager
 */
package com.luvina.file.main;

import com.luvina.file.manager.FileManager;

/**
 * @author Hoang Anh
 * @since 5 thg 1, 2021
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String pathSrc = ".";

		FileManager manager = new FileManager(pathSrc);
		manager.display();

		// All file
		manager.display(manager.findByExtension(".*"));

		// .java
		manager.display(manager.findByExtension(".java"));

		// Sort
		manager.display(manager.sortByNameSize());

	}
}
