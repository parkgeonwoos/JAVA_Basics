package Chapter6;

public class PersonTest {
	
	public static void main(String[]args) {
		
		Person personNoname = new Person();//personŬ������ ��ü�� ����
	    personNoname.showInfo();//�Լ� ȣ��
	    
	    Person personLee = new Person("Lee",20); //�� ��ü�� ������ ���� ���� �־���
	    personLee.showInfo();//�Լ� ȣ��
	    
	   Person p =personLee.getSelf();//lee��� ��ü�� P�� ������ �Ѵ�
	   System.out.println(p);//���� P�� ����� �� �޸𸮰� ���
	}

}
