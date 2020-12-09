/**
 * @Project_Name 32_Ex1_Single Dimension Array
 */
package com.luvina.single_dimension_array.array;

/**
 * @author Hoang Anh
 * @since 8 thg 12, 2020
 * @version 1.0
 */
public class ArrayInt {
	private int[] arr;

	/**
	 * Phương thức khởi tạo giá trị mặc định cho mảng *arr*
	 */
	public ArrayInt() {
		 arr = new int[] {1, 2, 3, 4, 5, 2, 3, 1, 5, 4, 1, 4, 5, 3, 2};
	}

	/**
	 * Phương thức khởi tạo giá trị cho đối tượng ArrayInt bằng cách 
	 * gán giá trị một mảng có sẵn cho thuộc tính của đối tượng
	 * @param arr - Mảng truyền vào đã khởi tạo sẵn giá trị
	 */
	public ArrayInt(int arr[]) {
		this.arr = new int[arr.length];

		for(int i = 0; i < arr.length; i++) {
			this.arr[i] = arr[i];
		}
	}

	/**
	 * Phương thức tìm phần tử có giá trị lớn nhất của mảng
	 * @return phần tử có giá trị lớn nhất trong mảng
	 */
	public int findMax() {
		int max = arr[0];

		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	/**
	 * Phương thức tìm và trả về một mảng chứa các phần tử của mảng 
	 * **this.arr** sao cho các phần tử này đều là số nguyên tố
	 * @return mảng chứa các số nguyên tố
	 */
	public int[] findPrimeNumber() {
		int[] primeArr = new int[arr.length];
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(isPrimeNumber(arr[i])) {
				if(!isNumberExist(primeArr, arr[i])) {
					primeArr[index++] = arr[i];
				}
			}
		}
		
		int[] result = new int[index];
		for(int i = 0; i < index; i++) {
			result[i] = primeArr[i];
		}
		return result;
	}
	
	/**
	 * Phương thức tìm và trả về giá trị của phần tử nhỏ ths 2 trong mảng
	 * @return phần tử nhỏ thứ 2 trong mảng
	 */
	public int findSecondMinimum() {
		int secondMinimum = arr[0] + arr[1];
		int min = arr[0];

		// Tìm min
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			} 
		}

		// Tìm secondMinimum
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > min && arr[i] < secondMinimum) {
				secondMinimum = arr[i];
			}
		}
		return secondMinimum;
	}

	/**
	 * Phương thức tìm và trả về các cặp 2 phần tử liên tiếp có tổng bằng 5
	 * @return chuỗi chứa giá trị của các phần tử liền kề có tổng bằng 5
	 */
	public String findTotalBy5 () {
		String result = "";

		for(int i = arr.length - 1; i > 0; i--) {
			if(arr[i] + arr[i - 1] == 5) {
				result += "(" + arr[i-1] + "," + arr[i] + ") ";
				// result += "(arr[" + (i-1) + "], arr[" + i + "]) ";
			}
		}
		return result;
	}

	// -------------------- PRIVATE LAYER --------------------

	/**
	 * Phương thức kiểm tra xem số *number* đã tồn tại trong mảng hay chưa?
	 * @param arr - mảng cần kiểm tra
	 * @param number - giá trị cần kiểm tra
	 * @return false: chưa tồn tại
	 * 	  <li> true: đã tồn tại
	 */
	private boolean isNumberExist(int arr[], int number) {
		for(int i = 0; i < arr.length; i++) {
			if(number  == arr[i]) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Phương thức kiểm tra xem số *number* có phải số nguyên tố hay không
	 * @param number - số nguyên cần kiểm tra
	 * @return false - Không phải số nguyên tố
	 *    <li> true - Là số nguyên tố
	 */
	private boolean isPrimeNumber(int number) {
		if(number < 2) {
			return false;
		} else if(number == 2) {
			return true;
		} 

		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
