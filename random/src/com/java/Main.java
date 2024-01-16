package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Purchase extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JScrollPane scrollPane;
	private JCheckBox chckbxNewCheckBox;
	private JTable innerTable;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JCheckBox chckbxNewCheckBox_4;
	private JButton btnback;
	private JButton btnbuy;
	private JButton btndelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Purchase dialog = new Purchase();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Purchase() {
		setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 27));
		setTitle("장바구니 화면");
		setBounds(100, 100, 512, 683);
		getContentPane().setLayout(null);
		getContentPane().add(getTextField());
		getContentPane().add(getScrollPane());
		getContentPane().add(getChckbxNewCheckBox());
		getContentPane().add(getChckbxNewCheckBox_1());
		getContentPane().add(getChckbxNewCheckBox_2());
		getContentPane().add(getChckbxNewCheckBox_3());
		getContentPane().add(getChckbxNewCheckBox_4());
		getContentPane().add(getBtnback());
		getContentPane().add(getBtnbuy());
		getContentPane().add(getBtndelete());

	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setText("장바구니");
			textField.setBounds(113, 76, 266, 49);
			textField.setColumns(10);
		}
		return textField;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(66, 198, 389, 211);
			scrollPane.setViewportView(getInnerTable());
		}
		return scrollPane;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("New check box");
			chckbxNewCheckBox.setBounds(28, 209, 26, 23);
		}
		return chckbxNewCheckBox;
	}
	private JTable getInnerTable() {
		if (innerTable == null) {
			innerTable = new JTable();
		}
		return innerTable;
	}
	private JCheckBox getChckbxNewCheckBox_1() {
		if (chckbxNewCheckBox_1 == null) {
			chckbxNewCheckBox_1 = new JCheckBox("New check box");
			chckbxNewCheckBox_1.setBounds(28, 244, 26, 23);
		}
		return chckbxNewCheckBox_1;
	}
	private JCheckBox getChckbxNewCheckBox_2() {
		if (chckbxNewCheckBox_2 == null) {
			chckbxNewCheckBox_2 = new JCheckBox("New check box");
			chckbxNewCheckBox_2.setBounds(28, 279, 26, 23);
		}
		return chckbxNewCheckBox_2;
	}
	private JCheckBox getChckbxNewCheckBox_3() {
		if (chckbxNewCheckBox_3 == null) {
			chckbxNewCheckBox_3 = new JCheckBox("New check box");
			chckbxNewCheckBox_3.setBounds(28, 314, 26, 23);
		}
		return chckbxNewCheckBox_3;
	}
	private JCheckBox getChckbxNewCheckBox_4() {
		if (chckbxNewCheckBox_4 == null) {
			chckbxNewCheckBox_4 = new JCheckBox("New check box");
			chckbxNewCheckBox_4.setBounds(28, 349, 26, 23);
		}
		return chckbxNewCheckBox_4;
	}
	private JButton getBtnback() {
		if (btnback == null) {
			btnback = new JButton("뒤로가기");
			btnback.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
									backAction();
				}
			});
			btnback.setBounds(66, 505, 117, 29);
		}
		return btnback;
	}
	private JButton getBtnbuy() {
		if (btnbuy == null) {
			btnbuy = new JButton("구매확정");
			btnbuy.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
								buyAction();
				}
			});
			btnbuy.setBounds(338, 505, 117, 29);
		}
		return btnbuy;
	}
	private JButton getBtndelete() {
		if (btndelete == null) {
			btndelete = new JButton("장바구니 제거");
			btndelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
								cartdelete();
				}
			});
			btndelete.setBounds(6, 421, 95, 29);
		}
		return btndelete;
	}
	
	
	//--------------Function------------
	
	
	//장바구니 삭제 기능
	public void cartdelete() {
		
	}
	
	
	
	//구매창 팝업
	public void buyAction() {
		JOptionPane.showMessageDialog(null, "제품을 구매하였습니다.");
		
	}
	
	
	//뒤로가기 버튼 활성화
	public void backAction() {
		
	}
	
	
	
} //End

