/**
 * @Project Gallery Manager
 * @author Hoang Anh
 * @version 1.0
 * @since 4 thg 11, 2020
 */
package com.luvina.gallerymanager.manager;
import com.luvina.gallerymanager.media.Media;

public class Gallery{
	private String albumID;
	private String albumName;
	private String albumCreateDate;
	private Media[] mediaList;
	
	public void createAlbum(String _albumID, String _albumName, String _albumCreateDate, Media[] _mediaList) {
		// Noi dung phuong thuc
	}
	
	public void changeAlbumName(String _albumName, String _albumID) {
		// Noi dung phuong thuc
	}
	
	public void displayAllAlbum() {
		// Hien thi tat ca cac album co trong danh sach
	}
	
	public void deleteAlbum(String _albumID) {
		// Xoa Album khi biet _albumID
	}
	
	public Gallery[] searchAlbum(String _albumName) {
		Gallery[] list = null;
		// tim kiem album theo ten
		return list;
	}
	
	// ------------------- Media handle -------------------
	public void addMediaToAlbum(Media _media, String _albumID) {
		// Them _media vao album
	}
	
	public void deleteMediaInAlbum(String _mediaID, String _albumID) {
		// Xoa _media trong Album khi biet _mediaID
	}
	
	//------------------ Get Method -----------------------
	/**
	 * @return the albumID
	 */
	public String getAlbumID() {
		return albumID;
	}

	/**
	 * @return the albumName
	 */
	public String getAlbumName() {
		return albumName;
	}

	/**
	 * @return the albumCreateDate
	 */
	public String getAlbumCreateDate() {
		return albumCreateDate;
	}

	/**
	 * @return the mediaList
	 */
	public Media[] getMediaList() {
		return mediaList;
	}
}
