package Chapter6;

public class ClasscodeTest1 {
	int age = 0;
	String name ="";
	String marry = "";
	int children = 0;

	public static void main(String[]args) {
		ClasscodeTest1 newguy = new ClasscodeTest1();
		newguy.age = 40;
		newguy.name = "James";
		newguy.marry = "True";
		newguy.children = 3;
		System.out.println("나이:"+newguy.age);
		System.out.println("이름:"+newguy.name);
		System.out.println("결혼 여부:"+newguy.name);
		System.out.println("자녀 수:"+newguy.name);
		
	}
	

	
}
//클래스를 통하여 객체를 만들고 이를 출력하는 코딩테스트1