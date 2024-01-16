package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.javalec.function.*;

public class Main {

	private JFrame frame;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResult;
	private JButton btnadd;

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
		frame.setBounds(100, 100, 450, 168);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Java GUI Example 01");
		lblNewLabel.setBounds(16, 6, 133, 21);
		frame.getContentPane().add(lblNewLabel);

		tfNum1 = new JTextField();
		tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
		tfNum1.setBounds(16, 39, 87, 26);
		frame.getContentPane().add(tfNum1);
		tfNum1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("=");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(199, 36, 61, 26);
		frame.getContentPane().add(lblNewLabel_1);

		tfNum2 = new JTextField();
		tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
		tfNum2.setColumns(10);
		tfNum2.setBounds(131, 39, 87, 26);
		frame.getContentPane().add(tfNum2);

		JLabel lblNewLabel_1_1 = new JLabel("+");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(88, 36, 61, 26);
		frame.getContentPane().add(lblNewLabel_1_1);

		tfResult = new JTextField();
		tfResult.setEditable(false);
		tfResult.setHorizontalAlignment(SwingConstants.TRAILING);
		tfResult.setColumns(10);
		tfResult.setBounds(237, 39, 87, 26);
		frame.getContentPane().add(tfResult);

		btnadd = new JButton("add!");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addAction();
			}
		});
		btnadd.setBounds(327, 39, 117, 29);
		frame.getContentPane().add(btnadd);

	}

	private void addAction() {

		if (tfNum1.getText().equals("") || tfNum2.getText().equals("")) { // String은 == 쓰는거 아님
			JOptionPane.showMessageDialog(null, "숫자를 입력 하세요!");
		} else {
			Addition addition = new Addition(Integer.parseInt(tfNum1.getText()), Integer.parseInt(tfNum2.getText()));// 텍스트를 숫자로 변경

			tfResult.setText(Integer.toString(addition.add()));
		}
	}

} // End