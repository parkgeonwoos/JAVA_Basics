package variable_code;

public class DoubleTest2 {
	public static void main(String[]args) {
		double dNum = 1; //dNum�� 1�� ����
		for (int i=0; i<10000;i++) {
			dNum =dNum +0.1;
		}//�� ���� �ݺ��Ͽ� dNum�� 0.1�� ���� �̷��� �Ǹ� 10000�� ������� ������ �� ����
		System.out.println(dNum);
		//��� �ڵ�(������ ����� �ٸ��� �ε��Ҽ����� ����Ͽ� �ݺ����� ������ �̼��� �ᱣ�� ���̰� ����)
	}

}
