package Chapter5;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1; //���� ���� 
		int sum = 0; //���� ����

		do {  //do-while�� �ڵ�
			sum += num;
			num++;
			
		}while(num <=10);
		
		System.out.println(sum); //��� �ڵ�
		System.out.println(num); //��� �ڵ�
	}

}
