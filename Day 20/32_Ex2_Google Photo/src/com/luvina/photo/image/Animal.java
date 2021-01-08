/**
 * @Project_Name 32_Ex2_Google Photo
 */
package com.luvina.photo.image;

/**
 * @author Hoang Anh
 * @since 4 thg 1, 2021
 * @version 1.0
 */
public class Animal extends Image {
	private String callName;
	private String livePlace;
	private String sound;

	public Animal(String imageID, String imageName, String imageLink, String dimension, String callName,
			String livePlace, String sound) {
		super(imageID, imageName, imageLink, dimension);
		this.callName  = callName;
		this.livePlace = livePlace;
		this.sound     = sound;
	}

	public void display() {
		System.out.println("Tên loài vật: " + this.callName);
		System.out.println("Tiếng kêu: " + this.sound);
	}

	@Override
	public String toString() {
		return super.toString() 
			+ "\nĐặc điểm của ảnh"
			+ "\nTên loài vật : " + this.callName
			+ "\nTiếng kêu	  : " + this.sound
			+ "\nNơi sống	  : " + this.livePlace
		;
	}

	/**
	 * @return the callName
	 */
	public String getCallName() {
		return callName;
	}

	/**
	 * @return the livePlace
	 */
	public String getLivePlace() {
		return livePlace;
	}

	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}
}
