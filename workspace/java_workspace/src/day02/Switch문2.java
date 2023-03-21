package day02;

public class Switch문2 {

	public static void main(String[] args) {
		/*주사위의 값을 출력하는 예제
		 * 주사위는 1~6까지의 랜덤수로 결정됨
		 * - 가 나오면 후진 , + 가 나오면 전진 */

		int random = (int)(Math.random()*13)-6;
		System.out.println(random);
					
			if (random > 0) {
				System.out.println(Math.abs(random)+"만큼 전진");
			} else if (random < 0)	{
				System.out.println(Math.abs(random)+"만큼 후진");
			} else {
				System.out.println("제자리");
			}
				

			
			
			
//			switch(random) {
//			case 1:
//				System.out.println(random+"만큼 전진");
//				break;
//				
//			case 2:
//				System.out.println(random+"만큼 전진");
//				break;
//			
//			case 3:
//				System.out.println(random+"만큼 전진");
//				break;
//				
//			case 4:
//				System.out.println(random+"만큼 전진");
//				break;
//				
//			case 5:
//				System.out.println(random+"만큼 전진");
//				break;
//				
//			default:
//				System.out.println(random+"만큼 전진");

	}
}
