package plus;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
	
		int in1 = 0;
		int in2 = 0;
		
		
		
					System.out.print("덧셈 시작 수를 입력하세요 : ");
					in1 = scanner.nextInt();			        
					System.out.print("덧셈 끝수를 입력하세요 : ");
					in2 = scanner.nextInt();
							
					   int     all = 0;
					    int  i = in1;
					  if ( in1 < in2 )  
						  
					  
//						for (in1 = i;  i <= in2 ; i++ )  																								     												        											        						 
						        	 for (in1 = i; i <= in2; i++) 
						        		 all +=i;
						        		 
						         		 
	
						        	 
						         
						         System.out.println("숫자의 총 합" + all + "이며 평균은" + ( all ) / (in2 - in1) + "." );
						 
	                              if ( in1 > in2 )  
						        	 System.out.println("슷자의 총 합은" + all + " 이며평균은" + (all) / (in2 - in1 ) + "." );
						        	 
	
	
	
						               
//						                 System.out.println("짝수의 합은 " + all2 + "이고 그 평균은 " +pall2 + '');
						        	
						    		
						      
					    	  
					    	  
	}
//						System.out.println("결과 :" + in1 + "~" + in2 + "까지의 합은 "+ all + "입니다");
					
	}
						
						
