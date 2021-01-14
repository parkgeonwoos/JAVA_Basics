package Chapter3;

public class OperatorEx1 {

	public static void main(String[] args) {
		int score = 100;// 변수에 값을 대입
		System.out.println(++score);  //변수의 값을 먼저 1을 올린 후 출력 코드
	    System.out.println(score++); //변수의 값을 출력을 먼저 한 이후 더해주는 코드
	    System.out.println(score); //값이 나중에 추가된 것을 확인하기 위한 코드
	    System.out.println(--score); // 변수의 값을 먼저 1을 감소한 후 출력 코드
	    System.out.println(score--); //변수의 값을 출력을 먼저 한 이후 감소하는 코드
	    
	}

}
