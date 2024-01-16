package com.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmCheckBoxradioButten;
	private JRadioButton rbKBS;
	private JRadioButton rbMBC;
	private JButton btnBroad;
	private JTextField tfBroad;
	private JCheckBox cbxApple;
	private JCheckBox cbxBanana;
	private JButton btnFruits;
	private JTextField tfFruits;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmCheckBoxradioButten.setVisible(true);
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
		frmCheckBoxradioButten = new JFrame();
		frmCheckBoxradioButten.setTitle("Check Box/Radio Butten");
		frmCheckBoxradioButten.setBounds(100, 100, 450, 300);
		frmCheckBoxradioButten.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckBoxradioButten.getContentPane().setLayout(null);
		frmCheckBoxradioButten.getContentPane().add(getRbKBS());
		frmCheckBoxradioButten.getContentPane().add(getRbMBC());
		frmCheckBoxradioButten.getContentPane().add(getBtnBroad());
		frmCheckBoxradioButten.getContentPane().add(getTfBroad());
		frmCheckBoxradioButten.getContentPane().add(getCbxApple());
		frmCheckBoxradioButten.getContentPane().add(getCbxBanana());
		frmCheckBoxradioButten.getContentPane().add(getBtnFruits());
		frmCheckBoxradioButten.getContentPane().add(getTfFruits());
	}
	private JRadioButton getRbKBS() {
		if (rbKBS == null) {
			rbKBS = new JRadioButton("KBS");
			rbKBS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbKBS);
			rbKBS.setSelected(true);
			rbKBS.setBounds(51, 69, 141, 23);
		}
		return rbKBS;
	}
	private JRadioButton getRbMBC() {
		if (rbMBC == null) {
			rbMBC = new JRadioButton("MBC");
			rbMBC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			buttonGroup.add(rbMBC);
			rbMBC.setBounds(51, 118, 141, 23);
		}
		return rbMBC;
	}
	private JButton getBtnBroad() {
		if (btnBroad == null) {
			btnBroad = new JButton("OK");
			btnBroad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			btnBroad.setBounds(61, 157, 117, 29);
		}
		return btnBroad;
	}
	private JTextField getTfBroad() {
		if (tfBroad == null) {
			tfBroad = new JTextField();
			tfBroad.setBounds(51, 210, 130, 26);
			tfBroad.setColumns(10);
		}
		return tfBroad;
	}
	private JCheckBox getCbxApple() {
		if (cbxApple == null) {
			cbxApple = new JCheckBox("Apple");
			cbxApple.setBounds(268, 69, 128, 23);
		}
		return cbxApple;
	}
	private JCheckBox getCbxBanana() {
		if (cbxBanana == null) {
			cbxBanana = new JCheckBox("Banana");
			cbxBanana.setBounds(268, 118, 128, 23);
		}
		return cbxBanana;
	}
	private JButton getBtnFruits() {
		if (btnFruits == null) {
			btnFruits = new JButton("OK");
			btnFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FruitCheck();
				}
			});
			btnFruits.setBounds(268, 157, 117, 29);
		}
		return btnFruits;
	}
	private JTextField getTfFruits() {
		if (tfFruits == null) {
			tfFruits = new JTextField();
			tfFruits.setColumns(10);
			tfFruits.setBounds(268, 210, 130, 26);
		}
		return tfFruits;
	}
	
	//======functions======
	private void broadCheck() {
		if (rbKBS.isSelected()) {
			tfBroad.setText("KBS is selected");
			
		}
		if (rbMBC.isSelected()) {
			tfBroad.setText("MBC is selected");
		}
	}
	
	
	
	private void FruitCheck() {
		
		tfFruits.setText("Nothing");				//제일 위에있는개 디폴트 값으로     else 같은거 안쓰고 사용가능
		
		if (cbxApple.isSelected()) {
			tfFruits.setText("Apple is selected");
		}
		if ( cbxBanana.isSelected()) {
			tfFruits.setText("Banana is selected");
		}
		if (cbxApple.isSelected() && cbxBanana.isSelected()) {
			tfFruits.setText("Apple & Banana");
		}
		
			
		
	}
	
	
	
	
	
}
