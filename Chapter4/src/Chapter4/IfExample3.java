package Chapter4;
import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//입력이 가능하도록 하는 코드 
		int score = scanner.nextInt(); //변수를 직접 선언
		char grade = 'F'; //변수 선언
		if(score <= 59) { //변수에 따른 학점 설정 조건문
			grade = 'F';
			
		}
		else if(score>=60 && score <=69) {
			grade = 'D';
		}
		else if (score>= 70 && score <=79) {
			grade = 'C';
		}
		else if(score>= 80 && score <=89) {
			grade = 'B';
		}
		else {
			grade = 'A';
		}
			
		System.out.println("점수:"+score); //점수 출력 코드
		System.out.println("학점:"+grade); //학점 출력 코드

	}

}
