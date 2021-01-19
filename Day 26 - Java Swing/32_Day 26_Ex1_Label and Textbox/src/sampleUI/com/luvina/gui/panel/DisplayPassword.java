package sampleUI.com.luvina.gui.panel;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

import sampleUI.com.luvina.gui.GUI;

/**
 * 
 * @author Hoang Anh
 * @since 18 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class DisplayPassword extends BasePanel {
	private final int MARGIN_LEFT = 30;
	private final int MARGIN_TOP = 20;

	private final int BUTTON_WIDTH = 100;
	private final int BUTTON_HEIGHT = 30;

	private final int TEXT_MARGIN = 3;

	private JLabel lbPassword;
	private JLabel lbDisplay;

	private JLabel lbResult;

	private JTextField tfDisplay;
	private JPasswordField pfPassword;

	private JButton btDisplay;
	private JButton btNext;
	private JButton btClose;

	private JProgressBar progress;

	private JCheckBox checkHappy;
	private JCheckBox checkSad;

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
		Font f = new Font("Calibri (Body)", Font.BOLD, 14);
		FontMetrics fm = getFontMetrics(f);

		// lbA
		lbPassword = new JLabel("Nhập Password:");
		lbPassword.setFont(f);
		lbPassword.setSize(fm.stringWidth(lbPassword.getText()), fm.getHeight());
		lbPassword.setLocation(MARGIN_LEFT, MARGIN_TOP);

		// lbB
		lbDisplay = new JLabel("Hiển thị:");
		lbDisplay.setFont(f);
		lbDisplay.setSize(fm.stringWidth(lbDisplay.getText()), fm.getHeight());
		lbDisplay.setLocation ( 
			lbPassword.getX() + lbPassword.getWidth() - lbDisplay.getWidth(),
			lbPassword.getHeight() + MARGIN_TOP + lbPassword.getY()
		);

		// tfDisplay
		tfDisplay = new JTextField();
		tfDisplay.setFont(f);
		tfDisplay.setEditable(false);
		tfDisplay.setSize(300, fm.getHeight() + TEXT_MARGIN * 2);
		tfDisplay.setLocation(lbDisplay.getX() + lbDisplay.getWidth() + 10, lbDisplay.getY());
		tfDisplay.setText("Cảm thấy nhập được thì nhập đi !!");

		// pfDisplay
		pfPassword = new JPasswordField();
		pfPassword.setSize(300, fm.getHeight() + TEXT_MARGIN * 2);
		pfPassword.setLocation(tfDisplay.getX(), MARGIN_TOP);
		pfPassword.setEchoChar('#');

		// btGiaiPT
		btDisplay = new JButton("Hiển thị");
		btDisplay.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		btDisplay.setLocation(lbDisplay.getX() + lbDisplay.getWidth() - 100,
				lbDisplay.getY() + MARGIN_TOP + fm.getHeight());

		// btNext
		btNext = new JButton("Tiếp");
		btNext.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		btNext.setLocation(btDisplay.getX() + btDisplay.getWidth() + 35,
				btDisplay.getY());

		// btNext
		btClose = new JButton("Đóng");
		btClose.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		btClose.setLocation(btNext.getX() + btNext.getWidth() + 35, btDisplay.getY());

		// Progress
		progress = new JProgressBar();
		progress.setSize(300, 25);
		progress.setLocation(lbDisplay.getX() + lbDisplay.getWidth() + 10, lbDisplay.getY());
		progress.setMaximum(1000);
		progress.setForeground(new Color(166, 218, 149));
		progress.setStringPainted(true);

		lbResult = new JLabel("Hiển thị");
		lbResult.setFont(f);
		lbResult.setSize(fm.stringWidth(lbResult.getText()), fm.getHeight());
		lbResult.setLocation(GUI.WIDTH / 2, GUI.HEIGHT / 2);

		checkHappy = new JCheckBox("Happy");
		checkHappy.setLocation(50, 50);
		checkHappy.setMnemonic(KeyEvent.VK_C);

		checkSad = new JCheckBox("Sad");
		checkSad.setLocation(150, 50);

		// add
//		add(lbPassword);
//		add(lbDisplay);
//		add(tfDisplay);
//		add(pfPassword);
//		add(btDisplay);
//		add(btNext);
//		add(btClose);

		add(lbResult);
		add(checkSad);
		add(checkHappy);
//		add(progress);

	}

	@Override
	public void addEvent() {
//		btDisplayListen();
//		btCloseListen();
		btNextListen();
	}

	// --------------------- Private Layer ---------------------

	private void btDisplayListen() {
		ActionListener ac = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String password = new String(pfPassword.getPassword());
				if (password.isEmpty()) {
					tfDisplay.setText("Không có gì thì hiển thị vào răng à ?");
				} else {
					tfDisplay.setText(password);
				}
			}
		};
		
		btDisplay.addActionListener(ac);
	}

//	public void actionPerformed(ActionEvent evt) {
//		startButton.setEnabled(false);
//		setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
//		done = false;
//		task = new Task();
//		task.addPropertyChangeListener(this);
//		task.execute();
//	}

	private void btNextListen() {

		MouseAdapter mouse = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(progress.getMaximum() == progress.getValue()) {
					progress.setValue(progress.getMinimum());
				} else {
					progress.setValue(progress.getValue() + 100);
				}
				
			}
		};
		progress.addMouseListener(mouse);
	}

	private void btCloseListen() {
		ActionListener ac = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		btClose.addActionListener(ac);
	}
}
