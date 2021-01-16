/**
 * @Project_Name 32_Day 25_Ex2_Multi Layout
 */
package com.luvina.layout.gui.panel;

import java.awt.Color;

import com.luvina.layout.gui.IPanelAction;

/**
 * @author Hoang Anh
 * @since 15 thg 1, 2021
 * @version 1.0
 */
public class Panel1 extends BasePanel implements IPanelAction {

	@Override
	public void init() {
		setSize(100, 100);
		setLocation(0, 0);
		setBackground(Color.red);

	}

	@Override
	public void addComponent() {


	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub

	}
}
