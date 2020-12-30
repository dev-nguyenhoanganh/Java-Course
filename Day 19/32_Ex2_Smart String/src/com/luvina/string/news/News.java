/**
 * @Project_Name 32_Ex2_Smart String
 */
package com.luvina.string.news;

/**
 * @author Hoang Anh
 * @since 30 thg 12, 2020
 * @version 1.0
 */
public class News {
	private String title;
	private String linkDetail;
	private String imgLink;
	private String date;

	/**
	 * 
	 */
	public News(String title, String linkDetail, String imgLink, String date) {
		this.title 		= title;
		this.linkDetail = linkDetail;
		this.imgLink 	= imgLink;
		this.date 		= date;
	}

	@Override
	public String toString() {
		return "Title: " 		 + title 		+ 
				"\nLinkDetail: " + linkDetail 	+ 
				"\nImageLink: "  + imgLink 		+ 
				"\nDate: "		 + date;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the linkDetail
	 */
	public String getLinkDetail() {
		return linkDetail;
	}

	/**
	 * @return the imgLink
	 */
	public String getImgLink() {
		return imgLink;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

}
