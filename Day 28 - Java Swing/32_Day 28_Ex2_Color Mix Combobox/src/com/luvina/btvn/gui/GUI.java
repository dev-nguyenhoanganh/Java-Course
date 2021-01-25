/**
 * @Project_Name 32_Day 27_Ex3_Phan Tich Nhan Tu
 */
package com.luvina.btvn.gui;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.luvina.btvn.gui.icommon.IChangeColor;
import com.luvina.btvn.gui.icommon.ICommon;
import com.luvina.btvn.gui.panel.ColorPanel;

/**
 * @author Hoang Anh
 * @since 20 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class GUI extends JFrame implements ICommon, IChangeColor {
	public static final int WIDTH = 600 + 16;
	public static final int HEIGHT = 300 + 39;

	public static final Color groundColor = new Color(219, 245, 176);


	private ColorPanel colorPanel;


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
		setTitle("Factor Finder");
		setSize(GUI.WIDTH, GUI.HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);

	}

	@Override
	public void addComponent() {
		colorPanel = new ColorPanel();
		colorPanel.addGUI(this);
		add(colorPanel);
	}

	@Override
	public void addEvent() {
		windowListen();

	}

	@Override
	public void changeColor(Color color) {
		getContentPane().setBackground(color);
	}

	// ------------------------ Private Layer ------------------------

	private void windowListen() {
		WindowAdapter window = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không?", "Xác nhận thoát",
						JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		};
		addWindowListener(window);
	}

}
