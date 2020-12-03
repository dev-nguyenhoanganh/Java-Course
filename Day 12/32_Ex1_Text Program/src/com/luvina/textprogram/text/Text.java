/**
 * @Project_Name 32_Ex1_Text Program
 * @author Hoang Anh
 * @date 30 thg 11, 2020
 * @version 2.0
 * 
 * Chỉnh sửa tại phương thức <b>sumContainNumber()</b>
 */
package com.luvina.textprogram.text;

public class Text {
	private String text;
	
	/**
	 * Phương thức khởi tạo của đối tượng Text
	 */
	public Text(String text) {
		this.text = text;
	}
	
	/**
	 * Phương thức tính tổng các số có trong chuỗi
	 * @return 
	 * <li>-1 : Xâu ký tự rỗng </li>
	 * <li>sum : Tổng của các số có trong chuỗi</li>
	 */
	public int sumContainNumber() {
		if(text.isEmpty()) { return -1; }
		
		String numberString = "";
		int sum 	= 0;
		for(int i = 0; i < text.length(); i++) {
			if('0' <= text.charAt(i) && '9' >= text.charAt(i)) {
				numberString += text.charAt(i);
				if(i == text.length() - 1) {	
					sum += Integer.parseInt(numberString);
				}
			}
			else if(!numberString.isEmpty()) {
				sum += Integer.parseInt(numberString);
				numberString = "";
			}
		}
		return sum;
	}
	
	/**
	 * Phương thức tìm ký tự có mã ASCII nhỏ nhất
	 * @return lowest - ký tự có max ASCII nhỏ nhất
	 */
	public char findLowestChar() {
		char lowest = text.charAt(0);
		for(int i = 1; i < text.length(); i++) {
			if(lowest > text.charAt(i)) {
				lowest = text.charAt(i);
			} 
		}
		return lowest;
	}
	
	/**
	 * Phương thức tìm các chữ cái in hoa có trong chuỗi
	 * @return result - là một xâu chứa các ký tự in hoa có trong chuỗi
	 */
	public String findUpperCase() {
		String result = "";
		boolean first = true;
		for(int i = 0; i < text.length(); i++) {
			if('A' <= text.charAt(i) && 'Z' >= text.charAt(i)) {
				if (first) {
					result += text.charAt(i);
					first = false;
				}
				else {
					result += "," + text.charAt(i);
				}
			}
		}
		return result;
	}
	
	/**
	 * In hoa các chữ cái đầu của từng từ trong chuỗi
	 * 
	 * <p> Ý tưởng: 
	 * <li> Kiểm tra ký tự đầu tiên của mảng, nếu nằm trong khoảng từ 
	 * 'a' đến 'z' thì tiến hành chuyển thành ký tự in hoa rồi cộng vào 
	 * chuỗi *result* để trả về. Trong trường hợp không nằm trong giải 
	 * ký tự 'a' - 'z' thì cộng trực tiếp vào chuỗi *result*
	 * <li> Sau đó dùng một vòng lặp for duyệt các phần tử còn lại của 
	 * chuỗi. Khi bắt gặp ký tự 'space' thì tiến hành kiểm tra ký tự 
	 * liền kề với nó. Nếu thuộc khoảng 'a' - 'z' thì tiến hành chuyển
	 * thành chữ in hoa và cộng vào *result*. Nếu không thì giữ nguyên
	 * rồi cộng vào *result* 
	 * 
	 * @return result - Là một xâu ký tự đã in hoa các chữ cái đầu của
	 * từng từ trong chuỗi
	 */
	public String upperFirstChar() {
		String result = "";
		
		if('a' <= text.charAt(0) && 'z' >= text.charAt(0)) {
			result += (char) (text.charAt(0) - 32);
		}
		else {
			result += text.charAt(0);
		}
		
		for(int i = 1; i < text.length(); i++) {
			if(i == text.length() - 1) {
				result += text.charAt(i);
				break;
			}
			else {
				if(text.charAt(i) == ' ') {
					// result += ' ';
					if(text.charAt(i+1) >= 'a' && text.charAt(i) <= 'z') {
						result += (char) (text.charAt(++i) - 32); 
						continue;
					}
				}
			}
			result += text.charAt(i);
		}
		return result;
	}
	
	/**
	 * Phương thức trả về chuỗi đảo ngược
	 * @return result - Là một xâu ký tự sau khi đảo ngược chuỗi *this* 
	 */
	public String reverseString() {
		String result = "";
		for(int i = text.length() - 1; i >= 0; i--) {
			result += text.charAt(i);
		}
		return result;
	}
	
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
		
}
