package coin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);


		int num1 = 0;

		System.out.print("금액을 입력하세요 : ");
		  num1 = scanner.nextInt();
		  
		  
		 if( num1 >8000) {
			 System.out.println("너무 비쌉니다");
		 }else if( num1 > 5000 ) {
		  System.out.println("조금 비쌉니다");
		 }else if( num1 > 3000) {
			 System.out.println("적당한 금액입니다");
		
		 }else if( num1 < 3000) {
			 System.out.println("싼편 입니다");
			 
		 }

		 
		 
	}

}
