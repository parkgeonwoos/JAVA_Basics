package Chapter6;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
    //지하철 번호,승객수,요금 선언 
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}//생성자 생성
	
	
	public void take(int money) {
		this.money += money;
		passengerCount ++;
		
	}//승객들의 요금들에 대한 가격을 누적하고 승객 수를 올리는 메소드
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "번 지하철의 승객은" + passengerCount +"명 이고 수입은" +money+"입니다.");
		
	}//출력 메소드
}
