package Chapter6;

public class coffeeTest {

	public static void main(String[] args) {
		
		Person kim = new Person("kim",10000);//Ŵ�̶�� ��ü ����
		starcoffee starcoffee = new starcoffee();
		kongcoffee kongcoffee = new kongcoffee();
		//�ٹ���� ��ü ���� 
		
		kim.buystarcoffee(starcoffee,4000);
		kim.buykongcoffee(kongcoffee,4500);
		//��ü�� Ȱ���Ͽ� ��¹� ����
	}

}
