/**
 * @Project_Name 32_Ex2_Google Photo
 */
package com.luvina.photo.image;

/**
 * @author Hoang Anh
 * @since 4 thg 1, 2021
 * @version 1.0
 */
public class Image {
	private String imageID;
	private String imageName;
	private String imageLink;
	private String dimension;
	private String topicID;
	private int suitablePoint;

	/**
	 * 
	 */
	public Image(String imageID, String imageName, String imageLink, String dimension) {
		this.imageID   = imageID;
		this.imageName = imageName;
		this.imageLink = imageLink;
		this.dimension = dimension;
	}

	@Override
	public String toString() {
		return "\n------- IMAGE -------" 
			+ "\nImage ID  : " + imageID
			+ "\nTopic ID  : " + topicID
			+ "\nName 	   : " + imageName
			+ "\nLink 	   : " + imageLink
			+ "\nDimension : " + dimension;
	}

	@Override
	public boolean equals(Object obj) {
		Image object = (Image) obj;
		return this.imageID.equals(object.getImageID());
	}

	/**
	 * @return the topicID
	 */
	public String getTopicID() {
		return topicID;
	}

	/**
	 * @param topicID the topicID to set
	 */
	public void setTopicID(String topicID) {
		this.topicID = topicID;
	}

	/**
	 * @return the imageID
	 */
	public String getImageID() {
		return imageID;
	}

	/**
	 * @return the imageName
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * @return the imageLink
	 */
	public String getImageLink() {
		return imageLink;
	}

	/**
	 * @return the dimension
	 */
	public String getDimension() {
		return dimension;
	}

	/**
	 * @return the suitablePoint
	 */
	public int getSuitablePoint() {
		return suitablePoint;
	}

	/**
	 * @param suitablePoint the suitablePoint to set
	 */
	public void setSuitablePoint(int suitablePoint) {
		this.suitablePoint = suitablePoint;
	}
}
