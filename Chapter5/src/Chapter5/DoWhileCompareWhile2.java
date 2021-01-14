package Chapter5;
import java.util.Scanner;
public class DoWhileCompareWhile2 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);//scanner 호출
		int sum = 0; //합계를 할 변수 선언
		int num;//내가 직접 입력할 숫자 선언
		
		num = scanner.nextInt();//숫자를 직접 입력
		while(num != 0) { //while문 코드
			sum += num; //입력한 num 값을 sum에 더함
			num = scanner.nextInt(); //반복문을 통하여 더한 이후 다시 내가 원하는 숫자 타이핑
		}
		
		System.out.println(sum); //그 동안 더한 코드들을 출력하는 코드
		
	}

}
