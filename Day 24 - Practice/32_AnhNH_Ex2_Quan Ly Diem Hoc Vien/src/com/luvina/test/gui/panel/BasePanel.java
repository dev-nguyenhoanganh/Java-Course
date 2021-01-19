/**
 * @Project_Name 32_AnhNH_Ex2_Quan Ly Diem Hoc Vien
 */
package com.luvina.test.gui.panel;

import javax.swing.JPanel;

import com.luvina.test.gui.igui.ICommon;

/**
 * @author Hoang Anh
 * @since 18 thg 1, 2021
 * @version 1.0
 */
public abstract class BasePanel extends JPanel implements ICommon {

	public BasePanel() {
		init();
		addComponent();
		addEvent();
	}

}
