package stdentmanager;

import java.util.Scanner;

public interface Program {
	

	/*interface - program
	  1. 학생 리스트 출력
	  2. 학생 등록
	  3. 학생 검색
	  4. 수강 신청
	  5. 수강 철회
	*/
	
	void printStudent(); //학생전체리스트 (수강내역x)
	void insertStudent(Scanner scan); //스캐너로 입력받기
	void serchStudent(Scanner scan);
	void registerSubject(Scanner scan);
	void deleteSubject(Scanner scan);

}




