/**
 * @Project_Name 32_Ex3_Todo List
 */
package com.luvina.todolist.alarm;

/**
 * @author Hoang Anh
 * @since 16 thg 12, 2020
 * @version 1.0
 */
public class AlarmClock {
	private int hour;
	private int minute;

	private static final int MINUTES_LIMIT_VALUE = 60;
	private static final int HOUR_LIMIT_VALUE = 24;

	/**
	 * Phương thức khởi tạo đối tượng
	 * <p>
	 * Dữ liệu đầu vào dưới dạng String như sau: "12h15" hoặc "12:15"
	 */
	public AlarmClock(String time) {
		time.replace(" ", "");
		if (time.contains("h")) {
			String[] temp = time.split("h");
			this.hour = Integer.parseInt(temp[0]);
			this.minute = Integer.parseInt(temp[1]);
		} else if (time.contains(":")) {
			String[] temp = time.split(":");
			this.hour = Integer.parseInt(temp[0]);
			this.minute = Integer.parseInt(temp[1]);
		}
	}

	@Override
	public String toString() {
		return hour + "h" + minute;
	}

	@Override
	public boolean equals(Object obj) {
		// 2 Khung giờ bằng nhau khi cả giờ và phút bằng nhau
		boolean hourCondition = ((AlarmClock) obj).getHour() == this.hour;
		boolean minuteCondition = ((AlarmClock) obj).getMinute() == this.minute;
		return hourCondition && minuteCondition;
	}

	/**
	 * Kiểm tra tính hợp lệ của thuộc tính hour và minute
	 * 
	 * @return
	 *         <li>true - hợp lệ
	 *         <li>false - Không hợp lệ
	 */
	public boolean isTimeValid() {
		if (hour >= 0 && hour <= HOUR_LIMIT_VALUE) {
			if (minute >= 0 && minute <= MINUTES_LIMIT_VALUE) {
				return true;
			}
		}
		return false;
	}

	// -------------------- GETTER & SETTER --------------------

	/**
	 * @return the hour
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * @param hour the hour to set
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}

	/**
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}
}
