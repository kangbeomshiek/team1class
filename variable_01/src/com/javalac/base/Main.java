package com.javalac.base;

import java.net.MulticastSocket;

public class Main {
 public static void main(String[] args) {
	 System.out.println("1234");
	 System.out.println(1234);
	 
	 System.out.println("asdf");
	 
	 
	 //  변수(variable)
	 
//	- 정수
	int num1 = 10;
   System.out.println(num1);
   num1 = 100;
   System.out.println(num1);
   System.out.println("1234+1="  + (1234 + 1));
   int firstNumber = 10;
     int num3 = 20;  
     
     
     
//     덧셈
       System.out.println(firstNumber + "+" + num3 + "=" + (firstNumber+num3));

//      나눗셈
     System.out.println(num3 + "%" + firstNumber + "=" + (num3%firstNumber));
//     곱셈
     System.out.println(num3 + "*" + firstNumber + "=" + ((double)num3*firstNumber));
     
      
      
//       
     System.out.println(num3 + ">" + firstNumber + "=" + (num3>firstNumber));
     
	       
	       
	    System.out.println(10.0/20.0);
	    
//	변수작명
	    /*
	     -변수는 의미 전달
	     1) camel  : 2단어의 연결중 첫번째 단어는 소문자로 시작하고 두번째 단어는 대문자로 시작
	    Ex) appleFruit  firstNumber 
	       사용:변수이름,Method 이름 
	       2) pascal :2단어의 연결중 첫번째 단어는 대문자로 시작하고 두번째 단어도 대문자로 시작
	      ex) AppleFruit, FirstNumber
	      사용:class 이름
	      3) snake: 2단어의 연결을 under bar 로
	      ex) apple_fruit, first_number
	      사용: 번수이름,method 이름
	      
	     */
	       
//	     상수(constant)
	    final double  pi = 3.141592;
	    
	    
//	    constNumber = 100;
	    
	    System.out.println(pi);
	    
	   System.out.println("----------------");
	   
	   int intNum1 = 20;
	   int intNum2 = 10;
	   
//	   자바에서 정수형인대 값이없으면 0
//	   인트에다가 실수를 넣으면 에러
	  
	   int intNum3;
	   intNum3= intNum1 + intNum2;
	   char char1 = '가';
	   String str1 = "가나다라마바";
//	 더블에는 정수,실수 전부 가능
	  double doubleNum = 10.123;
	   
	 boolean boolNum1 = true;
	 boolNum1 = false;
//	 메모리를 제일 적게차지하면서 저장할수있는 블린 true 1    false 0
	      
	    	doubleNum = intNum3;
	    	intNum3 = (int)doubleNum;
	    	
//	    큰 숫자가 작은 숫자에 들어갈수 없음       특이   실수 뒤에 0.ㅁㅁㅁㅁ전부 버림
	    
	    	
	    		
	 
	 
 }
 
}

