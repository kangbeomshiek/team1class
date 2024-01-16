package com.javalec.funtion;

public class SumEvenOdd {
			//Field
					
			//constructor    여기서  일을 다 하고싶다면  public void 를 사용
			public SumEvenOdd() {
				// TODO Auto-generated constructor stub
			}	
			//Method
//1 .합계를 구한다	      int 로 넘겨줄것     이 목록을 받는다  (순서가 중요)
			
			   //매소드 이름은 소문자 사용    method 안에 변수는 파라미터 라고 부룸
			 public int sumCalc(int num1, int num2) {
				 int sum =0;
				 for( int i = num1; i<=num2; i++) {
					 sum+=i;
				 }
				 return sum;
			 }
			
			
			
	//2.합계가 짝수인지 홀수인지 판단
		public String evenOdd(int sum) {
			String result ="";
			if ( sum % 2 == 0 ) {
				result ="짝수입니다";
			}else {
				result = "홀수입니다";
			}
		  return result;
		}
			
			
			
			
			
	
}
