/**
 * @Project_Name 32_Day 27_Ex3_Phan Tich Nhan Tu
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
public abstract class BasePanel extends JPanel implements ICommon {
	public BasePanel() {
		init();
		addComponent();
		addEvent();
	}
}
