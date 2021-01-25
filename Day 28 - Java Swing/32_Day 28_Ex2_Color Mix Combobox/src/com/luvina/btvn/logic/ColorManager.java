/**
 * @Project_Name 32_Day 28_Ex1_Color Mix
 */
package com.luvina.btvn.logic;

import java.awt.Color;
import java.util.ArrayList;

/**
 * @author Hoang Anh
 * @since 23 thg 1, 2021
 * @version 1.0
 */
public class ColorManager {
	ArrayList<ItemColor> listColor;


	/**
	 * 
	 */
	public ColorManager() {
		listColor = new ArrayList<ItemColor>();

	}

	/**
	 * 
	 */
	public void initListColor() {
		listColor.add(new ItemColor("Đỏ", Color.red));
		listColor.add(new ItemColor("Da trời", Color.blue));
		listColor.add(new ItemColor("Vàng", Color.yellow));
		listColor.add(new ItemColor("Lá cây", Color.green));
		listColor.add(new ItemColor("Mận đỏ", new Color(207, 8, 15)));
		listColor.add(new ItemColor("Hồng", Color.pink));
	}

	/**
	 * @return the listColor
	 */
	public ArrayList<ItemColor> getListColor() {
		return listColor;
	}
}
