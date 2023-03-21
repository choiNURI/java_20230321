	package day04;
	
	import java.util.Scanner;
	
	public class 과제주사위 {
	
		public static void main(String[] args) {
			
			/* 주사위를 랜덤으로 던져서 총 30칸을 이동하면 완주
			 * 주사위 : 1 ~ 6까지의 랜덤수
			 * 주사위: 3
			 * 3칸 전진 => 27칸 남았습니다.
			 * 6칸 전진 => 21칸 남았습니다.
			 * 총 30칸이 지나면 => 도착
			 * 총 몇번 던져서 도착했는지 => 총 이동 횟수 : 00번
			 * */
	
			System.out.println("랜덤의 힘으로 30칸까지 도착하세요");
			
			int count=0; //얼마나 돌았는지 카운트 해줄거임
			int num=0; // random는 나오는 값을 더해줄거임
			
			 	// 랜덤범위를 지정함	
			//
			
	
			while(num!=30) { // 주사위의 합. 30번 돌릴때 까지 계속해라.
				int random = (int)(Math.random()*6)+1;
				count++;     //실행문이 돌때마다 카운팅
				num = num + random;	//num는 랜덤을 계속 더한다.
				
				if(num>=30) {
					System.out.println("주사위 : "+random);
					System.out.println("우와!!!! 도착^^추카");
					System.out.println("** 총 이동 횟수는"+count+"번^^.");
					break;
				} else {
					System.out.println("주사위 : "+random);
					System.out.println("앞으로 "+random+"칸 전진하세요.");
					System.out.println("(아직멀었어.."+(30-num)+"칸 남았어..)");
					
				}
				
			}
			
	
			
			
		}
	
	}
