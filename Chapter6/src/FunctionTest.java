package Chapter6;

public class FunctionTest {
	public static int addNum(int num1,int num2) {
		int result;
		result = num1 + num2;
		return result;
		
	}//더하기 함수
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}//인삿말 출력 함수
	public static int calcSum() {
		int sum = 0;
		int i;
		for(i=0; i<=100; i++) {
			sum +=i;
		}
		return sum;
	}//1부터 100까지 더하는 함수

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1,n2);
		
		sayHello("안녕하세요");
		
		int num = calcSum();
		
		System.out.println(total);
		System.out.println(num);
		
		
		

	}

}
