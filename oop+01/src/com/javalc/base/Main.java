package com.javalc.base;

import java.util.Scanner;

import com.javalec.funtion.SumEvenOdd;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    //범위의 합계를 구하고 홀수 짝수인지 판별
		SumEvenOdd evenodd = new SumEvenOdd();
		int startNum = 0;
		int endNum = 0;
		int sum =0;
			Scanner scanner = new Scanner(System.in);
		System.out.print("범위의 숫자중 작은 숫자");
		startNum = scanner.nextInt();
		System.out.print("범위의 숫자중 큰 숫자");
		endNum = scanner.nextInt();
		
		
		
		sum = evenodd.sumCalc(startNum, endNum);
		System.out.println(startNum+ "~"  + endNum + "까지의 합 :"+ sum);
		System.out.println(evenodd.evenOdd(sum));
		
	}

}
