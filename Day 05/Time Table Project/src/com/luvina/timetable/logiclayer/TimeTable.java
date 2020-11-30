/**
 * @Project Time Table Project
 * @author Hoang Anh
 * @version 1.0
 * @since 4 thg 11, 2020
 */
package com.luvina.timetable.logiclayer;

public class TimeTable extends Time {
	private Time startTime;
	private Time endTime;
	private Time alarm;
	private String content;
	private String timeTableID;
	
	public void createTimeTable(Time _startTime, Time _endTime, String _content, String _timeTableID) {
		// Tao thoi gian bieu moi
		startTime = setTime(_startTime.hour, _startTime.minute);
		endTime = setTime(_endTime.hour, _endTime.minute);
	}
	
	public void changeTimeTable(TimeTable _editedTimeTable) {
		// Sua thoi gian bieu
	}
	
	public void deleteTimeTable(String _timeTableID) {
		// Xoa thoi gian bieu theo _timeTableID
	}
	
	public TimeTable[] searchTimeTable(String _content) {
		TimeTable[] list = null;
		// Tim kiem thoi gian bieu theo noi dung
		return list;
	}
	
	public TimeTable[] searchTimeTable(Time _startOrEnd) {
		TimeTable[] list = null;
		// Tim kiem thoi gian bieu theo thoi gian bat dau hoac ket thuc
		return list;
	}
	
	public void setAlarmClock(int _hour, int _minute) {
		alarm.hour = _hour;
		alarm.minute = _minute;
	}
	
	public void notification() {
		// Den thoi gian bao thuc => Dua ra thong bao
	}
	
	//------------------ Get Method -----------------------
	/**
	 * @return the startTime
	 */
	public Time getStartTime() {
		return startTime;
	}

	/**
	 * @return the endTime
	 */
	public Time getEndTime() {
		return endTime;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @return the timeTableID
	 */
	public String getTimeTableID() {
		return timeTableID;
	}
}
