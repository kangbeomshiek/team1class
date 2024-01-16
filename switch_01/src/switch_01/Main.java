package switch_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		       switch
		 
		Scanner scanner = new Scanner(System.in);
		   int inputNumber = 0;
		   String result = "";
		   
		
		
//		if문사용
		   System.out.println("숫자를 입력하세요 :");
		    inputNumber = scanner.nextInt();
		    
		     if(inputNumber % 2 == 0 ) {
		    	   result = "짝수";
		    	  
		     }else {
		    	 result = "홀수" ;
		    	 
		     }
		
//		     switch문
		    switch(inputNumber % 2 ) {
		    case 0 : 
		    	result = "짝수";
		    	break ;
		    case 1 : 
		        result = "홀수";
		    	  default :
		    }
		     
		    System.out.println("입력하신 숫자 " + inputNumber + "은(는)" + result + "입니다");
		    
	}

}
