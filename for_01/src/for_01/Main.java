package for_01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		           반복문
		        //i=i+1   ==  i++  
//		           +=  누적 의 의미
		
//		       start    end   stack
//		for (int i=1; i<=10; i+=2) {
//			System.out.println(i);
			
		
			
//					1 	부터 10 까지 의 합계                
		        											
		        											
		        											}
//		        int tot = 0 ;
//               for(int i=1; i<=10; i ++) {
//            	   tot+=i;
////            	   tot = tot + i;
//               }
//	           System.out.println(tot);
//	           
         
		
		//1부터 100까지의 홀수만 출력
//				int oddtot = 0;
//				
//			for (int i = 1; i <=100; i++ ) {
//				if(i % 2 == 1 ) {
//					 oddtot += i;
//					 
//					 
//				}
//			}
//	
//	System.out.println(oddtot);
	            int oddall = 0;
	            int evenall = 0;
	            
		
		for (int i = 1; i <=100; i++) {
			if(i % 2 == 0) {
				evenall +=i;
			if(i % 1 == 0) {
				oddall +=i;
		
				
				
			}
			}
		}
		System.out.println(evenall);
		System.out.println(oddall);
		
		
   
		
	
}
   
}
