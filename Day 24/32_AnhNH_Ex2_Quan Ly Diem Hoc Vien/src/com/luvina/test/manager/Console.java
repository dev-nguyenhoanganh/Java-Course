/**
 * @Project_Name 32_AnhNH_Ex2_Quan Ly Diem Hoc Vien
 */
package com.luvina.test.manager;

import java.util.Scanner;

import com.luvina.test.user.Student;
import com.luvina.test.user.Teacher;
import com.luvina.test.user.User;

/**
 * @author Hoang Anh
 * @since 9 thg 1, 2021
 * @version 1.0
 */
public class Console {
	private static Manager manager;
	private static User user;
	private static Scanner input;

	private static final String REGEX_ALL_CHAR = "";
	private static final String REGEX_NAME = "[\\D|\\W]+";
	private static final String REGEX_ID = "[\\S]{5,}";
	private static final String REGEX_SCORE = "(\\d+(\\.\\d+)?)|(\s)";
	private static final String REGEX_DATE = "\\d{1,2}\\/\\d{1,2}\\/\\d{4}";
//	private static final String REGEX_PRIORITY = "[0-1]";

//	// Chữ thường + chữ hoa + số + ký tự đặc biệt + 8 ký tự trở lên
//	private static final String REGEX_PASS = 
//	"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}";

//	// Chữ thường + chữ hoa + số + 8 ký tự trở lên
//	private static final String REGEX_PASS = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";

	// Lớn hơn 8 ký tự
	private static final String REGEX_PASS = ".{8,}";

	/**
	 * 
	 */
	public Console() {
		manager = new Manager();
		input = new Scanner(System.in);
	}

	public static void main(String[] args) {
		Console main = new Console();
		main.wellcomePage();
		main.close();
	}

	public void wellcomePage() {
		System.out.println("---------- Ứng dụng quản lý sinh viên ----------");
		System.out.println("Vui lòng chọn:\n" + "[1] Đăng nhập\n" + "[2] Đăng ký\n" + "[0] Thoát chương trình");

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

	public void signInPage() {
		System.out.println("------------------ Đăng nhập -------------------");
		System.out.print("Tài khoản: ");
		String account = getInput(REGEX_ALL_CHAR, "tài khoản");

		System.out.print("Mật khẩu: ");
		String pass = getInput(REGEX_ALL_CHAR, "mật khẩu");

		user = manager.signIn(account, pass);
		String priority = user.getPriorityLevel();
		if ("TEACHER".equals(priority)) {
			managerPage((Teacher) user);
		} else if ("STUDENT".equals(priority)) {
			studentPage((Student) user);
		} else {
			System.err.println("Tài khoản hoặc mật khẩu nhập vào không đúng");
			pressToContinue();
			wellcomePage();
		}
	}

	public void signUpPage() {
		System.out.println("\n--------------- Tạo tài khoản ----------------");
		String name;
		String account;
		String date;
		String pass;

		System.out.print("Nhập tên của bạn: ");
		name = getInput(REGEX_NAME, "họ và tên");

		System.out.print("Nhập ngày/tháng/năm sinh của bạn: ");
		date = getInput(REGEX_DATE, "ngày/tháng/năm");

		System.out.print("Nhập tên tài khoản: ");
		account = getInput(REGEX_ALL_CHAR, "tên tài khoản");

		System.out.print("Nhập mật khẩu : ");
		pass = getInput(REGEX_PASS, "mật khẩu");

		System.out.println(manager.addTeacher(new Teacher(account, name, date, account, pass)));
//		student.signUp(studentName, studentID, dateOfBirth, "", pass, STUDENT);
		signInPage();
	}

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
			System.err.print("Bạn đã nhập sai định dạng rồi :v" + "\nMời nhập lại " + name + ": ");
		}
	}

	private void pressToContinue() {
		System.out.print("Nhấn phím bất kỳ để tiếp tục ! ");
		input.nextLine();
	}
	
	public void close() {
		System.err.println("Chương trình đã đóng");
		input.close();
	}

	public void managerPage(Teacher teacher) {
		System.out.println("\n------------------------------------------------");
		System.out.println(
			   "[1] Thêm học sinh\r\n"
			+  "[2] Xóa học sinh\r\n"
			+  "[3] Hiển thị danh sách học sinh\r\n"
			+  "[0] Đăng xuất"
		);

		String choose = getInput("[0-3]", "[0-3]");
		switch (choose) {
		case "1":
			getStudentInfor(teacher);
			managerPage(teacher);
			break;
		case "2":
			removeStudent(teacher);
			pressToContinue();
			managerPage(teacher);
			break;
		case "3":
//			manager.display();
			pressToContinue();
			managerPage(teacher);
			break;
		case "0":
			wellcomePage();
			break;
		}
	}

	private static void getStudentInfor(Teacher teacher) {
		System.out.println("\n----------------- Thêm học sinh -----------------");
		String userID;
		String account;
		String name;
		String date;
		String pass;
		String mathScore;
		String literatureScore; 
		String englishScore;
		String grade;


		System.out.print("Nhập tên học sinh: ");
		name = getInput(REGEX_NAME, "tên học sinh");

		System.out.print("Nhập ngày/tháng/năm sinh của học sinh: ");
		date = getInput(REGEX_DATE, "ngày/tháng/năm");

		System.out.print("Nhập điểm Toán: ");
		mathScore = getInput(REGEX_SCORE, "điểm");

		System.out.print("Nhập điểm Văn: ");
		literatureScore = getInput(REGEX_SCORE, "điểm");

		System.out.print("Nhập điểm Anh: ");
		englishScore = getInput(REGEX_SCORE, "điểm");

		System.out.print("Nhập mã học sinh: ");
		userID = getInput(REGEX_ALL_CHAR, "mã học sinh");

		System.out.print("Tài khoản cho học sinh: ");
		account = getInput(REGEX_ID, "tài khoản");

		System.out.print("Nhập lớp học sinh: ");
		grade = getInput(REGEX_ALL_CHAR, "lớp");

		System.out.print("Nhập mật khẩu cho học sinh mới: ");
		pass = getInput(REGEX_ALL_CHAR, "mật khẩu");

//		System.err.println(
//			manager.addStudent(new Student( userID,
//										    name,
//										    date,
//										    account,
//										    pass,
//										 	mathScore,
//											literatureScore,
//											grade,
//						englishScore), user));
		
		System.out.print("Bạn có muốn nhập tiếp không [Y|N]? ");
		String result = getInput("[Y|N|n|y]", "câu trả lời [Y|N]");

		if ("N".equals(result) || "n".equals(result)) {
			return;
		}
		getStudentInfor(teacher);
	}
	
	public void studentPage(Student student) {
		System.out.println("------------------------------------------------");
		System.out.println("Mời chọn: ");
		System.out.println(
			   "[1] Hiển thị thông tin\r\n"
			+  "[0] Đăng xuất"
		);

		String choose = getInput("[0-1]", "[0-1]");
		switch (choose) {
		case "1":
			String result = student.showData();
			System.out.println(result);
			pressToContinue();
			studentPage(student);
			break;
		case "0":
			wellcomePage(); 
			break;
		}
	}

	private static void removeStudent(Teacher teacher) {
		System.out.print("Mã học sinh muốn xóa: ");
		String studentID = getInput(REGEX_ALL_CHAR, "mã học sinh");
//		System.err.println(manager.removeStudent(studentID));
	}
}
