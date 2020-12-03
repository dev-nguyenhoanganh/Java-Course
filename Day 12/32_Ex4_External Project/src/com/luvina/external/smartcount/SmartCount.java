/**
 * @Project_Name 32_Ex4_External Project
 * 
 */
package com.luvina.external.smartcount;

/**
 * 
 * @author Hoang Anh
 * @since 2 thg 12, 2020
 * @version 1.0
 */
public class SmartCount {
	private String str; 
	
	/**
	 *	Phương thức khởi tạo thuộc tính *str* cho đối tượng
	 */
	public SmartCount(String str) {
		this.str = str;
	}

	/**
	 * Phương thức đếm số lần xuất hiện của chuỗi *ret* trong chuỗi *this*
	 * <p> Ý tưởng: Sử dụng vòng lặp for để duyệt số lần bằng với kích thước
	 * của chuỗi. Bên trong vòng lặp for tiến hành kiểm tra xem *ret* có
	 * nằm trong chuỗi *this* hay không 
	 * <li> Nếu *ret* nằm trong *this*, sử dụng phương thức <i>indexOf()</i>
	 * để xác định vị trí xuất hiện đầu tiên của *ret* trong chuỗi *this*
	 * <li> Dùng vòng lặp while để tạo một chuỗi *tmp2* lưu các giá trị 
	 * còn lại của chuỗi để chuẩn bị cho lần duyệt tiếp theo
	 * <li> Nếu *ret* không nằm trong *this*, tiến hành thoát khỏi vòng
	 * lặp và trả về giá trị của biến <b>count</b>
	 * 
	 * @param ret - chuỗi truyền vào
	 * @return - trả về số lần lặp của chuỗi *ret* trong chuỗi *this*
	 */
	public int countRepeat(String ret) {
		// int count = 0;
		// String tmp2 = ""; 
		// for(int j = 0; j < tmp.length(); j++) {
		// 	if(tmp.contains(ret)) {
		// 		// int i = tmp.indexOf(ret, 0) + ret.length();
		// 		// while(i < tmp.length()) {
		// 		// 	tmp2 += tmp.charAt(i);
		// 		// 	i++;
		// 		// }
		// 		tmp2 = tmp.replace(ret, "");
		// 		count++;
		// 	}
		// 	else {
		// 		return count;
		// 	}
		// 	tmp  = tmp2;
		// 	tmp2 = "";
		// }
		// return count;
		
		String tmp  = str.replace(ret, "");
		return (str.length() - tmp.length()) / ret.length();
	}
	
	/**
	 * @param str the str to set
	 */
	public void setStr(String str) {
		this.str = str;
	}
}
