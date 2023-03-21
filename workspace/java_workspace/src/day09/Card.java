package day09;

public class Card {  // 1.카드 1개를 만들어줌..
	
	
	/* Card class
	 * - 숫자 1~10, J, Q, K
	 * - 모양 하트♥, 다이아◆, 클로버♣, 스페이드♠
	 * - 한장의 카드정보를 출력하는 기능
	 * 
	 * - 생성자 : 클래스의 멤버변수들을 초기화 하는 기능 메서드
	 * - 생성자가 하나도 없으면 기본생성자를 자동으로 생성.
	 * - 생성자가 하나라도 있다면 기본생성자는 생성되지 않음.
	 * - 생성자의 이름은 클래스명과 동일, 리턴 자리는 없음. 매개변수는 가질 수 있음.
	 * 
	 * - 멤버변수는 private 선언, 메서드는 public 선언
	 * - 멤버변수에 접근하기 위해 getter/setter 메서드 사용
	 * */
	

	
	//멤버변수
	private char shape; //모양
	private int num; 	//숫자 1~10 J(11) Q(12) K(13)
	
	
	//기본 생성자..
	public Card() {
		shape = '♥'; 
		num = 1;	
	}	
		
	// 메서드
	public void Print() {	
		System.out.print(shape);
		switch(num) {
		case 11: 
			System.out.print("J"); 
			break;
		case 12: 
			System.out.print("Q"); 
			break;
		case 13: 
			System.out.print("K"); 
			break;
		default:
			System.out.print(num);
		}
	
	}

	
	
	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		
		switch(shape) {
		case '♥': case '♣': case '♠': case '◆': 
			this.shape = shape; 
			break;	
		default : 
			this.shape = '♥';
		}

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
		if(num>13 || num<1) {
			this.num = 1;
		}
	}		
 }

	
