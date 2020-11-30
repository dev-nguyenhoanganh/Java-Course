/**
 * @author Hoang Anh
 * @version 1.0
 * @since 4 thg 11, 2020
 */

package com.luvina.gallerymanager.media;

public abstract class Media {
	protected String iD;
	protected String name;
	protected String size;
	
	public void createMedia(String _iD, String _name, String _size) {
		// Them media moi
	}
	
	public abstract void changeMediaName(String _mediaName, String _mediaID);
	
	public abstract void deleteMedia(String _mediaID);
	
	public abstract Media[] searchMedia(String _mediaName);
	
	// -------------------- Get method ----------------------
	/**
	 * @return the iD
	 */
	public String getiD() {
		return iD;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
}
