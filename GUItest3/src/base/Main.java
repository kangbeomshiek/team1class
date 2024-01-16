package base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField tffnum;
	private JTextField tflnum;
	private JTextField tftot;
	private JButton botten;
	private JRadioButton rbeven;
	private JRadioButton rbodd;
	private JRadioButton rbtot;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		frame.setTitle("합계구하기");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getTffnum());
		frame.getContentPane().add(getTflnum());
		frame.getContentPane().add(getTftot());
		frame.getContentPane().add(getBotten());
		frame.getContentPane().add(getRbeven());
		frame.getContentPane().add(getRbodd());
		frame.getContentPane().add(getRbtot());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("시작 숫자");
			lblNewLabel.setBounds(39, 42, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("끝 숫자");
			lblNewLabel_1.setBounds(28, 83, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("합계");
			lblNewLabel_2.setBounds(28, 152, 61, 16);
		}
		return lblNewLabel_2;
	}
	private JTextField getTffnum() {
		if (tffnum == null) {
			tffnum = new JTextField();
			tffnum.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tffnum();
				}
			});
			tffnum.setBounds(91, 37, 49, 26);
			tffnum.setColumns(10);
		}
		return tffnum;
	}
	private JTextField getTflnum() {
		if (tflnum == null) {
			tflnum = new JTextField();
			tflnum.setColumns(10);
			tflnum.setBounds(85, 78, 55, 26);
		}
		return tflnum;
	}
	private JTextField getTftot() {
		if (tftot == null) {
			tftot = new JTextField();
			tftot.setColumns(10);
			tftot.setBounds(68, 147, 61, 26);
		}
		return tftot;
	}
	private JButton getBotten() {
		if (botten == null) {
			botten = new JButton("계산하기");
			botten.setBounds(168, 78, 117, 29);
		}
		return botten;
	}
	private JRadioButton getRbeven() {
		if (rbeven == null) {
			rbeven = new JRadioButton("짝수");
			buttonGroup.add(rbeven);
			rbeven.setBounds(242, 38, 61, 23);
		}
		return rbeven;
	}
	private JRadioButton getRbodd() {
		if (rbodd == null) {
			rbodd = new JRadioButton("홀수");
			buttonGroup.add(rbodd);
			rbodd.setBounds(303, 38, 61, 23);
		}
		return rbodd;
	}
	private JRadioButton getRbtot() {
		if (rbtot == null) {
			rbtot = new JRadioButton("전체");
			buttonGroup.add(rbtot);
			rbtot.setSelected(true);
			rbtot.setBounds(185, 38, 61, 23);
		}
		return rbtot;
	}
	public void tffnum() {
		
		
		
	}
	
	
	
	
	
	
}
