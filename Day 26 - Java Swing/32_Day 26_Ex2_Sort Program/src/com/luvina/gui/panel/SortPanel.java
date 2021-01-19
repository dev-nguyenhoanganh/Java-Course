
package com.luvina.gui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.luvina.gui.GUI;
import com.luvina.logic.Sort;

/**
 * 
 * @author Hoang Anh
 * @since 18 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class SortPanel extends BasePanel {
	private final int MARGIN_LEFT = 30;
	private final int MARGIN_TOP = 20;

	private final int BUTTON_WIDTH = 100;
	private final int BUTTON_HEIGHT = 30;
	private final int TEXT_FIELD_WIDTH = 380;

	private final int TEXT_MARGIN = 3;

	private JLabel lbInput;
	private JLabel lbResult;

	private JButton btSort;

	private JTextField tfResult;
	private JTextField tfInput;

	@Override
	public void init() {
		setBackground(new Color(230, 230, 230));
		setSize(GUI.WIDTH, GUI.HEIGHT);
		setLocation(0, 0);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void addComponent() {
		Font font = new Font("Calibri (Body)", Font.BOLD, 14);
		FontMetrics fm = getFontMetrics(font);

		// lbA
		lbInput = new JLabel("Dãy số");
		lbInput.setFont(font);
		lbInput.setSize(fm.stringWidth(lbInput.getText()), fm.getHeight());
		lbInput.setLocation(MARGIN_LEFT, MARGIN_TOP);

		// lbB
		lbResult = new JLabel("Kết quả");
		lbResult.setFont(font);
		lbResult.setSize(fm.stringWidth(lbResult.getText()), fm.getHeight());
		lbResult.setLocation ( 
			lbInput.getX() + lbInput.getWidth() - lbResult.getWidth(),
			lbInput.getHeight() + MARGIN_TOP + lbInput.getY()
		);

		// tfDisplay
		tfInput = new JTextField();
		tfInput.setFont(font);
		tfInput.setSize(TEXT_FIELD_WIDTH, fm.getHeight() + TEXT_MARGIN * 2);
		tfInput.setLocation(lbInput.getX() + lbInput.getWidth() + 14, MARGIN_TOP);


		// pfDisplay
		tfResult = new JTextField();
		tfResult.setFont(font);
		tfResult.setEditable(false);
		tfResult.setSize(TEXT_FIELD_WIDTH, fm.getHeight() + TEXT_MARGIN * 2);
		tfResult.setLocation(tfInput.getX(), lbResult.getY());
		tfResult.setText("Cảm thấy nhập được thì nhập đi !!");

		// btGiaiPT
		btSort = new JButton("Hiển thị");
		btSort.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		btSort.setLocation(tfResult.getX() + tfResult.getWidth() - BUTTON_WIDTH,
				tfResult.getY() + tfResult.getHeight() + MARGIN_TOP);

		// add
		add(lbInput);
		add(lbResult);
		add(tfInput);
		add(tfResult);
		add(btSort);
		System.out.println(tfInput.getX());
		System.out.println(tfInput.getX() + tfInput.getWidth());
	}

	@Override
	public void addEvent() {
		ActionListener ac = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tfInput.getText();
				if (text.isEmpty()) {
					tfResult.setText("Chưa nhập à?");
				} else {
					Sort listInt = new Sort();
					listInt.setItemSort(text);
					tfResult.setText(listInt.sort());
				}
			}
		};
		

		btSort.addActionListener(ac);
	}

	// --------------------- Private Layer ---------------------
}
