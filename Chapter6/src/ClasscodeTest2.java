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
		mall.date = "2019�� 7�� 21��";
		mall.name = "�ڰǿ�";
		mall.productnumber = "PD0345-12";
		mall.location = "��⵵ �����ν� ��ϵ�";
		

		System.out.println("�ֹ���ȣ:"+mall.number);
		System.out.println("�ֹ��� ���̵�:"+mall.ID);
		System.out.println("�ֹ���¥:"+mall.date);
		System.out.println("�ֹ��� �̸�:"+mall.name);
		System.out.println("�ֹ� ��ǰ ��ȣ:"+mall.productnumber);
		System.out.println("��� �ּ�:"+mall.location);
	}

}
//Ŭ������ ���Ͽ� ��ü�� ����� �̸� ����ϴ� �ڵ��׽�Ʈ2