package Chapter5;

public class NestedLoop {

	public static void main(String[] args) {
		
		
		int dan; //���� ����
		int count; //���� ����
		
		for( dan = 2; dan <=9; dan++) { //���� for�� �ڵ�
			for(count =1; count <=9; count++) {
				System.out.println(dan +"x"+ count+"="+dan*count);//��� �ڵ�
			}
		System.out.println(); //��� �ڵ�
		}

	}

}
