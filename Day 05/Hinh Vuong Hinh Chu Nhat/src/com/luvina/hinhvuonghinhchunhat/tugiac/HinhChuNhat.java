/**
 * @author Hoang Anh
 * @version 2.0
 * @since 4 thg 11, 2020
 */
package com.luvina.hinhvuonghinhchunhat.tugiac;

public class HinhChuNhat extends TuGiac {
	private double[] doDaiCanh;
	
	public void tinhCanh() {
		doDaiCanh = tinhDoDaiCanh();
	}
	
	@Override
	public void tinhChuVi() {
		chuVi = (doDaiCanh[0] + doDaiCanh[1]) * 2;
	}
	
	@Override
	public void tinhDienTich() {
		dienTich = doDaiCanh[0] * doDaiCanh[1];
	}
	
	public void inThongTin() {
		// Noi dung phuong thuc
	}
}
