/**
 * @Project_Name 32_Day 27_Ex3_Phan Tich Nhan Tu
 */
package com.luvina.btvn.gui;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.luvina.btvn.gui.icommon.ICommon;
import com.luvina.btvn.gui.icommon.IFindFactor;
import com.luvina.btvn.gui.panel.FactorPanel;
import com.luvina.btvn.logic.FactorFinder;

/**
 * @author Hoang Anh
 * @since 20 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class GUI extends JFrame implements ICommon, IFindFactor {
	public static final int WIDTH = 500 + 16;
	public static final int HEIGHT = 500 + 32;

	public static final Color groundColor = new Color(219, 245, 176);


	private FactorPanel factorPanel;
	private FactorFinder factorFinder;

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
		
		

		setTitle("Factor Finder");
		setSize(GUI.WIDTH, GUI.HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);

	}

	@Override
	public void addComponent() {
		factorPanel = new FactorPanel();
		factorPanel.addGUI(this);
		add(factorPanel);
	}

	@Override
	public void addEvent() {
		windowListen();

	}

	@Override
	public String findFactor(String number) {
		factorFinder = new FactorFinder();
		if (factorFinder.setNumber(number)) {
			return factorFinder.findFactor();
		}
		return null;
	}

	@Override
	public boolean writeToFile() {
		if (factorFinder == null) {
			return false;
		}

		return factorFinder.writeToFile();
	}

	@Override
	public boolean writeToFile(String data) {
		if (factorFinder == null) {
			return false;
		}
		return factorFinder.writeToFile(data);
	}

	// ------------------------ Private Layer ------------------------

	private void windowListen() {
		WindowAdapter window = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không?", "Xác nhận thoát",
						JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		};
		addWindowListener(window);
	}

}
