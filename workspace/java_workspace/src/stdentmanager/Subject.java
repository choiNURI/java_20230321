package stdentmanager;

public class Subject {
	
	/*과목클래스 : 한 과목의 정보를 나타내는 클래스
	 - 과목코드, 과목명, 학점, 시수, 교수명, 학기, 분류, 수업시간표
	 
	 클래스 생성 순서
	 멤버변수선언 -> 생성자 -> getter/setter, 그 외 필요한 toString(print메서드) 
	 
	  ?? 머가 필수 ??
	  
	 */
	

	
	//1.멤버변수 선언 = private로 선언
	private String subCode; // 기본값 = null
	private String subName;
	private double subCredite;
	private int subTime;
	private String subProfecssor;
	private String subSemester;
	private String subCategory;
	private String subSchedule;



	
	// 생성자 : 객체를 생성할 때 기본 setting 하고자 하는 값을 미리 입력받아서 객체를 생성
	// 생성자는 기본 아무것도 없는 값을 가지고 있음 => 생성자를 추가하지 않는다면 자동 생성
	// 추가 생성자를 만든다면 기본 생성자는 사라짐.(자동생성 하지않음 => 직접만들어야함)
	
	
	//기본생성자
	public Subject() {} 
	
	//과목명만 받는 생성자
	public Subject(String subName) {
		this.subName=subName;
	}
	
	//과목코드, 과목명, 학점만 받는 생성자
	public Subject(String subCode, String subName, double subCredite) {
		this.subName=subName;
		this.subName=subName;
		this.subCredite=subCredite;
	}

	
	//전체 데이터를 받는 생성자	
	//source - Generate constructor using Fields 로 전체 불러오는게 편함.
	public Subject(String subCode, String subName, double subCredite, int subTime, String subProfecssor,
			String subSemester, String subCategory, String subSchedule) {
		// super();  - 상속받는 객체를 쓴다면 남기고.. 아니면 삭제
		this.subCode = subCode;
		this.subName = subName;
		this.subCredite = subCredite;
		this.subTime = subTime;
		this.subProfecssor = subProfecssor;
		this.subSemester = subSemester;
		this.subCategory = subCategory;
		this.subSchedule = subSchedule;
	}

	
	
	
	
	
	public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public double getSubCredite() {
		return subCredite;
	}

	public void setSubCredite(double subCredite) {
		this.subCredite = subCredite;
	}

	public int getSubTime() {
		return subTime;
	}

	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}

	public String getSubProfecssor() {
		return subProfecssor;
	}

	public void setSubProfecssor(String subProfecssor) {
		this.subProfecssor = subProfecssor;
	}

	public String getSubSemester() {
		return subSemester;
	}

	public void setSubSemester(String subSemester) {
		this.subSemester = subSemester;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getSubSchedule() {
		return subSchedule;
	}

	public void setSubSchedule(String subSchedule) {
		this.subSchedule = subSchedule;
	}

	
	
	// toString 
	@Override
	public String toString() {
		return "subject [subCode=" + subCode + ", subName=" + subName + ", subCredite=" + subCredite + ", subTime="
				+ subTime + ", subProfecssor=" + subProfecssor + ", subSemester=" + subSemester + ", subCategory="
				+ subCategory + ", subSchedule=" + subSchedule + "]";
	}
	

	
	
	

}
