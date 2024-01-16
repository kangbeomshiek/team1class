package com.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Main {

	private JFrame frame;
	private JTextField num1;
	private JTextField num2;
	private JComboBox comboBox;
	private JButton butn;
	private JTextField result;

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
		frame.setTitle("계산기");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getNum1());
		frame.getContentPane().add(getNum2());
		frame.getContentPane().add(getComboBox());
		frame.getContentPane().add(getButn());
		frame.getContentPane().add(getResult());
	}
	private JTextField getNum1() {
		if (num1 == null) {
			num1 = new JTextField();
			num1.setBounds(59, 116, 71, 26);
			num1.setColumns(10);
		}
		return num1;
	}
	private JTextField getNum2() {
		if (num2 == null) {
			num2 = new JTextField();
			num2.setBounds(225, 116, 71, 26);
			num2.setColumns(10);
		}
		return num2;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/"}));
			comboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			comboBox.setBounds(142, 117, 71, 27);
		}
		return comboBox;
	}
	private JButton getButn() {
		if (butn == null) {
			butn = new JButton("=");
			butn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				}
			});
			butn.setBounds(296, 116, 55, 29);
		}
		return butn;
	}
	private JTextField getResult() {
		if (result == null) {
			result = new JTextField();
			result.setBounds(363, 116, 55, 26);
			result.setColumns(10);
			
		}
		return result;
	}
	
}		//fin
