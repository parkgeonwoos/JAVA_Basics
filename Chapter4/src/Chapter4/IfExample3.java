package Chapter4;
import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//�Է��� �����ϵ��� �ϴ� �ڵ� 
		int score = scanner.nextInt(); //������ ���� ����
		char grade = 'F'; //���� ����
		if(score <= 59) { //������ ���� ���� ���� ���ǹ�
			grade = 'F';
			
		}
		else if(score>=60 && score <=69) {
			grade = 'D';
		}
		else if (score>= 70 && score <=79) {
			grade = 'C';
		}
		else if(score>= 80 && score <=89) {
			grade = 'B';
		}
		else {
			grade = 'A';
		}
			
		System.out.println("����:"+score); //���� ��� �ڵ�
		System.out.println("����:"+grade); //���� ��� �ڵ�

	}

}
