package com.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmPasswordfied;
	private JLabel lblNewLabel;
	private JPasswordField tfPassword1;
	private JButton btnShow;
	private JPasswordField tfPassword2;
	private JButton btnCompare;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmPasswordfied.setVisible(true);
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
		frmPasswordfied = new JFrame();
		frmPasswordfied.setTitle("PasswordFied");
		frmPasswordfied.setBounds(100, 100, 450, 300);
		frmPasswordfied.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPasswordfied.getContentPane().setLayout(null);
		frmPasswordfied.getContentPane().add(getLblNewLabel());
		frmPasswordfied.getContentPane().add(getTfPassword1());
		frmPasswordfied.getContentPane().add(getBtnShow());
		frmPasswordfied.getContentPane().add(getTfPassword2());
		frmPasswordfied.getContentPane().add(getBtnCompare());
		frmPasswordfied.getContentPane().add(getLblResult());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Password ;");
			lblNewLabel.setBounds(17, 71, 84, 16);
		}
		return lblNewLabel;
	}
	private JPasswordField getTfPassword1() {
		if (tfPassword1 == null) {
			tfPassword1 = new JPasswordField();
			tfPassword1.setBounds(96, 66, 84, 26);
		}
		return tfPassword1;
	}
	private JButton getBtnShow() {
		if (btnShow == null) {
			btnShow = new JButton("Show");
			btnShow.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkPassword();
					
				}
			});
			btnShow.setBounds(228, 66, 117, 29);
		}
		return btnShow;
	}
	private JPasswordField getTfPassword2() {
		if (tfPassword2 == null) {
			tfPassword2 = new JPasswordField();
			tfPassword2.setBounds(96, 107, 84, 26);
		}
		return tfPassword2;
	}
	private JButton getBtnCompare() {
		if (btnCompare == null) {
			btnCompare = new JButton("Compare");
			btnCompare.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comparePassword();
				}
			});
			btnCompare.setBounds(228, 107, 117, 29);
		}
		return btnCompare;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("");
			lblResult.setBounds(118, 186, 201, 16);
		}
		return lblResult;
	}
	
	//-----function-----
	private void checkPassword() {
		char[] pass = tfPassword1.getPassword();
		String passString = new String(pass);
		lblResult.setText(passString);
		
	}
	
	
	private void comparePassword() {
		char[] pass1 = tfPassword1.getPassword();
		String pass1String = new String(pass1);
		
		
		char[] pass2 = tfPassword2.getPassword();
		String pass2String = new String(pass2);
		
		if ( pass1String.equals(pass2String)) {
			lblResult.setText("Password가 일치합니다.");
		}else {
			lblResult.setText("Password가 일치 하지 않습니다."); 
		}
	}
		
	
	
	
	
	
}
