package variable_code;

public class CharTest {
	public static void main(String[]args) {
		char ch ='A'; //A��� ���ڸ� ch�� �־ ����
		System.out.println(ch);//���� �״�� ���
		System.out.println((int)ch);//���� ����ȯ ���� ���
		int iCh = 66;
		System.out.println(iCh);//���� �״�� ���
		System.out.println((char)iCh);//������ �ƽ�Ű�ڵ�� ��ȯ �� B�� ���
		char hangul = '\uAC00';//�ƽ�Ű �ڵ带 ���ڿ� ����
		System.out.println(hangul);//���� �� ���
	}

}
