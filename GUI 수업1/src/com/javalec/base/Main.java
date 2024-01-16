package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {

	private JFrame frame;
	private JLabel lblstartNum;
	private JLabel lblendNum;
	private JLabel lblresult;
	private JTextField tfstartNum;
	private JTextField tfendNum;
	private JTextField tfresult;
	private JButton btnresult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("범위의 숫자 합계 구하기");
		frame.setBounds(100, 100, 450, 210);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblstartNum());
		frame.getContentPane().add(getLblendNum());
		frame.getContentPane().add(getLblresult());
		frame.getContentPane().add(getTfstartNum());
		frame.getContentPane().add(getTfendNum());
		frame.getContentPane().add(getTfresult());
		frame.getContentPane().add(getBtnresult());
	}

	private JLabel getLblstartNum() {
		if (lblstartNum == null) {
			lblstartNum = new JLabel("시작 숫자");
			lblstartNum.setBounds(53, 39, 61, 16);
		}
		return lblstartNum;
	}

	private JLabel getLblendNum() {
		if (lblendNum == null) {
			lblendNum = new JLabel("끝 숫자");
			lblendNum.setBounds(53, 96, 61, 16);
		}
		return lblendNum;
	}

	private JLabel getLblresult() {
		if (lblresult == null) {
			lblresult = new JLabel("합계");
			lblresult.setBounds(226, 96, 61, 16);
		}
		return lblresult;
	}

	private JTextField getTfstartNum() {
		if (tfstartNum == null) {
			tfstartNum = new JTextField();
			tfstartNum.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
						// 그대로 진행
					} else {
						JOptionPane.showMessageDialog(null, "숫자만 입력하세요", "경고", JOptionPane.ERROR_MESSAGE);
						tfstartNum.setText("");
					}
				}
			});
			tfstartNum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfstartNum.setBounds(111, 34, 94, 26);
			tfstartNum.setColumns(10);
		}
		return tfstartNum;
	}

	private JTextField getTfendNum() {
		if (tfendNum == null) {
			tfendNum = new JTextField();
			tfendNum.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
						// 그대로 진행
					} else {
						JOptionPane.showMessageDialog(null, "숫자만 입력하세요", "경고", JOptionPane.ERROR_MESSAGE);
						tfendNum.setText("");
					}
				}
			});
			tfendNum.setHorizontalAlignment(SwingConstants.TRAILING);
			tfendNum.setColumns(10);
			tfendNum.setBounds(111, 91, 94, 26);
		}
		return tfendNum;
	}

	private JTextField getTfresult() {
		if (tfresult == null) {
			tfresult = new JTextField();
			tfresult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfresult.setEditable(false);
			tfresult.setColumns(10);
			tfresult.setBounds(267, 91, 134, 26);
		}
		return tfresult;
	}

	private JButton getBtnresult() {
		if (btnresult == null) {
			btnresult = new JButton("합계 구하기");
			btnresult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (tfstartNum.getText().equals("") || tfendNum.getText().equals("")) { // String은 == 쓰는거 아님
						JOptionPane.showMessageDialog(null, "숫자를 입력 하세요!");
					} 
					
					else if (Integer.parseInt(tfstartNum.getText()) < Integer.parseInt(tfendNum.getText())) {
						int result = 0;
						for (int i = Integer.parseInt(tfstartNum.getText()); i <= Integer
								.parseInt(tfendNum.getText()); i++) {
							result += i;
						}
						tfresult.setText(Integer.toString(result));
					}

					else if(Integer.parseInt(tfstartNum.getText()) > Integer.parseInt(tfendNum.getText())){
						int result = 0;
						for (int i = Integer.parseInt(tfendNum.getText()); i <= Integer
								.parseInt(tfstartNum.getText()); i++) {
							result += i;
						}
						tfresult.setText(Integer.toString(result));
					}
				}
			});
			btnresult.setBounds(267, 34, 117, 29);
		}
		return btnresult;
	}
}
