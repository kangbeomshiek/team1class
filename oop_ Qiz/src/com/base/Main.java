package com.base;

import com.fun.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();							//Method 를 쓰는거면 뒤에() 가있어야함
		System.out.println("car1.company =" + car1.company);
		//현대자동차
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company = " + car2.company);
		//현대자동차
		
		System.out.println("car2.model = " +car2.model);
		//자가용
		
		
		
		
		
		
	}

}
