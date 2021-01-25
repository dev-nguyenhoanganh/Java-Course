/**
 * @Project_Name 32_Day 27_Ex3_Phan Tich Nhan Tu
 */
package com.luvina.btvn.logic;

import java.awt.Color;

/**
 * @author Hoang Anh
 * @since 20 thg 1, 2021
 * @version 1.0
 */
public class ItemColor {

	String name;
	Color color;

	/**
	 * 
	 */
	public ItemColor(String name, Color color) {
		this.name = name;
		this.color = color;
	}

	@Override
	public String toString() {

		return this.name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}


}
