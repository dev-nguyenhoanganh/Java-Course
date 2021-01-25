///**
// * @Project_Name 32_Day 29_Ex2_Swing Download file
// */
//package com.luvina.btvn.logic;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//
//import javax.swing.JOptionPane;
//import javax.swing.SwingWorker;
//
//import com.luvina.btvn.gui.GUINew;
//	
///**
// * @author Hoang Anh
// * @since 25 thg 1, 2021
// * @version 1.0
// */
//public class DownloadTask extends SwingWorker<Void, Void> {
//	private static final int BUFFER_SIZE = 8192;
//	private String downloadURL;
//	private String saveDirectory;
//	private GUINew gui;
//
//	public DownloadTask(GUINew gui, String downloadURL, String saveDirectory) {
//		this.gui = gui;
//		this.downloadURL = downloadURL;
//		this.saveDirectory = saveDirectory;
//	}
//
//	/**
//	 * Executed in background thread
//	 */
//	@Override
//	protected Void doInBackground() throws Exception {
//		try {
//			HTTPDownLoad util = new HTTPDownLoad();
//			util.downloadFile(downloadURL);
//
//			// set file information on the GUI
//			gui.setFileInfo(util.getFileName(), util.getContentLength());
//
//			String saveFilePath = saveDirectory + File.separator + util.getFileName();
//
//			InputStream inputStream = util.getInputStream();
//			// opens an output stream to save into file
//			FileOutputStream outputStream = new FileOutputStream(saveFilePath);
//
//			byte[] buffer = new byte[BUFFER_SIZE];
//			int bytesRead = -1;
//			long totalBytesRead = 0;
//			int percentCompleted = 0;
//			long fileSize = util.getContentLength();
//
//			while ((bytesRead = inputStream.read(buffer)) != -1) {
//				outputStream.write(buffer, 0, bytesRead);
//				totalBytesRead += bytesRead;
//				percentCompleted = (int) (totalBytesRead * 100 / fileSize);
//
//				setProgress(percentCompleted);
//			}
//
//			outputStream.close();
//
//			util.disconnect();
//		} catch (IOException ex) {
//			JOptionPane.showMessageDialog(gui, "Error downloading file: " + ex.getMessage(), "Error",
//					JOptionPane.ERROR_MESSAGE);
//			ex.printStackTrace();
//			setProgress(0);
//			cancel(true);
//		}
//		return null;
//	}
//
//	/**
//	 * Executed in Swing's event dispatching thread
//	 */
//	@Override
//	protected void done() {
//		if (!isCancelled()) {
//			JOptionPane.showMessageDialog(gui, "File has been downloaded successfully!", "Message",
//					JOptionPane.INFORMATION_MESSAGE);
//		}
//	}
//}
//
