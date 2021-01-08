/**
 * @Project_Name 32_Ex2_FileManager
 */
package com.luvina.file.manager;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Hoang Anh
 * @since 5 thg 1, 2021
 * @version 1.0
 */
public class FileManager {
	private File fileSrc;
	private boolean validate;

	/**
	 * 
	 */
	public FileManager(String pathSrc) {
		fileSrc = new File(pathSrc);
		if (fileSrc.isDirectory()) {
			validate = true;
		} else {
			validate = false;
		}
	}

	Comparator<File> sortByName = new Comparator<File>() {

		@Override
		public int compare(File o1, File o2) {
			int resultName = o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
			if (resultName == 0) {
				long resultSize = o1.length() - o2.length();
				if (resultSize > 0) {
					return 1;
				} else if (resultSize < 0) {
					return -1;
				} else {
					return 0;
				}
			}
			return resultName;
		}
	};

	Comparator<File> sortBySize = new Comparator<File>() {

		@Override
		public int compare(File o1, File o2) {
			long result = o1.length() - o2.length();
			if (result > 0) {
				return 1;
			} else if (result < 0) {
				return -1;
			} else {
				return 0;
			}
		}
	};

	public void display() {
		if (validate) {
			System.out.println(fileSrc.toString());
		} else {
			System.out.println("Thư mục không tồn tại");
		}
	}

	public void display(ArrayList<File> list) {
		System.out.println("\nfindByExtension():");
		if (list.isEmpty()) {
			System.out.println("Không tìm thấy file");
		} else {
			for (File file : list) {
				System.out.println(file.toString());
			}
		}
	}

	public void display(File[] list) {
		System.out.println("\nsortByNameSize():");
		if (list == null) {
			System.out.println("Không tìm thấy file");
		} else {
			for (File file : list) {
				System.out.println(file.toString());
			}
		}
	}

	public ArrayList<File> findByExtension(String extension) {
		validate = validateExtension(extension);
		
		if(!validate) {
			return null;
		} else {
			ArrayList<File> list = new ArrayList<File>();
			findAllFiles(fileSrc, list);
			return matchExtension(extension, list);
		}
	}

	public File[] sortByNameSize() {
		if (!validate) {
			return null;
		} else {
			ArrayList<File> list = new ArrayList<File>();
			findAllFiles(fileSrc, list);
			list.sort(sortByName);

			File[] result = new File[list.size()];
			result = (File[]) list.toArray(result);
			return result;
		}
	}

	// ---------------- Private Layer ----------------
	private boolean validateExtension(String extension) {
		if(extension.isEmpty()) {
			return false;
		}

		// Regex 1 : Kiểm tra xem chuỗi không được phép có dấu khoảng trắng
		if (extension.matches("\\.\\S+")) {
			if (extension.contains("..") || extension.endsWith(".")) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

	private void findAllFiles(File directory, ArrayList<File> list) {
		if(directory.isDirectory()) {
			File[] children = directory.listFiles();
			for (File child : children) {
				this.findAllFiles(child, list);
			}
		} else if (directory.isFile()) {
			list.add(directory);
		}
	}

	private ArrayList<File> matchExtension(String extension, ArrayList<File> list) {
		ArrayList<File> result = new ArrayList<File>();
		if (".*".equals(extension)) {
			return list;
		} else {
			for (File file : list) {
				if (file.toString().endsWith(extension)) {
					result.add(file);
				}
			}
			return result;
		}
	}
}
