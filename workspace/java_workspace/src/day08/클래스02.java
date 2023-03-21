package day08;

public class 클래스02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 자동차 클래스 생성
		 * 맴버변수 : color, power, speed 
		 * 메서드 : powerOn "전원이켜졌습니다."(true) poerOff"전원이꺼졌습니다."(false) 
		 * 		  speedUP(+10) speedDown(-10)
		 * 멤버변수 : private
		 * 멤버변수를 확인/수정 => getter/setter 필요
		 * */

		
		
		
			
		Car c = new Car("빨강");
		System.out.println(c.getColor());
		System.out.println(c.getSpeed());
		System.out.println(c.isPower());
		
		//c.setColor("노랑");
		System.out.println(c.getColor());		
		c.powerOn();
		c.speedUP();
		c.speedUP();
		c.speedUP();
		c.speedUP();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.powerOff();
		c.speedUP(); // 시동이 꺼졌는데 스피드가 올라가면안됨..-_-
		c.powerOn();
		c.speedUP();
		c.speedDown();
		c.speedDown(); //이미 speed값이 0이니까 아래는 출력하지 않는다.
		c.speedDown();
		c.speedDown();

		System.out.println();
		
		Car c2 = new Car("노랑");
		System.out.println("--- 다른 자동차 생성 ---");
		c.setDoor(2);
		System.out.println(c.getColor());
		System.out.println(c.isPower());
		System.out.println(c.getSpeed());
		
		//c2.setColor("빨강");
		System.out.println(c.getColor());
		c2.powerOn();
		c2.speedUP();
		c2.speedUP();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c.speedUP();

	

	}
}



class Car{
	// 1. 멤버변수 선언	
	//어떤멤버를 결정할건가 
	private String color;  //null    // 메인에서 변경할수있게 get set	
	private int door;
	private boolean power; //false   // on off 메서드
	private int speed;     //0      // up down 메서드
	
	
	
	///// --------------- 생성자 위치
	//생성자 : 없으면 기본생성자가 자동 추가된다.
	//클래스와이름이 같고 리턴타입이 없다
	public Car(String color) {
		this.color = color;
	}
	
	
	public Car(String color, int door) {
		//this(color); 생성자호출..  호출하는 생성자는 맨윗줄에 있어야됨..
		               //이렇게도 가능합니다..근데 생성자 많을때 쓴대용..ㅋ
		this.color = color;
		this.door = door;
	}	
	
	
	public Car() {    } //기본생성자(아무것도 없는 값) // -> 생성자 오버로딩
	
	
	
	
	//2. 멤버메서드
	//어떤기능을 쓸것인가 (메서드)
	
	public void powerOn() { //내부에서 키는거지 밖에서 가져오는게 아님..가져올 변수도x
		System.out.println("시동이 켜졌습니다.");
		//실제로 켜진게아니니까..아래 조건 달기
		power = true;   //멤버변수 파워의 값으로 true가 저장됨
	}

	public void powerOff() { //내부에서 키는거지 밖에서 가져오는게 아님..가져올 변수도x
		System.out.println("시동이 꺼졌습니다.");
		//실제로 꺼진게아니니까..아래 조건 달기
		power = false;
	}
	
	
	//연산할게없음(리턴할게 없음)
	public void speedUP() {
	
		if(power) {
			speed = speed+10;   //내스피드값은 멤버변수에 저장됨
			System.out.println(color+"속도 : " + speed);
		} else {
			System.out.println("시동이 꺼졌습니다. 시동을 켜주세요.");
		}
	}
	
	public void speedDown() {	
		
	if(speed>0) {
	speed = speed-10;   //내스피드값은 멤버변수에 저장됨
		System.out.println(color+"속도 : " + speed);
		} else {
			speed=0;
	}
//		speed = speed-10;  
//		System.out.println("속도 : " + ((speed<=0) ? 0 : speed));
//		// >이렇게하면 (-)값은 계속 누적됨.. 
	
	}
	
	
	
	//3. getter/setter
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) { //내 매개변수를 너의 값으로 덮어씌울게
		this.color = color;
	}

	
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getDoor() {
		return door;
	}


	public void setDoor(int door) {
		this.door = door;
	}

}