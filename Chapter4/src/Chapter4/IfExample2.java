package Chapter4;
import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//�Է��� �����ϵ��� �ϴ� �ڵ� 
		int age = scanner.nextInt(); //������ ���� ����
		int charge = 0; //���� ����
		if(age < 8) { //������ ���� ��� ���� ���ǹ�
			charge = 1000;
			
		}
		else if(age>=8 && age < 14) {
			charge = 1400;
		}
		else if (age < 20) {
			charge = 2000;
		}
		else {
			charge = 3000;
		}
		System.out.println("����:"+age); //���� ��� �ڵ�
		System.out.println("���:"+charge); //��� ��� �ڵ�

	}

}
