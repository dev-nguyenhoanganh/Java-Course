/**
 * @Project_Name 32_Ex2_Google Photo
 */
package com.luvina.photo.topic;

import java.util.ArrayList;
import java.util.Comparator;

import com.luvina.photo.image.Image;

/**
 * @author Hoang Anh
 * @since 3 thg 1, 2021
 * @version 1.0
 */
public class Topic {
	private String topicID;
	private String topicName;
	private String date;
	private ArrayList<Image> imageList;
	
	/**
	 * 
	 */
	public Topic(String topicID, String topicName, String date) {
		this.topicID 	= topicID;
		this.topicName  = topicName;
		this.date 		= date;
		this.imageList  = new ArrayList<Image>();
	}

	Comparator<Image> suitablePoint = new Comparator<Image>() {

		@Override
		public int compare(Image o1, Image o2) {
			return o2.getSuitablePoint() - o1.getSuitablePoint();
		}
	};

	public void display() {
		if (imageList.isEmpty()) {
			System.out.println("Danh sách ảnh hiện đang trống");
		} else {
			for (Image image : imageList) {
				System.out.println(image.toString());
			}
		}
	}

	public void display(ArrayList<Image> imageList) {
		if (imageList.isEmpty()) {
			System.out.println("Chưa có ảnh tương tự");
		} else {
			for (Image image : imageList) {
				System.out.println(image.toString());
			}
		}
	}

	@Override
	public String toString() {
		return "------- TOPIC -------"
			+ "\nID   : " + this.topicID
			+ "\nName : " + this.topicName 
			+ "\nDate : " + this.date
			+ this.imageList;
	}

	@Override
	public boolean equals(Object obj) {
		Topic object = (Topic) obj;
		return this.topicID.equals(object.getTopicID());
	}

	public String addNewImage(Image newImg) {
		if (imageList.contains(newImg)) {
			return "Đã tồn tại";
		} else {
			newImg.setTopicID(this.topicID);
			imageList.add(newImg);
		}
		return "Thêm thành công";
	}

	public String removeImage(String imageID) {
		if (imageList.isEmpty()) {
			return "Danh sách hiện đang rỗng không có gì để xóa";
		} else {
			for (int i = 0; i < imageList.size(); i++) {
				if (imageID.equals(imageList.get(i).getImageID())) {
					imageList.remove(i);
					return "Xóa thành công";
				}
			}
		}
		return "Không tồn tại ID ảnh này";
	}

	public ArrayList<Image> findSimilar(String imgName) {
		ArrayList<Image> result = new ArrayList<Image>();
		for (Image image : imageList) {
			int suitablePoint = checkSimilar(imgName, image.getImageName());
			if (suitablePoint > 3) {
				image.setSuitablePoint(suitablePoint);
				result.add(image);
			}
		}

		result.sort(suitablePoint);
		return (ArrayList<Image>) result.subList(0, 4);
	}

	private int checkSimilar(String imgName, String objName) {
		char[] arr = imgName.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (objName.contains("" + arr[i])) {
				count++;
			}
		}
		return count;
	}

	/**
	 * @return the topicID
	 */
	public String getTopicID() {
		return topicID;
	}

	/**
	 * @return the topicName
	 */
	public String getTopicName() {
		return topicName;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param topicName the topicName to set
	 */
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

}
