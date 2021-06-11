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
	    	address = "주소 없음";
	    	serialNum++;
	    	studentID =serialNum;
	    }
	    
			
		public void showStudentInfo() {
			System.out.println(studentName+","+address);
			
		}//학생 정보 출력하는 메소드
		public String getStudentName() {
			return studentName;
		}
		//학생 이름을 출력하는 메소드 

		public int getStudentId() {
			return studentID;
		}
		//private 변수로 studentID가 선언되어서 다른 클래스에서 사용이 안되므로 
		//정보 은닉을 위해 메소드로 사용하여 반환

		public static int getSerialNum() {
			return serialNum;
		}
       //static변수가 private이기에 get메소드를 통해 출력한다,이를 위헤 생성
		public static void setSerialNum(int serialNum) {
			staticStudent.serialNum = serialNum;
		}
		//static변수가 prviate이기에 set메소드를 통해 저장한다,이를 위해 생성
		
	}


