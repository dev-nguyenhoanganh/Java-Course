/**
 * @Project_Name 32_Day 27_Ex2_Check Box
 */
package com.luvina.btvn.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.luvina.btvn.gui.icommon.ICommon;
import com.luvina.btvn.gui.panel.CheckBoxPanel;

/**
 * @author Hoang Anh
 * @since 19 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class GUI extends JFrame implements ICommon {
	public static final int WIDTH = 500;
	public static final int HEIGHT = 280;

	private CheckBoxPanel checkBoxPanel;

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
		setTitle("Check Box");
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	@Override
	public void addComponent() {
		checkBoxPanel = new CheckBoxPanel();
		add(checkBoxPanel);
	}

	@Override
	public void addEvent() {
		windowEvent();

	}

	// ---------------------- Private Layer ----------------------

	private void windowEvent() {
		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Bạn muốn thoát chương trình không?", "Xác nhận",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		};
		addWindowListener(wa);
	}

}
