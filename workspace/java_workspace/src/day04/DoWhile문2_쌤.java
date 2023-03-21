package day04;
import java.util.Scanner;
public class DoWhile문2_쌤 {
	
	public static void main(String[] args) {
	
	/* ------ menu ------
	 * 1.저장|2.출력|3.종료
	 * ------------------
	 * 입력 : 1
	 * 저장되었습니다.
	 * 입력 : 2
	 * 출력되었습니다.
	 * 입력 : 3
	 * 종료되었습니다. (반복문종료)
	 * */
		
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		do {
			System.out.println("------ menu ------");
			System.out.println("1.저장|2.출력|3.종료");
			System.out.println("------------------");
			System.out.print("입력 > ");
			
			menu = scan.nextInt(); //스캔받은int를 menu에 저장하겠다.
			
			// 아래는 실제 기능을 적어주자
			
			switch(menu){ // menu의 경우에 따라 값을주겠다.
			case 1:
				System.out.println("저장되었습니다.");
				break;
			case 2:
				System.out.println("출력되었습니다.");
				break;
			case 3:
				System.out.println("종료되었습니다.");
				break;
			default :
				System.out.println("잘못입력되었습니다.");
				break;				
			}
		
		}while(menu!=3); // true, 3과 같지 않을 경우는 do문 반복
		System.out.println("프로그램종료");
		
		
		
		
		scan.close(); 
		
		
		
		
			}
	
	}

