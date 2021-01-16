/**
 * @Project_Name Sample
 */
package com.luvina.sample.gui;

import javax.swing.JFrame;

import com.luvina.sample.gui.panel.SignUpPage;

/**
 * @author Hoang Anh
 * @since 14 thg 1, 2021
 * @version 1.0
 */
public class GUI extends JFrame implements ICommon {
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;

	private SignUpPage signUp;

	/**
	 * 
	 */
	public GUI() {
		init();
		addComponent();
		addEvent();
	}

	@Override
	public void init() {
		setTitle("Quản lý sinh viên");
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
//		setLayout(null);
	}

	@Override
	public void addComponent() {
		signUp = new SignUpPage();
		add(signUp);
	}

	@Override
	public void addEvent() {

	}
}
