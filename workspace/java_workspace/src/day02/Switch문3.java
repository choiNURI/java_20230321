package day02;

public class Switch문3 {

	public static void main(String[] args) {
		/*
		 * 계절을 출력
		 * 봄,여름,가을,겨울
		 * 1~12월까지 랜덤으로 생성 후 해당하는 월과 계절을 출력 
		 * 3~5월 봄 , 6~8월 여름, 9~11월 가을, 12월~2월 겨울 */


		int random = (int)(Math.random()*12)+1;

		switch(random) {
		case 3:
		case 4:
		case 5:
			System.out.println(random+"월은 봄입니다.");
		break;
		
		case 6:
		case 7:
		case 8:
			System.out.println(random+"월은 여름입니다.");
		break;
		
		case 9:
		case 10:
		case 11:
			System.out.println(random+"월은 가을입니다.");
		break;
			
		default:
			System.out.println(random+"월은 겨울입니다.");
		}
		
		 if (random >=3 && random <=5) {
			 System.out.println(random+"월은 봄입니다.");		
			 
			 } else if (random >=6 && random <=8) {
				 System.out.println(random+"월은 여름입니다.");
				 
			 } else if (random>=9 && random <=11) {
				 System.out.println(random+"월은 가을입니다.");
				 
			 } else if (random ==12 || random==2 || random==1) {
				 System.out.println(random+"월은 겨울입니다.");
			 } else {
				 System.out.println("오류");
				 		 
		 }

	}
}





/* (1) || (2) or은 둘중 하나의 조건만 맞으면 true 
 * (1) && (2) and 둘다 맞아야 true
 * !(true) not. 조건의 반대
 * */
 