package Chapter5;

public class WhileExample {
	public static void main(String[]args) {
		
		int num = 1; //��������
		int sum = 0; //��������
		
		while(num <= 10) { //while�� �ڵ�
			sum += num; //num�� ���� sum�� ���ϴ� �ڵ�
			num++; //num�� �ϳ��� ���� 
		}
		
	    System.out.println(sum);//����ڵ�
	    System.out.println(num);//����ڵ�	
	    
	}

}
