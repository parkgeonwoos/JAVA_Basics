package Chapter6;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company company1 = Company.getInstance();//객체 생성
		
		Company company2 = Company.getInstance();//객체 생성
		
		System.out.println(company1);
		System.out.println(company2);
		
		//둘 다 호출 시 같기 때문에 이것을 싱글톤 패턴이라고 부름 
		
	}

}
