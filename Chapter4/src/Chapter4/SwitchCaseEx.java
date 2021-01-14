package Chapter4;

import java.util.Scanner;
public class SwitchCaseEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //변수를 직접 선언
		
		int rank =scanner.nextInt();//등수를 직접 선언
		char medalColor; //메달의 색깔을 나타낼 문자 변수 선언
		
		switch(rank) { //스위치문 
		  case 1: medalColor ='G';
		      break;
		  case 2: medalColor = 'S';
		      break;
		  case 3: medalColor = 'B';
			  break;
	      default : medalColor ='A';
		}
		System.out.println(rank +"등은" + medalColor+ "메달입니다."); //출력 코드

	}

}
