package variable_code;

public class CharTest {
	public static void main(String[]args) {
		char ch ='A'; //A라는 문자를 ch에 넣어서 선언
		System.out.println(ch);//문자 그대로 출력
		System.out.println((int)ch);//정수 형변환 이후 출력
		int iCh = 66;
		System.out.println(iCh);//숫자 그대로 출력
		System.out.println((char)iCh);//문자형 아스키코드로 변환 후 B로 출력
		char hangul = '\uAC00';//아스키 코드를 문자에 저장
		System.out.println(hangul);//문자 가 출력
	}

}
