package Chapter6;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student2 studentP = new Student2("geonwoo",30000);
		Student2 studentG = new Student2("park",10000);
		//학생 객체 2명 생성
		
		Bus bus100 = new Bus(100);
		Subway subwayGreen = new Subway(2);
		Taxi taxiyellow = new Taxi(1111);
		//각 클래스의 메소드를 사용하기 위해 객체 생성
		
        studentP.takeBus(bus100);
        studentG.takeSubway(subwayGreen);
        studentP.takeTaxi(taxiyellow);
        //어떤 종류를 탔는지에 대한 메소드
		
        studentP.showInfo();
        studentG.showInfo();
        //남은 돈에 대해 호출하는 메소드
        bus100.showBusInfo();
        subwayGreen.showSubwayInfo();
        taxiyellow.showtaxiInfo();
        //각자 대중교통의 요금에 대한 설명 메소드

	}

}
