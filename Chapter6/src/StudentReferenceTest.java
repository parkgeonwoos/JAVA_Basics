package Chapter6;

public class StudentReferenceTest {

	public static void main(String[] args) {
		StudentReference Studentpark = new StudentReference(100,"Park");
		Studentpark.setkoreaSubject("����", 100);
		Studentpark.setMathSubject("����", 95);
       //�����ڸ� ���Ͽ� ��ü ����
		
		StudentReference StudentLee = new StudentReference(85,"Lee");
		StudentLee.setkoreaSubject("����", 88);
		StudentLee.setMathSubject("����", 95);
	  //�����ڸ� ���Ͽ� ��ü ����	
		Studentpark.showStudentScore();
		StudentLee.showStudentScore();
     //�� ��ü���� ���� ���� ������ ��Ÿ���� ��¹�
	}

}
