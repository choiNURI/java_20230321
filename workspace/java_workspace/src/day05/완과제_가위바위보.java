package day05;

import java.util.Scanner;

public class 완과제_가위바위보 {

	public static void main(String[] args) {
		/*
		 * 가위 바위 보 만들기
		 * 컴퓨터가 가위,바위,보 중 랜덤으로 선택 (0=가위, 1=바위, 2=보)
		 * 내가 가위,바위,보 중 선택을 해서 입력
		 * 승 패 무의 결과를 출력
		 * 
		 * */
		
		System.out.println("가위, 바위, 보 게임 시작 !!");
		Scanner scan = new Scanner(System.in);  // 오픈 후 scan.clse();안에 모든걸 넣어라

		int comNum = (int)(Math.random()*3); // 0 1 2
		System.out.println("컴퓨터가 결정을 완료하였습니다.");
		System.out.println("가위/바위/보 중 하나를 선택하세요 > ");
		
		String myChoice = scan.next(); // 나의 선택
		
		// 컴퓨터 선택을 String으로 변환
		String comChoice = (comNum == 0)?"가위" : (comNum == 1)?"바위" :"보";
		System.out.println("com 선택 > " + comChoice);
		
		//비교
		if(comChoice.equals(myChoice)) {    // 순서바뀌어두 상관없옹
			System.out.println("비겼습니다.");
		}else {
			if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("바위")? "이겼습니다." : "졌습니다.");
			} else if(comChoice.equals("바위")) {
				System.out.println(myChoice.equals("보")? "이겼습니다." : "졌습니다.");
			} else {
				System.out.println(myChoice.equals("가위")? "이겼습니다." : "졌습니다.");
				
			}
		} System.out.println("게임종료!!");

		
		
//		int user = scn.nextInt();
//		if(user==0) {
//			System.out.println("당 신 : 가위");
//		}if(user==1) {
//			System.out.println("당 신 : 바위");
//		}if(user==2) {
//				System.out.println("당 신 : 보");
//		}			
//		
//		int num = (int)(Math.random()*3);	
//
//		if(num==0) {
//			System.out.println("컴퓨터 : 가위");
//		}if(num==1) {
//			System.out.println("컴퓨터 : 바위");
//		}if(num==2) {
//				System.out.println("컴퓨터 : 보");
//		}
//		
//	 if (num==0) {
//		 if(user==0) {
//			 System.out.println("비겼어요^^");
//		 } if(user==1) {
//			 System.out.println("이겼어요^^");
//	    }if(user==2) {
//		  System.out.println("졌어요^^");
//	    }
//	 }
//	 
//	 if (num==1) {
//		 if(user==0) {
//			 System.out.println("졌어요^^");
//		 } if(user==1) {
//			 System.out.println("비겼어요^^");
//	    }if(user==2) {
//		  System.out.println("이겼어요^^");
//	    }
//	 }
//	 
//	 
//	 if (num==2) {
//		 if(user==0) {
//			 System.out.println("이겼어요^^");
//		 } if(user==1) {
//			 System.out.println("졌어요^^");
//	    }if(user==2) {
//		  System.out.println("비겼어요^^");
//	    }
//	 }
		

	}
}

