/**
 * @Project_Name 32_Day 23_Ex1_Student Manager
 */
package com.luvina.btvn.console;

import java.util.Scanner;

import com.luvina.btvn.manager.Manager;
import com.luvina.btvn.student.User;

/**
 * @author Hoang Anh
 * @since 8 thg 1, 2021
 * @version 1.0
 */
public class Console {
	private static Scanner input;
	private static Manager manager;
	private static User student;

//	private static final String NAMING_SIGN_UP_PAGE = "---------------- Đăng ký ------------------";
//	private static final String NAMING_SIGN_IN_PAGE = "--------------- Đăng nhập -----------------";
//	private static final String NAMING_MANAGER_PAGE = "----------- Xin chào quản lý --------------";
//	private static final String NAMING_MANAGER_PAGE = "----------- Xin chào quản lý --------------";
//	private static final String NAMING_MANAGER_PAGE = "----------- Xin chào quản lý --------------";

	private static final String REGEX_ALL_CHAR = "";
	private static final String REGEX_NAME     = "[\\D|\\W]+";
	private static final String REGEX_ID   	   = "[\\S]{5,}";
	private static final String REGEX_SCORE    = "(\\d+(\\.\\d+)?)|(\s)";
	private static final String REGEX_DATE 	   = "\\d{1,2}\\/\\d{1,2}\\/\\d{4}";
//	private static final String REGEX_PRIORITY = "[0-1]";

//	// Chữ thường + chữ hoa + số + ký tự đặc biệt + 8 ký tự trở lên
//	private static final String REGEX_PASS = 
//	"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}";

//	// Chữ thường + chữ hoa + số + 8 ký tự trở lên
//	private static final String REGEX_PASS = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";

	// Lớn hơn 8 ký tự
	private static final String REGEX_PASS = ".{8,}";

	private final static String MANAGER = "0";
	private final static String STUDENT = "1";	

	/**
	 * 
	 */
	public Console() {
		input = new Scanner(System.in);
		manager = new Manager();
		student = new User();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Console main = new Console();
		main.wellcomePage();
		main.close();
	}

	public void wellcomePage() {
		System.out.println("---------- Ứng dụng quản lý sinh viên ----------");
		System.out.println("Vui lòng chọn:\n"
						+  "[1] Đăng nhập\n"
						+  "[2] Đăng ký\n"
						+  "[0] Thoát chương trình"
		);

		String choose = getInput("[0-2]", "[0-2]");
		switch (choose) {
		case "1":
			signInPage();
			break;
		case "2":
			signUpPage();
			break;
		case "0":
			return;
		}
	}

	public void signUpPage() {
		System.out.println("\n--------------- Tạo tài khoản ----------------");
		String studentName;
		String studentID;
		String dateOfBirth;
		String pass;

		System.out.print("Nhập tên của bạn: ");
		studentName = getInput(REGEX_NAME, "họ và tên");

		System.out.print("Nhập ngày/tháng/năm sinh của bạn: ");
		dateOfBirth = getInput(REGEX_DATE, "ngày/tháng/năm");

		System.out.print("Nhập tên tài khoản: ");
		studentID = getInput(REGEX_ID, "tên tài khoản");

		System.out.print("Nhập mật khẩu : ");
		pass = getInput(REGEX_PASS, "mật khẩu");

		System.out.println(manager.addStudent(new User(studentName, studentID, dateOfBirth, "", pass, STUDENT)));
//		student.signUp(studentName, studentID, dateOfBirth, "", pass, STUDENT);
		signInPage();
	}

	public void signInPage() {
		System.out.println("------------------ Đăng nhập -------------------");
		System.out.print("Tài khoản: ");
		String account = getInput(REGEX_ALL_CHAR, "tài khoản");

		System.out.print("Mật khẩu: ");
		String pass = getInput(REGEX_ALL_CHAR, "mật khẩu");

		String priority = manager.signIn(account, pass);

		if (MANAGER.equals(priority)) {
			managerPage(account);
		} else if (STUDENT.equals(priority)) {
			studentPage(account);
		} else {
			System.err.println("Tài khoản hoặc mật khẩu nhập vào không đúng");
			pressToContinue();
			wellcomePage();
		}
	}

	public void studentPage(String account) {
		System.out.println("------------------------------------------------");
		String name = manager.findStudentByAccount(account).getStudentName();
		System.out.println("Xin chào " + name);
		System.out.println("Mời chọn: ");
		System.out.println(
			   "[1] Tìm kiếm học sinh\r\n" 
			+  "[2] Sắp xếp danh sách học sinh theo điểm giảm dần\r\n"
			+  "[3] Hiển thị thông tin\r\n"
			+  "[0] Đăng xuất"
		);

		String choose = getInput("[0-3]", "[0-3]");
		switch (choose) {
		case "1":
			findStudent();
			pressToContinue();
			studentPage(account);
			break;
		case "2":
			arrangeStudent();
			pressToContinue();
			studentPage(account);
			break;
		case "3":
			String result = manager.findStudentByAccount(account).showData();
			System.out.println(result);
			pressToContinue();
			studentPage(account);
			break;
		case "0":
			wellcomePage(); 
			break;
		}
	}

