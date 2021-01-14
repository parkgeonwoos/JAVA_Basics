package Chapter5;

public class NestedLoop {

	public static void main(String[] args) {
		
		
		int dan; //변수 선언
		int count; //변수 선언
		
		for( dan = 2; dan <=9; dan++) { //이중 for문 코드
			for(count =1; count <=9; count++) {
				System.out.println(dan +"x"+ count+"="+dan*count);//출력 코드
			}
		System.out.println(); //출력 코드
		}

	}

}
