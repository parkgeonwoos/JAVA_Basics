package Chapter6;

public class staticStudentTest {
	
	public static void main(String[]args) {
		
		staticStudent studentPark = new staticStudent("park");//��ü ����
		System.out.println(staticStudent.getSerialNum());
		//��¹�-static ������ ����ϱ⿡ Ŭ���� ������� �Ҹ��� Ŭ�������� ����Ͽ� ���
		
		
		staticStudent studentPark2 = new staticStudent("park2");//��ü ����
		System.out.println(staticStudent.getSerialNum());
		//��¹�-static ������ ����ϱ⿡ Ŭ���� ������� �Ҹ��� Ŭ�������� ����Ͽ� ���
		System.out.println(studentPark.getStudentId());
		System.out.println(studentPark2.getStudentId());
	}

}
