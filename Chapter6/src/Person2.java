package Chapter6;

public class Person {
	
	String name;
	int price;
	
	public Person() {
		this("�̸�����",1);
		
	}//�޼ҵ� �����ε�
	public Person(String name, int price) {
		this.name = name;
		this.price = price;
		
	}//�޼ҵ� �����ε�
	public void showInfo() {
		System.out.println(name+","+price);
	}
	//��� �޼ҵ�
	public Person getSelf() {
		return this; //�ڱ� �ڽ� ��ȯ �޼ҵ�
	}
	public void buystarcoffee(starcoffee a, int i) {
		System.out.println(name+"����"+i+"���� �� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.");
		// TODO Auto-generated method stub
		
	}
	//�� �ٹ� �Ƹ޸�ī�� ���� ��� �޼ҵ�
	public void buykongcoffee(kongcoffee b, int i) {
		System.out.println(name+"����"+i+"���� �� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.");
		// TODO Auto-generated method stub
		
	}
	//�� �ٹ� �Ƹ޸�ī�� ���� ��� �޼ҵ�

}
