package com.luvina.btvn.gui;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.luvina.btvn.gui.icommon.ICommon;
import com.luvina.btvn.gui.panel.DownloadPanel;

public class GUI extends JFrame implements ICommon {
	public static final int WIDTH = 500;
	public static final int HEIGHT = 300 + 39;

	public static final Font fontHeader = new Font("Calibri", Font.BOLD, 36);
	public static final Font fontNormal = new Font("Calibri", Font.PLAIN, 16);


	private DownloadPanel downloadPanel;

	public GUI() {
		init();
		addComponent();
		addEvent();

	}

	@Override
	public void init() {
		// init
		setTitle("Download HTTP");
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	@Override
	public void addComponent() {
		// add conponent
		downloadPanel = new DownloadPanel();

		add(downloadPanel);
	}

	@Override
	public void addEvent() {
		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Bạn đã chắc chắn chưa?", "Xác nhận",
						JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		};
		addWindowListener(wa);

	}

}
