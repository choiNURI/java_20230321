package day08;

public class 클래스03 {

	public static void main(String[] args) {
		

		Card g = new Card();
		
		g.Print();

		g.setShape('♣');
		g.setNum(12);
		g.Print();
		
		
		//카드에 없는 모양/숫자가 들어오면 무조건 1♥ >> setter에 조건을 넣어준다.
		g.setShape('*');
		g.setNum(1);
		g.Print();
	}

}



/* Card 클래스 생성 : 포커게임에서 사용하는 카드를 나타내는 클래스
 * 모양 : 하트♥ 클로버♣ 스페이드♠ 다이아◆
 * 숫자 : 1 ~ 10 J(11) Q(12) K(13)/
 * 
 * 
 * 클래스의 구성
 * - 멤버변수 : char shape , int num
 * - 메서드 : 프린트
 * - getter / setter
 *  - 생성자 : 하트 1 (1♥)
 * 
 */

//멤버변수만들기
	class Card{ 
		private char shape; 
		private int num;

//생성자만들기
	public Card() {
		shape = '♥';
		num = 1;	
}	

	
	//프린트하는 매서드 만들기
	
	//연산할게없음(리턴할게 없음)
	public void Print() {	

		switch(num) {
		case 11: System.out.print("J"); break;
		case 12: System.out.print("Q");break;
		case 13: System.out.print("K");break;
		default:
			System.out.print(num);
		}
		System.out.println(shape);
	}	




	public char getShape() {
		return shape;
	}


	public void setShape(char shape) {
		this.shape = shape;
		switch(shape) {
		case '♥': this.shape = shape; break;
		case '♣': this.shape = shape; break;
		case '♠': this.shape = shape; break;
		
		default: this.shape = '♥';	
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
	
