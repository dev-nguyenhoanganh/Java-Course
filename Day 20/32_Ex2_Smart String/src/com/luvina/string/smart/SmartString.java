/**
 * @Project_Name 32_Ex2_Smart String
 */
package com.luvina.string.smart;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.luvina.string.news.News;

/**
 * @author Hoang Anh
 * @since 30 thg 12, 2020
 * @version 1.0
 */
public class SmartString {
	// Khai báo hằng
	private static final String TITLE_OPEN_REGEX  = "<title><!\\[CDATA\\[";
	private static final String TITLE_CLOSE_REGEX = "\\]\\]><\\/title>";
	private static final String LINK_OPEN_REGEX   = "<link><!\\[CDATA\\[";
	private static final String LINK_CLOSE_REGEX  = "\\]\\]><\\/link>";
	private static final String IMG_OPEN_REGEX 	  = "<img src\\=\\\"";
	private static final String IMG_CLOSE_REGEX   = "\\\" \\/>";
	private static final String DATE_OPEN_REGEX   = "<pubDate><!\\[CDATA\\[";
	private static final String DATE_CLOSE_REGEX  = "]]></pubDate>";

	// Khai báo thuộc tính
	private String text;

	/**
	 * Phương thức khởi tạo giá trị cho đối tượng SmartString
	 * 
	 * @param text - giá trị của truyền vào cho thuộc tính `text`
	 */
	public SmartString(String text) {
		this.text = text;
	}
	
	/**
	 * Phương thức in ra một danh sách chứa các đối tượng News
	 * 
	 * @param list - Danh sách cần in
	 */
	public void print(ArrayList<News> list) {
		if (list.isEmpty()) {
			System.out.println("List rỗng");
		} else {
			int idx = 0;
			for (News news : list) {
				System.out.println("------------------- Item " + (++idx) + " -------------------");
				System.out.println(news.toString());
			}
		}
	}

	/**
	 * Phương thức tìm và lọc trong đoạn text ra danh sách các đối tượng
	 * News
	 * 
	 * @return Danh sách gồm các đối tượng News
	 */
	public ArrayList<News> filter() {
		ArrayList<News> list = new ArrayList<News>();

		String itemList[] = text.split("<item>\r\n");

		for (int i = 0; i < itemList.length; i++) {
			if (!itemList[i].trim().isEmpty() && itemList[i].contains("</item>")) {
				list.add(getItemInformation(itemList[i]));
			}
		}

		return list;
	}

	/**
	 * Phương thức tìm kiếm và trả về đối tượng News mới gồm các giá trị
	 * thuộc tính được tìm thấy bên trong item
	 * 
	 * @param item - chứa các thông tin của một đối tượng new
	 * @return Một thực thể News mới chứa các giá trị thuộc tính được tìm
	 *         thấy bên trong item
	 */
	public News getItemInformation(String item) {
		String[] result = new String[4];
		result[0] = getTitle(item);
		result[1] = getLink(item);
		result[2] = getImg(item);
		result[3] = getDate(item);

		return new News(result[0], result[1], result[2], result[3]);
	}

	/**
	 * Phương thức tìm kiếm và trả về giá trị của thuộc tính `title` từ
	 * chuỗi item ban đầu
	 * 
	 * @param item - chứa các thông tin của một đối tượng new
	 * @return Giá trị của thuộc tính `title`
	 */
	private String getTitle(String item) {
		String titleRegex = TITLE_OPEN_REGEX + "(.*)" + TITLE_CLOSE_REGEX;

		// Khởi tạo thực thể pattern
		Pattern r = Pattern.compile(titleRegex);

		// Tạo thực thể matcher
		Matcher m = r.matcher(item);

		if (m.find()) {
			return m.group(1);
		}
		return "Not Found";
	}

	/**
	 * Phương thức tìm kiếm và trả về giá trị của thuộc tính `link` từ
	 * chuỗi item ban đầu
	 * 
	 * @param item - chứa các thông tin của một đối tượng new
	 * @return Giá trị của thuộc tính `link`
	 */
	private String getLink(String item) {
		String linkRegex = LINK_OPEN_REGEX + "(.*)" + LINK_CLOSE_REGEX;

		// Khởi tạo thực thể pattern
		Pattern r = Pattern.compile(linkRegex);

		// Tạo thực thể matcher
		Matcher m = r.matcher(item);

		if (m.find()) {
			return m.group(1);
		}
		return "Not Found";
	}

	/**
	 * Phương thức tìm kiếm và trả về giá trị của thuộc tính `img` từ
	 * chuỗi item ban đầu
	 * 
	 * @param item - chứa các thông tin của một đối tượng new
	 * @return Giá trị của thuộc tính `img`
	 */
	private String getImg(String item) {
		String imgRegex = IMG_OPEN_REGEX + "(.*)" + IMG_CLOSE_REGEX;
		// Khởi tạo thực thể pattern
		Pattern r = Pattern.compile(imgRegex);

		// Tạo thực thể matcher
		Matcher m = r.matcher(item);

		if (m.find()) {
			return m.group(1);
		}
		return "Not Found";
	}

	/**
	 * Phương thức tìm kiếm và trả về giá trị của thuộc tính `date` từ
	 * chuỗi item ban đầu
	 * 
	 * @param item - chứa các thông tin của một đối tượng new
	 * @return Giá trị của thuộc tính `date`
	 */
	private String getDate(String item) {
		String dateRegex = DATE_OPEN_REGEX + "(.*)" + DATE_CLOSE_REGEX;

		// Khởi tạo thực thể pattern
		Pattern r = Pattern.compile(dateRegex);

		// Tạo thực thể matcher
		Matcher m = r.matcher(item);

		if (m.find()) {
			return m.group(1);
		}
		return "Not Found";
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
}
