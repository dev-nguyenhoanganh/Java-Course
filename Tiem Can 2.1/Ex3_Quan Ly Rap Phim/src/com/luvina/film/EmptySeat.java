/**
 * @Project_Name Ex3_Quan Ly Rap Phim
 */
package com.luvina.film;

/**
 * @author Hoang Anh
 * @since 21 thg 12, 2020
 * @version 1.0
 */
public class EmptySeat {
	private String[] listEmpty;
	private String showtime;
	
	/**
	 * 
	 */
	public EmptySeat(String[] listEmpty, String showtime) {
		this.listEmpty = listEmpty;
		this.showtime  = showtime;
	}

	/**
	 * @return the listEmpty
	 */
	public String[] getListEmpty() {
		return listEmpty;
	}

	/**
	 * @param listEmpty the listEmpty to set
	 */
	public void setListEmpty(String[] listEmpty) {
		this.listEmpty = listEmpty;
	}

	/**
	 * @return the showtime
	 */
	public String getShowtime() {
		return showtime;
	}

	/**
	 * @param showtime the showtime to set
	 */
	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}

}
