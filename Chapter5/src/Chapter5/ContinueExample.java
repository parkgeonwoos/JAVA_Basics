package Chapter5;

public class ContinueExample {

	public static void main(String[] args) {
		
		int num; //���� ����
		
		for (num =1 ; num <= 100; num++) { //for�� �ڵ�
			if((num % 3)!=0)  //3�� ����� �ƴҰ��
				continue; //�ٽ� ���ǹ����� ���ư���
			
				System.out.println(num); //3�� ����鸸 ��� �ڵ�
			
		}

	}

}
