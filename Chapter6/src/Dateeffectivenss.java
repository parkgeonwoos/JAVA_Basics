package Chapter6;
import java.util.Calendar;
public class Dateeffectivenss {
	
	private int day;
	private int month;
	private int year;
	private boolean isValid =true;
	
	//�ʿ��� �޼ҵ� ����
	public int getDay() {
		return day;
	}
	//��¥ ��ȯ �޼ҵ�
	
	public Dateeffectivenss(int day,int month,int year) {
		setyear(year);
		setmonth(month);
		setday(day);
	}
	//������ ����
	
	public void setday(int day) {
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if (day<0||day>31) {
				isValid = false;
			}
			else {
				this.day =day;
			}
			break;
		case 4: case 6: case 9: case 11:
			if (day<0||day>30) {
				isValid = false;
			}
			else {
				this.day =day;
			}
			break;
		case 2:
			if (day<0||day>=29) {
				isValid =false;
			}
			else {
				this.day =day;
				
			}
			break;
		default:
			isValid = false;
		}
	}
	//�� �޸��� ������ ��¥�� �ٸ��Ƿ� �̿� ���� switch������ �б⸦ ���� ��ȿ���� �ƴ����� ���� ������ ������ �޼ҵ�	
	
	public int getmonth() {
		return month;
	}
	//���� �������� �޼ҵ�
	public void setmonth(int month) {
		if (month<=1 || month >=12) {
			isValid =false;
		}else {
			this.month = month;
			
	}
	}//���� ���ϴ� �޼ҵ�
	
	public int getyear() {
		return year;
	}
	//year�� �������� �޼ҵ�
	
	public void setyear(int year) {
		if (year > Calendar.getInstance().get(Calendar.YEAR)) {
			isValid = false;
		}
		else {
			this.year = year;
		}
	}//���� ���ϴ� �޼ҵ�
		
    public String isValid() {
		
		if(isValid) {
			return "��ȿ�� ��¥�Դϴ�.";
		}
		else {
			return "��ȿ���� ���� ��¥�Դϴ�.";
		}
	}
}
	//��ȿ���� �ƴ����� ���� ����ϴ� �޼ҵ�

	


