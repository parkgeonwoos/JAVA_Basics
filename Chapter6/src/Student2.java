package Chapter6;

public class Student2 {
	
	String studentName;
	int grade;
	int money;
	//�л� �̸�,�г�,�ܾ��� ������ ����
	public Student2(String studentName,int money) {
		this.studentName =studentName;
		this.money = money;
	}//�����ڸ� ����
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}//������ Ż ��� ��� 1000�� ���� �޼ҵ�
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}//����ö�� Ż ��� ��� 1200�� ���� �޼ҵ� 
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}//����ö�� Ż ��� ��� 1200�� ���� �޼ҵ� 
	
	public void showInfo() {
		System.out.println(studentName+"���� ���� ����"+money+"�� �Դϴ�.");
	}
    //�л��� ���� ���� ��� �޼ҵ� ����
}
