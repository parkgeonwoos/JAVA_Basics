package Chapter6;

public class staticStudent {
	
	    private static int serialNum = 1000;                
		private int studentID;
	    public String studentName;
	    public String address;
	    
	    public staticStudent(String name) {
	    	studentName = name;
	    	serialNum++;
	    	studentID = serialNum;
	    }
	    
	    public staticStudent(int id,String name) {
	    	studentID = id;
	    	studentName = name;
	    	address = "�ּ� ����";
	    	serialNum++;
	    	studentID =serialNum;
	    }
	    
			
		public void showStudentInfo() {
			System.out.println(studentName+","+address);
			
		}//�л� ���� ����ϴ� �޼ҵ�
		public String getStudentName() {
			return studentName;
		}
		//�л� �̸��� ����ϴ� �޼ҵ� 

		public int getStudentId() {
			return studentID;
		}
		//private ������ studentID�� ����Ǿ �ٸ� Ŭ�������� ����� �ȵǹǷ� 
		//���� ������ ���� �޼ҵ�� ����Ͽ� ��ȯ

		public static int getSerialNum() {
			return serialNum;
		}
       //static������ private�̱⿡ get�޼ҵ带 ���� ����Ѵ�,�̸� ���� ����
		public static void setSerialNum(int serialNum) {
			staticStudent.serialNum = serialNum;
		}
		//static������ prviate�̱⿡ set�޼ҵ带 ���� �����Ѵ�,�̸� ���� ����
		
	}


