/**
 * @author Hoang Anh
 * @version 1.0
 * @since 1 - 11 -2020
 */
public class SuKienSapToi extends GhiChu {
	// khai báo thuộc tính
	String thoiGianBaoThuc;
	int soLanBT;
	boolean xacNhanThamGia;
	String amThanhBT;
	
	// khai báo phương thức	
	@Override
	void nhapThongTin(String maGhiChu, String tieuDe, String noiDungGhiChu, String thoiGian, String diaDiem,
			boolean daBoLo) {
		super.nhapThongTin(maGhiChu, tieuDe, noiDungGhiChu, thoiGian, diaDiem, daBoLo);
		// nội dung phương thức

	}

	void xacNhanThamGiaSuKien(boolean xacNhanThamGia) {
		// nội dung phương thức
	}
	
	void datBaoThuc(int soLan, String thoiGianBT, String amThanh) {
		// nội dung phương thức
	}
	
	@Override
	void inTT() {
		super.inTT();
		// nội dung phương thức
	}
}
