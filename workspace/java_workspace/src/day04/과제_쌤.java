package day04;
import java.util.Scanner;
public class 과제_쌤 {

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
		
		// 스캐너열기
		Scanner scan = new Scanner(System.in);
		
		// 랜덤수결정하기 (1부터 50까지)		
		int random = (int)(Math.random()*50)+1;
		int num=0, count=0;
		System.out.println("컴퓨터가 랜덤수를 결정했습니다. (1~50)");
		//반복문 열기
		while(num != random) { //num와 random 값이 맞지않으면 true라 반복
			System.out.print("입력 : ");
			num = scan.nextInt();
			count++; // 사용자가 입력했을때 1 증가
			
			// 비교문 작성
			
			if(num < 1 || num > 50) {  //범위가 잘못되는 조건 설정
				System.out.println("입력 범위를 벗어났습니다.(1~50)");
			} else if(num>random) {
					System.out.println("Down");
			}else if(num<random) {
					System.out.println("Up");
			}else {
				System.out.println("정답입니다.");
				}
			}
			System.out.println("게임횟수 : "+count);
			
			
		
		}

}
