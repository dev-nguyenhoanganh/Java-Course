/**
 * @Project_Name 32_Day 25_Ex1_Menu Frame
 */
package com.luvina.gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * @author Hoang Anh
 * @since 15 thg 1, 2021
 * @version 1.0
 */
public class GUI extends JFrame implements ICommon {

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
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(new CardLayout());
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void addComponent() {
		JLabel label = new JLabel();
		label.setText("This is a Swing Frame");
		label.setFont(new Font("Calibri", Font.PLAIN, 20));
		label.setForeground(new Color(0x0));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);

		add(label);
	}

	@Override
	public void addEvent() {
		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn tắt không?", "Xác nhận",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					dispose();
				} else {
					setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				}
			}
		};
		addWindowListener(wa);

	}


}
