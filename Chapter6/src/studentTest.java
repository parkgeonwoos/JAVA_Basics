package Chapter6;

public class studentTest {
	public static void main(String[]args) {
		
		Student studentPark =new Student();//생성자 생성
		studentPark.studentName = "박건우"; //나의 정보 입력
		studentPark.address = "춘천";//나의 정보 입력
		
		studentPark.showStudentInfo(); //student에서 만든 메소드 사용
		
		Student studentKim = new Student();
		studentKim.studentName = "박건우2";
		studentKim.address = "의정부";
		
		studentKim.showStudentInfo();
		//두 번째 인스터스를 생성
		System.out.println(studentPark);
		System.out.println(studentKim); 
		//메모리 주소 출력(가상 메모리) 
	}

}
