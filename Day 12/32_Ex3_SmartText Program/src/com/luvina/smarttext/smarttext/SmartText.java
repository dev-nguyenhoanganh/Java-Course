/**
 * @Project_Name 32_Ex3_SmartText Program
 *
 */
package com.luvina.smarttext.smarttext;

/**
 * <p> Thay đổi tại phương thức <b>orderByCharacter()</b> từ tăng dần
 * thành giảm dần 
 * 
 * @author Hoang Anh
 * @date 1 thg 12, 2020
 * @version 2.0
 * 
 */
public class SmartText {
	private String text;
	final String UNICODE_A = "áàạảãăắằặẵẳâấầậẩẫâ";
	final String UNICODE_E = "éèẹẻẽếềệễểê";
	final String UNICODE_U = "úùủũụứừửữựư";
	final String UNICODE_O = "óòỏõọớờởỡợơ";
	final String UNICODE_I = "íìỉĩị";
	final String UNICODE_Y = "ýỳỷỹỵ";
	
	/**
	 * Phương thức khởi tạo của đối tượng
	 */
	public SmartText(String text) {
		this.text = text;
	}
	
	/**
	 * Phương thức trả về các ký tự có trong thuộc tính text của đối tượng
	 * 
	 * <p> Ý tưởng: lấy từng ký tự của chuỗi đi duyệt
	 * với các phần tử có trong <b>result</b>
	 * <li>Giá trị khởi tạo ban đầu của <b>result</b> là ký tự đầu tiên
	 * của chuỗi *this*
	 * <li>Khi xuất hiện 2 ký tự trùng nhau thì thoát khỏi vòng lặp
	 * đồng thời bắt đầu kiểm tra kí tự mới 
	 * <li>Nếu duyệt hết các ký tự trong chuỗi <b>result</b> không có 
	 * ký tự nào bị lặp thì cộng ký tự này vào <b>result</b>
	 * @return chuỗi <b>result</b> là kết quả của quá trình lưu các ký tự
	 * có trong chuỗi *this*
	 */
	public String storeByCharacter() {
		String  result  = "";
				result += text.charAt(0);
		for(int i = 0; i < text.length(); i++) {
			for(int j = 0; j < result.length(); j++) {
				if(text.charAt(i) == result.charAt(j)) {
					break;
				}
				if(j == result.length() - 1) {
					result += text.charAt(i);
				}
			}
		}
		return result;
	}
	
	/**
	 * Phương thức sắp xếp các ký tự có trong chuỗi theo chiều giảm dần
	 * của bảng mã ASCII
	 * <p> Ý tưởng: 
	 * <li> Vòng for 1: Dùng để duyệt từng ký tự trong chuỗi *this* 
	 * để tìm ra ký tự có mã ASCII nhỏ nhất, và cộng ký tự này vào chuỗi 
	 * <b>result</b>
	 * <li> Vòng for 2: Dùng để tách ký tự đã duyệt khỏi chuỗi, và tạo
	 * thành chuỗi mới để duyệt với ký tự tiếp theo
	 * <li> Giá trị mặc định của ký tự nhỏ nhất sau mỗi lần lặp vòng for 1
	 *  sẽ là ký tự đầu tiên của chuỗi tạm <b>tmp</b>
	 * @param input - Chuỗi cần sắp xếp
	 * @return result - Chuỗi đã được sắp xếp
	 */
	public String orderByCharacter(String input) {
		String result = "\"";
		String tmp  = input;
		String tmp2 = "";
		
//		start_loop:
		for(int i = 1; i < input.length(); i++) 
		{
			char max = tmp.charAt(0);
			for(int j = 1; j < tmp.length(); j++) 
			{
				if(max < tmp.charAt(j)) 
				{
					tmp2  += max;
					max = tmp.charAt(j);
					continue;
				}
				tmp2 += tmp.charAt(j);
			}
			tmp  = tmp2;
			tmp2 = "";
			result += max;
		}
		return result + "\"";
	}

