package Chapter5;
import java.util.Scanner;
public class DoWhileCompareWhile1 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);//scanner 호출
		int sum = 0; //합계를 할 변수 선언
		int num;//내가 직접 입력할 숫자 선언
		
		do { //do-while문 코드
			num = scanner.nextInt(); //내가 더할 숫자들을 입력
			sum+=num; //입력한 숫자들을 계속 sum에 더함
			
		}while(num != 0); //num이 0이 입력되기 전까지 반복
		
		System.out.println(sum); //그 동안 더한 코드들을 출력하는 코드
		
	}

}
