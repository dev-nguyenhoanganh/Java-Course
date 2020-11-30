/**
 * @author Hoang Anh
 * @version 2.0
 * @since 4 thg 11, 2020
 */

// package location
package com.luvina.hinhvuonghinhchunhat.tugiac;

// Import location
import com.luvina.hinhvuonghinhchunhat.dinh.Dinh;

public abstract class TuGiac extends Dinh {
	protected Dinh[] dSDinh;
	protected double chuVi;
	protected double dienTich;
	protected String answer;
	
	protected void nhapDanhSachDinh(Dinh[] _dSDinh) {
	 	dSDinh[0] = nhapDinh(_dSDinh[0]);
	 	dSDinh[1] = nhapDinh(_dSDinh[1]);
	 	dSDinh[2] = nhapDinh(_dSDinh[2]);
	 	dSDinh[3] = nhapDinh(_dSDinh[3]);
	}
	
	public double[] tinhDoDaiCanh() {
		double[] _canh = new double[4];
		_canh[0] = tinhKhoangCach(dSDinh[0], dSDinh[1]);
		_canh[1] = tinhKhoangCach(dSDinh[1], dSDinh[2]);
		_canh[2] = tinhKhoangCach(dSDinh[2], dSDinh[3]);
		_canh[3] = tinhKhoangCach(dSDinh[3], dSDinh[0]);
		
		if((_canh[0] == _canh[1]) && (_canh[2] == _canh[3]) && (_canh[3] == _canh[0]))
			answer = "Hinh Vuong";
		else if ((_canh[0] == _canh[2]) && (_canh[1] == _canh[3]))
			answer = "Hinh Chu Nhat";
		else {
			answer = null;
		}
		return _canh;
	}
	
	public abstract void tinhChuVi();
	public abstract void tinhDienTich();
	
	public void inThongTin() {
		// NDPT
	}
}
