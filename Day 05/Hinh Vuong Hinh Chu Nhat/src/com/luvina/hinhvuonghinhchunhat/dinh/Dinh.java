/**
 * @author Hoang Anh
 * @version 2.0
 * @since 4 thg 11, 2020
 */
package com.luvina.hinhvuonghinhchunhat.dinh;

public abstract class Dinh {
	protected double x;
	protected double y;
	
	protected Dinh nhapDinh(Dinh _dinh) {
		x = _dinh.x;
		y = _dinh.y;
		return this;
	} 
	
	public double tinhKhoangCach(Dinh _dinh1, Dinh _dinh2) {
		double ketQua = 0;
		ketQua = (_dinh1.x - _dinh2.x)*(_dinh1.x - _dinh2.x) + (_dinh1.y - _dinh2.y)*(_dinh1.y - _dinh2.y);
		return Math.sqrt(ketQua);
	}

	
}
