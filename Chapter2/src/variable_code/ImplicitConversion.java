package variable_code;

public class ImplicitConversion {
	public static void main(String[]args) {
		byte bNum = 10;//����Ʈ bNum�� �� 10�� ����
		int iNum = bNum; //iNum�� bNum ���� ��������
		System.out.println(bNum);
		System.out.println(iNum);
		//����ڵ�
		int iNum2 = 20; //���� iNum2�� 20�� ���� 
		float fNum = iNum2; //�Ǽ� fNum�� iNum2���� ����
		System.out.println(fNum);
		//����ڵ�
		double dNum;//�Ǽ��� dNum�� ����
		dNum =fNum +iNum; //�ڷ����� �ٸ����� �̹� ������ ��ȯ���� ���� ���� ������ �������� dNum�� ������
		System.out.println(dNum);
		//��� �ڵ�
	}

}
