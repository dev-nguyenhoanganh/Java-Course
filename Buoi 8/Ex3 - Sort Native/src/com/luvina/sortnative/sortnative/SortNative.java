/**
 * @Project_Name Ex3 - Sort Native
 * @author Hoang Anh
 * @date 17 thg 11, 2020
 * @version 1.0
 */
package com.luvina.sortnative.sortnative;

public class SortNative {
	private int a;
	private int b;
	private int c;
	private int d;
	private int tempNum;
	
	// Constructor 
	public SortNative() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
		this.d = 0;
		this.tempNum = this.a;
	}

	// Constructor
	public SortNative(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.tempNum = a;
	}
	
	/**
	 * Phương thức sắp xếp các tham số của đối tượng theo 
	 * thứ tự tăng dần
	 * @return <ul><b>Xâu ký tự</b> - sắp xếp các tham số theo 
	 * thứ tự tăng dần. </ul>
	 * <code> VD: a < b < c < d 
	 */
	public String sort() {
		// Xếp 3 số a, b, c theo thứ tự tăng dần
		sortABC();

		if (d < a) {
			return d + " < " + a + " < " + b + " < " + c;
		}
		else if(d < b) {
			return a + " < " + d + " < " + b + " < " + c;
		}
		else if(d < c) {
			return a + " < " + b + " < " + d + " < " + c;
		}
		return a + " < " + b + " < " + c + " < " + d;
	}
	
	
	//------------------- Private Method -------------------
	/**
	 * <ul>Phương thức sắp xếp các giá trị trong tham số this.a,
	 * this.b, this.c theo thứ tự tăng dần ứng với a, b, c</ul>
	 * VD:<ul><li> a = 3, b = 1, c = 2;
	 * <li>sortABC(); <li><i>// a = 1, b = 2, c = 3</i></ul>
	 */
	private void sortABC() { 
		if((a < b) && (a < c)) {
			if(b > c) {
				swapBC(); 			// a < c < b
			}						
			else {}					// a < b < c				
		}							
		if((b < a) && (b < c)) {	
			if(a < c) {				
				swapAB(); 			// b < a < c
			}
			else {
				swapAB();
				swapBC();			// b < c < a
			}
		}
		if((c < a) && (c < b)) {
			if(a < b) {
				swapAC();			 
				swapBC();			// c < a < b
			}
			else {
				swapAC();			// c < b < a
			}
		}
	}
	
	private void swapAB() {
		this.tempNum = this.a;
		this.a  = this.b;
		this.b  = this.tempNum;
	}
	
	private void swapBC() {
		this.tempNum = this.b;
		this.b  = this.c;
		this.c  = this.tempNum;
	}
	
	private void swapAC() {
		this.tempNum = this.a;
		this.a  = this.c;
		this.c  = this.tempNum;
	}

	/**
	 * @return the tempNum
	 */
	public double getTempNum() {
		return tempNum;
	}
}


