/**
 * @author Hoang Anh
 * @date 28-10-2020
 * 
 */

public class SoNguyenTo {
	// Khai bao thuoc tinh
	int value;
	String answer;
	final static boolean THOA_MAN_DIEU_KIEN = true;   // Hang so tuong trung
	
	// Khai bao phuong thuc
	public static void getValue() {
		// Noi dung phuong thuc
		// gan value = gia tri nhap vao tu ban phim
	}
	
	public static boolean kiemTra() {
		// Noi dung phuong thuc 
		// Neu la so nguyen to -> return true
		// Neu khong la so nguyen to -> return false
		if(THOA_MAN_DIEU_KIEN) 
			return true;
		else
			return false;
	}
	
	public static void displayAnswer(boolean _answer) {
		/**
		 * Noi dung:
		 * Hien thi cau tra loi ra man hinh
		 * Neu _answer = true => La so nguyen to
		 * _answer = false => Khong la so nguyen to
		 */
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SoNguyenTo number = new SoNguyenTo();
		getValue();
		displayAnswer(kiemTra());
	} 
}
