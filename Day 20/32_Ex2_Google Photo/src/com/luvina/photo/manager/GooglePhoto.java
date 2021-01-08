/**
 * @Project_Name 32_Ex2_Google Photo
 */
package com.luvina.photo.manager;

import java.util.ArrayList;

import com.luvina.photo.topic.Topic;

/**
 * @author Hoang Anh
 * @since 3 thg 1, 2021
 * @version 1.0
 */
public class GooglePhoto {
	private ArrayList<Topic> topicList;

	/**
	 * 
	 */
	public GooglePhoto() {
		topicList = new ArrayList<Topic>();
	}

	public String addTopic(Topic newTopic) {
		if (topicList.contains(newTopic)) {
			return "Đã tồn tại chủ đề này";
		} else {
			topicList.add(newTopic);
		}
		return "Thêm thành công";
	}

	public String modifyTopic(String topicID, String nameOrDate) {
		if (nameOrDate.isEmpty() || topicID.isEmpty()) {
			return "Dữ liệu nhập vào không hợp lệ";
		}

		for (int i = 0; i < topicList.size(); i++) {
			Topic temp = topicList.get(i);
			if (topicID.equals(temp.getTopicID())) {
				if (nameOrDate.matches("\\d{1,2}\\W\\d{1,2}\\W\\d{4}")) {
					temp.setDate(nameOrDate);
				} else {
					temp.setTopicName(nameOrDate);
				}
				return "Sửa thành công";
			}
		}
		return "Không tồn tại chủ đề có ID tương ứng";
	}

	public String removeTopic(String topicID) {
		if (topicList.isEmpty()) {
			return "Danh sách hiện đang rỗng không có gì để xóa";
		} else {
			for (int i = 0; i < topicList.size(); i++) {
				if (topicID.equals(topicList.get(i).getTopicID())) {
					topicList.remove(i);
					return "Xóa thành công";
				}
			}
		}
		return "Không tồn tại ID chủ đề này";
	}

	public String removeImage(String imageID) {
		for (Topic topic : topicList) {
			String result = topic.removeImage(imageID);
			if ("Xóa thành công".equals(result)) {
				return "Xóa thành công";
			}
		}
		return "Xóa không thành công";
	}

	public ArrayList<Topic> findTopic(String topicName) {

		return null;
	}
	// ----------------- Private Layer -----------------


}
