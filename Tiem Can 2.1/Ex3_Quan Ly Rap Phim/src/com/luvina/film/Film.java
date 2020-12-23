/**
 * @Project_Name Ex3_Quan Ly Rap Phim
 */
package com.luvina.film;

/**
 * @author Hoang Anh
 * @since 19 thg 12, 2020
 * @version 1.0
 */
public class Film {
	private String 	iD;
	private String  name;
	private String  content;
	private String  showTime;
	private int 	duration;

	/**
	 * 
	 */
	public Film(String iD, int duration, String name, String showTime) {
		this.iD 		= iD;
		this.duration 	= duration;
		this.name 		= name;
		this.showTime 	= showTime;
	}

	@Override
	public boolean equals(Object obj) {
		Film tempObj = (Film) obj;
		boolean contentCondition  = tempObj.getContent().equals(this.content);
		boolean iDCondition 	  = tempObj.getiD().equals(this.iD);
		boolean durationCondition = tempObj.getDuration() == this.duration;
		return (contentCondition && durationCondition) || iDCondition;
	}

	@Override
	public String toString() {
		return "Tên phim:" + name + "\nThời lượng" + duration + "\tLịch chiếu:" + showTime;
	}

	/**
	 * @return the minute
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @param duration the minute to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
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

	/**
	 * @return the showTime
	 */
	public String getShowTime() {
		return showTime;
	}

	/**
	 * @param showTime the showTime to set
	 */
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	/**
	 * @return the iD
	 */
	public String getiD() {
		return iD;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setiD(String iD) {
		this.iD = iD;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
