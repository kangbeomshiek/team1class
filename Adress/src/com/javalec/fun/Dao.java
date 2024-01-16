package com.javalec.fun;

import java.beans.Statement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Dao {
	//Field
	private final String url_mysql = ShareVar.dbName;
	private final String id_mysql = ShareVar.dbUser;
	private final String pw_mysql = ShareVar.dbPass;
	
	int seqno;
	String name;
	String telno;
	String address;
	String email;
	String relation;
	FileInputStream file;
	
	
	
	//constructor
	
	public Dao() {
		// TODO Auto-generated constructor stub
	}	
	
	
	
	//Method

	public Dao(int seqno, String name, String telno, String address, String email, String relation, FileInputStream file) {
		super();
		this.seqno = seqno;
		this.name = name;
		this.telno = telno;
		this.address = address;
		this.email = email;
		this.relation = relation;
		this.file = file;
	}



	public Dao(int seqno) {
		super();
		this.seqno = seqno;
	}






	public Dao(String name, String telno, String address, String email, String relation,FileInputStream file) {
		super();
		this.name = name;
		this.telno = telno;
		this.address = address;
		this.email = email;
		this.relation = relation;
		this.file = file;
	}



	//검색결과를 Table 로 보내자
	public ArrayList<Dto> selectList() {
			ArrayList<Dto> dtoList = new ArrayList<Dto>();
			String whereDefault = "select seqno, name, telno, relation from userinfo";
			 
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
				Statement stmt_mysql = conn_mysql.createStatement();
				
				ResultSet rs = stmt_mysql.executeQuery(whereDefault);
				
				while(rs.next()) {
					int wkSeq = rs.getInt(1);
					String wkName = rs.getString(2);
					String wkTelno = rs.getNString(3);
					String wkRelation = rs.getString(4);
					
					Dto dto = new Dto(wkSeq, wkName, wkTelno, wkRelation);
					dtoList.add(dto);
				}
				conn_mysql.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
	
	return dtoList;
	}
			

//Table 을 Click 하였을 경우
			public Dto tableClick() {
				Dto dto = null;
				
				String where1 = "select seqno, name, telno, address, email, relation, file from userinfo";
				String where2 = "where seqno = " + seqno;
				ArrayList<Dto> dtoList = new ArrayList<Dto>();
				String whereDefault = "select seqno, name, telno, relation from userinfo";
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
					Statement stmt_mysql = conn_mysql.createStatement();
					
					ResultSet rs = stmt_mysql.executeQuery(whereDefault);
					
					while(rs.next()) {
						int wkSeq = rs.getInt(1);
						String wkName = rs.getString(2);
						String wkAddress = rs.getString(3);
						String wkEmail = rs.getString(4);
						String wkTelno = rs.getNString(5);
						String wkRelation = rs.getString(6);
						
						
						//file
						ShareVar.filename = ShareVar.filename = 1;				//파일 이름을 1번부터 짓는것
						File file = new File(Integer.toString(ShareVar.filename));
						FileOutputStream output = new FileOutputStream(file);
						InputStream input = rs.getBinaryStream(7);
						byte[] buffer = new byte[1024]; 				//파일을 짜르는 크기
						while(input.read(buffer) > 0) {
							output.write(buffer);						//output 으로 생성
							
						}
						
		//id,sales,col,size,qua				
						
						 dto = new Dto(wkSeq, wkName, wkTelno, wkAddress, wkEmail, wkRelation);
					
						 
						 
						 
					}
					conn_mysql.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
		
		return dto;
			}
			

//}
//입력
					public boolean insertAction () {
						PreparedStatement ps = null;
					}
						Dto dto = null;
						
						String where1 = "select seqno, name, telno, address, email, relation from user";
						String where2 = "where seqno = " + seqno;
						ArrayList<Dto> dtoList = new ArrayList<Dto>();
						String whereDefault = "select seqno, name, telno, relation from userinfo";
						
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
							Statement stmt_mysql = conn_mysql.createStatement();
							
						
							String A = "insert into userinfo ( name, telno , address , email , relation, file";
							String B = ") calues (?,?,?,?,?,?)";
							
							ps = conn_mysql.prepareStatement(A+B);
							ps.setString(1,name);
							ps.setString(2,telno);
							ps.setString(3,address);
							ps.setString(4,email);
							ps.setString(5,relation);
							ps.setBinaryStream(6,file);
							ps.executeUpdate();
		//품명 가격 색깔 사이즈 수						
							
							
							conn_mysql.close();
						}catch(Exception e) {
							return false;
						}
				
				return true;
					}
// 수정
    public void updateAction () {
    
    
PreparedStatement ps = null;

	Dto dto = null;
	
	String where1 = "select seqno, name, telno, address, email, relation from user";
	String where2 = "where seqno = " + seqno;
	ArrayList<Dto> dtoList = new ArrayList<Dto>();
	String whereDefault = "select seqno, name, telno, relation from userinfo";
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		
	
		String A = "insert into userinfo ( name, telno , address , email , relation";
		String B = ") calues (?,?,?,?,?)";
		
		ps = conn_mysql.prepareStatement(A+B);
		ps.setString(1,name);
		ps.setString(2,telno);
		ps.setString(3,address);
		ps.setString(4,email);
		ps.setString(5,relation);
		ps.setInt(6, seqno);
		ps.executeUpdate();
			
		
		
		conn_mysql.close();
	}catch(Exception e) {
		return;
	}
	
return true;
}