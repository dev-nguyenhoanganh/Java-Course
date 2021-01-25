/**
 * @Project_Name 32_Day 27_Ex2_RGB Color
 */
package com.luvina.btvn.gui.panel;

import java.awt.Color;

import com.luvina.btvn.gui.GUI;

/**
 * @author Hoang Anh
 * @since 20 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ColorPanel extends BasePanel {


	@Override
	public void init() {
		setSize(GUI.WIDTH, GUI.HEIGHT);
		setLocation(0, 0);
		setLayout(null);
		setBackground(Color.pink);
	}

	@Override
	public void addComponent() {

	}

	@Override
	public void addEvent() {

	}
}
