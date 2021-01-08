/**
 * @Project_Name 32_Ex2_Smart String
 */
package com.luvina.string.main;

import com.luvina.string.smart.SmartString;

/**
 * @author Hoang Anh
 * @since 30 thg 12, 2020
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {
		String txt = new String("<item>\r\n"
			+ " <title><![CDATA[Dự án cao cấp quận Long Biên đã trở lại đường đua]]></title>\r\n"
			+ " <link><![CDATA[http://dantri.com.vn/nha-dat/du-an-cao-cap-quan-long-bien-da-tro-lai-duong-dua-20170612104930159.htm]]></link>\r\n"
			+ " <guid isPermalink=\"false\"><![CDATA[aa072862-dc18-4bd6-8187-7cffe8e787c7]]></guid>\r\n"
			+ " <description><![CDATA[<a href=\"http://dantri.com.vn/nha-dat/du-an-cao-cap-quan-long-bien-da-tro-lai-duong-dua-20170612104930159.htm\">"
			+ " <img src=\"https://dantricdn.com/zoom/80_50/2017/untitled1-1497238454764.jpg\" /></a>]]></description>\r\n"
			+ " <pubDate><![CDATA[Mon, 12 Jun 2017 10:50:00 GMT+7]]></pubDate>\r\n"
			+ "</item>\r\n" + "<item>\r\n"
			+ " <title><![CDATA[Dùng ảnh người khác tạo tài khoản Facebook bị phạt 10-20 triệu đồng]]></title>\r\n"
			+ " <link><![CDATA[http://dantri.com.vn/suc-manh-so/dung-anh-nguoi-khac-tao-tai-khoan-facebook-bi-phat-10-20-trieu-dong-2017061210513045.htm]]></link>\r\n"
			+ " <guid isPermalink=\"false\"><![CDATA[f29f74f5-2194-4e17-a017-8382be0131f8]]></guid>\r\n"
			+ " <description><![CDATA[<a href=\"http://dantri.com.vn/suc-manh-so/dung-anh-nguoi-khac-tao-tai-khoan-facebook-bi-phat-10-20-trieu-dong-2017061210513045.htm\"><img src=\"https://dantricdn.com/zoom/80_50/2017/facebook-1497239322966.jpeg\" /></a>]]></description>\r\n"
			+ " <pubDate><![CDATA[Mon, 12 Jun 2017 10:50:00 GMT+7]]></pubDate>"
			+ "</item>\r\n"
		);

		SmartString smart = new SmartString(txt);

		smart.print(smart.filter());
	}

}
