package stdentmanager;

public class Student {

	/*학생클래스 : 한 학생의 정보를 나타내는 클래스
	- 학번, 이름, 주민번호, 학부, 학과, 수강과목(과목 클래스를 배열로 생성 - 5개) 
	- 수강과목 번지를 대신할 count
	
	- 메서드
	 > 수강과목 추가(배열이 다 찼다면 늘려주기)
	 > 수강과목 삭제
	- 생성자, getter/setter, 출력메서드(print) - 2가지형태로
	*/
	
	
	private String sdtNum;
	private String sdtName;
	private String registerNum;
	private String faculty;
	private String major;
	
	private Subject[] subjectList = new Subject[5]; //subject 클래스를 배열로 선언.
	private int subCount;
	
	
	//기본생성자
	public Student() {}
	
	//전체 요소를 받는 생성자
	public Student(String sdtNum, String sdtName, String registerNum, 
					String faculty, String major) {		
		this.sdtNum = sdtNum;
		this.sdtName = sdtName;
		this.registerNum = registerNum;
		this.faculty = faculty;
		this.major = major;
	}

	
	
	//메서드
	//print method : 학생정보만 출력
	public void stdPrint() {
		System.out.println("학생명(학번):"+sdtName+"("+registerNum+")");
		System.out.println("학　부(학과):"+faculty+"("+major+")");
	}
	
	//수강과목을 출력하는 메서드
	public void subPrint() {
		//수강과목이 없을 때 (count == 0)
		
		if(subCount==0) {
			System.out.println("수강중인과목이 없습니다.");
		}
		
		//수강과목이 있을 때 : 수강과목은 여러개 있을 수 있음.
		
		for(int i = 0; i<subCount ; i++) {
			System.out.println(subjectList[i]); // toString을 이용한 출력
			
			//print 메서드로 직접 sysout을 헀을 경우 
			//subjectList[i].print(메서드명) 적으면 출력 됨 // subject 클래스에 print 메서드가 있을 경우
 	
		}
		
		
		
		
	}
	

	
	
	
	//수강과목 추가
	/* 매개변수 : Subject subName
	 * 리턴타입 : void
	 * */
	public void insertSubject(Subject subName) {
		
		//배열이 다 찼다면 늘려주기
		if(subCount == subjectList.length) {
			//new를 이용 배열 생성 (새로운 배열을 생성) + 5 			
			//기존에 가지고있는 list보다 5개 추가를 해라
			Subject[] tmp = new Subject[subjectList.length+5];

			//arraycopy를 이용한 배열복사	
			//System.arraycopy(구배열, 시작번지, 신배열, 시작번지, 총개수)
			System.arraycopy(subjectList, 0, tmp , 0, subjectList.length);
						
			//새로만든 배열로 연결			
			subjectList = tmp;		
		}
		
			//subName 추가
		subjectList[subCount] = subName;
		subCount++; // 값을 추가했기 때문에 증가 ++
		
	}
	
	
	//수강과목 삭제
	/* 매개변수 : String subName
	 * 리턴타입 : void
	 * */
	
	public void deleteSubject(String subName) {
		int index = -1; //찾는 과목의 위치를 나타내는 변수
						//0번지로 두면 위치가 무족건 첫번째가 선택되니까 아무것도 안줄라궁ㅋ
		// 만약에 매개변수의 값이 null이라면 return
		if(subName==null) {
			return;   //delete메서드를 빠져나가겠다는 뜻!
		}
		
		// subName을  subjectList에 있는지 검색 		
		for(int i = 0; i <subCount ; i++) {
			if(subjectList[i].getSubName().equals(subName)) {
				//있다면 번지를 index에 저장
				index = i;
				break;
			}
			
		}
		
		//찾는 과목이 없다면...return으로 빠져나오기
		if(index == -1) {
			return; 
		}
		
		//찾았을 경우 삭제.
		//찾은 위치부터 뒷번지의 과목을 앞번지로 옮기는 작업
		//subCount = 1 1과목이 있다는 것을 의미. subjectList = 0번지
		
		 for(int i=index ; i<subCount-1 ; i++) { 
			 //마지막 끝값을 비교하면.. +1에 의해서 뒤에있는 번지값을 앞으로 넘겨야하는데 값이 풀로차있다면 에러가생겨서 옮긴 후  마지막번지는 null로 채울거라서;; 먼소리야
			 subjectList[i] = subjectList[i+1];
		 }
		 
		 //마지막 번지는 null
		 //ex) 과목이 값이 3개있다면 0 1 2번지가 있다.  3에서 -1를해야 마지막 번지다
		 subjectList[subCount-1]=null;
		 subCount--; //삭제했으니까.지워라.
		 
		 

		 

		
	}
	
	
	
	
	
	
	
	//getter/setter
	public String getSdtNum() {
		return sdtNum;
	}

	public void setSdtNum(String sdtNum) {
		this.sdtNum = sdtNum;
	}

	public String getSdtName() {
		return sdtName;
	}

	public void setSdtName(String sdtName) {
		this.sdtName = sdtName;
	}

	public String getRegisterNum() {
		return registerNum;
	}

	public void setRegisterNum(String registerNum) {
		this.registerNum = registerNum;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Subject[] getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(Subject[] subjectList) {
		this.subjectList = subjectList;
	}
	
	// SubCount는 set를 생략 - 수정이 되면 안됨
	public int getSubCount() {
		return subCount;
	}
	
	
	
	
	
	

}