	public void managerPage(String account) {
		System.out.println("\n------------------------------------------------");
		String name = manager.findStudentByAccount(account).getStudentName();
		System.err.println("Xin chào " + name);
		System.out.println(
			   "[1] Tìm kiếm học sinh\r\n" 
			+  "[2] Sắp xếp danh sách học sinh theo điểm giảm dần\r\n"
			+  "[3] Thêm học sinh\r\n"
			+  "[4] Xóa học sinh\r\n"
			+  "[5] Phân quyền cho một học sinh\r\n"
			+  "[6] Hiển thị danh sách học sinh\r\n"
			+  "[7] Hiển thị thông tin tài khoản\r\n"
			+  "[0] Đăng xuất"
		);

		String choose = getInput("[0-7]", "[0-7]");
		switch (choose) {
		case "1":
			findStudent();
			pressToContinue();
			managerPage(account);
			break;
		case "2":
			arrangeStudent();
			pressToContinue();
			managerPage(account);
			break;
		case "3":
			getStudentInfor();
			managerPage(account);
			break;
		case "4":
			removeStudent();
			pressToContinue();
			managerPage(account);
			break;
		case "5": 
			setPriorityLevel(account);
			pressToContinue();
			managerPage(account);
			break;
		case "6":
			manager.display();
			pressToContinue();
			managerPage(account);
			break;
		case "7":
			User stu = manager.findStudentByAccount(account);
			System.out.println(stu.showData());
			pressToContinue();
			managerPage(account);
			break;
		case "0":
			wellcomePage();
			break;
		}
	}

	/**
	 * 
	 */
	public void close() {
		System.err.println("Chương trình đã đóng");
		input.close();
	}

	// ----------------------- Private Layer -----------------------

	private static String getInput(String regex, String name) {
		String result = "";
		while (true) {
			result = input.nextLine().trim();
			if (regex.isEmpty()) {
				return result;
			}
			if (result.matches(regex)) {
				return result;
			}
			System.err.print("Bạn đã nhập sai định dạng rồi :v"
							+ "\nMời nhập lại " + name + ": ");
		}
	}

	private static void findStudent() {
		System.out.println("Vui lòng nhập tên học sinh muốn tìm: ");
		String name = getInput(REGEX_NAME, "tên");
		System.out.println("Kết quả tìm kiếm");
		manager.display(manager.findStudent(name), name);
	}

	private static void arrangeStudent() {
		System.out.println("Danh sách học sinh sau khi sắp xếp");
		manager.display(manager.sortByScore(), "");
	}

	private static void removeStudent() {
		System.out.print("Mã học sinh muốn xóa: ");
		String studentID = getInput(REGEX_ALL_CHAR, "mã học sinh");
		System.err.println(manager.removeStudent(studentID));
	}

	private static void getStudentInfor() {
		System.out.println("\n----------------- Thêm học sinh -----------------");
		String studentName;
		String studentID;
		String dateOfBirth;
		String score;
		String pass;

		System.out.print("Nhập tên học sinh: ");
		studentName = getInput(REGEX_NAME, "tên học sinh");

		System.out.print("Nhập ngày/tháng/năm sinh của học sinh: ");
		dateOfBirth = getInput(REGEX_DATE, "ngày/tháng/năm");

		System.out.print("Nhập điểm của học sinh này: ");
		score = getInput(REGEX_SCORE, "điểm");

		System.out.print("Nhập mã học sinh: ");
		studentID = getInput(REGEX_ID, "mã học sinh");

		System.out.print("Nhập mật khẩu cho học sinh mới: ");
		pass = getInput(REGEX_PASS, "mật khẩu");

		System.err.println(
			manager.addStudent(new User(studentName, 
										   studentID, 
										   dateOfBirth, 
										   score, 
										   pass, 
										   STUDENT))
		);
		System.out.print("Bạn có muốn nhập tiếp không [Y|N]? ");
		String result = getInput("[Y|N|n|y]", "câu trả lời [Y|N]");

		if ("N".equals(result) || "n".equals(result)) {
			return;
		}
		getStudentInfor();
	}

	/**
	 * @param account
	 * 
	 */
	private void setPriorityLevel(String account) {
		System.out.println("\n----------------- Phân quyền -----------------");
		System.out.println("[1] Nhập mã học sinh muốn phân quyền\n" 
						+  "[0] Trở lại"
		);
		
		String choose = getInput("[0-1]", "[0-1]");

		switch (choose) {
			case "0" : 
				managerPage(account);
				break;
			case "1" :
				setToManager();
				break;
		}
	}

	/**
	 * 
	 */
	private void setToManager() {
		System.out.print("Nhập mã học sinh: ");
		String account = getInput(REGEX_ALL_CHAR, "mã học sinh");

		User student = manager.findStudentByAccount(account);
		if (student == null) {
			System.err.println("Không tồn tại học sinh này");
			return;
		}
		student.setPriorityLevel(MANAGER);
		manager.convertListToFile();
		System.out.println("Phân quyền thành công !!!");
	}

	private void pressToContinue() {
		System.out.print("Nhấn phím bất kỳ để tiếp tục ! ");
		input.nextLine();
	}
}
