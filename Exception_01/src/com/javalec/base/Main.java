package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 예외처리 방법

		
		int i =10;
		int j =0;
		
		
		
		
		System.out.println("Add :" + (i+j));
		System.out.println("Sub :" + (i-j));
		System.out.println("Mul :" + (i*j));
		
		
		
		
		
		try {													//이것을 시도해보고
			System.out.println("Div :" + (i/j));
		}catch(Exception e){											//시도에 이상이 있으면 아래를 실행
//			e.printStackTrace();
			System.out.println("숫자를 다시한번 확인하세요");
		}finally {
			
		}
//		System.out.println("Div :" + (i/j));
		
	}
					
}
