package Chapter6;

public class staticStudentTest {
	
	public static void main(String[]args) {
		
		staticStudent studentPark = new staticStudent("park");//객체 생성
		System.out.println(staticStudent.getSerialNum());
		//출력문-static 변수를 사용하기에 클래스 변수라고도 불리움 클래스명을 사용하여 출력
		
		
		staticStudent studentPark2 = new staticStudent("park2");//객체 생성
		System.out.println(staticStudent.getSerialNum());
		//출력문-static 변수를 사용하기에 클래스 변수라고도 불리움 클래스명을 사용하여 출력
		System.out.println(studentPark.getStudentId());
		System.out.println(studentPark2.getStudentId());
	}

}
