package Chapter3;

public class OperatorEx4 {

	public static void main(String[] args) {
		int num1 = 0B00001010; //2���� (10) ����
		int num2 = 0B00000101; //2���� (5) ����
		System.out.println(num1 & num2);//��Ʈ �� ��� �ڵ�
		System.out.println(num1 | num2);//��Ʈ �� ��� �ڵ�
		System.out.println(num1 ^ num2);//��Ʈ xor ��� �ڵ�
		System.out.println(num2 << 1); //����Ʈ ������ ��� �ڵ�
		System.out.println(num2 << 2); //����Ʈ ������ ��� �ڵ�
		System.out.println(num2 >>2); //����Ʈ ������ ��� �ڵ�
		
	   
	    
	}

}
