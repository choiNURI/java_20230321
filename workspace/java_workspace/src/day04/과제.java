package day04;
import java.util.Scanner;
public class 과제 {

	public static void main(String[] args) {
		/*응용문제
		 * 
		 * 1부터..50사이의..
		 * 랜덤수하나를 생성하시오.
		 * 
		 * 예)컴퓨터가 랜덤수를 생성했습니다. -> 45
		 * 사용자 입력 : 20
		 * Up
		 * 사용자 입력 : 30
		 * Up
		 * 사용자 입력 : 49
		 * Down
		 * 사용자 입력 : 45
		 * 정답입니다.
		 * 
		 * 퀴즈게임~*/
		
		
		// 스캔을 받고 랜덤값은 i로 설정 두가지를 비교할거임
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("랜덤게임^^숫자를 맞추세요. (범위 1~50)");
		
		int i = (int)(Math.random()*50)+1; 
		System.out.println(i);
		
		for(;;) {
			int s;
			s= scan.nextInt();
		if(s>50) {
			System.out.println("범위가 잘못되었습니다.");

		} else if (s<i) {
			System.out.println("Up해주세요");

		} else if (s>i) {
			System.out.println("Dwon 해주세요.");
			
		} else  {
			System.out.println("정답입니다.");
			break;
		} 
		
		}
		
		
		
		
		

		
		
		
		
		

	}

}
