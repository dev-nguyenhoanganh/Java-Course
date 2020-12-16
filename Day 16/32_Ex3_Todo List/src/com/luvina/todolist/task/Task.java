/**
 * @Project_Name 32_Ex3_Todo List
 */
package com.luvina.todolist.task;

import java.util.Calendar;

import com.luvina.todolist.alarm.AlarmClock;

/**
 * @author Hoang Anh
 * @since 16 thg 12, 2020
 * @version 1.0
 */
public class Task {
	private int 	   id;
	private AlarmClock time;
	private String     content;
	private boolean    accomplish;

	/**
	 * 
	 */
	public Task(String content, String time) {
		this.content 	= content;
		this.time 		= new AlarmClock(time);
		this.accomplish = false;
	}

	@Override
	public boolean equals(Object obj) {
		// Nội dung giống nhau thì task giống nhau
		return ((Task) obj).getContent().equals(this.content);
	}

	@Override
	public String toString() {
		return "[" + id + "] " + content + "  " + time + " | Hoàn thành: " + accomplish;
	}

	/**
	 * Tác vụ báo thức khi đến thời gian thực hiện tác vụ.
	 * Thời gian được lấy theo thời gian của laptop
	 * @return Chuổi trả về có bao gồm thời gian thực của laptop
	 */
	public String alarm() {
		Calendar cal = Calendar.getInstance();
		String currentTime = cal.get(Calendar.HOUR_OF_DAY) + "h" + cal.get(Calendar.MINUTE);

		if(currentTime.equals(this.time.toString())) {
			return "Bây giờ là " + currentTime + " đã tới giờ thực hiện tác vụ";
		}
		return "Bây giờ là " + currentTime + " chưa đến giờ thực hiện tác vụ";
	}

	// -------------------- GETTER & SETTER --------------------

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time.toString();
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = new AlarmClock(time);
	}

	/**
	 * @return the accomplish
	 */
	public boolean isAccomplish() {
		return accomplish;
	}

	/**
	 * @param accomplish the accomplish to set
	 */
	public void setAccomplish(boolean accomplish) {
		this.accomplish = accomplish;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
}
