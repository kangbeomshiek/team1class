package com.java.day4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
//		문자비교
	
		Scanner scanner = new Scanner(System.in);
		String id = "";
		String Password = "";
		
		
		String realId = "root";
		String realPassword = "1234";
		
		
		
		
		
	System.out.println("Log In Check");
	      
	    System.out.print("ID를 입력하세요 :");
		    id = scanner.next();
		    
	    System.out.print("Password를 입력하세요 :");
		    Password = scanner.next();
		
		
		    if(realId.equals(id) && realPassword.equals(Password)  ) {
		          System.out.println("환영합니다");
		          
		    } else {
		    	System.out.println("ID나 Password를 확인하세요");

		    }
		    
		
	}

}
