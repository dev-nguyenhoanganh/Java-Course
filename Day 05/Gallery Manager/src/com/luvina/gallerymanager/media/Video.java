/**
 * @author Hoang Anh
 * @version 1.0
 * @since 4 thg 11, 2020
 */
package com.luvina.gallerymanager.media;

public class Video extends Media {
	private String typeOfVideo;
	private String time;
	private String duration;

	public void createVideo(String _iD, String _name, String _size, String _typeOfVideo, String _time,
			String _duration) {
		createMedia(_iD, _name, _size);
		// Them video moi
	
	}
	
	@Override
	public Video[] searchMedia(String _videoName) {
		Video[] list = null;
		// Tim kiem video theo ten
		return list;
	}
	
	@Override
	public void changeMediaName(String _videoName, String _videoID) {
		// Sua ten video theo videoID
	}
	
	@Override
	public void deleteMedia(String _videoID) {
		// Xoa video theo videoID
	}
	
	public void playVideo(String _videoID) {
		// Play video khi biet _videoID
	}
	
	// -------------------- Get method ----------------------
	/**
	 * @return the typeOfVideo
	 */
	public String getTypeOfVideo() {
		return typeOfVideo;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}
}
