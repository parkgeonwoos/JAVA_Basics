package Chapter4;
import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//입력이 가능하도록 하는 코드 
		int age = scanner.nextInt(); //변수를 직접 선언
		int charge = 0; //변수 선언
		if(age < 8) { //변수에 따른 요금 설정 조건문
			charge = 1000;
			
		}
		else if(age>=8 && age < 14) {
			charge = 1400;
		}
		else if (age < 20) {
			charge = 2000;
		}
		else {
			charge = 3000;
		}
		System.out.println("나이:"+age); //나이 출력 코드
		System.out.println("요금:"+charge); //요금 출력 코드

	}

}
