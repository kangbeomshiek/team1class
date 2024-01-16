package com.javalec.base;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.javalec.fun.ShareVar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JLabel lblimege;
	private JButton btnFilebutten;
	private JTextField btnFilepath;

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
		frame.setBounds(100, 100, 450, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblimege());
		frame.getContentPane().add(getBtnFilebutten());
		frame.getContentPane().add(getBtnFilepath());
	}
	private JLabel getLblimege() {
		if (lblimege == null) {
			lblimege = new JLabel("");
			lblimege.setBackground(Color.BLACK);
			lblimege.setBounds(27, 405, 113, 88);
		}
		return lblimege;
	}
	private JButton getBtnFilebutten() {
		if (btnFilebutten == null) {
			btnFilebutten = new JButton("File경로");
			btnFilebutten.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					filePath();
				}
			});
			btnFilebutten.setBounds(195, 405, 117, 29);
		}
		return btnFilebutten;
	}
	private JTextField getBtnFilepath() {
		if (btnFilepath == null) {
			btnFilepath = new JTextField();
			btnFilepath.setBounds(182, 449, 229, 26);
			btnFilepath.setColumns(10);
		}
		return btnFilepath;
	}
	
	
	
	
	
	
	//Image File
	
			FileInputStream input = null;
			File file = new File(tfFilePath.getText());
			try {
				input = new FileInputStream(file);
				
			}catch(FileNotFoundException e ) {
				
			}
	
	
	
	
	
	
	
	
	
	//Image 처리 : filename 이 틀려야 보여주기가 가능
	String filePath = Integer.toString(ShareVar.filename);
	tfFilePath.setText(filePath);
	
	lblimage.setIcon(new ImageIcon(filePath));
	lblImage.setHorizontalAlignmet.SwingConstants.CENTER);
	 
	
	File file = new File(filePath);
	file.delete();
	
	//이미지 선택했을때 
	private void filePath() {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG","PNG","BMP" ,  "jpg","png","bmp");				//이 파일들만 불러오갰다
		chooser.setFileFilter(filter);
		
		int ret = chooser.showOpenDialog(null);
		if(ret!=JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다");
			return;
		}
		String filePath = chooser.getSelectedFile().getPath();
		tfFilePath.setText(filePath);
		lblImage.setIcon(new ImageIcon(filePath));
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		
	}
	
	
	
}
