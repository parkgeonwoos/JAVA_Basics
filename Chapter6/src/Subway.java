package Chapter6;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
    //����ö ��ȣ,�°���,��� ���� 
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}//������ ����
	
	
	public void take(int money) {
		this.money += money;
		passengerCount ++;
		
	}//�°����� ��ݵ鿡 ���� ������ �����ϰ� �°� ���� �ø��� �޼ҵ�
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "�� ����ö�� �°���" + passengerCount +"�� �̰� ������" +money+"�Դϴ�.");
		
	}//��� �޼ҵ�
}
