package variable_code;

public class ExplicitConversion {
	public static void main(String[]args) {
		int i =1000;//���� i�� 1000����
		byte bNum =(byte)i;//1000�� ���� ���� i�� ����� ��ȯ�� ���� ����Ʈ�� �ٲپ� bNum�� ����
		System.out.println(bNum);
		//����ڵ�
		double dNum1 =1.2;
		float fNum =0.9F;
		//double�� float �� ����
		int iNum1 = (int)dNum1 +(int)fNum;//����ȯ�� ���� �� �� ���� ��
		int iNum2 = (int)(dNum1+fNum);//���� ���� ������� ����ȯ�ϴ� ��
		System.out.println(iNum1);
		System.out.println(iNum2);
		//��� �ڵ�(�� ��ȯ�� �����ϳĿ� ���� ������� �ٸ� ����� ��ȯ)
		
	}

}
