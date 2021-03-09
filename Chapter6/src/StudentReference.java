package Chapter6;

public class StudentReference {
	int studentID;
	String studentName;
	
	SubjectReference korea;
	SubjectReference math;
	//참고 자료형 SubjectReference 생성
	 public StudentReference(int id, String name) {
		 studentID = id;
		 studentName = name;
	     korea = new SubjectReference();
	     math = new SubjectReference();
	    	
	    }
	 //생성자 생성
	 public void setkoreaSubject(String name,int score) {
		 korea.subjectName = name;
		 korea.score = score;
	 }
	 //국어 과목,점수 메소드
	public void setMathSubject(String name,int score) {
		math.subjectName = name;
		math.score = score;
	}
   //수학 과목,점수 메소드
    public void showStudentScore() {
    	int total = korea.score + math.score;
    	System.out.println(total);
    }
    //학생의 객체 총 점수를 보여주는 메소드
}
