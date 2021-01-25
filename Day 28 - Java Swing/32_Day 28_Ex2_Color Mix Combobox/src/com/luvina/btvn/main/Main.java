/**
 * @Project_Name 32_Day 27_Ex3_Phan Tich Nhan Tu
 */
package com.luvina.btvn.main;

import java.awt.EventQueue;

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

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				GUI gui = new GUI();
				gui.setVisible(true);
//				try {
//					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
//						| UnsupportedLookAndFeelException e) {
//					e.printStackTrace();
//				}
//				SwingUtilities.updateComponentTreeUI(gui);
			}
		});


	}
}
