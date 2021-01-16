/**
 * @Project_Name Sample
 */
package com.luvina.sample.gui.panel;

import javax.swing.JPanel;

import com.luvina.sample.gui.ICommon;

/**
 * @author Hoang Anh
 * @since 14 thg 1, 2021
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
