/**
 * @Project_Name 32_Day 27_Ex2_RGB Color
 */
package com.luvina.btvn.gui.panel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;

import com.luvina.btvn.gui.GUI;
import com.luvina.btvn.gui.icommon.IChangeColor;

/**
 * @author Hoang Anh
 * @since 20 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class checkBoxPanel extends BasePanel {

	private static final int MARGIN_TOP = 25;
	private static final int MARGIN_LEFT = 20;
	private static final int COLOR_DEPTH = 255;

	private IChangeColor event;
	private JCheckBox cbRed;
	private JCheckBox cbBlue;
	private JCheckBox cbGreen;

	private int red = 0;
	private int green = 0;
	private int blue = 0;

	public void addGUI(IChangeColor event) {
		this.event = event;
	}

	@Override
	public void init() {
		setSize(200, 200);
		setLayout(null);
		setLocation(150, 90);
//		setBackground(Color.green);
	}

	@Override
	public void addComponent() {
//		FontMetrics fm = getFontMetrics(GUI.fontNormal);
		
		cbRed = new JCheckBox("Red");
		cbRed.setFont(GUI.fontNormal);
		cbRed.setSize(cbRed.getPreferredSize());
		cbRed.setLocation(MARGIN_LEFT, MARGIN_TOP);

		cbBlue = new JCheckBox("Blue");
		cbBlue.setFont(GUI.fontNormal);
		cbBlue.setSize(cbBlue.getPreferredSize());
		cbBlue.setLocation(MARGIN_LEFT, MARGIN_TOP + cbRed.getY() + cbRed.getHeight());

		cbGreen = new JCheckBox("Green");
		cbGreen.setFont(GUI.fontNormal);
		cbGreen.setSize(cbGreen.getPreferredSize());
		cbGreen.setLocation(MARGIN_LEFT, MARGIN_TOP + cbBlue.getY() + cbBlue.getHeight());

		add(cbRed);
		add(cbBlue);
		add(cbGreen);

	}

	@Override
	public void addEvent() {
		checkBoxAction();
	}

	// ------------------------ Private layer ------------------------

	/**
	 * 
	 */
	private void changeColor(int red, int green, int blue) {
		if (red == 0 && green == 0 && blue == 0) {
			event.changeColor(Color.pink);
		} else {
			event.changeColor(new Color(red, green, blue));
		}
	}

	/**
	 * 
	 */
	private void checkBoxAction() {
		cbRed.setName("red");
		cbGreen.setName("green");
		cbBlue.setName("blue");

		ActionListener action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = ((JCheckBox) e.getSource()).getName();
				switch (name) {
				case   "red":
					red   = cbRed.isSelected()   ? COLOR_DEPTH : 0;
					break;
				case "green":
					green = cbGreen.isSelected() ? COLOR_DEPTH : 0;
					break;
				case  "blue":
					blue  = cbBlue.isSelected()  ? COLOR_DEPTH : 0;
					break;
				}
				changeColor(red, green, blue);
			}
		};

		cbRed.addActionListener(action);
		cbGreen.addActionListener(action);
		cbBlue.addActionListener(action);
	}
}
