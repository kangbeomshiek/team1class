package day4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
		double num1 = 0;
		double num2 = 0;
	  
	   
	   
		
		System.out.println("**BMI계산기");
	    System.out.print("신장(cm)을 입력 하세요 :");
	        num1 = scanner.nextDouble();
	    System.out.print("몸무게(kg)를 입력하세요 : ");
	        num2 = scanner.nextDouble();
	        
	        num1 =num1 / 100;
	        double bmi =  num2 / (num1 * num1) ;
	        
	        
//	        (num2) / (num1 *	 num1)
	    
	        
	         if (bmi  >= 30 ) {
	              System.out.println("(결과)귀하는 고도비만 입니다.");
	         }else if  (bmi  >= 25 )     {
                  System.out.println("(결과)귀하는 비만 입니다.");
	         } else if  (bmi  >= 23  )   {
	              System.out.println("(결과)귀하는 과체중 입니다.");
	          }else if (bmi  >= 18.5  )    {  
            	  System.out.println("귀하는 정상체중 입니다.");
             } else if (bmi  >= 0   )     {
                  System.out.println("(결과)귀하는 저체중 입니다.");
             }  else {
            	 System.out.println("다시 입력하여주세요");
            	 
             }
	         
                	 
                  
	         
	        
		
		
		
		
	}

}
