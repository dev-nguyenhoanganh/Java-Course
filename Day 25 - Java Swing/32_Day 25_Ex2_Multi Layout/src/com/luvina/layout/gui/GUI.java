/**
 * @Project_Name 32_Day 25_Ex2_Multi Layout
 */
package com.luvina.layout.gui;

import javax.swing.JFrame;

import com.luvina.layout.gui.panel.Panel1;
import com.luvina.layout.gui.panel.Panel2;
import com.luvina.layout.gui.panel.Panel3;
import com.luvina.layout.gui.panel.Panel4;
import com.luvina.layout.gui.panel.Panel5;
import com.luvina.layout.gui.panel.Panel6;
import com.luvina.layout.gui.panel.Panel7;
import com.luvina.layout.gui.panel.Panel8;
import com.luvina.layout.gui.panel.Panel9;

/**
 * @author Hoang Anh
 * @since 15 thg 1, 2021
 * @version 1.0
 */
public class GUI extends JFrame implements IPanelAction {

	/**
	 * 
	 */
	public GUI() {
		addComponent();
		addEvent();
		init();
	}

	@Override
	public void init() {
		setTitle("Multi Layout Frame");
		setSize(516, 539);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
//		setLayout(new CardLayout());
//		setBackground(Color.darkGray);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void addComponent() {
		add(new Panel1());
		add(new Panel2());
		add(new Panel3());
		add(new Panel4());
		add(new Panel5());
		add(new Panel6());
		add(new Panel7());
		add(new Panel8());
		add(new Panel9());

	}

	@Override
	public void addEvent() {

	}

}
