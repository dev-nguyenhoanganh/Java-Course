/**
 * @Project_Name 32_Day 27_Ex1_Progress Bar
 */
package com.luvina.btvn.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.luvina.btvn.gui.icomon.ICommon;
import com.luvina.btvn.gui.panel.ProgressPanel;

/**
 * @author Hoang Anh
 * @since 19 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class GUI extends JFrame implements ICommon {
	public static final int WIDTH = 500;
	public static final int HEIGHT = 200;

	private ProgressPanel progressPanel;

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
		setTitle("Progress Bar");
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	@Override
	public void addComponent() {
		progressPanel = new ProgressPanel();
		add(progressPanel);
	}

	@Override
	public void addEvent() {
		windowEvent();
	}

	// ---------------------- Private Layer ----------------------

	/**
	 * 
	 */
	private void windowEvent() {
		WindowAdapter window = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn tắt không", "Xác nhận",
						JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION) {
					dispose();
				} 
			}
		};

		addWindowListener(window);
	}
}
