/**
 * @Project_Name 32_Day 27_Ex3_Phan Tich Nhan Tu
 */
package com.luvina.btvn.gui.panel;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.luvina.btvn.gui.GUI;
import com.luvina.btvn.gui.icommon.IFindFactor;

/**
 * @author Hoang Anh
 * @since 20 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class FactorPanel extends BasePanel {
	private JLabel lbTitle;
	private JLabel lbNumber;
	private JLabel lbPath;

	private JTextField tfNumber;
	private JTextField tfPath;
	private JTextArea taResult;

	private JButton btCaculate;
	private JButton btSave;
	private JTextPane text;

	private IFindFactor event;

	private static final int TEXT_MARGIN = 10;
	private static final int TOP_MARGIN = 20;
	private static final int LEFT_MARGIN = 20;

	private static final int TEXTAREA_WIDTH = 440;
	private static final int TEXTAREA_HEIGHT = 300;
	private static final int TEXTFIELD_WIDTH = 250;
	private static final int BUTTON_WIDTH = 150;


	public static final Font fontHeader = new Font("Calibri", Font.BOLD, 30);
	public static final Font fontNormal = new Font("Calibri", Font.PLAIN, 20);

	@Override
	public void init() {
		setSize(GUI.WIDTH, GUI.HEIGHT);
		setLocation(0, 0);
		setBackground(GUI.groundColor);
		setLayout(null);

	}

	@Override
	public void addComponent() {
		FontMetrics metricHeader = getFontMetrics(fontHeader);
		FontMetrics metricNormal = getFontMetrics(fontNormal);
		
		int height;
		int width;
		
		// lbTitle
		lbTitle = new JLabel("PHÂN TÍCH THÀNH NHÂN TỬ");
		width = metricHeader.stringWidth(lbTitle.getText());
		height = metricHeader.getHeight() + TEXT_MARGIN;
		lbTitle = (JLabel) setComponent(
					lbTitle, 
					GUI.WIDTH / 2 - width / 2,
					TOP_MARGIN,
					width, 
					height, 
					fontHeader);
	
		// lbNumber
		lbNumber = new JLabel("N =");
		width = metricNormal.stringWidth(lbNumber.getText());
		height = metricNormal.getHeight() + TEXT_MARGIN;
		lbNumber = (JLabel) setComponent(
					lbNumber, 
					LEFT_MARGIN, 
					lbTitle.getY() + lbTitle.getHeight(), 
					width, 
					height, 
					fontNormal);

		// tfNumber
		tfNumber = new JTextField();
		tfNumber = (JTextField) setComponent(
					tfNumber, 
					lbNumber.getX() + lbNumber.getWidth() + LEFT_MARGIN,
					lbNumber.getY(), 
					TEXTFIELD_WIDTH, 
					height,
					fontNormal);

		// btCaculate
		btCaculate = new JButton("Phân tích");
		btCaculate = (JButton) setComponent(
					btCaculate, 
					tfNumber.getX() + tfNumber.getWidth() + LEFT_MARGIN, 
					lbNumber.getY(),
					BUTTON_WIDTH, 
					height, 
					fontNormal);
					

		// taResult
		// taResult = new JTextArea();
		// taResult.setEditable(false);
		// taResult.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		// taResult = (JTextArea) setComponent(
		// 			taResult, 
		// 			LEFT_MARGIN, 
		// 			lbNumber.getY() + TOP_MARGIN + lbNumber.getHeight(), 
		// 			TEXTAREA_WIDTH, 
		// 			TEXTAREA_HEIGHT, 
		// 			fontNormal);

		text = new JTextPane();
//		SimpleAttributeSet attribs = new SimpleAttributeSet();
//		StyleConstants.setAlignment(attribs, StyleConstants.ALIGN_RIGHT);
//		text.setParagraphAttributes(attribs, true);
		text = (JTextPane) setComponent(
					text, 
					LEFT_MARGIN, lbNumber.getY() + TOP_MARGIN + lbNumber.getHeight(),
					TEXTAREA_WIDTH, 
					TEXTAREA_HEIGHT, 
					fontNormal);

		// lbPath
		lbPath = new JLabel("Path");
		width = metricNormal.stringWidth(lbPath.getText());
		lbPath = (JLabel) setComponent(
					lbPath, 
					LEFT_MARGIN, 
					// taResult.getY() + TOP_MARGIN + taResult.getHeight(),
					text.getY() + TOP_MARGIN + text.getHeight(), 
					width, 
					height, 
					fontNormal);
		
		// tfPath
		tfPath = new JTextField();
		tfPath.setEditable(false);
//		tfPath.setHorizontalAlignment(JTextField.CENTER);
		tfPath.setText(".\\data\\database.txt");
		tfPath = (JTextField) setComponent(
					tfPath, 
					tfNumber.getX(), 
					lbPath.getY(), 
					tfNumber.getWidth(), 
					tfNumber.getHeight(), 
					fontNormal);

		// btSave
		btSave = new JButton("Lưu File");
		btSave = (JButton) setComponent(
					btSave, 
					btCaculate.getX(), 
					lbPath.getY(),
					btCaculate.getWidth(), 
					btCaculate.getHeight(), 
					fontNormal);

		// taResult
		System.out.println("lbPath: " + lbPath.getHeight());
		System.out.println("lbTitle: " + lbTitle.getHeight());
	}

	@Override
	public void addEvent() {
		buttonEven();

	}

	public void addGUI(IFindFactor event) {
		this.event = event;
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
		add(com);
		return com;
	}

	/**
	 * 
	 */
	private void buttonEven() {
		btCaculate.setName("caculate");
		btSave.setName("save");

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = ((JButton) e.getSource()).getName();
				switch (name) {
				case "caculate":
					findFactor();
					break;
				case "save":
					writeToFile();
					break;
				}

			}
		};
		btCaculate.addActionListener(actionListener);
		btSave.addActionListener(actionListener);
	}

	/**
	 * 
	 */
	private void findFactor() {
		String number = tfNumber.getText();
		if (number.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Bạn chưa nhập số kìa -_-");
			return;
		}
		String result = event.findFactor(number);
		if (result == null) {
			JOptionPane.showMessageDialog(null, "Số nhập vào không phải số nguyên dương");
			tfNumber.setText("");
			return;
		} else {
			// taResult.setText(result);
			text.setText(result);
		}
	}

	/**
	 * 
	 */
	private void writeToFile() {
		if (tfNumber.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Không có dữ liệu để ghi vào file");
			return;
		}
		if (event.writeToFile()) {
			JOptionPane.showInternalMessageDialog(null, "Ghi thành công");
		} else {
			JOptionPane.showInternalMessageDialog(null, "Ghi không thành công");
		}
	}

}
