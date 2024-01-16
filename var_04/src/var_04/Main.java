package var_04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		desc:사용자에게 정수를 입력 받아 짝수 인지 홀수 인지 판별한다
//	date 2023.11.23
//	author knag
//		--------------------------------------------------//
		
//		property
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;    //사용자에게 입력받은 정수
		String result ="";  //짝수인지홀수인지 판단결
		
		//input
		System.out.print("정수를 입력하세요 :");
		
		 inputNumber  = scanner.nextInt();
//		  System.out.println(inputNumber % 2 == 0);
		  
//	process
		result = (inputNumber % 2 == 0 ? "짝수" : "홀수");
		
		
		
		
		//output
		System.out.println("입력하신" + inputNumber +"는(은)" + result +  "입니다");
		
		
		
		
		
	}
 private void syso() {
	// TODO Auto-generated method stub


}
