package day10;

import java.util.Scanner;

public class EzenComMain {

	public static void main(String[] args) {
		
		
		EzenCom ec = new EzenCom();
		ec.setName("윤민영");
		ec.setAge(1);
		ec.setBirth("2002-09-12");
		ec.setPhone("1577-3082");
		ec.setBranch("UA");
		ec.printInfo();
		ec.printCompany();
		ec.insertCourse("탈주닌자되기", "365개월");
		ec.insertCourse("빌런으로살아남기", "100개월");
		ec.insertCourse("카가미랑결혼하기", "66666개월");
		ec.printCourse();
		
		System.out.println();
		
		EzenCom ec1 = new EzenCom("최누리", "2023-02-13",12, "1577-1577", "UA");
		ec1.printInfo();
		ec1.printCompany();
		ec1.insertCourse("히어로과정", "6개월");
		ec1.insertCourse("히어로명만들기", "1개월");
		ec1.insertCourse("히어로인턴활동", "3개월");
		ec1.printCourse();
		
		
		
		System.out.println();
		
		/*배열로 5명의 학생을 등록 후
		 * - 학생 이름으로 검색
		 * - 지점명으로 검색*/
		
		EzenCom[] std = new EzenCom[7];
		std[0]=new EzenCom("최누리", "1004-1004", "서울");
		std[1]=new EzenCom("윤민영", "1577-3082", "서울");
		std[2]=new EzenCom("최수정", "1234-5678", "북한");
		std[3]=new EzenCom("윤지영", "5858-5858", "인천");
		std[4]=new EzenCom("윤민영", "5678-1234", "서울");
		std[5]=ec;
		std[6]=ec1;
		
		
		
		
		String searchName = "최누리"; // 최누리의 지점정보 출력/개인정보 출력
		System.out.println("----------- 검색결과 :");
		for (int i=0;i<std.length;i++) {	
			if(std[i].getName().equals(searchName)) {
				std[i].printInfo();
				std[i].printCompany();
				System.out.println();
			}
		}
		
		

		String searchBranch = "인천"; // 지점정보/개인정보 출력
		System.out.println("----------- 검색결과 :");
		for (EzenCom tmp : std) {
			if(tmp.getBranch().equals(searchBranch)) {
				tmp.printInfo();
				tmp.printCompany();
			}
		}

		
	
		
		
	}

}
