package day10;

public class EzenComputer {

/* - 학생기본정보 : 이름, 생년월일, 나이, 전화번호
 * - 학원정보 : 학원이름 = "EZEN", 지점
 * - 수강정보 : 수강과목, 기간
 * 
 * - 한명의 학생은 여러과목 수강 가능.
 * 과목, 기간 => 배열처리 = 5
 * 
 * 홍길동, 990101, 20, 010-1111-1111
 * EZEN, 인천
 * 자바(6개월), DB(1개월), html(2개월)
 * 
 * 기능
 * 학생의 기본정보 출력
 * 학생의 학원정보 출력
 * 학생의 수강정보 출력
 * 힉생의 수강정보를 추가하는 기능
 * 
 * */
	
	
	
	
	
	
	private String subject[] = new String[5];
	
	private String studentName;
	private String studentBirth;
	private String studentAge;
	private String studentNum;
	
	private final String schoolName="EZEN";
	private String schoollocation;
	
	
	
	
	
	
	
	public EzenComputer() {}
	
	public EzenComputer(String studentName, String studentBirth, String studentAge, String studentNum,String schoolName,String schoollocation) {
		this.studentName=studentName;
		this.studentBirth=studentBirth;
		this.studentAge=studentAge;
		this.studentNum=studentNum;
		this.schoollocation=schoollocation;
	}
	
		

	
	
	public void studentPrint() {
		System.out.println("--------------");
		System.out.println("학생 이름:" + studentName);
		System.out.println("학생 생일:" + studentBirth);
		System.out.println("학생 나이:" + studentAge);
		System.out.println("학생 번호:" + studentNum);
		System.out.println("--------------");
	}
	
	public void EzenPrint() {
		System.out.println("--------------");
		System.out.println("학원 이름:" + schoolName);
		System.out.println("학원 지역:" + schoollocation);
		System.out.println("--------------");
	
	}
	
	
	

	public void subjectArray() {
		int i;
		int num=0;
		int [] arr = new int[5];
		for(i=0; i<arr.length ; i++) {
			
			int subNum = subjectNumber(num);
			arr[i]=subNum;
			num++;
	
		}	
	}
	
	
	
	
	
	public int subjectNumber(int num) {
		switch(num) {
		case 0: System.out.println("자바(6개월)");
		return 0;
		case 1: System.out.println("DB(1개월)");
		return 1;
		case 2: System.out.println("html(2개월)");
		return 2;
		case 3: System.out.println("윤민영과친구하기(10년)");
		return 3;	
		case 4: System.out.println("최수정과친구하기(폐강)");
		return 4;
		}return num;
	}
	
	
	
}


























