/**
 * @Project Time Table Project
 * @author Hoang Anh
 * @version 1.0
 * @since 4 thg 11, 2020
 */
package com.luvina.timetable.logiclayer;

public abstract class Time {
	protected int hour;
	protected int minute;
	
	protected Time setTime(int _hour, int _minute) {
		hour = _hour;
		minute = _minute;
		return this;
	}
}
