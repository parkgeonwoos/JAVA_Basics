package Chapter5;

public class BreakExample {

	public static void main(String[] args) {
		
		int sum = 0; //���� ����
		int num; //���� ����
		for(num =1 ; ; num++) { //for�� �ڵ�
			sum += num; //num���� ������Ű�鼭 sum�� ���Ͽ� ����
			if (sum >= 100) //if�� 
				break; //break
		}
		System.out.println(sum); //��� �ڵ�
		System.out.println(num); //��� �ڵ�

	}

}
