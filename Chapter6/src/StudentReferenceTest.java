package Chapter6;

public class StudentReferenceTest {

	public static void main(String[] args) {
		StudentReference Studentpark = new StudentReference(100,"Park");
		Studentpark.setkoreaSubject("국어", 100);
		Studentpark.setMathSubject("수학", 95);
       //생성자를 통하여 객체 생성
		
		StudentReference StudentLee = new StudentReference(85,"Lee");
		StudentLee.setkoreaSubject("국어", 88);
		StudentLee.setMathSubject("수학", 95);
	  //생성자를 통하여 객체 생성	
		Studentpark.showStudentScore();
		StudentLee.showStudentScore();
     //각 객체들의 과목 총합 점수를 나타내는 출력문
	}

}
