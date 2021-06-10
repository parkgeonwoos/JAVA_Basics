package Chapter6;

public class coffeeTest {

	public static void main(String[] args) {
		
		Person kim = new Person("kim",10000);//킴이라는 객체 생성
		starcoffee starcoffee = new starcoffee();
		kongcoffee kongcoffee = new kongcoffee();
		//다방들의 객체 생성 
		
		kim.buystarcoffee(starcoffee,4000);
		kim.buykongcoffee(kongcoffee,4500);
		//객체를 활용하여 출력문 생성
	}

}
