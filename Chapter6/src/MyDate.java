package Chapter6;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	private boolean isValid;
	
	public void setDay(int day) {
		this.day = day;
	}
	//��Ӻ����� ��Ÿ���� this�� �ٿ��� 
	
	public int getDay() {
		return day;
	}
	//��¥ ��ȯ �޼ҵ�
	
	public int getMonth() {
		return month;
	}
    //�� ��ȯ �޼ҵ�
	public void setMonth(int month) {
		
		if( month <1 || month >12) {
			isValid = false;
			
		}
		else
		this.month = month;
	}
    //�� ���� �޼ҵ�
	public int getYear() {
		return year;
	}
    //�� ��ȯ �޼ҵ�
	public void setYear(int year) {
		this.year = year;
	}
    //�� ���� �޼ҵ�
	public void showDate() {
		
		if(isValid) {
			
		
		System.out.println(year + "��" + month + "��" + day +"�� �Դϴ�.");
		}
		else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
		}

}

//default�� ��� ���� ��Ű�� �������� ������� ��� ����
//private�� ��� ���� Ŭ������ �ƴ� �� ����� �� ����(�ܺο���)

