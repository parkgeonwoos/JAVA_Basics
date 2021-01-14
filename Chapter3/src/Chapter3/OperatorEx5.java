package Chapter3;

public class OperatorEx5 {

	public static void main(String[] args) {
		int num1 = 10; //변수 선언
	    int i = 2; //변수 선언 
	    boolean value = ((num1=num1+10)<10)&&((i=i+2)<10); //논리곱을 확인하기 위한 조건 코드
	    System.out.println(num1);//논리곱일 경우 앞에 조건부터 false이므로 앞게 조건만 늘어난 값으로 저장
	    System.out.println(i);//논리곱일 경우 앞에 조건부터 false이므로 앞게 조건만 늘어난 값으로 저장
	    System.out.println(value);//당연히 False 출력
        int num2 = 10; //변수선언
        int num3 = 20; //변수선언
	    int max = (10>20)? num2 : num3; // 삼항연산자를 이용한 조건 코드
	    System.out.println(max);//출력코드 
	    
	}

}
