/**
 * @Project_Name 32_Day 27_Ex2_RGB Color
 */
package com.luvina.btvn.gui.panel;

import java.awt.Color;

import com.luvina.btvn.gui.GUI;
import com.luvina.btvn.gui.icommon.IChangeColor;

/**
 * @author Hoang Anh
 * @since 20 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class MainPanel extends BasePanel {

	private ColorPanel colorPanel;
	private checkBoxPanel checkboxPanel;

	@Override
	public void init() {
		setSize(GUI.WIDTH, GUI.HEIGHT);
		setLocation(0, 0);
		setLayout(null);
	}

	@Override
	public void addComponent() {
		// CheckBox panel
		checkboxPanel = new checkBoxPanel();

		// Color Panel
		colorPanel = new ColorPanel();

		add(checkboxPanel);
		add(colorPanel);


	}

	@Override
	public void addEvent() {

	}

	public void addGUI(IChangeColor event) {
		checkboxPanel.addGUI(event);
	}

	/**
	 * @param newColor
	 */
	public void changeColor(Color newColor) {
		this.colorPanel.setVisible(false);
		this.colorPanel.setBackground(newColor);
		this.colorPanel.setVisible(true);
	}

}
