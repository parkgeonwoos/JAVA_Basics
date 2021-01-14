package Chapter4;

import java.util.Scanner;
public class SwitchCaseEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //변수를 직접 선언
		
		int month =scanner.nextInt();//월을 직접 선언
		String day; //해당하는 월의 날짜 수를 나타낼 문자 변수 선언
		
		switch(month) { //스위치문 
		  case 1: day ="31";
		      break;
		  case 2: day = "28";
		      break;
		  case 3: day = "31";
			  break;
		  case 4: day = "30";
		     break;
		  case 5: day = "31";
		     break;
		  case 6: day = "30";
		     break;
		  case 7: day = "31";
		     break;
		  case 8: day = "31";
		     break;
		  case 9: day = "30";
		     break;
		  case 10: day = "31";
		     break;
		  case 11: day = "30";
		     break;
		  case 12: day = "31";
		    break;   
	      default : day ="0";
		}
		System.out.println(month +"월의 날짜 수는" + day+ "입니다."); //출력 코드

	}

}
