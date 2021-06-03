package Chapter6;

public class Student2 {
	
	String studentName;
	int grade;
	int money;
	//학생 이름,학년,잔액의 변수를 선언
	public Student2(String studentName,int money) {
		this.studentName =studentName;
		this.money = money;
	}//생성자를 선언
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}//버스를 탈 경우 요금 1000원 감소 메소드
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}//지하철을 탈 경우 요금 1200원 감소 메소드 
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}//지하철을 탈 경우 요금 1200원 감소 메소드 
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은"+money+"원 입니다.");
	}
    //학생에 대한 정보 출력 메소드 생성
}
