package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.javalec.function.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {

	private JFrame frame;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField shownum1;
	private JTextField shownum2;
	private JTextField tfresult;

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
		frame.setTitle("두개의 숫자 가감승제");
		frame.getContentPane().setBackground(new Color(240, 212, 69));
		frame.setBounds(100, 100, 450, 221);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel txtNum2 = new JLabel("숫자 2 :");
		txtNum2.setBounds(25, 82, 61, 16);
		frame.getContentPane().add(txtNum2);

		JLabel txtNum1 = new JLabel("숫자 1 :");
		txtNum1.setBounds(25, 40, 61, 16);
		frame.getContentPane().add(txtNum1);

		tfNum1 = new JTextField();
		tfNum1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TextField에 숫자 외의 문자가 입력되면 지우기
				if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
					//숫자가 입력 됨
				}else {
					JOptionPane.showMessageDialog(null, "숫자만 입력하세요","경고",JOptionPane.ERROR_MESSAGE);
					tfNum1.setText("");
				}
			}
		});
		tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
		tfNum1.setBounds(83, 35, 130, 26);
		frame.getContentPane().add(tfNum1);
		tfNum1.setColumns(10);

		tfNum2 = new JTextField();
		tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
		tfNum2.setColumns(10);
		tfNum2.setBounds(83, 77, 130, 26);
		frame.getContentPane().add(tfNum2);

		shownum1 = new JTextField();
		shownum1.setForeground(new Color(58, 37, 217));
		shownum1.setHorizontalAlignment(SwingConstants.TRAILING);
		shownum1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		shownum1.setEditable(false);
		shownum1.setBounds(25, 128, 90, 26);
		frame.getContentPane().add(shownum1);
		shownum1.setColumns(10);

		shownum2 = new JTextField();
		shownum2.setForeground(new Color(58, 37, 217));
		shownum2.setHorizontalAlignment(SwingConstants.TRAILING);
		shownum2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		shownum2.setEditable(false);
		shownum2.setColumns(10);
		shownum2.setBounds(148, 128, 86, 26);
		frame.getContentPane().add(shownum2);

		tfresult = new JTextField();
		tfresult.setForeground(new Color(208, 40, 0));
		tfresult.setHorizontalAlignment(SwingConstants.TRAILING);
		tfresult.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		tfresult.setEditable(false);
		tfresult.setColumns(10);
		tfresult.setBounds(286, 128, 137, 26);
		frame.getContentPane().add(tfresult);

		JLabel textcalc = new JLabel("+");
		textcalc.setHorizontalAlignment(SwingConstants.CENTER);
		textcalc.setBounds(100, 133, 61, 16);
		frame.getContentPane().add(textcalc);

		JLabel result = new JLabel("=");
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setBounds(231, 133, 61, 16);
		frame.getContentPane().add(result);

		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfNum1.getText().equals("") || tfNum2.getText().equals("")) { // String은 == 쓰는거 아님
					JOptionPane.showMessageDialog(null, "숫자를 입력 하세요!");
				} else {
					Calc calc = new Calc(Integer.parseInt(tfNum1.getText()), Integer.parseInt(tfNum2.getText()));// 텍스트를 숫자로 변경

					tfresult.setText(Integer.toString(calc.calc('+')));
					shownum1.setText(tfNum1.getText());
					shownum2.setText(tfNum2.getText());
					textcalc.setText("+");
				}

			}
		});
		btnAdd.setForeground(new Color(235, 81, 212));
		btnAdd.setBounds(268, 35, 47, 29);
		frame.getContentPane().add(btnAdd);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfNum1.getText().equals("") || tfNum2.getText().equals("")) { // String은 == 쓰는거 아님
					JOptionPane.showMessageDialog(null, "숫자를 입력 하세요!");
				} else {
					Calc calc = new Calc(Integer.parseInt(tfNum1.getText()), Integer.parseInt(tfNum2.getText()));// 텍스트를 숫자로 변경

					tfresult.setText(Integer.toString(calc.calc('-')));
					shownum1.setText(tfNum1.getText());
					shownum2.setText(tfNum2.getText());
					textcalc.setText("-");
				}
			}
		});
		btnSub.setForeground(new Color(235, 81, 212));
		btnSub.setBounds(327, 35, 47, 29);
		frame.getContentPane().add(btnSub);

		JButton btnMul = new JButton("X");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfNum1.getText().equals("") || tfNum2.getText().equals("")) { // String은 == 쓰는거 아님
					JOptionPane.showMessageDialog(null, "숫자를 입력 하세요!");
				} else {
					Calc calc = new Calc(Integer.parseInt(tfNum1.getText()), Integer.parseInt(tfNum2.getText()));// 텍스트를 숫자로 변경

					tfresult.setText(Integer.toString(calc.calc('*')));
					;
					shownum1.setText(tfNum1.getText());
					shownum2.setText(tfNum2.getText());
					textcalc.setText("X");
				}
			}
		});
		btnMul.setForeground(new Color(58, 37, 217));
		btnMul.setBounds(268, 77, 47, 29);
		frame.getContentPane().add(btnMul);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfNum1.getText().equals("") || tfNum2.getText().equals("")) { // String은 == 쓰는거 아님
					JOptionPane.showMessageDialog(null, "숫자를 입력 하세요!");
				} else {
					Calc calc = new Calc(Integer.parseInt(tfNum1.getText()), Integer.parseInt(tfNum2.getText()));// 텍스트를 숫자로 변경

					// String format 자체가 string 값으로 바뀌주는 것이기 때문에 굳이 tostring을 해주지않아도됨
					tfresult.setText(String.format("%.2f", calc.div()));
					shownum1.setText(tfNum1.getText());
					shownum2.setText(tfNum2.getText());
					textcalc.setText("/");
				}
			}
		});
		btnDiv.setForeground(new Color(58, 37, 217));
		btnDiv.setBounds(327, 77, 47, 29);
		frame.getContentPane().add(btnDiv);
	}

}
