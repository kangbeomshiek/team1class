package com.javalac.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner scanner = new Scanner(System.in);
		   
		
		int num1 = 0, fnum = 0;
		int num2 = 0, snum = 0;
		int num3 = 0;
	    int tot = 0;       //숫자의 총 
		int numall = 0;      //   배수인 숫자의 갯수
		int Btot = 0;        //  배수의 합
	    double Btotcount = 0;    //배수의 평균
	    int Lnum = 0;
int Anum2 = 0;
 int Snum = 0;

	    
		
		
		
		   System.out.print("시작하는 숫자를 정하세요 :");
		   num1 =   scanner.nextInt();		  
		   System.out.print("범위의 끝 숫자를 정하세요 :");
		   num2 =   scanner.nextInt();
		   System.out.print("원하는 배수는? :");
		   num3 =   scanner.nextInt();
		
	         
		   
		
		    if (num1 > num2 ) {
		    	   fnum = num2;
		    	  snum = num1;
		       } else {
		    	   fnum = num1;
		    	   snum = num2;
		    	   
		       }
		   
		   
		   
		   
		   for(int i = fnum; i <= snum; i++) {
			      tot +=i;					 
			      if ( i % num3 == 0 ) {
			    	     Btot +=i; 
			    	    numall ++;
			    	    
			        if ( Lnum < i) {
			             Lnum = i;
			        		
			        	
			        
			              
			        	
			        
			        }   if (i % Lnum == 0 && Snum > 0 ) {
			        	       Snum = i;
			        }
 			        

			    		        }
			    		         
			    		    }
			    	 
			        
			        
			    	
		   
			     
			  
		      
			
			    	 
			       
			      
		   
		         
		   
	
		   		 
		   
		   	Btotcount = ((double)Btot/numall) ;
		    
		   
		   
		   
		 System.out.println(num1 + "부터" + num2 + "범위중" + num3 + "의 배수의 숫자의 갯수는" +  numall +" 개이고 합은 " + Btot + "입니다" );
	     System.out.println(num3 + "의 배수의 평균은" + Btotcount + "이고");
	     System.out.println(num3 +"의 배수의 숫자중 최대 숫자는 " + Lnum + "이고 최소 숫자는" + Snum + "입니다");
	     
//		
		
		
	}

}
