package Chapter5;
import java.util.Scanner;
public class DoWhileCompareWhile2 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);//scanner ȣ��
		int sum = 0; //�հ踦 �� ���� ����
		int num;//���� ���� �Է��� ���� ����
		
		num = scanner.nextInt();//���ڸ� ���� �Է�
		while(num != 0) { //while�� �ڵ�
			sum += num; //�Է��� num ���� sum�� ����
			num = scanner.nextInt(); //�ݺ����� ���Ͽ� ���� ���� �ٽ� ���� ���ϴ� ���� Ÿ����
		}
		
		System.out.println(sum); //�� ���� ���� �ڵ���� ����ϴ� �ڵ�
		
	}

}
