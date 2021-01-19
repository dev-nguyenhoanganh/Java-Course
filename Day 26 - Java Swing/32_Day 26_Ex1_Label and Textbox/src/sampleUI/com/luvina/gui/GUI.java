/**
 * @Project_Name 32_Day 26_Ex1_Label and Textbox
 */
package sampleUI.com.luvina.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import sampleUI.com.luvina.gui.icommon.ICommon;
import sampleUI.com.luvina.gui.panel.DisplayPassword;

/**
 * 
 * @author Hoang Anh
 * @since 18 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class GUI extends JFrame implements ICommon {
	public static final int WIDTH = 498;
	public static final int HEIGHT = 187;
	private DisplayPassword panelSample;

	public GUI() {
		init();
		addComponent();
		addEvent();

	}

	@Override
	public void init() {
		// init
		setTitle("Giai PTB2");
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	@Override
	public void addComponent() {
		// add conponent
		panelSample = new DisplayPassword();
		add(panelSample);

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
