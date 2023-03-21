package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Subject01 {
	private HashMap<String,Integer> map = new HashMap<>();	
	Scanner scan = new Scanner(System.in);
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
		
		Subject01 sb = new Subject01();
		int menu = -1;
		do {
			sb.printMenu(); //메뉴출력
			menu = sb.scan.nextInt();
			switch(menu) {
			case 1: sb.insert(); break;
			case 2: sb.print();  break;
			case 3: sb.printSub(); break;
			case 4: sb.modify(); break;
			case 5: sb.delete(); break;
			case 6: break;
			default : System.out.println("잘못된 메뉴");
			}	
		}while(menu != 6);
		System.out.println("종료됩니다.");
		
		
		
		
	}

	//메뉴 print	
	public void printMenu() {
		System.out.println(">>menu");
		System.out.println("1. 성적추가");
		System.out.println("2. 성적조회(전체)");
		System.out.println("3. 성적조회(과목)");
		System.out.println("4. 성적수정");
		System.out.println("5. 성적삭제");
		System.out.println("6. 종료");
		System.out.print(">>menu : ");
	}
	
	
	//성적추가	
	public void insert() {
		System.out.println("과목과 성적을 입력해주세요. (ex:국어 90)");
		String subject = scan.next();
		int score = scan.nextInt();
		
		if(score<0 || score>100) {
			System.out.println("잘못된 점수입니다.");
			return;
		}
		if(map.get(subject) == null) { //과목 중복 입력 방지
			map.put(subject, score);
		}else {
			System.out.println(subject+"는 이미 존재합니다.");
		}
	}
	
	
	//전체 출력
	public void print() {
		int sum=0;
		double avg =0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String subject = it.next();
			int score = map.get(subject);
			sum = sum+score;
			System.out.println(subject+":"+score);
		}
		System.out.println("합계"+sum);
		System.out.println("평균"+sum/map.size());
	}
	

	//과목조회 후 출력
	public void printSub() {
		System.out.println("조회할 과목을 입력해주세요.");
		String subject = scan.next();
		
		Integer score = map.get(subject);
		if(score == null) {
			System.out.println(subject+"는 없는 과목입니다.");			
		} else {
			System.out.println(subject+":"+score);
		}
	}
	
	
	//성적 수정
	public void modify() {
		System.out.println("수정할 과목과 점수를 입력해주세요. (ex:국어 80)");
		String subject = scan.next();
		int score = scan.nextInt();
		
		if(score<0 || score>100) {
			System.out.println("잘못된 점수입니다.");
			return;
		}
		 map.put(subject, score); //map의 key는 중복불가 중복되면 알아서 덮어쓰기함. 중복을 지워서 다시 할 필요가없음(List라면 찾아서 수정해야되능데...)
		System.out.println(subject+"이"+score+"로 변경되었습니다.");		
	}
	
	//성적 삭제
	public void delete() {
		System.out.println("삭제할 과목을 입력해주세요.");
		String subject = scan.next();
		if(map.get(subject)==null) {
			System.out.println(subject+"는 없는 과목입니다.");	
		} else {
			map.remove(subject);
			System.out.println(subject+"과목이 삭제되었습니다.");
		}
	}



}
