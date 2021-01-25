/**
 * @Project_Name 32_Day 27_Ex2_RGB Color
 */
package com.luvina.btvn.gui.panel;

import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;

import com.luvina.btvn.gui.GUI;

/**
 * @author Hoang Anh
 * @since 25 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class DownloadPanel extends RootPanel {

	private static int counter = 101;
	
	private static final int MARGIN_TOP = 20;
	private static final int MARGIN_LEFT = 20;
	private static final int MARGIN_TEXT = 6;

	private static final int TEXT_FEILD_WIDTH = 200;
	private static final int BUTTON_WIDTH = 100;


	private JLabel labelURL;
	private JLabel labelFileName;
	private JLabel labelSaveFile;
	private JLabel labelFileSize;
	private JLabel labelProgress;

	private JTextField fieldURL;
	private JTextField fieldSave;
	private JTextField fieldFileName;
	private JTextField fieldFileSize;

	private JButton buttonDownload;
	private JButton buttonBrowse;

	private JProgressBar progressBar;

	private JFileChooser fileChooser;

	@Override
	public void init() {
		setSize(GUI.WIDTH, GUI.HEIGHT);
		setLocation(0, 0);
		setLayout(null);

		fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

	}

	@Override
	public void addComponent() {
		FontMetrics fm = getFontMetrics(GUI.fontNormal);
		int textHeight = fm.getHeight() + MARGIN_TEXT;

		// lbTitle
		labelURL = new JLabel("Download URL: ");
		labelURL.setFont(GUI.fontNormal);
		labelURL.setSize(labelURL.getPreferredSize());
		labelURL.setLocation(MARGIN_LEFT, MARGIN_TOP);

		fieldURL = new JTextField(30);
		fieldURL.setFont(GUI.fontNormal);
		fieldURL.setSize(TEXT_FEILD_WIDTH + 120, textHeight);
		fieldURL.setLocation(labelURL.getX() + labelURL.getWidth() + MARGIN_LEFT, labelURL.getY());

		labelSaveFile = new JLabel("Save in directory: ");
		labelSaveFile.setFont(GUI.fontNormal);
		labelSaveFile.setSize(labelSaveFile.getPreferredSize());
		labelSaveFile.setLocation(labelURL.getX(), labelURL.getY() + labelURL.getHeight() + MARGIN_TOP);

		fieldSave = new JTextField(30);
		fieldSave.setFont(GUI.fontNormal);
		fieldSave.setSize(TEXT_FEILD_WIDTH, textHeight);
		fieldSave.setLocation(fieldURL.getX(), labelSaveFile.getY());

		buttonBrowse = new JButton("Browse...");
		buttonBrowse.setSize(BUTTON_WIDTH, textHeight);
		buttonBrowse.setLocation(fieldSave.getX() + fieldSave.getWidth() + MARGIN_LEFT, fieldSave.getY());

		buttonDownload = new JButton("Download");
		buttonDownload.setSize(BUTTON_WIDTH, textHeight);
		buttonDownload.setLocation(GUI.WIDTH / 2 - 50, fieldSave.getY() + fieldSave.getHeight() + MARGIN_TOP);



		// labelFileName
		labelFileName = new JLabel("File name: ");
		labelFileName.setFont(GUI.fontNormal);
		labelFileName.setSize(labelFileName.getPreferredSize());
		labelFileName.setLocation(labelSaveFile.getX(),
				buttonDownload.getY() + buttonDownload.getHeight() + MARGIN_TOP);

		fieldFileName = new JTextField(20);
		fieldFileName.setFont(GUI.fontNormal);
		fieldFileName.setEditable(false);
		fieldFileName.setSize(TEXT_FEILD_WIDTH + 120, textHeight);
		fieldFileName.setLocation(fieldSave.getX(), labelFileName.getY());

		labelFileSize = new JLabel("File size (bytes): ");
		labelFileSize.setFont(GUI.fontNormal);
		labelFileSize.setSize(TEXT_FEILD_WIDTH, textHeight);
		labelFileSize.setLocation(labelFileName.getX(),
				labelFileName.getY() + labelFileName.getHeight() + MARGIN_TOP);

		fieldFileSize = new JTextField(20);
		fieldFileSize.setFont(GUI.fontNormal);
		fieldFileSize.setEditable(false);
		fieldFileSize.setSize(TEXT_FEILD_WIDTH + 120, textHeight);
		fieldFileSize.setLocation(fieldFileName.getX(), labelFileSize.getY());

		labelProgress = new JLabel("Progress:");
		labelProgress.setFont(GUI.fontNormal);
		labelProgress.setSize(labelProgress.getPreferredSize());
		labelProgress.setLocation(labelFileSize.getX(), labelFileSize.getY() + labelFileSize.getHeight() + MARGIN_TOP);

		progressBar = new JProgressBar(0, 100);
		progressBar.setStringPainted(true);
		progressBar.setSize(TEXT_FEILD_WIDTH + 120, textHeight);
		progressBar.setLocation(fieldFileName.getX(), labelProgress.getY());



		add(labelURL);
		add(labelSaveFile);
		add(labelFileName);
		add(labelFileSize);
		add(labelProgress);

		add(fieldURL);
		add(fieldSave);
		add(fieldFileName);
		add(fieldFileSize);

		add(buttonBrowse);
		add(buttonDownload);
		
		add(progressBar);
	}

	@Override
	public void addEvent() {
		autoRun();
	}

	// ------------------------ Private layer ------------------------

	/**
	 * 
	 */
	private void autoRun() {
		buttonBrowse.setName("Browse");
		buttonDownload.setName("Download");
		ActionListener action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = ((JButton) e.getSource()).getName();
				switch (name) {
				case "Browse":
					browseFile(e);
					break;
				case "Download":
					downloadFile();
					break;
				}
			}
		};

		buttonBrowse.addActionListener(action);
		buttonDownload.addActionListener(action);
	}

	private void downloadFile() {
		String url = fieldURL.getText().trim();
		String saveDir = fieldSave.getText().trim();
		String fileName = "";
		int idx;
		if (url.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Bạn chưa nhập URL");
			return;
		} else {
			idx = url.lastIndexOf("\\");
			if (idx == -1) {
				JOptionPane.showMessageDialog(null, "Không tìm thấy file");
				return;
			}
			fileName = url.substring(idx, url.length());
			fieldFileName.setText(fileName);
			fieldFileSize.setText("" + (int) (Math.random() * 1000));
			System.out.println(fileName.length());
		}
		if (saveDir.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Bạn chưa nhập địa chỉ lưu");
			return;
		}

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				try {
					while (counter <= 100) {
						progressBar.setValue(counter++);
						System.out.println(counter);
						Thread.sleep(50);
					}
					JOptionPane.showMessageDialog(null, "Tải thành công");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread dowloadProgress = new Thread(runnable);
		if (counter > 100) {
			counter = 0;
			dowloadProgress.start();
		} else {
			JOptionPane.showMessageDialog(null, "Tiến trình tải chưa hoàn tất");
		}

	}

	public void browseFile(ActionEvent evt) {
		if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {

			fieldSave.setText(fileChooser.getSelectedFile().getAbsolutePath());
		}
	}

	public void addFileTypeFilter(String extension, String description) {
		FileFilter filter = new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				if (pathname.isDirectory()) {
					return true;
				}
				return pathname.getName().toLowerCase().endsWith(extension);
			}

			@Override
			public String getDescription() {
				return description + String.format(" (*%s)", extension);
			}
		};
		fileChooser.addChoosableFileFilter(filter);
	}

}
