package Chapter6;

public class studentTest {
	public static void main(String[]args) {
		
		Student studentPark =new Student();//������ ����
		studentPark.studentName = "�ڰǿ�"; //���� ���� �Է�
		studentPark.address = "��õ";//���� ���� �Է�
		
		studentPark.showStudentInfo(); //student���� ���� �޼ҵ� ���
		
		Student studentKim = new Student();
		studentKim.studentName = "�ڰǿ�2";
		studentKim.address = "������";
		
		studentKim.showStudentInfo();
		//�� ��° �ν��ͽ��� ����
		System.out.println(studentPark);
		System.out.println(studentKim); 
		//�޸� �ּ� ���(���� �޸�) 
	}

}
