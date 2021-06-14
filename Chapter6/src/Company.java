package Chapter6;

public class Company {
	
	private static Company instance = new Company();//스태틱 객체를 생성
	
	private Company() {
		
	}
	//생성자 생성
	
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	//객체가 private이기 떄문에 다른 클래스에서 메소드를 사용하기 위해 public 사용 
	//또한, static을 사용해야지만 다른 클래스에서 사용가능함.

}
