/**
 * @author Hoang Anh
 * @version 1.0
 * @since 4 thg 11, 2020
 */
package com.luvina.gallerymanager.media;

public class Image extends Media {
	private String typeOfImage;
	private String resolution;
	
	void createImage(String _iD, String _name, String _size, String _typeOfImage, String _resolution) {
		typeOfImage = _typeOfImage;
		resolution = _resolution;
		createMedia(_iD, _name, _size);
	}
	
	@Override
	public Image[] searchMedia(String _imageName) {
		Image[] list = null;
		// Tim kiem hinh anh theo ten
		return list;
	}
	
	@Override
	public void changeMediaName(String _imageName, String _imageID) {
		// Sua ten image theo imageID
	}
	
	@Override
	public void deleteMedia(String _imageID) {
		// Xoa anh theo imageID
	}
	
	public void zoomIn_zoomOut(String _imageID) {
		// Thu phong hinh anh khi biet _imageID
	}
	
	public void rotateImage(String _imageID) {
		// Xoay hinh anh khi biet _imageID
	}

	// -------------------- Get method ---------------------- 
	/**
	 * @return the typeOfImage
	 */
	public String getTypeOfImage() {
		return typeOfImage;
	}

	/**
	 * @return the resolution
	 */
	public String getResolution() {
		return resolution;
	}
}
