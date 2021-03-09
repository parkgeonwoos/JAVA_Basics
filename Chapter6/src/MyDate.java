package Chapter6;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	private boolean isValid;
	
	public void setDay(int day) {
		this.day = day;
	}
	//멤머변수를 나타날땐 this를 붙여씀 
	
	public int getDay() {
		return day;
	}
	//날짜 반환 메소드
	
	public int getMonth() {
		return month;
	}
    //월 반환 메소드
	public void setMonth(int month) {
		
		if( month <1 || month >12) {
			isValid = false;
			
		}
		else
		this.month = month;
	}
    //월 설정 메소드
	public int getYear() {
		return year;
	}
    //년 반환 메소드
	public void setYear(int year) {
		this.year = year;
	}
    //년 설정 메소드
	public void showDate() {
		
		if(isValid) {
			
		
		System.out.println(year + "년" + month + "월" + day +"일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
		}

}

//default일 경우 같은 패키지 내에서만 멤버변수 사용 가능
//private일 경우 같은 클래스가 아닐 시 사용할 수 없음(외부에서)

