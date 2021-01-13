package variable_code;

public class ExplicitConversion {
	public static void main(String[]args) {
		int i =1000;//정수 i에 1000대입
		byte bNum =(byte)i;//1000의 값을 가진 i를 명시적 변환을 통해 바이트로 바꾸어 bNum에 대입
		System.out.println(bNum);
		//출력코드
		double dNum1 =1.2;
		float fNum =0.9F;
		//double과 float 형 선언
		int iNum1 = (int)dNum1 +(int)fNum;//형변환을 먼저 한 후 더한 값
		int iNum2 = (int)(dNum1+fNum);//더한 이후 결과값을 형변환하는 값
		System.out.println(iNum1);
		System.out.println(iNum2);
		//출력 코드(형 변환을 언제하냐에 따라 결과값이 다른 명시적 변환)
		
	}

}
