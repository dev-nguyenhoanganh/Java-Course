/**
 * @Project_Name 32_Day 27_Ex2_Check Box
 */
package com.luvina.btvn.gui.panel;

import javax.swing.JPanel;

import com.luvina.btvn.gui.icommon.ICommon;

/**
 * @author Hoang Anh
 * @since 19 thg 1, 2021
 * @version 1.0
 */
public abstract class BasePanel extends JPanel implements ICommon {
	public BasePanel() {
		init();
		addComponent();
		addEvent();
	}
}
