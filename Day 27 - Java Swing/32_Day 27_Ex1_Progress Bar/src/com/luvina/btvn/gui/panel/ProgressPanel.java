/**
 * @Project_Name 32_Day 27_Ex1_Progress Bar
 */
package com.luvina.btvn.gui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import com.luvina.btvn.gui.GUI;

/**
 * @author Hoang Anh
 * @since 19 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ProgressPanel extends BasePanel {
	private JLabel title;

	private JProgressBar progressBar;

	private static int TOP_MARGIN = 20;
	private static int TEXT_MARGIN = 3 * 2;

	private static int PROGRESS_BAR_WIDTH = 350;
	private static int PROGRESS_BAR_HEIGHT = 50;

	@Override
	public void init() {
		setSize(GUI.WIDTH, GUI.HEIGHT);
		setVisible(true);
		setLocation(0, 0);
		setLayout(null);

		// Light Yellow Color
		setBackground(new Color(239, 252, 197));
	}

	@Override
	public void addComponent() {
		Font font = new Font("Tahoma", Font.PLAIN, 20);
		FontMetrics fm = getFontMetrics(font);

		// Title
		title = new JLabel("Progress Bar");
		int titleWidth = fm.stringWidth(title.getText());
		title = (JLabel) setComponent(
				title, 
				GUI.WIDTH / 2 - titleWidth / 2,
				TOP_MARGIN, 
				titleWidth, 
				fm.getHeight() + TEXT_MARGIN, 
				font);

		// Progress Bar
		progressBar = new JProgressBar();
		progressBar.setMaximum(1000);
		progressBar.setForeground(new Color(39, 145, 232));
		progressBar.setStringPainted(true);

		progressBar = (JProgressBar) setComponent(
				progressBar, 
				GUI.WIDTH / 2 - PROGRESS_BAR_WIDTH / 2, 
				title.getY() + TOP_MARGIN + title.getHeight(), 
				PROGRESS_BAR_WIDTH, 
				PROGRESS_BAR_HEIGHT, 
				font);

		System.out.println("JLabel :");
		System.out.println("X : " + title.getX() + "\tY : " + title.getY());
		
		System.out.println("JProgress :");
		System.out.println("X : " + progressBar.getX() + "\tY : " + progressBar.getY());
	}

	@Override
	public void addEvent() {
		mouseEvent();
	}

	// ---------------------- Private Layer ----------------------

	/**
	 * 
	 */
	private void mouseEvent() {
		MouseAdapter mouse = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int value = progressBar.getValue() + 100;
				if (value > progressBar.getMaximum()) {
					value = progressBar.getMinimum();
				}
				progressBar.setValue(value);
			}
		};
		progressBar.addMouseListener(mouse);
	}

	private JComponent setComponent(JComponent com, int x, int y, int width, int height, Font font) {
		com.setFont(font);
		com.setSize(width, height);
		com.setLocation(x, y);
		add(com);

		return com;
	}
}