	/**
	 * Phương thức tìm tần suất xuất hiện của từng ký tự trong chuỗi *this*
	 * <p> Ý tưởng:
	 * <li> Dùng *tmp* làm một chuỗi tạm để kiểm tra tần suất xuất hiện
	 * các ký tự. Chuỗi *tmp* sẽ được thay đổi khi bắt đầu một vòng lặp 
	 * while mới. 
	 * <li> Dùng 1 vòng lặp while để duyệt đến khi chuỗi *tmp*
	 * không còn ký tự nào nữa
	 * <li> Dùng 1 vòng lặp for để kiểm tra ký tự đầu tiên của chuỗi *tmp*
	 * xuất hiện bao nhiêu lần trong chuỗi *tmp*
	 * <li> Chuỗi *tmp2* sử dụng để tách ký tự đang đếm số lần xuất hiện, 
	 * các ký tự còn lại trong chuỗi sẽ được lưu vào *tmp2*. Giá trị *tmp2*
	 * sẽ được gán cho *tmp* khi kết thúc mỗi vòng lặp while 
	 * @return <b>result</b> - Chuỗi trả về kết quả đếm tần suất xuất hiện 
	 * các ký tự trong chuỗi
	 */
	public String letterFrequency() {
		String result = "";
		String tmp  = text;
		String tmp2 = "";
		
//		start_loop:
		while(!tmp.isEmpty()) {
			int count = 0;
			for(int j = 0; j < tmp.length(); j++) {
				if(tmp.charAt(0) == tmp.charAt(j)) {
					count++; continue;
				}
				tmp2 += tmp.charAt(j); 
			}
			result += "- " + tmp.charAt(0) + " : " + count + "\n";
			tmp  = tmp2;
			tmp2 = "";
		}
		return result;
	}	
	
	/**
	 * Phương thức xóa ký tự khoảng trắng thừa ra trong chuỗi *this*
	 * <p> Ý tưởng: 
	 * Sử dụng 1 vòng lặp for duyệt từ đầu tới cuối chuỗi *this* 
	 * nếu gặp ký tự 'space' thì tiến hành kiểm tra lần lượt các điều kiện
	 * <li> Tiến hành kiểm tra ký tự liền kề với nó, bằng cách tăng biến
	 * index lên 1 đơn vị. Nếu ký tự liền kề không phải ký tự 'space' 
	 * thì tiến hành kiểm tra xem ký tự 'space' này có đang nằm ở đầu chuỗi 
	 * không bằng cách sử dụng cờ *first*. 
	 * <li> Nếu ký tự này xuất hiện ở đầu của chuỗi thì không được cộng vào 
	 * chuỗi trả về <b>result</b>. Ở trường hợp ngược lại thì cộng ký tự 
	 * 'space' này vào trong chuỗi <b>result</b>
	 * <li> Trong trường hợp ký tự được duyệt không phải ký tự 'space' thì
	 * sẽ được cộng trực tiếp vào chuỗi <b>result</b> để trả về 
	 * @return <b>result</b> - là kết quả của quá trình xóa ký tự 'space'
	 * thừa ra
	 */
	public String trimExtra(char letter) {
		String result = "\"";
		boolean first = true;
		
		for(int i = 0; i < text.length(); i++) {
			if(letter == text.charAt(i)) {
				if(i == text.length() - 1) {
					continue;
				}
				if(letter != text.charAt(i+1)) {
					if(first) {
						first = false;
						continue;
					}
					result += text.charAt(i);
					continue;
				}
				continue;
			}
			result += text.charAt(i);
		}
		return result + "\"";
	}
	
	/**
	 * Phương thức xóa các ký tự latin đặc biệt
	 * <p> Ý tưởng: Dùng 1 vòng lặp for duyệt từng phần tử có trong chuỗi.
	 * <li> Kiểm tra xem các phần tử này có thuộc các ký tự đặc biệt 
	 * hay không
	 * <li> Nếu là các ký tự đặc biệt thì tiến hành chỉnh sửa về dạng 
	 * không dấu sau đó cộng vào chuỗi <b>result</b>
	 * <li> Nếu không phải các ký tự đặc biệt thì tiến hành cộng thẳng 
	 * vào chuỗi <b>result</b>
	 * @return <b>result</b> - Kết quả của quá trình chuyển các ký tự
	 * latin đặc biệt về ký tự thường của bảng mã ASCII
	 */
	public String removeLatinChar() {
		String result = "\"";
		for(int i = 0; i < text.length(); i++) {
			if(UNICODE_A.contains("" + text.charAt(i))) {
				result += 'a';
			}
			else if(UNICODE_E.contains("" + text.charAt(i))) {
				result += 'e';
			}
			else if(UNICODE_O.contains("" + text.charAt(i))) {
				result += 'o';
			}
			else if(UNICODE_U.contains("" + text.charAt(i))) {
				result += 'u';
			}
			else if(UNICODE_I.contains("" + text.charAt(i))) {
				result += 'i';
			}
			else if(UNICODE_Y.contains("" + text.charAt(i))) {
				result += 'y';
			}
			else {
				result += text.charAt(i);
			}
		}
		return result + "\"";
	}
	
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
}
