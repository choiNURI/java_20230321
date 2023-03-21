package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Subject {
	Scanner scan = new Scanner(System.in);	
	int exit = 1;
	String sch;
	HashMap<String,Integer> map = new HashMap<>();	
	public static void main(String[] args) {
		/* map을 이용 성적관리 프로그램 생성
		 * >>menu
		 * 1. 성적추가 (국어 79)
		 * 2. 성적조회 (전체출력) : 합계/평균
		 * 3. 성적조회(과목) : 서치 후 일치하는 과목 출력
		 * 4. 성적수정 : 서치 후 수정
		 * 5. 성적삭제
		 * 6. 종료
		 * CRUD
		 * C(create) 생성 R(read) 읽기
		 * U(update) 수정 D(delete) 삭제
		 * 
		 * */
		
		
		

		Subject sbj = new Subject();
		
		sbj.map();
		sbj.print();
		

	} //라면은..죽었다.
	
	
	
	//입력메서드
	public void map() {	
	System.out.println("성적등록을 시작합니다~");
	while(exit != 0) {
		System.out.print("과목:");
		String sub = scan.next();
		System.out.print("점수:");
		int scr = scan.nextInt();			
		map.put(sub, scr);
		 System.out.println("계속:1, 종료:0");
		  exit = scan.nextInt();
			if(exit>1 || exit <0) {
				System.out.println("오류났습니다.종료합니다.");
				break;
			}
		}		
	}
	
	//출력메서드
	public void print() {
		Iterator<String> it = map.keySet().iterator();
		int sum=0;
		double avg = 0;
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			sum += value;
			System.out.println(key + ":" + value) ;
		}
		System.out.println("합계 : " + sum + " 평균 : " + (double)sum/map.size());
		System.out.println();

		//서치메소드를 붙여넣는다.
		search();
		
	} 
	
	
	
	public void search() {
		
		System.out.println("찾으실 과목을 입력해주세요.");
		 scan.next();
		

				
			}
		
		
		
		
	}
	
	
	
	

