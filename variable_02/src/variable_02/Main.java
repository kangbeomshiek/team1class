package variable_02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    연산자종류별 출력 
		int num1= 10;
		int num2 = 2;
		int num3 = 5;
		System.out.println("<< 산술 연산자 >>>");
	System.out.println("덧셈 :" +num1 + "+" + num2 + "=" + (num1+num2));
	System.out.println("뺄셈 :" +num1 + "-" + num2 + "=" + (num1-num2));
	System.out.println("곱셈 :" +num1 + "*" + num2 + "=" + (num1*num2));

	System.out.println("나눗셈  몫:" +num1 + "/" + num2 + "=" + (num1/num2));
	System.out.println("나눗셈  나머지 :" +num1 + "%" + num2 + "=" + (num1%num2));
	
         
    System.out.println("<<<자동 증감 연산자 >>>");
    num1 = num1 + 1;
//   =기준 오른쪽부터 계산 후 왼쪽으로넘겨줌num1에 미래에 1을 
     num1 += 1;
//	위에꺼와 같은 의미
//   덧셈으로 1을 누적한다    
       num1++;
//      이건 무조건 하나씩 올라간다는 뜻
       System.out.println("증가 :" + num1);
       num1 = num1 - 1;
       num1 -=1;
       num1--;
       System.out.println("감소 :" + num1);
          
	
	
	
       System.out.println("<<< 동등 비교 관계 연산자 >>>");
           System.out.println("num1 == num2 :" + (num1==num2)); 
              
//           같다의 기호는 ==			 num1 ==num2  true        num1 !=num2   false
          
           System.out.println("num1 != num2 :" + (num1!=num2)); 
//	주어동사목적어 순  영ㅇ어의 문법
           System.out.println("num1 > num2 :" + (num1>num2)); 
           System.out.println("num1 < num2 :" + (num1<num2)); 
           System.out.println("num1 >= num2 :" + (num1>=num2)); 
           System.out.println("num1 <= num2 :" + (num1<=num2)); 
           
           
           System.out.println("<<< 논리연산자 >>>");
           /*
            * 1 && 2       1과 2가 둘다 참일때 
            * 
            * true & true => true
            * true && false => false
            * false && true => false
            * false && false =>false
            * 
            */
           System.out.println("num1 > num2 && num2 > num3 :" + ((num1>num2) && (num2>num3)));
//          1 또는 2
           
//          or
           
           System.out.println("num1 > num2 || num2 > num3 :" + ((num1>num2) || (num2>num3)));
           
           
           
           System.out.println("<<< 삼항 연산자 >>>");
//              7이 3의 배수인지 판단
          System.out.println("7이 3의 배수인가? :" + (7 % 3 == 0 ? "3의배수" :"3의배수 아님"));
          String result = (7 % 3 == 0 ? "3의배수" : "3의배수 아님");
          System.out.println(result);
          /*
           * 등록 id asdf
           * password : 1234
           * 입력 아이디 qwe
           * 1234
           * 
           */
          
          
//           System.out.println("qwe : " + ( "qwe == asdf" ?"환영합니다" : "i나 password를 다시 입력하시"));
           
           
           
        
           String ipass = "abcd";
           int iid = 1234;
           String id = "qwe";
           int pass = 1234;
           
        	System.out.println("abcd" == "qwe" &&	"1234  ==1234");
    
           
           
           
        		   
        		   
        		 
             
      
          
         
          
           
        		  
            
	
	
	}

}
