package Chapter5;

public class BreakContinueTest {

	public static void main(String[] args) {
		
		int dan; //변수 선언
		int count; //변수 선언
		
		for (dan = 2; dan <=9; dan++) { //이중 for문 코드
			
			if((dan%2)!=0) //짝수의 구구단만 출력
				continue;
			
			for(count = 1; count <=9; count++ ) {
				if (count >= dan)  //짝수 구구단에서 2단일 경우 2x2까지만 출력하게 하는 코드
					break;
				System.out.println(dan +"X"+count+"="+dan*count); //출력 코드
				;
			}
			System.out.println();//출력 코드
		}
		 

	}

}
