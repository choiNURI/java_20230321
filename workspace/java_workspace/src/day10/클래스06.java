package day10;

public class 클래스06 {

	public static void main(String[] args) {
		/* final 클래스, 변수, 메서드에 붙일 수 있다.
		 * final : 수정할 수 없다.
		 * final 멤버 변수 : 상수
		 * final 멤버 메서드 : 오버라이딩을 할수 없다.
		 * final 클래스 : 상속 할 수 없다. 부모 클래스가 될 수 없다.
		 * 
		 * */
		
		
		
		EzenStudent A = new EzenStudent("UA", "Shoto todoroki", "A", "1004-1004");
		
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		A.printEzen();
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		
		System.out.println();
		
		
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		//EzenStudent B = new EzenStudent();
	
//		B.setName("BAKUGO");
//		B.setGroup("A");
//		B.setNumber("8282-8282");
//		B.printEzen();
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
			
		System.out.println();
		
		System.out.println(A);
//		System.out.println(B);

	}

}


/* 초기화 방법 : 기본값, 명시적 초기값, 초기화 블럭, 생성사
 * 1. 명시적 초기화 : 멤버변수 선언과 동시에 초기값을 지정
 * 2. 초기화 블럭 : { } 멤버변수 초기화
 * 3. 생성자 : 객체를 생성할 때 초기화 해서 생성
 * 초기값 우선순위
 * 기본값 -> 명시적초기값 -> 초기화블럭 -> 생성자
 * */



// 멤버변수 :  지점, 이름, 반, 전화번호
// 메서드 : 출력(print 메서드, toString가능)



class EzenStudent{
	
	
	
	private String location="UA";
	private String name;
	private String group;
	private String number;
	
	{
	  //초기화 블럭 : 멤버변수들을 초기화;
		location="HERO";
		group = "미정";
	
	}

	
	


	
	
	
	
	
	public EzenStudent(String location,String name,String group,String number) {
		this.location = location;
		this.name = name;
		this.group = group;
		this.number = number;	

	}



	@Override
	public String toString() {
		return "EzenStudent [location=" + location + ", name=" + name + ", group=" + group + ", number=" + number + "]";
	}
	
	
	public void printEzen() {
		System.out.println("지점 : " + location);
		System.out.println("이름 : " + name);
		System.out.println("반 : " + group);
		System.out.println("전번 : " + number);
		
		
	}





	public String getLocation() {
		return location;
	}





	public void setLocation(String location) {
		this.location = location;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getGroup() {
		return group;
	}





	public void setGroup(String group) {
		this.group = group;
	}





	public String getNumber() {
		return number;
	}





	public void setNumber(String number) {
		this.number = number;
	}
	
	
}





