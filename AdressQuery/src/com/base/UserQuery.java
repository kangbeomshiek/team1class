package com.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class UserQuery {

	private JFrame frame;
	private JComboBox cbSelection;
	private JTextField tfSelection;
	private JButton btnQuery;
	private JScrollPane scrollPane;
	private JTable inner_Table;
	private JLabel lblNewLabel;
	private JTextField tfSequenceNo;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField tfName;
	private JTextField tfTelNo;
	private JTextField tfAdress;
	private JTextField tfEmail;
	private JLabel lblNewLabel_3_1;
	private JLabel lblNewLabel_3_2;
	private JTextField tfRelation;
	
	//---- Database & Table
	
	private final DefaultTableModel outer_table = new DefaultTableModel();
	private final String url_mysql 
	private JButton btnUpdate;
	private JButton btnDelete;\ "jdbc"
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserQuery window = new UserQuery();
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
	public UserQuery() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override						
			public void windowActivated(WindowEvent e) {							// 	클릭했을 때 이밴트 발생 
				tableInit();	
				searchAction();
			}
		});
		frame.setTitle("주소록 검색");
		frame.setBounds(100, 100, 450, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCbSelection());
		frame.getContentPane().add(getTfSelection());
		frame.getContentPane().add(getBtnQuery());
		frame.getContentPane().add(getScrollPane());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfSequenceNo());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getTfTelNo());
		frame.getContentPane().add(getTfAdress());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getLblNewLabel_3_1());
		frame.getContentPane().add(getLblNewLabel_3_2());
		frame.getContentPane().add(getTfRelation());
		frame.getContentPane().add(getBtnUpdate());
		frame.getContentPane().add(getBtnDelete());
		
		
		
		
		
		
	}
	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setModel(new DefaultComboBoxModel(new String[] {"이름", "주소", "관계"}));
			cbSelection.setBounds(35, 35, 79, 27);
		}
		return cbSelection;
	}
	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(132, 34, 130, 26);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}
	private JButton getBtnQuery() {
		if (btnQuery == null) {
			btnQuery = new JButton("검색");
			btnQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				conditionQuery();
				}
			});
			btnQuery.setBounds(301, 34, 117, 29);
		}
		return btnQuery;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(45, 74, 315, 104);
			scrollPane.setViewportView(getInner_Table());
		}
		return scrollPane;
	}
	private JTable getInner_Table() {
		if (inner_Table == null) {
			inner_Table = new JTable();
			inner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getButton() == 1) {
						tableClick();
					}
				}
			});
			inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			inner_Table.setModel(outer_Table);		  //******************
			}
		return inner_Table;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Sequence No");
			lblNewLabel.setBounds(35, 210, 117, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfSequenceNo() {
		if (tfSequenceNo == null) {
			tfSequenceNo = new JTextField();
			tfSequenceNo.setEditable(false);
			tfSequenceNo.setBounds(150, 205, 43, 26);
			tfSequenceNo.setColumns(10);
		}
		return tfSequenceNo;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름");
			lblNewLabel_1.setBounds(35, 252, 117, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호");
			lblNewLabel_2.setBounds(35, 296, 117, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소");
			lblNewLabel_3.setBounds(35, 331, 117, 16);
		}
		return lblNewLabel_3;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(150, 247, 66, 26);
		}
		return tfName;
	}
	private JTextField getTfTelNo() {
		if (tfTelNo == null) {
			tfTelNo = new JTextField();
			tfTelNo.setColumns(10);
			tfTelNo.setBounds(150, 291, 117, 26);
		}
		return tfTelNo;
	}
	private JTextField getTfAdress() {
		if (tfAdress == null) {
			tfAdress = new JTextField();
			tfAdress.setColumns(10);
			tfAdress.setBounds(150, 326, 194, 26);
		}
		return tfAdress;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(150, 361, 194, 26);
		}
		return tfEmail;
	}
	private JLabel getLblNewLabel_3_1() {
		if (lblNewLabel_3_1 == null) {
			lblNewLabel_3_1 = new JLabel("전자우편");
			lblNewLabel_3_1.setBounds(21, 366, 117, 16);
		}
		return lblNewLabel_3_1;
	}
	private JLabel getLblNewLabel_3_2() {
		if (lblNewLabel_3_2 == null) {
			lblNewLabel_3_2 = new JLabel("관계");
			lblNewLabel_3_2.setBounds(21, 397, 117, 16);
		}
		return lblNewLabel_3_2;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setColumns(10);
			tfRelation.setBounds(150, 392, 194, 26);
		}
		return tfRelation;
	}
	
	//------function------
	//Table 의 컬럼을 정의하고 DAta 내용을 초기화 시킨다.
	private void tableInit() {
		outer_Table.addColumn("순서");
		outer_Table.addColumn("이름");
		outer_Table.addColumn("전화번호");
		outer_Table.addColumn("관계");
		outer_Table.setColumnCount(4);
		
		//순서
		int colNo =0;
		TableColumn col = inner_Table.getColumnModel().getColumn(colNo);
		int width= 30;
		col.setPreferredWidth(width);
		//이름
		 colNo =1;
		  col = inner_Table.getColumnModel().getColumn(colNo);
		 width= 100;
		col.setPreferredWidth(width);
		//전화번호
		 colNo =2;
		  col = inner_Table.getColumnModel().getColumn(colNo);
		 width= 150;
		col.setPreferredWidth(width);
		//관계
		 colNo =3;
		  col = inner_Table.getColumnModel().getColumn(colNo);
		 width= 100;
		col.setPreferredWidth(width);
		
		//초기화 시키기
		int i = outer_Table.getRowCount();
		for ( int j =0;j<i; j++) {
			outer_Table.removeRow(0);
		}
		
		inner_Table.setAutoResizeMode(inner_Table.AUTO_RESIZE_OFF);
		
		
	}
	private void searchAction() {
		String query = "select seqno, name, telno, relation from userinfo";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql );
			Statement stmt_mtsql = conn_mysql.createStatement();
			
			
			
			
			ResultSet rs =  stmt_mysql.executeQuery(query);
			while(rs.next()) {
				String[] qTxt = {Integer.toString(rs.getInt(1)),Integer.toString(rs.getInt(2)),Integer.toString(rs.getInt(3)),Integer.toString(rs.getInt(4))};
				outer_Table.addRow(qTxt);
				
				
//				rs.getInt(1);
//				rs.getString(2);
//				rs.getString(3);
//				rs.getString(4);
				
			}
			conn_mysql.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void tableClick() {
		int i = inner_Table.getSelectedRow();
		String seqno = (String)inner_Table.getValueAt(i, 0);				//Row 값인 i    배열의 0번째
		
		
		String query1 = "select seqno, name, telno, address, email, relation from userinfo ";			//여기 마지막에 띄어쓰기
		String query2 = "where seqno=" + Integer.parseInt(seqno);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql );
			Statement stmt_mtsql = conn_mysql.createStatement();
			
			
			
			
			ResultSet rs =  stmt_mysql.executeQuery(query1 + query2 );
			while(rs.next()) {
					tfSequenceNo.setText(Integer.toString(rs.getInt(1)));
					tfName.setText(rs.getString(2));
					tfTelNo.setText(rs.getString(3));
					tfAdress.setText(rs.getString(4));
					tfEmail.setText(rs.getString(5));
					tfRelation.setText(rs.getString(6));
				
//				rs.getInt(1);
//				rs.getString(2);
//				rs.getString(3);
//				rs.getString(4);
				
			}
			conn_mysql.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	private void conditionQuery() {
		int i = cbSelection.getSelectedIndex();
		String conditionQueryName = "";
		
		switch(i) {
		case 0:
			conditionQueryName = "name";
			break;
		case 1:
		conditionQueryName = "adress";
		 break;
		case 2:
		conditionQueryName = "relation";
		break;
		default:
			break;
			
		
		}
		tableInit();					
		clearColumn();					//목록을 지워줘야 한다	
		conditionQueryAction(conditionQueryName);			//검색 버튼의 이밴트
		
	}
	
	private void clearColumn () {
		tfSequenceNo.setText("");
		tfName.setText("");
		tfTelNo.setText("");
		tfAdress.setText("");
		tfEmail.setText("");
		tfRelation.setText("");
		
	}

	private void conditionQueryAction(String conditionQueryName ) {
		String query1 = "select seqno, name, telno, relation from userinfo where " + conditionQueryName;
		String query2 = "like '%" + tfSelection.getText() + "%'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql );
			Statement stmt_mtsql = conn_mysql.createStatement();
			
			
			
			
			ResultSet rs =  stmt_mysql.executeQuery(query1 + query2);
			while(rs.next()) {
				String[] qTxt = {Integer.toString(rs.getInt(1)),Integer.toString(rs.getInt(2)),Integer.toString(rs.getInt(3)),Integer.toString(rs.getInt(4))};
				outer_Table.addRow(qTxt);
				
				

			}
			conn_mysql.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("수정");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					update();
				}
			});
			btnUpdate.setBounds(119, 461, 117, 29);
		}
		return btnUpdate;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("삭제");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					deleteAction();
				}
			});
			btnDelete.setForeground(Color.RED);
			btnDelete.setBounds(262, 461, 117, 29);
		}
		return btnDelete;
	}
	
	
	
	private void update () {
		updateAction();					//업데이트 해 주고
		tableInit();					//테이블 불러오고	
		clearColumn();					//목록 지워주고
		searchAction();					//검색한다
		
	}
	
	private void updateAction() {
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			statement stmt_mysql = conn_mysql.createStatement();
					
					String query = "update userinfo set name=?, telno=?, address=?, email=?, relation=?, SequenceNo=? ";
					String query1 = "where seqno=?";
					
					ps = conn_mysql.prepareStatement(query + query1);
					ps.setString(1, tfName.getText().trim());
					ps.setString(2, tfTelNo.getText().trim());
					ps.setString(3, tfAdress.getText().trim());
					ps.setString(4, tfEmail.getText().trim());
					ps.setString(5, tfRelation.getText().trim());
					ps.setInt(6, Integer.parseInt(tfSequenceNo.getText()));
					
					ps.executeUpdate();
					
					conn_mysql.close();
					
					JOptionPane.showConfirmDialog(null, tfName.getText() + "님의 정보가 수정되었습니다.");
					
										
					
					
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void deleteAction () {
		
		
	}
	
	
	
	
	
	
	
}

