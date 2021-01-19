package com.luvina.gui.panel;

import javax.swing.JPanel;

import com.luvina.gui.icommon.ICommon;

/**
 * 
 * @author Hoang Anh
 * @since 18 thg 1, 2021
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
