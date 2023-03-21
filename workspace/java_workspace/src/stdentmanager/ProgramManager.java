package stdentmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramManager implements Program {

	
	
	
	//멤버변수 Student class, stdCount 변수
	
	private Student[] std = new Student[10];
	private int stdCount; // 등록한 학생 카운트






	@Override
	public void printStudent() {
		for(int i = 0 ; i <stdCount ; i++) {
			std[i].stdPrint();	 // 학생정보만 출력
			System.out.println("------------");
			//printStudentOne(std[i]); // 학생정보+수강정보	
		}
	}

	@Override
	public void insertStudent(Scanner scan) {
		// 1명의 학생정보 값을 입력받아 객체를 생성한 후 std 배열에 등록
		System.out.println("--학생정보입력--");		
		System.out.println("이름>");
		String name = scan.next();
		System.out.println("학번>");
		String sNum = scan.next();
		System.out.println("주민번호>");
		String rNum = scan.next();
		System.out.println("학부");
		String faculy = scan.next();
		System.out.println("학과");
		String major = scan.next();
		System.out.println("------------");
		
		//입력받은 값으로 객체를 생성
		Student s = new Student(rNum, name, sNum, faculy, major);
		
		//배열이 다 찼다면 더 큰 배열을 생성 후 배열복사		
		if(stdCount == std.length) {
			Student[] tmp = new Student[std.length+5];
			System.arraycopy(std, 0, tmp , 0, stdCount);			
			std = tmp;		
		}
		
		//std 배열에 등록
		std[stdCount]=s;
		stdCount++; //인원증가(배열번지증가)

	}


	
	@Override
	public void serchStudent(Scanner scan) {
		
		//검색할 학생이름을 받아 배열에서 탐색 후 있다면
		//학생정보+수강정보 출력 => printStudentOne() 호출
		System.out.println("학생 이름 입력>");
		String searchname = scan.next();
		int index = -1; //찾은 학생의 배열주소 입력
		
		//배열로 전체 탐색
		for(int i = 0 ; i < stdCount ; i++) {
		
		if(std[i].getSdtName().equals(searchname)) {
			printStudentOne(std[i]);
			index = i;			
			System.out.println();
			} 
		}
		//for문에 돌리면 힘들..다? 변수 선언 후...하는게 나아욧 !
		if(index==-1) {
			System.out.println("그런 학생은 없어요..");
			System.out.println();
		}
		
//		if (!(std[i].getSdtName().equals(searchname))){
//				System.out.println("그런 학생은 없어요..");
//				System.out.println();
//			}

	}
	

	
	
	@Override
	public void registerSubject(Scanner scan) {

		// 수강신청자(학생) 체크 (ex 학번/이름 입력받아서...)
		int index = -1;
		System.out.println("학생 이름 입력>");
		String searchname = scan.next();
		// 입력받은 학생 배열 위치를 체크 후 신청
		for(int i = 0 ; i < stdCount ; i++) {
			if(std[i].getSdtName().equals(searchname)) {
				index=i;
					break; //생략가능
				} 
			}
				// 학번이 없다면 ?..
			if(index==-1) {
				System.out.println("학생정보가없습니다...;;");
			} else {
				// 신청할 과목의 갹체 생성(과목정보 입력받기)
				System.out.println("수강신청 과목번호>");
				String sNum = scan.next();
				System.out.println("수강신청 과목명>");
				String sName = scan.next();
				System.out.println("학정>");
				double sPoint = scan.nextDouble();
				
				
				//객체생성
				Subject sb = new Subject(sNum,sName,sPoint);
				std[index].insertSubject(sb);

				}

		
	}
	
	
	

	@Override
	public void deleteSubject(Scanner scan) {
		// 수강신청자(학생) 체크 (ex 학번/이름 입력받아서...)
		int index = -1;
		System.out.println("학생 이름 입력>");
		String searchname = scan.next();
		// 입력받은 학생 배열 위치를 체크 후 신청
		for(int i = 0 ; i < stdCount ; i++) {
			if(std[i].getSdtName().equals(searchname)) {
				index=i;
				break; //생략가능
				} 
		}
		// 학번이 없다면 ?..
		if(index==-1) {
			System.out.println("학생정보가없습니다...;;");
		} else {
			// 신청할 과목의 갹체 생성(과목정보 입력받기)
			System.out.println("수강삭제 과목>");
			String sName = scan.next();
			// 신청메서드 호출 deleteSubject(과목명)
			std[index].deleteSubject(sName);
		}

	}
	
	
	

	//1명의 학생정보+수강정보를 같이 추력하고 싶을 때
	public void printStudentOne(Student s) {
		System.out.println("*✧·˚ : *학생정보*✧·˚ : *");
		s.stdPrint();
		System.out.println("*✧·˚ : *수강정보*✧·˚ : *");
		s.subPrint();
		System.out.println();
		
	}


}
