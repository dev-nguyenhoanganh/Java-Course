/**
 * @author Hoang Anh
 * @date 28-10-2020
 */

public abstract class GhiChu {
	// Khai bao thuoc tinh
	String  maGhiChu;
	String  tieuDe	;
	String  noiDung	;
	String  thoiGian;
	String  diaDiem	;
	boolean suKienBoLo;
	
	final int ARRAY_LENGTH = 50;
	
	// Khai bao phuong thuc
	void xemNoiDung() {
		// Noi dung phuong thuc
	}
	
	void nhapTT(String maGhiChu, String tieuDe, String noiDung, String thoiGian, String diaDiem) {
		// Noi dung phuong thuc
	}
	
	GhiChu[] timKiem(String _theoThuocTinh) {
		GhiChu danhSachTraVe[] = new GhiChu[ARRAY_LENGTH];
		// Noi dung phuong thuc 
		return danhSachTraVe;
	}
	
	GhiChu[] lietKeSuKienDaBoLo() {
		GhiChu danhSachTraVe[] = new GhiChu[ARRAY_LENGTH];
		// Noi dung phuong thuc
		return danhSachTraVe;
	}
	
	void hienThi(String _maGhiChu) {
		// Hien thi noi dung cua ghi chu
	}
}
