package Chapter6;

public class Taxi {
	
	int taxiNumber;
	int passengerCount;
	int money;
    //�ý� ��ȣ,�°� �� ,��� ����
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	//������ ����
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}//�°����� ��ݵ鿡 ���� ������ �����ϰ� �°� ���� �ø��� �޼ҵ�
	
	
	
	public void showtaxiInfo() {
		System.out.println(taxiNumber + "�� �ý��� �°���" + passengerCount +"�� �̰� ������" +money+"�Դϴ�.");
		
	}//��� �޼ҵ�
	
}
