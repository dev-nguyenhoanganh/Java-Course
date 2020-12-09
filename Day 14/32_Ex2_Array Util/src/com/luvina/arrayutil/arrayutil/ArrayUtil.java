/**
 * @Project_Name 32_Ex2_Array Util
 */
package com.luvina.arrayutil.arrayutil;

/**
 * @author Hoang Anh
 * @since 8 thg 12, 2020
 * @version 1.0
 */
public class ArrayUtil {
	private int[] arr;
	int n;
	
	/**
	 * Phương thức khởi tạo giá trị cho các thuộc tính của đối tượng 
	 * @param n - kích thước của thuộc tính mảng
	 */
	public ArrayUtil(int n) {
		this.n = n;
		this.arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 50);
		}
	}

	/**
	 * Phương thức tìm kiếm 3 cạnh của tam giác bằng cách duyệt 
	 * 3 phần tử liền kề
	 * @return - các bộ 3 phần tử có thể tạo thành tam giác
	 */
	public String findTriangle() {
		String result = "";
		
		for(int i = 0; i < arr.length - 2; i++) {
			if(isTriangle(arr[i], arr[i+1], arr[i+2])) {
				result += "(" + arr[i] + "," + arr[i+1] + "," + arr[i+2] + ")\n";
			}
		}
		return result;
	}

	/**
	 * @return the arr
	 */
	public int[] getArr() {
		return arr;
	}
	
	/**
	 * @return the n
	 */
	public int getN() {
		return n;
	}
	
	// -------------------- PRIVATE LAYER --------------------
	
	/**
	 * Phương thức kiểm tra xem 3 số truyền vào có thể tạo thành tam giác
	 * hay không?
	 * @param a - giá trị cạnh thứ nhất
	 * @param b - giá trị cạnh thứ hai
	 * @param c - giá trị cạnh thứ ba
	 * @return false - không thể tạo thành tam giác
	 * 	  <li> true - có thể tạo thành tam giác
	 */
	private boolean isTriangle(int a, int b, int c) {
		if(a <= 0 || b <= 0 || c <= 0) {
			return false;
		}
		return (a + b > c) && (b + c > a) && (c + a > b);
	}
}
