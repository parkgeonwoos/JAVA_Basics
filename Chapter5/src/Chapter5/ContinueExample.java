package Chapter5;

public class ContinueExample {

	public static void main(String[] args) {
		
		int num; //변수 선언
		
		for (num =1 ; num <= 100; num++) { //for문 코드
			if((num % 3)!=0)  //3의 배수가 아닐경우
				continue; //다시 조건문으로 돌아가라
			
				System.out.println(num); //3의 배수들만 출력 코드
			
		}

	}

}
