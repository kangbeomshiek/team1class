package com.base;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
					//Set
		
		
				HashSet<Integer> hashSet = new HashSet<Integer>();
				hashSet.add(1);
				hashSet.add(2);
				hashSet.add(3);
				hashSet.add(4);						//중복된 데이터는 수용하지 않음
				hashSet.add(4);
				hashSet.add(4);
				hashSet.add(4);
				System.out.println(hashSet);
		
				hashSet.remove(4);
				System.out.println(hashSet);
				
				
				
		
							
	}

}
