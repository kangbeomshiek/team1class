package com.base;

import java.util.ArrayList;

import com.model.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
						//ArrayList
//		
//				ArrayList<String> arrayList = new ArrayList<String>();					//배열 선언
//				
//				
//				 arrayList.add("str1");
//				 arrayList.add("str2");
//				 arrayList.add("str3");
//				 arrayList.add("str4");
//				 
//				 
//				 
//				 
//				 System.out.println(arrayList);
//				 		System.out.println(arrayList.size());				//배열의 .length
//		
//				 			for ( int i=0; i <arrayList.size(); i++) {
//				 				System.out.println(arrayList.get(i));
//				 			}
//				 		
//				 			System.out.println(arrayList.get(3));
//				 			
//				 			// 수정
//				 			
//				 			arrayList.set(3, "str111");    			//.set 은 수정
//				 			System.out.println(arrayList);
//				 			
//				 			//삭제
//				 			
//				 			arrayList.remove(1);
//				 			System.out.println(arrayList);
//				 			arrayList.remove("str1");						//중복된걸 다 지울려면 removeAll 사용
//				 			System.out.println(arrayList);
//				 		System.out.println(	arrayList.remove("aaaa"));		
//				 		//
//				 		arrayList.add(0, "aaa");
//				 			System.out.println(arrayList);
//				 		arrayList.clear();								//List 안에 데이터를 다 지운다
//				 		System.out.println(arrayList);
//				 			
		
						User user;
						
						ArrayList<User> arrayList = new ArrayList<User>();
						arrayList.add(new User("a" , "111" , "서울" , "010-1111-2222"));
//						System.out.println(arrayList.get(0).getId());
//						System.out.println(arrayList.get(0).getPw());
//						System.out.println(arrayList.get(0).getAddress());
//						System.out.println(arrayList.get(0).getPhone());
		     	
						
						
						
						
						
	}

}
