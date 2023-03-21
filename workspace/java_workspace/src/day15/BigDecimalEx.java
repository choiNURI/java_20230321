package day15;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalEx {

	public static void main(String[] args) {

		// BigDecimal : java에서 숫자를 정밀하게 저장/표현하기 위한 클래스
		// 돈, 소수점 정밀한 계산이 필요한 경우는 필수
		// 단점 : 느린속도
		
		
		//값을 초기화 하기 위해서는 "문자열"로 값을 넘겨줘야 함. ""에 안넣으면..값이 이상하게나옴-_-;
		BigDecimal db = new BigDecimal("1000.1234");
		BigDecimal db1 = new BigDecimal("1000.1234");
		BigDecimal db2 = new BigDecimal("100");
		
		//double db = 1000.1234; // 일반적 하지만 빅데쒸말이 더.. 정밀하다.
		
		
		System.out.println(db);
		// == 는 객체의 주소가 같은지 비교 -> 똑같은 db와 db1를 비교해도 다르다구함ㅡㅡ
		// 값이 같은지 비교를 위해서는 equals를 써야합니다.
		
		System.out.println(db==db1);
		System.out.println(db.equals(db1));
		
		//compareTo :  값을 비교시 같으면 0, 작으면 -1, 크면 1 
		
		// + - * / 문자열이라 사칙연산쑬수없다.	
		// 더하기 : add  , 빼기 : subtract , 곱하기 : multiply, 
		// 나누기 : divide , 나머지 : remainder
		
		System.out.println(" 더하기 : "+db.add(db2));
		System.out.println(" 뺴　기 : "+db.subtract(db2));
		System.out.println(" 곱하기 : "+db.multiply(db2));
		System.out.println(" 나누기 : "+db.divide(db2));
		System.out.println(" 나머지 : "+db.remainder(db2));
		
		//max min 
		System.out.println("max : "+db.max(db2));
		System.out.println("min : "+db.min(db2));
		
		//BigInteger
		BigInteger bi = BigInteger.valueOf(10000); //일반 int
		System.out.println(bi);
		
		int int_bi = bi.intValue(); // Integer -> int 형변환
		long long_bi = bi.longValue(); // Integer -> long 형변환
		String string_bi = bi.toString(); // Integer -> String 형변환
		
		
		
		
		
		

	}

}
