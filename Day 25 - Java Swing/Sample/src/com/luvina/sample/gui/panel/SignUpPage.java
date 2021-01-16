/**
 * @Project_Name Sample
 */
package com.luvina.sample.gui.panel;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Hoang Anh
 * @since 14 thg 1, 2021
 * @version 1.0
 */
public class SignUpPage extends BasePanel {

	@Override
	public void init() {
		setSize(200, 200);
		setLocation(0, 0);
		setBackground(Color.ORANGE);

		setVisible(true);
	}

	@Override
	public void addComponent() {
		// TODO Auto-generated method stub
//		JTextComponent text = ;
	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub
//		WindowAdapter wa = new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				int result = JOptionPane.showConfirmDialog(parentComponent, message)
//			}
//		};

		MouseAdapter mouse = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int r = (int) (Math.random() * 255);
				int g = (int) (Math.random() * 255);
				int b = (int) (Math.random() * 255);
				setBackground(new Color(r, g, b));
			}
		};

		addMouseListener(mouse);
	}

}
