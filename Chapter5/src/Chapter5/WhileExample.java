package Chapter5;

public class WhileExample {
	public static void main(String[]args) {
		
		int num = 1; //변수선언
		int sum = 0; //변수선언
		
		while(num <= 10) { //while문 코드
			sum += num; //num의 값을 sum에 더하는 코드
			num++; //num은 하나씩 증가 
		}
		
	    System.out.println(sum);//출력코드
	    System.out.println(num);//출력코드	
	    
	}

}
