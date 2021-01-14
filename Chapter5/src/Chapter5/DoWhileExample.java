package Chapter5;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1; //변수 선언 
		int sum = 0; //변수 선언

		do {  //do-while문 코드
			sum += num;
			num++;
			
		}while(num <=10);
		
		System.out.println(sum); //출력 코드
		System.out.println(num); //출력 코드
	}

}
