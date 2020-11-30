/**
 * @author Hoang Anh
 * @date 28-10-2020
 */
public class ThongTinHinh {
	// Khai bao thuoc tinh
	double chieuDai;
	double chieuRong;
	double chuVi;
	double dienTich;
	int[] dinh;
	final boolean CHECK = true;
	final int HINH_VUONG = 0;
	final int HINH_CHU_NHAT = 1;
	
	// Khai bao phuong thuc
	int kiemTra(int[] dinh) {
		// Tinh toan chieu dai cac canh cua tu giac
		// Neu chieu dai bang nhau => Hinh vuong
		// Neu chieu dai 2 cap canh doi bang nhau => Hinh chu nhat
		
		/**
		 * Tinh chu vi, dien tich, chieu dai, chieu rong
		 */
		
		if (CHECK) 
			return HINH_VUONG;
		else 
			return HINH_CHU_NHAT;
	}
	
	double tinhChuVi(double _chieuDai, double _chieuRong) {
		return (_chieuDai + _chieuRong) * 2;
	}
	
	double tinhDienTich(double _chieuDai, double _chieuRong) {
		return _chieuDai * _chieuRong;
	}
	
	double[] tinhDoDaiCanh(int[] dinh) {
		// _doDai[0] : Chieu dai
		// _doDai[1] : Chieu rong
		double _doDai[] = {0, 0};
		// Tinh chieu dai, chieu Rong dua vao gia tri cua "dinh[]";
		return _doDai;
	}
	
	void display() {
		// In thong tin HV or HCN
	}
}
