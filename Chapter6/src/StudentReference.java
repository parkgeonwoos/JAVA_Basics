package Chapter6;

public class StudentReference {
	int studentID;
	String studentName;
	
	SubjectReference korea;
	SubjectReference math;
	//���� �ڷ��� SubjectReference ����
	 public StudentReference(int id, String name) {
		 studentID = id;
		 studentName = name;
	     korea = new SubjectReference();
	     math = new SubjectReference();
	    	
	    }
	 //������ ����
	 public void setkoreaSubject(String name,int score) {
		 korea.subjectName = name;
		 korea.score = score;
	 }
	 //���� ����,���� �޼ҵ�
	public void setMathSubject(String name,int score) {
		math.subjectName = name;
		math.score = score;
	}
   //���� ����,���� �޼ҵ�
    public void showStudentScore() {
    	int total = korea.score + math.score;
    	System.out.println(total);
    }
    //�л��� ��ü �� ������ �����ִ� �޼ҵ�
}
