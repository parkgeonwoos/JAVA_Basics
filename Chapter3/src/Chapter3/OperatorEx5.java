package Chapter3;

public class OperatorEx5 {

	public static void main(String[] args) {
		int num1 = 10; //���� ����
	    int i = 2; //���� ���� 
	    boolean value = ((num1=num1+10)<10)&&((i=i+2)<10); //������ Ȯ���ϱ� ���� ���� �ڵ�
	    System.out.println(num1);//������ ��� �տ� ���Ǻ��� false�̹Ƿ� �հ� ���Ǹ� �þ ������ ����
	    System.out.println(i);//������ ��� �տ� ���Ǻ��� false�̹Ƿ� �հ� ���Ǹ� �þ ������ ����
	    System.out.println(value);//�翬�� False ���
        int num2 = 10; //��������
        int num3 = 20; //��������
	    int max = (10>20)? num2 : num3; // ���׿����ڸ� �̿��� ���� �ڵ�
	    System.out.println(max);//����ڵ� 
	    
	}

}
