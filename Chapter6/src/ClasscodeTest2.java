package Chapter6;

public  class ClasscodeTest2 {
	String number = "";
	String ID = "";
	String date = "";
	String name = "";
	String productnumber = "";
	String location = "";

	public static void main(String[] args) {
		ClasscodeTest2 mall = new ClasscodeTest2();
		mall.number = "201907210001";
		mall.ID = "abc123";
		mall.date = "2019년 7월 21일";
		mall.name = "박건우";
		mall.productnumber = "PD0345-12";
		mall.location = "경기도 의정부시 장암동";
		

		System.out.println("주문번호:"+mall.number);
		System.out.println("주문자 아이디:"+mall.ID);
		System.out.println("주문날짜:"+mall.date);
		System.out.println("주문자 이름:"+mall.name);
		System.out.println("주문 상품 번호:"+mall.productnumber);
		System.out.println("배송 주소:"+mall.location);
	}

}
//클래스를 통하여 객체를 만들고 이를 출력하는 코딩테스트2