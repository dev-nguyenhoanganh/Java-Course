/**
 * @Project_Name 32_Day 25_Ex2_Multi Layout
 */
package com.luvina.layout.gui.panel;

import javax.swing.JPanel;

import com.luvina.layout.gui.IPanelAction;

/**
 * @author Hoang Anh
 * @since 15 thg 1, 2021
 * @version 1.0
 */
public abstract class BasePanel extends JPanel implements IPanelAction {

	/**
	 * 
	 */
	public BasePanel() {
		init();
		addComponent();
		addEvent();
	}
}
