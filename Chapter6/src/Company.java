package Chapter6;

public class Company {
	
	private static Company instance = new Company();//����ƽ ��ü�� ����
	
	private Company() {
		
	}
	//������ ����
	
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	//��ü�� private�̱� ������ �ٸ� Ŭ�������� �޼ҵ带 ����ϱ� ���� public ��� 
	//����, static�� ����ؾ����� �ٸ� Ŭ�������� ��밡����.

}
