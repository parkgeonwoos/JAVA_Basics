package Chapter6;

public class Student { //클래스 생성 이후 학생의 정보를 작성
	int studentID;
    public String studentName;
    public  String address;
    
		
	public void showStudentInfo() {
		System.out.println(studentName+","+address);
		
	}//학생 정보 출력하는 메소드
	public String getStudentName() {
		return studentName;
	}
	//학생 이름을 출력하는 메소드 

	

}
