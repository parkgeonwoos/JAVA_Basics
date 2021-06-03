package Chapter6;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		this("이름없음",1);
		
	}//메소드 오버로딩
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}//메소드 오버로딩
	public void showInfo() {
		System.out.println(name+","+age);
	}
	//출력 메소드
	public Person getSelf() {
		return this; //자기 자신 반환 메소드
	}

}
