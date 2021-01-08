/**
 * @Project_Name 32_Day 22_Ex2_UtilInt
 */
package com.luvina.util.utilint;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Hoang Anh
 * @since 6 thg 1, 2021
 * @version 1.0
 */
public class UtilInt {
	private int[] arr;
//	private int[] count;
	private Scanner input;

	private static final int ARRAY_LENGTH = 10;

	/**
	 * Phương thức khởi tạo các thuộc tính cho đối tượng
	 */
	public UtilInt() {
		arr = new int[ARRAY_LENGTH];
//		count = new int[ARRAY_LENGTH];
	}

	/**
	 * Phương thức khởi tạo giá trị cho mảng
	 */
	public void init() {
		input = new Scanner(System.in);
		System.out.println("Nhập giá trị cho mảng");
		for (int i = 0; i < ARRAY_LENGTH; i++) {
			arr[i] = getInput("-?\\d{1,9}", i + 1);
		}
	}

	/**
	 * Hiển thị các giá trị bên trong thuộc tính mảng của đối tượng
	 */
	public void display() {
		System.out.print("Các phần tử của mảng: ");
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * Phương thức hiển thị ra phần tử có nhiều bội nhất trong mảng
	 */
	public void displayMultiples() {
		if (checkDuplicate()) {
			System.out.println("Tất cả các phần tử của mảng có một bội là: " + arr[0]);
			return;
		}

		int[] 	 count 		= countMultiple(); // Tìm bội cho từng phần tử
		String[] idxString  = findMax(count);  // Tìm các giá trị lớn nhất của mảng
		int[] 	 idxInt 	= stringToIntArr(idxString);

		String checkDuplicate = ""; // Khử giá trị lặp arr[i]
		String result = ""; // Chuỗi kết quả trả về để hiển thị ra màn hình

		for (int i = 0; i < idxInt.length; i++) {
			if (!checkDuplicate.contains("" + arr[i])) {
				String temp = findMultipleNumber(i);
				if (temp.isEmpty()) {
					continue;
				}
				result += "Phần tử có nhiều bội nhất là " + arr[i] + " vì có (" 
						+ temp + " chia hết)\n";
			}
			checkDuplicate += " " + arr[i];
		}

		if (result.isEmpty()) {
			System.out.println("Mảng toàn số 0");
		} else {
			System.out.println(result);
		}
	}

	// ---------------- Private Layer ----------------

	/**
	 * Phương thức lấy và kiểm tra giá trị nhập vào từ bàn phím.
	 * <li>Nếu giá trị thỏa mãn yêu cầu của chuỗi <b>regex</b> thì trả về
	 * một giá trị kiểu <code>int</code>
	 * <li>Nếu giá trị từ bàn phím không thỏa mãn yêu cầu của chỗi
	 * <b>regex</b> thì báo lỗi và yêu cầu nhập lại giá trị tới khi nào
	 * thỏa mãn mới thôi
	 * 
	 * @param regex - Chuỗi <b>regex</b> dùng để kiểm tra định dạng dữ
	 *              liệu nhập vào từ bàn phím
	 * @param idx   - Chỉ số của giá trị thứ <b>index</b> cần nhập vào
	 * @return Giá trị thuộc kiểu số nguyên (<b><code>int</code></b>)
	 */
	private int getInput(String regex, int idx) {
		String result = "";
		while(true) {
			System.out.print("Phần tử thứ [" + idx + "] : ");
			result = input.nextLine();
			if (result.matches(regex)) {
				return Integer.parseInt(result);
			}
			System.out.println("Không nằm trong khoảng giá trị nguyên, mời nhập lại");
		}
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
	 * Phương thức tìm các bội trong mảng arr[] ban đầu.
	 * <li>Nếu tồn tại bội thì trả về chuỗi String chứa các giá trị bội đó
	 * <li>Nếu không tồn tại thì trả về một chuỗi empty ("")
	 * 
	 * <p>
	 * Ví dụ: Mảng đầu vào [2,3,4,5,6,7] <br>
	 * Giá trị truyền vào : 2 <br>
	 * Giá trị trả về : "4,6"
	 * 
	 * @param index - Vị trí của phần tử trong mảng ban đầu
	 * @return Chuỗi String chứa các giá trị là bội của <b>value</b>
	 *         truyền vào.
	 * 
	 */
	private String findMultipleNumber(int index) {
		String result = "";
		for (int i = 0; i < ARRAY_LENGTH; i++) {
			if (i == index || arr[index] == 0) {
				continue;
			}
			if (arr[i] % arr[index] == 0) {
					result += "," + arr[i];
			}
		}
		if (!result.isEmpty()) {
			result = result.substring(1);
		}
		return result;
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
	 * Phương thức này làm nhiệm vụ đếm các bội của từng phần tử trong
	 * mảng sau đó trả về các giá trị đếm được thông qua một mảng
	 * <code>int[]</code>
	 * 
	 * @return <code>int[]</code> - mỗi phần tử của mảng này lần lượt ứng
	 *         với số lượng bội của từng phần tử trong mảng
	 *         <code>arr[]</code> ban đầu
	 */
	private int[] countMultiple() {

		int[] count = new int[ARRAY_LENGTH];
		for (int i = 0; i < ARRAY_LENGTH; i++) {
			// Nếu phần tử arr[i] bằng 0 thì bắt đầu vòng lặp mới
			if (arr[i] == 0) {
				continue;
			}
			// Đếm và trả về số bội của phần tử arr[i]
			for (int j = 0; j < ARRAY_LENGTH; j++) {
				if (j != i) {
					if (arr[j] % arr[i] == 0) {
						count[i]++;
					}
				}
			}
		}
		return count;
	}

	private boolean checkDuplicate() {
		int countDuplicate = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[0]) {
				countDuplicate++;
			}
		}
		if (countDuplicate == ARRAY_LENGTH) {
			return true;
		} else {
			return false;
		}
	}

// Cách 2: Làm gộp các bước trên

//	public String[] countMultiples() {
//		String[] result = new String[10];
//		Arrays.fill(result, "");
//		for (int i = 0; i < 10; i++) {
//			if (arr[i] == 0) {
//				result[i] = "";
//				continue;
//			}
//			for (int j = 0; j < 10; j++) {
//				if (j != i) {
//					if (arr[j] % arr[i] == 0) {
//						count[i]++;
//						result[i] += "." + arr[j];
//					}
//				}
//			}
//			if(!result[i].isEmpty()) {
//				result[i] = result[i].substring(1);
//			}
//		}
//		return result;
//	}

//	public int findMax() {
//		int max = count[0];
//		for (int i = 0; i < count.length; i++) {
//			if (max < count[i]) {
//				max = count[i];
//			}
//		}
//		return max;
//	}

//	public String displayMultiples() {
//		String countResult[] = countMultiples();
//		int max = findMax();
//		String result = "";
//		for (int i = 0; i < count.length; i++) {
//			if (max == count[i]) {
//				result += "Phần tử có nhiều bội nhất là " + arr[i] + " vì có (" + countResult[i] + " chia hết)\n";
//			}
//		}
//		return result;
//	}

}


