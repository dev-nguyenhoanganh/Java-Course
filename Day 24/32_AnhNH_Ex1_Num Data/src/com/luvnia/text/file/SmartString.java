/**
 * @Project_Name 32_AnhNH_Ex1_Num Data
 */
package com.luvnia.text.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.luvnia.text.user.User;

/**
 * @author Hoang Anh
 * @since 9 thg 1, 2021
 * @version 1.0
 */
public class SmartString {

	// REGEX FILE
	private static final String ID_OPEN_REGEX = "<ID>";
	private static final String ID_CLOSE_REGEX = "<\\/ID>";
	private static final String AGE_OPEN_REGEX = "<Age>";
	private static final String AGE_CLOSE_REGEX = "<\\/Age>";
	private static final String PHONE_OPEN_REGEX = "<Phone>";
	private static final String PHONE_CLOSE_REGEX = "<\\/Phone>";
	private static final String NAME_OPEN_REGEX = "<Name>";
	private static final String NAME_CLOSE_REGEX = "</Name>";

	// REGEX User
	private static final String REGEX_NAME = "\\D+";
	private static final String REGEX_AGE = "\\d+";
	private static final String REGEX_PHONE = "\\d+";

	private static final String READ_FILE = ".\\data\\objData.txt";
	private static final String ERROR_FILE = ".\\data\\DataError.txt";

	// Khai báo thuộc tính
	private String text;
	private ArrayList<User> listUser;

	/**
	 * Phương thức khởi tạo giá trị cho đối tượng SmartString
	 */
	public SmartString() {
		this.text = readFile(READ_FILE);
		listUser = new ArrayList<User>();
	}

	// ---------------- Xử lý file DataError.txt ----------------


	/**
	 * 
	 */
	public void validate() {
		String result = "";
		for (User user : listUser) {
			result += validateUser(user);
		}
		System.out.println();
		System.out.println(result);
		System.out.println(writeToFile(result, ERROR_FILE));
	}

	/**
	 * 
	 */
	private String validateUser(User user) {
		String result = "ID = " + user.getUserID() + ": ";

		if (user.getName().isEmpty()) {
			result += "Tên chưa được nhập, ";
		} else {
			String name = validate(REGEX_NAME, user.getName());
			if ("NOT_OK".equals(name)) {
				result += "Tên chứa số, ";
			}
		}

		if (user.getPhone().isEmpty()) {
			result += "SDT chưa được nhập, ";
		} else {
			String phone = validate(REGEX_PHONE, user.getPhone());
			if ("NOT_OK".equals(phone)) {
				result += "SDT Chứa ký tự khác, ";
			}
		}

		if (user.getAge().isEmpty()) {
			result += "Tuổi chưa được nhập, ";
		} else {
			String age = validate(REGEX_AGE, user.getAge());
			if ("NOT_OK".equals(age)) {
				result += "Tuổi không phải là số, ";
			}
		}
		if (result.length() < 10) {
			return "";
		}
		return result.substring(0, result.length() - 2) + "\n";
	}

	/**
	 * 
	 */
	private String validate(String regex, String value) {
		if (value.matches(regex)) {
			return "OK";
		}
		return "NOT_OK";
	}

	// ----------------- Xử lý file objData.txt -----------------

	/**
	 * Phương thức in ra một danh sách chứa các đối tượng News
	 * 
	 * @param list - Danh sách cần in
	 */
	public void print() {
		if (listUser.isEmpty()) {
			System.out.println("List rỗng");
		} else {
			int idx = 0;
			for (User users : listUser) {
				System.out.println("------------------- Item " + (++idx) + " -------------------");
				System.out.println(users.toString());
			}
		}
	}

	/**
	 * Phương thức tìm và lọc trong đoạn text ra danh sách các đối tượng
	 * News
	 * 
	 * @return Danh sách gồm các đối tượng News
	 */
	public void filter() {
		listUser = new ArrayList<User>();

		String itemList[] = text.split("<user>\r\n");

		for (int i = 0; i < itemList.length; i++) {
			if (!itemList[i].trim().isEmpty() && itemList[i].contains("</user>")) {
				listUser.add(getItemInformation(itemList[i]));
			}
		}
	}

