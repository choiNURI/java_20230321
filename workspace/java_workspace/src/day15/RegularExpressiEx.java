package day15;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressiEx {

	public static void main(String[] args) {
		// RegularExpression : 정규표현식
		// 문자의 형식을 검증하는 형태
		// 전화번호, 비밀번호 
		// 자바스크립트에서 많이 쓴답니다. 자바에서도 쓰는 거 참고하세용
		
		// [abc] abc중 하나의 문자 , 
		// [a-zA-Z] a~z, A~Z 중 하나의 문자 : 대소문자 1개 가능
		// \d : 숫자 \w == [a-zA-Z0-9] : 대소문자,숫자 1개만 가능

		// . : 모든 문자중 한개의 문자
		// ? : 없음 또는 1개, * : 없음 또는 1개 이상
		// {3,} : 무조건 3자리 이상 
		// ?=.* : 필수
		// (02|010)-\d{3,4}-\d{4} => 010-111-1111 , 02-1212-2222 가능한.
		
		
		String[] strArr = {"car","cd","date","disk",
							"count","apple","banana","baboYejun","babyHamin","bonggu"};
		Arrays.sort(strArr);
		for(int i = 0 ; i < strArr.length ; i++) {
			System.out.println(strArr[i]+" ");
		}
		System.out.println("--------------");
		
		Pattern pattern = Pattern.compile("b[a-zA-Z]*");
		for(String str : strArr) {
			Matcher matcher = pattern.matcher(str);
			if(matcher.matches()) {  //패턴이 일치가 되면 true를 반환
				System.out.println(str+" ");
			}
		}
	}

}  