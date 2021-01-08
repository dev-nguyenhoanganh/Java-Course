package com.lu.sao098thang.main;

import java.util.Scanner;

public class Main {
	private static Scanner keyboard;
	private static final String MAIN_MENU 		= "0";
	private static final String MENU_GOI_HOT 	= "1";
	private static final String MENU_ST5K 		= "2";
	private static final String MENU_ST15K 		= "3";

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		mainMenu();

		keyboard.close();

	}

	private static void mainMenu() {
		System.out.println("Menu *098#\r\n" 
						+  "1. Gói Hot.\r\n" 
						+  "2. Siêu ưu đãi data.\r\n" 
						+  "3. Miễn phí thoại.\r\n"
						+  "0. Thoát");

		String choose = getInput("[0-3]", MAIN_MENU);
		switch (choose) {
		case "0":
			return;
		case "1":
			goiHot(MAIN_MENU);
			break;
		case "2":
			break;
		case "3":
			break;

		default:
			break;
		}
	}

	private static void goiHot(String mainMenu) {
		System.out.println("Menu Gói Hot\r\n" 
						+  "1. ST5K.\r\n" 
						+  "2. ST15K.\r\n" 
						+  "0. Thoát");
		
		String choose = getInput("[0-2]", mainMenu);
		switch (choose) {
		case "0":
			back(MAIN_MENU, false);
			break;
		case "1":
			menuST5K_ST15K(MENU_GOI_HOT, "ST5K");
			break;
		case "2":
			menuST5K_ST15K(MENU_GOI_HOT, "ST15K");
			break;
		default:
			break;
		}
	}

	private static void menuST5K_ST15K(String menuGoiHot, String noiDung) {
		System.out.println("Menu " + noiDung);
		System.out.println("1. Đăng kí gia hạn.\r\n" 
						+  "2. Tặng cho người thân.\r\n" 
						+  "0. Quay lại.");

		String choose = getInput("[0-2]", menuGoiHot);
		
		switch (choose) {
		case "0":
			back(MENU_GOI_HOT, false);
			break;
		case "1":
			menuDangKi(MENU_ST5K);
			break;
		case "2":
			menuDangKi(MENU_ST15K);
			break;
		default:
			break;
		}
	}

	private static void menuDangKi(String menuST5K_ST15K) {
		System.out.println("Menu Đăng kí\r\n" 
						+  "1. Đăng kí.\r\n" 
						+  "0. Quay lại.");
		
		String choose = getInput("[0-1]", menuST5K_ST15K);
		
		switch (choose) {
		case "0":
			back(menuST5K_ST15K, false);
			break;
		case "1":
			System.out.println("Đăng kí thành công");
			System.exit(0);
		default:
			break;
		}
	}

	private static String getInput(String regex, String menu) {
		String result = "";
		while (true) {
			result = keyboard.nextLine();
			if (!result.matches(regex)) {
				System.out.println("Bạn đã nhập không hợp lệ. Nhập 0 để quay lại");
				back(menu, true);
				continue;
			}
			break;
		}
		return result;
	}

	private static void back(String previousMenu, boolean keyboardStream) {
		if (keyboardStream) {
			getInput("[0]", previousMenu);
		} 
		switch (previousMenu) {
			case MAIN_MENU: 
				mainMenu();
				break;
			case MENU_GOI_HOT: 
				goiHot(previousMenu);
				break;
			case MENU_ST5K: 
				menuST5K_ST15K(previousMenu, "ST5K");
				break;
			case MENU_ST15K: 
				menuST5K_ST15K(previousMenu, "ST15K");
				break;
		}
	}
}
