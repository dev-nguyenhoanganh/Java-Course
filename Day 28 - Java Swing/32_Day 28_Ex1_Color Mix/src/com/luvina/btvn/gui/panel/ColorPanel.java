/**
 * @Project_Name 32_Day 27_Ex3_Phan Tich Nhan Tu
 */
package com.luvina.btvn.gui.panel;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import com.luvina.btvn.gui.GUI;
import com.luvina.btvn.gui.icommon.IChangeColor;
import com.luvina.btvn.logic.ColorManager;
import com.luvina.btvn.logic.ItemColor;

/**
 * @author Hoang Anh
 * @since 20 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ColorPanel extends BasePanel {
	private JLabel lbNumber;

	private JTextField tfNumber;

	private JButton btMix;
	private JList colorList;
	private DefaultListModel<ItemColor> modelList;
	private ColorManager manager;

	private IChangeColor event;

	private static final int TEXT_MARGIN = 10;
	private static final int TOP_MARGIN = 20;
	private static final int LEFT_MARGIN = 20;

	private static final int BUTTON_WIDTH = 150;


	public static final Font fontHeader = new Font("Calibri", Font.BOLD, 30);
	public static final Font fontNormal = new Font("Calibri", Font.PLAIN, 20);


	public void addGUI(IChangeColor event) {
		this.event = event;
	}

	@Override
	public void init() {
		setSize(400, GUI.HEIGHT);
		setLocation(0, 0);
		setBackground(GUI.groundColor);
		setLayout(null);

	}

	@Override
	public void addComponent() {
		FontMetrics fm = getFontMetrics(fontNormal);
		int textHeight = fm.getHeight() + TEXT_MARGIN;

		// colorList
		colorList = new JList<ItemColor>();
		updateModelList();
		colorList.setLayoutOrientation(JList.VERTICAL_WRAP);
		colorList.setVisibleRowCount(3);
		colorList.setFixedCellHeight(textHeight);
		colorList.setFixedCellWidth(100);
		setFont(fontNormal);
		colorList.setSize(200, 100);
		colorList.setLocation(LEFT_MARGIN, TOP_MARGIN);

		// btCaculate
		btMix = new JButton("Pha");
		btMix = (JButton) setComponent(
					btMix, 
					colorList.getX() + colorList.getWidth() + LEFT_MARGIN, 
					GUI.HEIGHT / 2 - textHeight / 2,
					BUTTON_WIDTH, 
					textHeight,
					fontNormal);
					

		add(btMix);
		add(colorList);
	}



	@Override
	public void addEvent() {
		buttonEvent();

	}

	// ------------------------ Private layer ------------------------

	private JComponent setComponent(JComponent com, 
									int x, 
									int y, 
									int width, 
									int height, 
									Font font) {
		
		com.setFont(font);
		com.setSize(width, height);
		com.setLocation(x, y);
		return com;
	}

	/**
	 * 
	 */
	private void updateModelList() {
		manager = new ColorManager();
		manager.initListColor();

		ArrayList<ItemColor> list = manager.getListColor();
		modelList = new DefaultListModel<ItemColor>();
		for (ItemColor color : list) {
			modelList.addElement(color);
		}
		colorList.setModel(modelList);
	}

	/**
	 * 
	 */
	private void buttonEvent() {
		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ItemColor item = (ItemColor) colorList.getSelectedValue();
				if (item == null) {

				} else {
					event.changeColor(item.getColor());
				}
				System.out.println(colorList.getSelectedValue());
			}
		};
		btMix.addActionListener(actionListener);
	}
}
