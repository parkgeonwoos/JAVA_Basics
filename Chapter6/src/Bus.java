package Chapter6;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	//���� ��ȣ,�°� �� ,��� ����
	public Bus(int busNumber) {
		this.busNumber =busNumber;
		
	}//������ ����
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}//�°����� ��ݵ鿡 ���� ������ �����ϰ� �°� ���� �ø��� �޼ҵ�
	
	
	
	public void showBusInfo() {
		System.out.println(busNumber + "�� ������ �°���" + passengerCount +"�� �̰� ������" +money+"�Դϴ�.");
		
	}//��� �޼ҵ�
	

}
