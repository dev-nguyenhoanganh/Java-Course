/**
 * @Project_Name Ex3_Quan Ly Rap Phim
 */
package com.luvina.manager;

import java.util.ArrayList;

import com.luvina.film.Film;
import com.luvina.room.CinemaRoom;

/**
 * @author Hoang Anh
 * @since 19 thg 12, 2020
 * @version 1.0
 */
public class Manager {
	private ArrayList<Film> filmList;
	private ArrayList<CinemaRoom> roomList;

	/**
	 * 
	 */
	public Manager() {
		filmList = new ArrayList<Film>();
		roomList = new ArrayList<CinemaRoom>();

		
	}


}
