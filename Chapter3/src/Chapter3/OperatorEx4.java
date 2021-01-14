package Chapter3;

public class OperatorEx4 {

	public static void main(String[] args) {
		int num1 = 0B00001010; //2진수 (10) 선언
		int num2 = 0B00000101; //2진수 (5) 선언
		System.out.println(num1 & num2);//비트 곱 출력 코드
		System.out.println(num1 | num2);//비트 합 출력 코드
		System.out.println(num1 ^ num2);//비트 xor 출력 코드
		System.out.println(num2 << 1); //시프트 연산자 출력 코드
		System.out.println(num2 << 2); //시프트 연산자 출력 코드
		System.out.println(num2 >>2); //시프트 연산자 출력 코드
		
	   
	    
	}

}
