package tes;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
	        
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		
		
		
		
		
		System.out.print("국어 점수를 입력하세요 : ");
		 	num1 = scanner.nextInt(); 
		System.out.print("영어 점수를 입력하세요 : ");
		  	num2 = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		    num3= scanner.nextInt(); 
		System.out.println("평균점수 : " + (num1 + num2 + num3) / 3 ) ;
		 
		if ( num1 >(num1 + num2 + num3) / 3)  
			System.out.println("국어 점수가 평균보다 높습니다");
		   else  if  ( num1 ==(num1 + num2 + num3) / 3) 
			  System.out.println("국어 점수가 평균입니다");
		  else if   ( num1 <(num1 + num2 + num3) / 3) 
			   System.out.println("국어 점수가 평균 아래입니다");
		   
			   
			   
			   
			   
		if ( num2 >(num1 + num2 + num3) / 3) 				 				  
			System.out.println("영어 점수가 평균보다 높습니다");				  
		     else if  ( num2 == (num1 + num2 + num3) / 3)  
				  System.out.println("영어 점수가 평균입니다");
			else if( num2 <(num1 + num2 + num3) / 3)  
					  System.out.println("영어 점수가 평균보다 낮습니다");
			
					  
					  
					  
		if ( num3 >(num1 + num2 + num3) / 3) 
			   System.out.println("수학 점수가 평균보다 높습니다");
			   else if ( num3 == (num1 + num2 + num3) / 3) 
			   System.out.println("수학 점수가 평균입니");
			   else if  ( num3 <(num1 + num2 + num3) / 3)  
						  System.out.println("수학 점수가 평균보다 낮습니다");
						  
				  
			  }
		   
	}

		 
		   
	
	
	


