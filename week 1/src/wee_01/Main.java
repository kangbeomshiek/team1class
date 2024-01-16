package wee_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
//					수의 범위를 입력받아 총합,평균,짝수합,짝수평균,홀수합,홀수평균 을 나타내시오.
      	          //property
		Scanner scanner = new Scanner(System.in);
		   int num1 = 0,fnum =0;      //시작
 		   int num2 = 0, snum = 0;    //끝
		   int tot =0;                // 총합
		   int totCount = 0;          //총합횟수
		   int oddtot =0;              // 홀수총합
		   int oddtotCount = 0;        //홀수총합횟수
		   int eventot =0;              // 짝수총합
		   int eventotCount = 0;        //짝수총합횟수
		System.out.print("덧셈 시작 수를 입력하세요:");
		  num1 = scanner.nextInt();
//		   System.out.println(num1);   
		
		  System.out.print("덧셈  수를 입력하세요:");
		  num2 = scanner.nextInt();
//		   System.out.println(num2);   
		  
		  
		  
		    //시작숫자와 끝숫자를  비교하여 시작과 끝을 정렬하자
		       if (num1 > num2 ) {
		    	   fnum = num2;
		    	  snum = num1;
		       } else {
		    	   fnum = num1;
		    	   snum = num2;
		    	   
		       }
		  
//		System.out.println(fnum + "/" + snum);
		
		
		    //숫자의 총합 구하기
		      for (int i =fnum; i<=snum; i++) {
//		    	  System.out.println(i);
		    	    tot += i;
		    	    totCount++;      //숫자의횟수 구하기
		    	    if (i % 2 == 1 ) {     //홀수인경우
		    	    	oddtot +=i;
		    	    	oddtotCount ++;
		    	    }else {
		    	    	eventot += i;      //짝수인경우
		    	    	eventotCount ++;   
		    	    }
		      }
		
		//출력하기
		      System.out.println("결과 : ");
		      System.out.println("1) 숫자의 총합은 " +tot + "이며 평균은" + ((double)tot/totCount) );
		      System.out.println("2) 홀수의 총합은 " +oddtot + "이며 평균은" + ((double)oddtot/oddtotCount) );
		      System.out.println("3) 짝수의 총합은 " +eventot + "이며 평균은" + ((double)eventot/eventotCount) );
		
	}

}
