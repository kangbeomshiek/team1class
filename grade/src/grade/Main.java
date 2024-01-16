package grade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
		
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		String result  = "";
	    System.out.println("학점 관리");
		System.out.print("성적을 입력하시오 :");
	       
		num1 = scanner.nextInt();  
	       
		
//		if(num1 > 10 ||num1 < 0 ) {    //점수가 비정상일
//			System.out.println("점수를 다시 입력하시오");	
//		}else {		
//	    if(num1 == 9)     //점수가 정상일때
//	    	gradeResult = "A";
//	    else if (num1 == 8 ) 
//	    	gradeResult = "B";
//	    else if (num1 == 7 ) 
//	    	gradeResult = "C";
//	    else if (num1 == 6) 
//	    	gradeResult = "D";
//	    else gradeResult = "F";
//	    	System.out.println("귀하는" + gradeResult + "점 입니다");
//	    	
	    	
	    	
//	       if(num1 == 100 && num1 <101) {
//	    	   System.out.println("A+입니다");
//	    	
//	       }else if(num1 >= 90 && num1 <100) {
//	    	   System.out.println("A입니다");
//	    	   
//	       }else if (num1 >=70 && num1 <90) {
//	    	   System.out.println("B입니다");
//	    	   
//	    	   
//	       }else if (num1 >= 0 && num1 <70) {
//	    	   System.out.println("C입니다");
//	       
//	       }else { System.out.println("다시 입력해 주십시오");
	         if ( num1 > 100 || num1 < 0 )
	        	   System.out.println("학점을 다시 입력하세요");
	         else {
	      switch (num1 / 10) {
	      case 10 :
	      case  9 :              //점수가 정상일때
		    	result = "A";
		    	break;
   		  case  8 : 
		    	result = "B";
	       break;
	       	case  7 : 
		    	result  = "C";
		    	break;
	       case  6 :
		    	result = "D";
		    	break;
	       default:
	    	   result = "F";
	    	   break;
		}
	      System.out.println("귀하는" + result + "점 입니다");
	         }
	      
	      
//	      
//			switch (num1 / 10 )   {
//	        case  9 :              //점수가 정상일때
//		    	result = "A";
//	        break;
//	       case  8 : 
//		    	result = "B";
//	       break;
//	       case  7 : 
//		    	result  = "C";
//	       break;
//	       case  6 :
//		    	result = "D";
//	       break;
//			 default :  
//		    result = "F";
//		    break;
//			}
			
		    		
			    			       
			  	       
		    	
		    }	

}