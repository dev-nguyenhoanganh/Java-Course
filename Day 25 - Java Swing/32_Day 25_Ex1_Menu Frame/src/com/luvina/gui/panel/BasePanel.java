/**
 * @Project_Name 32_Day 25_Ex1_Menu Frame
 */
package com.luvina.gui.panel;

import javax.swing.JPanel;

import com.luvina.gui.ICommon;

/**
 * @author Hoang Anh
 * @since 15 thg 1, 2021
 * @version 1.0
 */
public abstract class BasePanel extends JPanel implements ICommon {

	/**
	 * 
	 */
	public BasePanel() {
		init();
		addComponent();
		addEvent();
	}

}
