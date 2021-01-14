package Chapter5;

public class BreakExample {

	public static void main(String[] args) {
		
		int sum = 0; //변수 선언
		int num; //변수 선언
		for(num =1 ; ; num++) { //for문 코드
			sum += num; //num값을 증가시키면서 sum에 더하여 저장
			if (sum >= 100) //if문 
				break; //break
		}
		System.out.println(sum); //출력 코드
		System.out.println(num); //출력 코드

	}

}
