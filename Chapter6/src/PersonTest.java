package Chapter6;

public class PersonTest {
	
	public static void main(String[]args) {
		
		Person personNoname = new Person();//person클래스의 객체를 생성
	    personNoname.showInfo();//함수 호출
	    
	    Person personLee = new Person("Lee",20); //새 객체를 생성한 이후 값을 넣어줌
	    personLee.showInfo();//함수 호출
	    
	   Person p =personLee.getSelf();//lee라는 객체를 P에 저장을 한다
	   System.out.println(p);//이후 P를 출력할 시 메모리가 출력
	}

}
