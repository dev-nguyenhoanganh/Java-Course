/**
 * @Project_Name 32_Ex1_Int Array
 */
package com.luvina.tc.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Hoang Anh
 * @since 8 thg 1, 2021
 * @version 1.0
 */
public class Console {
	private int[] arr;
	private static final String PATH = ".\\data\\numberData.txt";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Console main = new Console();
		main.display();

		main.writeToFile(PATH);
		main.readFile(PATH);
		main.display();
		System.out.println("\nPhần tử trùng nhau: ");
		main.findIntNumber();

		System.out.println("\nTổng nhỏ hơn 5: " + main.calcSum());
		main.sortIntDown();

		main.findPerfectInt();
	}

	@Override
	public String toString() {
		return Arrays.toString(arr);
	}

	public void display() {
		System.out.println(Arrays.toString(arr));
	}

	public int calcSum() {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 5) {
				sum += arr[i];
			}
		}
		return sum;
	}

	public void sortIntDown() {
		int[] arrInt = Arrays.copyOf(arr, arr.length);
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = arrInt[i] * (-1);
		}

		Arrays.sort(arrInt);
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = arrInt[i] * (-1);
		}
		System.out.println("\nXếp giảm dần: " + Arrays.toString(arrInt));
	}

	public void findIntNumber() {

		String checkDuplicate = "";
		for (int i = 0; i < arr.length - 1; i++) {
			String result = "";

			if (checkDuplicate.contains("" + arr[i])) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					result += ", " + j;
				}
			}
			if (result.length() > 3) {
				result = result.substring(2);
				System.out.println(arr[i] + " : " + i + ", " + result);
			}
			checkDuplicate += arr[i] + " ";
		}
	}

	/**
	 * Phương thức hiển thị ra phần tử có nhiều bội nhất trong mảng
	 */
	public void findPerfectInt() {
		if (checkDuplicate()) {
			System.out.println("Tất cả các phần tử của mảng có một bội là: " + arr[0]);
			return;
		}
		try {
			// Tìm bội cho từng phần tử
			int[] count = countMultiple();

			// Tìm các giá trị lớn nhất của mảng
			String[] idxString = findMax(count);
			int[] idxInt = stringToIntArr(idxString);

			// Khử giá trị lặp arr[i]
			String checkDuplicate = "";

			// Chuỗi kết quả trả về để hiển thị ra màn hình
			String result = "";

			for (int i = 0; i < idxInt.length; i++) {
				if (!checkDuplicate.contains(" " + arr[idxInt[i]])) {
					String temp = findMultipleNumber(idxInt[i]);
					if (temp.isEmpty()) {
						continue;
					}
					result += "Số hoàn hảo là " + arr[idxInt[i]] + " vì chia hết cho (" + temp + ")\n";
				}
				checkDuplicate += " " + arr[idxInt[i]];
			}

			if (result.isEmpty()) {
				System.out.println("Mảng toàn số 0");
			} else {
				System.out.println(result);
			}
		} catch (NumberFormatException e) {
			System.out.println("Số 0 là số hoàn hảo nhất vì chia hết cho tất cả phần tử trong mảng");
		}
	}

	// ------------------ Đọc ghi file ------------------

	/**
	 * @param path
	 * @return
	 */
	public void readFile(String path) {
		String data = "";
		try {
			// 1 trỏ vào file
			File file = new File(path);
			// 2. Kiểm tra tồn tại
			if (!file.exists()) {
				System.out.println("File cần đọc không tồn tại.");
				return;
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

		arr = convertStringToInt(data);
	}

	public void writeToFile(String path) {
		initArr();
		String input = Arrays.toString(arr);
		try {
			// 1 trỏ vào file
			File file = new File(path);
			// 2. Kiểm tra tồn tại
			if (!file.exists()) {
				file.getParentFile().mkdirs();
				file.createNewFile();
				System.out.println("Tạo file thành công");
			}
			// 3. Mở File để ghi
			FileOutputStream fO = new FileOutputStream(file);
			byte[] byteArr = input.getBytes();
			fO.write(byteArr);
			// close
			fO.close();
		} catch (IOException e) {
			System.out.println("Lỗi hệ thống !!!");
		}
	}

	// ------------------ Private Method ------------------
	private int[] convertStringToInt(String data) {
		if (data.isEmpty()) {
			System.out.println("File rỗng");
			return null;
		}
		
		data = data.substring(1, data.length() - 1);

		String arrStr[] = data.split(", ");
		int[] arrInt = new int[arrStr.length];
		try {
			for (int i = 0; i < arrStr.length; i++) {
				arrInt[i] = Integer.parseInt(arrStr[i]);
			}
		} catch (NumberFormatException e) {
			System.out.println("File lỗi định dạng");
		}
		
		return arrInt;
	}

	private void initArr() {
		this.arr = new int[20];

		for (int i = 0; i < arr.length; i++) {
			this.arr[i] = (int) (Math.random() * 11);
		}
	}

	private int[] countMultiple() {

		int[] count = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			// Nếu phần tử arr[i] bằng 0 thì bắt đầu vòng lặp mới
			if (arr[i] == 0) {
				throw new NumberFormatException("Số 0");
			}
			// Đếm và trả về số bội của phần tử arr[i]
			for (int j = 0; j < arr.length; j++) {
				if (j != i && arr[j] != 0) {
					if (arr[i] % arr[j] == 0) {
						count[i]++;
					}
				}
			}
		}
		return count;
	}

	/**
	 * Phương thức tìm và trả về chuỗi <b>String</b> các vị trí chứa giá
	 * trị lớn nhất trong mảng
	 * <p>
	 * Ví dụ <br>
	 * Mảng truyền vào: [1,2,3,4,5,5] <br>
	 * Giá trị trả về: ["5" , "6"]
	 * 
	 * @param arr - Mảng cần tìm giá trị lớn nhất
	 * @return Vị trí của phần tử có giá trị lớn nhất trong mảng
	 */
	private String[] findMax(int[] arr) {
		int max = arr[0];
		String index = "";

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i + " ";
			} else if (max == arr[i]) {
				index += i + " ";
			}
		}

		// Cắt bỏ dấu cách phía cuối chuỗi
		index = index.trim();

		// Dùng phương thức split() để tách thành mảng chứa các index
		return index.split(" ");
	}

	/**
	 * Phương thức ép kiểu từ chuỗi dạng <b>String</b> về dạng <b>int</b>
	 * <p>
	 * Ví dụ: <br>
	 * Mảng truyền vào: ["1", "2", "3", "4"] <br>
	 * Mảng trả về : [1, 2, 3, 4]
	 * 
	 * 
	 * @param arr
	 * @return
	 */
	private int[] stringToIntArr(String arr[]) {
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = Integer.parseInt(arr[i]);
		}
		return result;
	}

	/**
	 * Phương thức tìm các bội trong mảng arr[] ban đầu.
	 * <li>Nếu tồn tại bội thì trả về chuỗi String chứa các giá trị bội đó
	 * <li>Nếu không tồn tại thì trả về một chuỗi empty ("")
	 * 
	 * <p>
	 * Ví dụ: Mảng đầu vào [2,3,4,5,6,7] <br>
	 * Giá trị truyền vào : 6 <br>
	 * Giá trị trả về : "2,3"
	 * 
	 * @param index - Vị trí của phần tử trong mảng ban đầu
	 * @return Chuỗi String chứa các giá trị là ước của <b>value</b>
	 *         truyền vào.
	 * 
	 */
	private String findMultipleNumber(int index) {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == index || arr[i] == 0) {
				continue;
			}
			if (arr[index] % arr[i] == 0) {
				result += "," + arr[i];
			}
		}
		if (!result.isEmpty()) {
			result = result.substring(1);
		}
		return result;
	}

	private boolean checkDuplicate() {
		int countDuplicate = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[0]) {
				countDuplicate++;
			}
		}
		if (countDuplicate == arr.length) {
			return true;
		} else {
			return false;
		}
	}
}
