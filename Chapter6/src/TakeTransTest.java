package Chapter6;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student2 studentP = new Student2("geonwoo",30000);
		Student2 studentG = new Student2("park",10000);
		//�л� ��ü 2�� ����
		
		Bus bus100 = new Bus(100);
		Subway subwayGreen = new Subway(2);
		Taxi taxiyellow = new Taxi(1111);
		//�� Ŭ������ �޼ҵ带 ����ϱ� ���� ��ü ����
		
        studentP.takeBus(bus100);
        studentG.takeSubway(subwayGreen);
        studentP.takeTaxi(taxiyellow);
        //� ������ �������� ���� �޼ҵ�
		
        studentP.showInfo();
        studentG.showInfo();
        //���� ���� ���� ȣ���ϴ� �޼ҵ�
        bus100.showBusInfo();
        subwayGreen.showSubwayInfo();
        taxiyellow.showtaxiInfo();
        //���� ���߱����� ��ݿ� ���� ���� �޼ҵ�

	}

}
