package Chapter5;
import java.util.Scanner;
public class DoWhileCompareWhile1 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);//scanner ȣ��
		int sum = 0; //�հ踦 �� ���� ����
		int num;//���� ���� �Է��� ���� ����
		
		do { //do-while�� �ڵ�
			num = scanner.nextInt(); //���� ���� ���ڵ��� �Է�
			sum+=num; //�Է��� ���ڵ��� ��� sum�� ����
			
		}while(num != 0); //num�� 0�� �ԷµǱ� ������ �ݺ�
		
		System.out.println(sum); //�� ���� ���� �ڵ���� ����ϴ� �ڵ�
		
	}

}
