package Chapter6;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		this("�̸�����",1);
		
	}//�޼ҵ� �����ε�
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}//�޼ҵ� �����ε�
	public void showInfo() {
		System.out.println(name+","+age);
	}
	//��� �޼ҵ�
	public Person getSelf() {
		return this; //�ڱ� �ڽ� ��ȯ �޼ҵ�
	}

}
