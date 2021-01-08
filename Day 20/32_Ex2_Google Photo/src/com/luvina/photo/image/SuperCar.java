/**
 * @Project_Name 32_Ex2_Google Photo
 */
package com.luvina.photo.image;

/**
 * @author Hoang Anh
 * @since 4 thg 1, 2021
 * @version 1.0
 */
public class SuperCar extends Image {
	private String carName;
	private String brand; // Thương hiệu
	private String price; // Giá bán

	/**
	 * 
	 */
	public SuperCar(String imageID, String imageName, String imageLink, String dimension, String carName,
			String brand, String price) {
		super(imageID, imageName, imageLink, dimension);
		this.carName = carName;
		this.brand   = brand;
		this.price   = price;
	}

	@Override
	public String toString() {
		return super.toString()
			+ "\nĐặc điểm của ảnh"
			+ "\nTên xe 	 : " + this.carName
			+ "\nThương hiệu : " + this.brand
			+ "\n Giá bán 	 : " + this.price
		;
	}

	/**
	 * @return the carName
	 */
	public String getCarName() {
		return carName;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
}
