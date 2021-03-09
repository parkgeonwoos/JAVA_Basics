package Chapter6;

public class MyDateTest {

	public static void main(String[] args) {
		
         MyDate date = new MyDate();
         date.setYear(2019);
         date.setMonth(7);
         date.setDay(10);
        
         date.showDate();
	}

}
//private를 사용하고 getter,setter를 통하여 
//유효한 날짜만을 출력하도록 하는 코드(정보 은닉)