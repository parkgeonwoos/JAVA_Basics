package Chapter5;

public class BreakContinueTest {

	public static void main(String[] args) {
		
		int dan; //���� ����
		int count; //���� ����
		
		for (dan = 2; dan <=9; dan++) { //���� for�� �ڵ�
			
			if((dan%2)!=0) //¦���� �����ܸ� ���
				continue;
			
			for(count = 1; count <=9; count++ ) {
				if (count >= dan)  //¦�� �����ܿ��� 2���� ��� 2x2������ ����ϰ� �ϴ� �ڵ�
					break;
				System.out.println(dan +"X"+count+"="+dan*count); //��� �ڵ�
				;
			}
			System.out.println();//��� �ڵ�
		}
		 

	}

}
