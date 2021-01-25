/**
 * @Project_Name 32_Day 27_Ex2_Check Box
 */
package com.luvina.btvn.gui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
/**
 * @author Hoang Anh
 * @since 19 thg 1, 2021
 * @version 1.0
 */
import javax.swing.JLabel;

import com.luvina.btvn.gui.GUI;

@SuppressWarnings("serial")
public class CheckBoxPanel extends BasePanel {
	
	private static final int TOP_MARGIN = 35;
	private static final int TEXT_MARGIN = 6;

	private JCheckBox cbHappy;
	private JCheckBox cbSad;

	private JLabel lbResult;
	
	@Override
	public void init() {
		setSize(GUI.WIDTH, GUI.HEIGHT);
		setLocation(0, 0);
		setBackground(Color.pink);
		setLayout(null);

	}

	@Override
	public void addComponent() {
		Font fontNormal = new Font("Tahoma", Font.PLAIN, 20);
		FontMetrics fm = getFontMetrics(fontNormal);

		// cbHappy
		cbHappy = new JCheckBox("Happy");
		cbHappy.setFont(fontNormal);
		cbHappy.setSize(cbHappy.getPreferredSize());
		cbHappy.setLocation(GUI.WIDTH / 2 - cbHappy.getWidth() - TOP_MARGIN, 20);
		add(cbHappy);

		// cbHappy
		cbSad = new JCheckBox("Sad");
		cbSad.setFont(fontNormal);
		cbSad.setSize(cbSad.getPreferredSize());
		cbSad.setLocation(GUI.WIDTH / 2 + TOP_MARGIN, 20);
		add(cbSad);

		// lbResult
		lbResult = new JLabel("");
		lbResult.setFont(fontNormal);
		lbResult.setSize(fm.stringWidth("Happy is checked"), fm.getHeight() + TEXT_MARGIN);
		lbResult.setLocation(GUI.WIDTH / 2 - lbResult.getWidth() / 2,
				cbHappy.getY() + TOP_MARGIN + cbHappy.getHeight());
		add(lbResult);

	}

	@Override
	public void addEvent() {
		checkboxAction();
	}

	// ---------------------- Private Layer ----------------------

	/**
	 * 
	 */
	private void checkboxAction() {
		cbHappy.setName("Happy");
		cbSad.setName("Sad");

		ActionListener action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = ((JCheckBox) e.getSource()).getName();
				if ("Happy".equals(name)) {
					if (cbHappy.isSelected()) {
						lbResult.setText("Happy is checked");
						cbSad.setSelected(false);
					} else {
						lbResult.setText("");
					}
				} else {
					if ("Sad".equals(name)) {
						if (cbSad.isSelected()) {
							lbResult.setText("Sad is checked");
							cbHappy.setSelected(false);
						} else {
							lbResult.setText("");
						}
					}
				}

			}
		};
		cbHappy.addActionListener(action);
		cbSad.addActionListener(action);
	}

}
