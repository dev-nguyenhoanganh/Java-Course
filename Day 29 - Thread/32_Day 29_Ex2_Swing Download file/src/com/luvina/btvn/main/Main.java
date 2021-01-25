/**
 * @Project_Name 32_Day 27_Ex2_RGB Color
 */
package com.luvina.btvn.main;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.luvina.btvn.gui.GUI;

/**
 * @author Hoang Anh
 * @since 20 thg 1, 2021
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// set look and feel to system dependent
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GUI().setVisible(true);
			}
		});
	}
}