	/**
	 * Phương thức tìm kiếm và trả về đối tượng User mới gồm các giá trị
	 * thuộc tính được tìm thấy bên trong item
	 * 
	 * @param item - chứa các thông tin của một đối tượng user
	 * @return Một thực thể News mới chứa các giá trị thuộc tính được tìm
	 *         thấy bên trong item
	 */
	public User getItemInformation(String item) {
		String[] result = new String[4];
		result[0] = getName(item);
		result[1] = getAge(item);
		result[2] = getPhone(item);
		result[3] = getID(item);

		return new User(result[0], result[1], result[2], result[3]);
	}

	/**
	 * Phương thức tìm kiếm và trả về giá trị của thuộc tính `title` từ
	 * chuỗi item ban đầu
	 * 
	 * @param item - chứa các thông tin của một đối tượng new
	 * @return Giá trị của thuộc tính `title`
	 */
	private String getName(String item) {
		String titleRegex = NAME_OPEN_REGEX + "(.*)" + NAME_CLOSE_REGEX;

		// Khởi tạo thực thể pattern
		Pattern r = Pattern.compile(titleRegex);

		// Tạo thực thể matcher
		Matcher m = r.matcher(item);

		if (m.find()) {
			return m.group(1);
		}
		return "Not Found";
	}

	/**
	 * Phương thức tìm kiếm và trả về giá trị của thuộc tính `link` từ
	 * chuỗi item ban đầu
	 * 
	 * @param item - chứa các thông tin của một đối tượng new
	 * @return Giá trị của thuộc tính `link`
	 */
	private String getID(String item) {
		String linkRegex = ID_OPEN_REGEX + "(.*)" + ID_CLOSE_REGEX;

		// Khởi tạo thực thể pattern
		Pattern r = Pattern.compile(linkRegex);

		// Tạo thực thể matcher
		Matcher m = r.matcher(item);

		if (m.find()) {
			return m.group(1);
		}
		return "Not Found";
	}

	/**
	 * Phương thức tìm kiếm và trả về giá trị của thuộc tính `img` từ
	 * chuỗi item ban đầu
	 * 
	 * @param item - chứa các thông tin của một đối tượng new
	 * @return Giá trị của thuộc tính `img`
	 */
	private String getAge(String item) {
		String imgRegex = AGE_OPEN_REGEX + "(.*)" + AGE_CLOSE_REGEX;
		// Khởi tạo thực thể pattern
		Pattern r = Pattern.compile(imgRegex);

		// Tạo thực thể matcher
		Matcher m = r.matcher(item);

		if (m.find()) {
			return m.group(1);
		}
		return "Not Found";
	}

	/**
	 * Phương thức tìm kiếm và trả về giá trị của thuộc tính `date` từ
	 * chuỗi item ban đầu
	 * 
	 * @param item - chứa các thông tin của một đối tượng new
	 * @return Giá trị của thuộc tính `date`
	 */
	private String getPhone(String item) {
		String dateRegex = PHONE_OPEN_REGEX + "(.*)" + PHONE_CLOSE_REGEX;

		// Khởi tạo thực thể pattern
		Pattern r = Pattern.compile(dateRegex);

		// Tạo thực thể matcher
		Matcher m = r.matcher(item);

		if (m.find()) {
			return m.group(1);
		}
		return "Not Found";
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	// ----------------- Read and Write File -----------------

	/**
	 * @param path
	 * @return
	 */
	private String readFile(String path) {
		String data = "";
		try {
			// 1 trỏ vào file
			File file = new File(path);
			// 2. Kiểm tra tồn tại
			if (!file.exists()) {
				System.out.println("File cần đọc không tồn tại.");
				return null;
			}
			// 3. Mở File để đọc
			FileInputStream fI = new FileInputStream(file);
			byte[] arrByte = new byte[8192];
			int length = fI.read(arrByte);
			while (length != -1) {
				data += new String(arrByte, 0, length);
				length = fI.read(arrByte);
			}
			fI.close();
		} catch (IOException e) {
			System.out.println("Lỗi Hệ Thống");
		}
		return data;
	}

	private String writeToFile(String input, String path) {
		try {
			// 1 trỏ vào file
			File file = new File(path);
			// 2. Kiểm tra tồn tại
			if (!file.exists()) {
				file.getParentFile().mkdirs();
				file.createNewFile();
				return "Tạo file thành công";
			}
			// 3. Mở File để ghi
			FileOutputStream fO = new FileOutputStream(file);
			byte[] byteArr = input.getBytes();
			fO.write(byteArr);
			// close
			fO.close();
		} catch (IOException e) {
			return "Lỗi hệ thống !!!";
		}
		return "Ghi thành công";
	}
}
