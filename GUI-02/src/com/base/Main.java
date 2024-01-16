package com.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Main {

	private JFrame frmCcomboBox;
	private JComboBox cbFruits;
	private JFormattedTextField tfFruits;
	private JTextField txtApple;
	private JTextField textField_1;
	private JComboBox comboBox;
	private JButton Add;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmCcomboBox.setVisible(true);
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
		frmCcomboBox = new JFrame();
		frmCcomboBox.setTitle("cCombo Box");
		frmCcomboBox.setBounds(100, 100, 450, 300);
		frmCcomboBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCcomboBox.getContentPane().setLayout(null);
		frmCcomboBox.getContentPane().add(getCbFruits());
		frmCcomboBox.getContentPane().add(getTfFruits());
		frmCcomboBox.getContentPane().add(getTxtApple());
		frmCcomboBox.getContentPane().add(getTextField_1());
		frmCcomboBox.getContentPane().add(getComboBox());
		frmCcomboBox.getContentPane().add(getAdd());
	}
	private JComboBox getCbFruits() {
		if (cbFruits == null) {
			cbFruits = new JComboBox();
			cbFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboAction();
				}
			});
			cbFruits.setModel(new DefaultComboBoxModel(new String[] {"Apple", "Banana", "Grape", "Mango", "Melon"}));
			cbFruits.setBounds(54, 39, 100, 48);
		}
		return cbFruits;
	}
	private JFormattedTextField getTfFruits() {
		if (tfFruits == null) {
			tfFruits = new JFormattedTextField();
			tfFruits.setBounds(247, 49, 71, 26);
			tfFruits.setColumns(10);
		}
		return tfFruits;
	}
	
		private void comboAction() {
			cbFruits.getSelectedItem().toString();				//텍스트 필드는 string 으로
			tfFruits.setText(strFruits);
		}
	private JTextField getTxtApple() {
		if (txtApple == null) {
			txtApple = new JTextField();
			txtApple.setText("Apple");
			txtApple.setBounds(237, 49, 130, 26);
			txtApple.setColumns(10);
		}
		return txtApple;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(70, 138, 130, 26);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(274, 139, 118, 27);
		}
		return comboBox;
	}
	private JButton getAdd() {
		if (Add == null) {
			Add = new JButton("Add");
			Add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addAtction();
				}
			});
			Add.setBounds(53, 189, 117, 29);
		}
		return Add;
	}
	private void addAtction() {
		cbAdd.addItem(	tfAdd.getText());
	}
}		//End
