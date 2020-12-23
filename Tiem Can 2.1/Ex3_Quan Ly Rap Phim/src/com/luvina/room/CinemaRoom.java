/**
 * @Project_Name Ex3_Quan Ly Rap Phim
 */
package com.luvina.room;

import java.util.ArrayList;

import com.luvina.film.EmptySeat;
import com.luvina.film.Film;

/**
 * @author Hoang Anh
 * @since 21 thg 12, 2020
 * @version 1.0
 */
public class CinemaRoom {
	private String  iD;
	private String  roomName;
	private ArrayList<Film>  	 filmList;
	private ArrayList<EmptySeat> seatList;

	/** 
	 * 
	 */
	public CinemaRoom(String iD, String seatList, String roomName) {
		this.iD 	  = iD;
		this.roomName = roomName;
		this.filmList = new ArrayList<Film>();
		this.seatList = new ArrayList<EmptySeat>();
	}

	public String addNewFilm(Film newFilm) {
		if(filmList.contains(newFilm)) {
			return "Phim này đã tồn tại";
		}

		filmList.add(newFilm);
		return "Thêm thành công";
	}

	public String removeFilm(Film newFilm) {
		int index = filmList.indexOf(newFilm);
		if(index == -1) {
			return "Không tồn tại phim cần xóa";
		}
		filmList.remove(index);
		return "Xóa thành công";
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
	 * @return the roomName
	 */
	public String getRoomName() {
		return roomName;
	}

	/**
	 * @param roomName the roomName to set
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	/**
	 * @return the filmList
	 */
	public ArrayList<Film> getFilmList() {
		return filmList;
	}

	/**
	 * @param filmList the filmList to set
	 */
	public void setFilmList(ArrayList<Film> filmList) {
		this.filmList = filmList;
	}

	/**
	 * @return the seatList
	 */
	public ArrayList<EmptySeat> getSeatList() {
		return seatList;
	}

	/**
	 * @param seatList the seatList to set
	 */
	public void setSeatList(ArrayList<EmptySeat> seatList) {
		this.seatList = seatList;
	}
}
