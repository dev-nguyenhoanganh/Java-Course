/**
 * @Project_Name 32_Ex2_Google Photo
 */
package com.luvina.photo.image;

/**
 * @author Hoang Anh
 * @since 4 thg 1, 2021
 * @version 1.0
 */
public class Nature extends Image {
	private String callName;
	private String benefit;

	public Nature(String imageID, String imageName, String imageLink, String dimension, String callName,
			String benefit) {
		super(imageID, imageName, imageLink, dimension);
		this.callName  = callName;
		this.benefit   = benefit;
	}

	@Override
	public String toString() {
		return super.toString()
			+ "\nĐặc điểm của ảnh"
			+ "\nTên cây : " + this.callName
			+ "\nCông dụng: " + this.benefit;
	}

	/**
	 * @return the callName
	 */
	public String getCallName() {
		return callName;
	}

	/**
	 * @return the benefit
	 */
	public String getBenefit() {
		return benefit;
	}
}
