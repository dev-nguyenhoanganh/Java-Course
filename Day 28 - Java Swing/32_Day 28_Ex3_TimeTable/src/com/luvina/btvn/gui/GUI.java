/**
 * @Project_Name 32_Day 27_Ex2_RGB Color
 */
package com.luvina.btvn.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.luvina.btvn.gui.icommon.IChangeColor;
import com.luvina.btvn.gui.icommon.ICommon;
import com.luvina.btvn.gui.panel.TablePanel;

/**
 * @author Hoang Anh
 * @since 20 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class GUI extends JFrame implements ICommon, IChangeColor {
	public static final int WIDTH = 650 + 16;
	public static final int HEIGHT = 500 + 39;

	public static final Font fontHeader = new Font("Calibri", Font.BOLD, 36);
	public static final Font fontNormal = new Font("Calibri", Font.PLAIN, 16);

	private TablePanel tablePanel;

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
		setTitle("Time Table");
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	@Override
	public void addComponent() {
		tablePanel = new TablePanel();
		add(tablePanel);
	}

	@Override
	public void addEvent() {
		windowListen();
	}

	@Override
	public void changeColor(Color newColor) {

	}

	// ------------------------ Private layer ------------------------

	private void windowListen() {
		WindowAdapter window = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không?", "Xác nhận thoát",
						JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		}; 
		addWindowListener(window);;
	}

}
