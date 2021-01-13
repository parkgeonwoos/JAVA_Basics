package variable_code;

public class DoubleTest2 {
	public static void main(String[]args) {
		double dNum = 1; //dNum에 1를 선언
		for (int i=0; i<10000;i++) {
			dNum =dNum +0.1;
		}//만 번을 반복하여 dNum에 0.1을 더함 이렇게 되면 10000이 결과값이 나오는 게 정상
		System.out.println(dNum);
		//출력 코드(하지만 결과와 다르게 부동소수점을 사용하여 반복문을 돌리면 미세한 결괏값 차이가 생김)
	}

}
