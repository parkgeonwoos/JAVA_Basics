package Chapter4;

import java.util.Scanner;
public class SwitchCaseEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //������ ���� ����
		
		int month =scanner.nextInt();//���� ���� ����
		String day; //�ش��ϴ� ���� ��¥ ���� ��Ÿ�� ���� ���� ����
		
		switch(month) { //����ġ�� 
		  case 1: day ="31";
		      break;
		  case 2: day = "28";
		      break;
		  case 3: day = "31";
			  break;
		  case 4: day = "30";
		     break;
		  case 5: day = "31";
		     break;
		  case 6: day = "30";
		     break;
		  case 7: day = "31";
		     break;
		  case 8: day = "31";
		     break;
		  case 9: day = "30";
		     break;
		  case 10: day = "31";
		     break;
		  case 11: day = "30";
		     break;
		  case 12: day = "31";
		    break;   
	      default : day ="0";
		}
		System.out.println(month +"���� ��¥ ����" + day+ "�Դϴ�."); //��� �ڵ�

	}

}
