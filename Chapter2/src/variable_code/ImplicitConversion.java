package variable_code;

public class ImplicitConversion {
	public static void main(String[]args) {
		byte bNum = 10;//바이트 bNum에 값 10을 넣음
		int iNum = bNum; //iNum에 bNum 값을 대입해줌
		System.out.println(bNum);
		System.out.println(iNum);
		//출력코드
		int iNum2 = 20; //정수 iNum2에 20을 대입 
		float fNum = iNum2; //실수 fNum에 iNum2값을 대힙
		System.out.println(fNum);
		//출력코드
		double dNum;//실수형 dNum을 선언
		dNum =fNum +iNum; //자료형은 다르지만 이미 묵시형 변환으로 인해 정수 값들이 더해져서 dNum에 더해짐
		System.out.println(dNum);
		//출력 코드
	}

}
