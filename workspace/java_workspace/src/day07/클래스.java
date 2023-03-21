package day07;

public class 클래스 {
	  //멤버변수자리
	public static void main(String[] args) {
	
		/* 클래스 - 설계도
		 * 객체를 생성하기위한 설계도
		 * 매서드 - 기능
		 * 
		 *  클래스의 구성정보
		 *  - 속성 : 멤버변수   (모든 메서드에서 공통적으로 사용하는 변수)
		 *  - 기능 : 메서드    (지역변수 = 메서드에서만 사용)
		 *  
		 *  
		 * 프린터 클래스
		 * - 속성(정보) : 크기, 색, 제조사, 이름, 구동방식
		 * - 기능 : 인쇄, 스캔, 팩스, 복사
		 *  
		 *  멤버변수는 클래스 안, 메서드 위에 작성 (4번라인)
		 *  멤버변수는 클래스안에서 사용할수 있다. (모든 메서드에서 사용가능)
		 *  
		 *  접근제한자 class 클래스명 {
		 *   // 클래스명은 대문자로시작 (규칙)
		 *   }
		 *   
		 *  - 객체 선언
		 *  클래스명 객체명 ;
		 *  
		 *  -객체선언 & 초기화(생성) 
		 *  클래스명 객체명 = new 클래스명();
		 *  
		 *  - 멤버 메서드 사용하는 법
		 *  객체명.메서드명();
		 *  
		 *  같은 클래스 안에서 메서드를 호출할 때는 메서드명으로 호출가능. => 메서드명();
		 *  다른 클래스에서는 메서더를 호출할 때 객체를 이용하여 사용 => 객체명.메서드명();
		 *  */
		
		/* 접근데한자(제어자)
		 * - public    : 모두 사용 가능.
		 * - protected : 나(내 클래스) + 패키지 + 자식클래스
		 * - (default) : 나(내 클래스) + 패키지
		 * - private : 나 (내 클래스.. 다른 클래스는 호출 불가)
		 * 
		 * 클래스에서 public을 붙일 수 있는 건 파일명과 클래스명이 같을 때만 가능.
		 * 멤버변수나, 메서드는 public을 붙이는 것에 제한이 없음.
		 * 
		 * private :멤버변수/메서드를 다른 클래스에서 사용할 수 없게 함.
		 * 
		 * - 일반적으로 멤버변수는 private으로 하고, 메서드는 public으로 선언
		 * - 일반적으로 private으로 선언된 멤버변수 getter/setter를 통해 변수에 접근할 수 있음.
		 * */
		
		
	
		
		Point p = new Point(); //스캐너 선언하듯...
		p.print();
		
		p.move(5, 3);
		p.print();

//		p.x = 7;
		p.print();
		
//		p.y=10;
		p.print();
		
//		System.out.println(p.x);
//		System.out.println(p.y);
		
		System.out.println(p.getX());

		
		p.setX(100);
		System.out.println(p.getX());
		
		
		System.out.println(p.getY()); // 변경전 : 3
		p.sety(50);   				  // y를 50으로 변경
		System.out.println(p.getY()); // 변경후 : 50

		
		System.out.println("-----------------------");
		
		
		// Point1 x,y,z불러오기
		Point1 pp = new Point1();
		pp.print();
		
		pp.move(10, 20, 30);
		pp.print();
		
		pp.setterX(70);
		pp.setterY(80);
		pp.setterZ(100);
		
		System.out.println(pp.getterX());
		System.out.println(pp.getterY());
		System.out.println(pp.getterZ());
		
		
		
		
		
		
		
		
		
		

	}
}

/* 다른 클래스 밖에서 생성
 * 접근제한자 class 클래스명{
 * 클래스명은 대문자로 시작
 * }
 * */


class Point{ // 접근제한자가 없다는 건 default라는 것.
	
	//멤버변수는 초기화하지 않아도 기본0또는 null로 초기화 됨.
	private int x;    // private 로바꾸면 main에서 못씀 직접접근불가! 메서드를 통해서만 접근가능
	private int y; //누구나 쓸수있게.. 멤버변수 선언
	
	
	
	//x,y 좌표를 변경하는 메서드
	//매개변수 : x, y의 값을 주고 멤버변수의 x,y를 변경
	public void move(int x1, int y1) {
//		this.x=x;  // this.x는 나의 멤버변수 . x는 그냥 지역변수 똑같을때만 this 해주기
//		this.y=y;		
		x=x1;
		y=y1;
		
	}
	
	
	//x,y 좌표를 프린트하는 메서드
	public void print() {
		//(0,0)
		System.out.println("("+ x + "," + y +")");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
	}
	

	public int getY() {
		return y;
	}
	public void sety(int y) {
		this.y=y;
	}
	
}	
	
class Point1{
		//x,y,z를 멤버변수로 선언		
		private int x;   
		private int y;
		private int z;
		
		//(x,y,z)를 찍는 print메서드 생성
		public void print() {
			System.out.printf("(%d,%d,%d)%n",x,y,z);
		}
		
		//x,y,z의 값을 변경하는 move 메서드 생성
		
		public void move(int x, int y,int z) {
			this.x=x;
			this.y=y;
			this.z=z;			
		}
		
		
		
		
		
		//각각의 값을 getter/setter생성
		
		public int getterX() {
			return x;
		}
		public int getterY() {
			return y;
		}
		public int getterZ() {
			return z;
		}
		
		public void setterX(int x) {
			this.x=x;
		}
		public void setterY(int y) {
			this.y=y;
		}
		public void setterZ(int z) {
			this.z=z;
		}		
		
		//오른쪽마우스>> source > Generate Getter and Setter 선택하면
		// getter, setter 자동생성됨..-_-
		
		
		
	
}






