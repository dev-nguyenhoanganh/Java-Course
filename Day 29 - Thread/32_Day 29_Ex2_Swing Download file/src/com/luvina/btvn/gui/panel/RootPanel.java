/**
 * @Project_Name 32_Day 27_Ex2_RGB Color
 */
package com.luvina.btvn.gui.panel;

import javax.swing.JPanel;

import com.luvina.btvn.gui.icommon.ICommon;

/**
 * @author Hoang Anh
 * @since 20 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public abstract class RootPanel extends JPanel implements ICommon {

	public RootPanel() {
		init();
		addComponent();
		addEvent();
	}
}
