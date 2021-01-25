/**
 * @Project_Name 32_Day 27_Ex2_RGB Color
 */
package com.luvina.btvn.gui.panel;

import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.luvina.btvn.gui.GUI;
import com.luvina.btvn.logic.Subject;


/**
 * @author Hoang Anh
 * @since 20 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class TablePanel extends RootPanel {

	private static final int MARGIN_TOP = 20;
	private static final int MARGIN_LEFT = 20;
	private static final int MARGIN_TEXT = 6;
	
	private static final int COMBOBOX_WIDTH = 200;
	private static final int BUTTON_WIDTH = 100;

	private static final String[] HEADER = new String[] { "Thứ", "Môn học" };

	private static final String[] TIME = new String[] { "Thứ 2", 
														"Thứ 3", 
														"Thứ 4", 
														"Thứ 5", 
														"Thứ 6", 
														"Thứ 7",
														"Chủ nhật" };

	private JTable allTimeTable;
	private JTable filterTable;

	private JComboBox<String> allTimeCob;
	private JComboBox<String> filterCob;

	private JLabel lbTitle;
	private JLabel lbTimeTitle;
	private JLabel lbSubjectTitle;

	private JButton btAdd;

	private JTextField tfSubject;

	private ArrayList<Subject> listSubject;
	private ArrayList<Subject> filterListSubject;

	private DefaultTableModel filterModel;
	private DefaultTableModel allTimeModel;

	@Override
	public void init() {
		setSize(GUI.WIDTH, GUI.HEIGHT);
		setLocation(0, 0);
		setLayout(null);

		listSubject = new ArrayList<Subject>();
		filterListSubject = new ArrayList<Subject>();
	}

	@Override
	public void addComponent() {
		FontMetrics fm = getFontMetrics(GUI.fontNormal);
		FontMetrics fmTitle = getFontMetrics(GUI.fontHeader);
		int textHeight = fm.getHeight() + MARGIN_TEXT;
		
		// lbTitle
		lbTitle = new JLabel("THỜI KHÓA BIỂU", JLabel.CENTER);
		lbTitle.setFont(GUI.fontHeader);
		lbTitle.setSize(fmTitle.stringWidth(lbTitle.getText()), fmTitle.getHeight() + 14);
		lbTitle.setLocation(MARGIN_LEFT, MARGIN_TOP);

		// lbTimeTitle
		lbTimeTitle = new JLabel("Thứ", JLabel.CENTER);
		lbTimeTitle.setFont(GUI.fontNormal);
		lbTimeTitle.setSize(lbTimeTitle.getPreferredSize());
		lbTimeTitle.setLocation(lbTitle.getX(), lbTitle.getY() + lbTitle.getHeight());

		// lbSubjectTitle
		lbSubjectTitle = new JLabel("Môn học", JLabel.CENTER);
		lbSubjectTitle.setFont(GUI.fontNormal);
		lbSubjectTitle.setSize(lbSubjectTitle.getPreferredSize());
		lbSubjectTitle.setLocation(lbTimeTitle.getX(), lbTimeTitle.getY() + lbTimeTitle.getHeight() + MARGIN_TOP);

		// tfSubject
		tfSubject = new JTextField();
		tfSubject.setFont(GUI.fontNormal);
		tfSubject.setSize(COMBOBOX_WIDTH, textHeight);
		tfSubject.setLocation(lbSubjectTitle.getX() + lbSubjectTitle.getWidth() + MARGIN_LEFT, lbSubjectTitle.getY());

		// allTimeCob
		allTimeCob = new JComboBox<String>(TIME);
		allTimeCob.setFont(GUI.fontNormal);
		allTimeCob.setSize(COMBOBOX_WIDTH, textHeight);
		allTimeCob.setLocation(tfSubject.getX(), lbTimeTitle.getY());

		// btAdd
		btAdd = new JButton("Thêm");
		btAdd.setFont(GUI.fontNormal);
		btAdd.setSize(BUTTON_WIDTH, tfSubject.getY() - allTimeCob.getY() + tfSubject.getHeight());
		btAdd.setLocation(allTimeCob.getX() + allTimeCob.getWidth() + MARGIN_LEFT, lbTimeTitle.getY());

		// allTimeTable
		allTimeTable = new JTable();
		allTimeTable.setShowGrid(true);
		updateAllTimeTable();
		JScrollPane scrAllTime = new JScrollPane(allTimeTable);
		scrAllTime.setSize(btAdd.getX() - lbTimeTitle.getX() + btAdd.getWidth(), 300);
		scrAllTime.setLocation(lbSubjectTitle.getX(), lbSubjectTitle.getY() + lbSubjectTitle.getHeight() + MARGIN_TOP);

		// filterCob
		filterCob = new JComboBox<String>(TIME);
		filterCob.setFont(GUI.fontNormal);
		filterCob.setSize(COMBOBOX_WIDTH, textHeight);
		filterCob.setLocation(scrAllTime.getX() + scrAllTime.getWidth() + MARGIN_LEFT, MARGIN_TOP + MARGIN_TEXT);

		// filterTable
		filterTable = new JTable();
		filterTable.setShowGrid(true);

		updateFilterTable();
		JScrollPane scrFilter = new JScrollPane(filterTable);
		scrFilter.setSize(filterCob.getWidth(), scrAllTime.getY() - lbTimeTitle.getY() + scrAllTime.getHeight());
		scrFilter.setLocation(filterCob.getX(), lbTimeTitle.getY());


		add(lbTitle);
		add(lbTimeTitle);
		add(lbSubjectTitle);

		add(tfSubject);
		add(btAdd);

		add(allTimeCob);
		add(filterCob);

		add(scrAllTime);
		add(scrFilter);
	}

	@Override
	public void addEvent() {
		addSubject();
		filterSubject();
	}

	// ------------------------ Private layer ------------------------


	/**
	 * 
	 */
	private void updateAllTimeTable() {
		allTimeModel = new DefaultTableModel(HEADER, 0);
		for (int i = 0; i < listSubject.size(); i++) {
			Subject subject = listSubject.get(i);
			String[] datarow = new String[] { subject.getTime(), subject.getSubject() };
			allTimeModel.addRow(datarow);
		}
		allTimeTable.setModel(allTimeModel);
	}

	/**
	 * 
	 */
	private void updateFilterTable() {
		filterModel = new DefaultTableModel(HEADER, 0);
		for (int i = 0; i < filterListSubject.size(); i++) {
			Subject subject = filterListSubject.get(i);
			String[] datarow = new String[] { subject.getTime(), subject.getSubject() };
			filterModel.addRow(datarow);
		}
		filterTable.setModel(filterModel);
		filterListSubject.clear();
	}

	/**
	 * 
	 */
	private void addSubject() {

		ActionListener action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String subject = tfSubject.getText();
				String time = (String) allTimeCob.getSelectedItem();

				if (subject.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Tên môn học không được để trống");
				} else {
					Subject newSubject = new Subject(time, subject);
					int index = listSubject.indexOf(newSubject);
					if (index == -1) {
						listSubject.add(newSubject);
						updateAllTimeTable();
						tfSubject.setText("");
					} else {
						JOptionPane.showMessageDialog(null, "Môn học đã tồn tại trong danh sách");
					}
				}
			}
		};

		btAdd.addActionListener(action);
	}

	/**
	 * 
	 */
	private void filterSubject() {
		ItemListener aListener = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {
					String day = (String) e.getItem();
					for (Subject subject : listSubject) {
						if (day.equals(subject.toString())) {
							filterListSubject.add(subject);
							System.out.println(subject);
						}
					}
				}
				updateFilterTable();
			}
		};

		filterCob.addItemListener(aListener);

	}
}
