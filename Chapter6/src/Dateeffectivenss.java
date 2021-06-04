package Chapter6;
import java.util.Calendar;
public class Dateeffectivenss {
	
	private int day;
	private int month;
	private int year;
	private boolean isValid =true;
	
	//필요한 메소드 선언
	public int getDay() {
		return day;
	}
	//날짜 반환 메소드
	
	public Dateeffectivenss(int day,int month,int year) {
		setyear(year);
		setmonth(month);
		setday(day);
	}
	//생성자 선언
	
	public void setday(int day) {
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if (day<0||day>31) {
				isValid = false;
			}
			else {
				this.day =day;
			}
			break;
		case 4: case 6: case 9: case 11:
			if (day<0||day>30) {
				isValid = false;
			}
			else {
				this.day =day;
			}
			break;
		case 2:
			if (day<0||day>=29) {
				isValid =false;
			}
			else {
				this.day =day;
				
			}
			break;
		default:
			isValid = false;
		}
	}
	//각 달마다 끝나는 날짜가 다르므로 이에 따라 switch문으로 분기를 시켜 유효한지 아닌지에 대한 기점을 나누는 메소드	
	
	public int getmonth() {
		return month;
	}
	//달을 가져오는 메소드
	public void setmonth(int month) {
		if (month<=1 || month >=12) {
			isValid =false;
		}else {
			this.month = month;
			
	}
	}//달을 정하는 메소드
	
	public int getyear() {
		return year;
	}
	//year를 가져오는 메소드
	
	public void setyear(int year) {
		if (year > Calendar.getInstance().get(Calendar.YEAR)) {
			isValid = false;
		}
		else {
			this.year = year;
		}
	}//년을 정하는 메소드
		
    public String isValid() {
		
		if(isValid) {
			return "유효한 날짜입니다.";
		}
		else {
			return "유효하지 않은 날짜입니다.";
		}
	}
}
	//유효한지 아닌지에 대해 출력하는 메소드

	


