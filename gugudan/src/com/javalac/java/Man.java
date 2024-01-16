package com.javalac.java;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Man {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scanner = new Scanner(System.in);
		int num1 = 0;

//		int dan = 1;
		
		
		
		
		for( int i = 1; i<=9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
                if ( dan*i % 2 == 0 ) {
                	System.out.print(dan + "x" + i +"=" + (dan*i) + "\t\t" );
                	
               }  	else if ( dan*i % 2 == 1 ) {
               		  System.out.print("\t\t");
                	  
                	
                	
                }
              

		                  

				//	단이 1 올라갈때마다 줄바꾸기
			}
             	System.out.println();
	 }
		//구구단 2단 출력
//		 for (int dan =2; dan <= 9; dan++) {			 		
//			 for ( int i=1; i <=9; i++) {
//				 System.out.println(dan + "x" + i + "=" + (dan*i) );
//			 
//		 }
		
			   
		   
		   
		 
	
		 
		 
//	             				
//		System.out.println("구구단으로 사용할 숫자를 입력하세요!");
//		    num1 =  scanner.nextInt();
//		    
//		       for (int i = 1; i <=9; i++) {
//		    	   System.out.println(num1 + "x" + i + "=" + (num1 * i));
		    	   
//		       }
		
		
		
		
		
	}

}
