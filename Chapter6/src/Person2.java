package Chapter6;

public class Person {
	
	String name;
	int price;
	
	public Person() {
		this("이름없음",1);
		
	}//메소드 오버로딩
	public Person(String name, int price) {
		this.name = name;
		this.price = price;
		
	}//메소드 오버로딩
	public void showInfo() {
		System.out.println(name+","+price);
	}
	//출력 메소드
	public Person getSelf() {
		return this; //자기 자신 반환 메소드
	}
	public void buystarcoffee(starcoffee a, int i) {
		System.out.println(name+"님이"+i+"으로 별 다방 아메리카노를 구입했습니다.");
		// TODO Auto-generated method stub
		
	}
	//별 다방 아메리카노 구입 출력 메소드
	public void buykongcoffee(kongcoffee b, int i) {
		System.out.println(name+"님이"+i+"으로 콩 다방 아메리카노를 구입했습니다.");
		// TODO Auto-generated method stub
		
	}
	//콩 다방 아메리카노 구입 출력 메소드

}
