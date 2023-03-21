package day05;

public class String01 {

	public static void main(java.lang.String[] args) {
		/* 
		 * String 클래스 = 문자열을 다루는 클래스
		 * String str = new String();
		 * String str = "가나다" // 일반 자료형처럼 이용가능.
		 * */
		
		String str = "Hello Wolrd~!!" ;
		System.out.println(str);
		
		//CharAt(index) : index번지에 있는 문자열을 반환
		System.out.println("---charAt---");
		System.out.println(str.charAt(0));

		//length : 전체 글자의 길이
		System.out.println("---length---");
		System.out.println(str.length());
		
		//compareTo(str) : str문자열과 비교하여 같으면0 , 사전순으로 앞이면-1, 뒤면 1
		System.out.println("--compareTo--");
		System.out.println("b".compareTo("a")); // 문자에대한 올림/내림차순 가능
		System.out.println("b".compareTo("b"));
		System.out.println("b".compareTo("g"));
		
		//concat(str) : 이어붙이기 ( + 연산자와 같은 의미)
		System.out.println("---concat---");
		System.out.println("abc".concat("def"));
		System.out.println("abc"+"def"); // 같은 의미
		
		//equals(str) : 두 문자열이 같은지 확인 (대소문자 구분)
		System.out.println("---equals---");
		System.out.println("abc".equals("def"));
		System.out.println("abc".equals("abc"));
		System.out.println("abc"=="abc");  // 안되는 경우도 많음.. 정확도↓, 쓰지말것.
		
		//indexOf(str) : 문자의 위치를 찾아주는 기능
		System.out.println("---indexOf---");
		System.out.println("abc".indexOf("b"));
		System.out.println("abc".indexOf("d")); //번지수를 알려줍니당. 찾는 문자가 없으면 -1로 반환.
		
		String email = "coolkidzzang@gmail.co.kr";
		System.out.println(email.indexOf(".")); //중복문자를 찾으면 가장 첫번쨰 위치한 번지수 반환
		System.out.println(email.lastIndexOf(".")); // 끝에서부터 문자를 찾음
		
		//substring : 문자열 추출(내가원하는 문자만 추출)
		System.out.println("--substring--");
		System.out.println(email.substring(0));
		System.out.println(email.substring(1));
		System.out.println(email.substring(5));
		System.out.println(email.substring(0,5)); //index -1 , 5번지는포함x 마지막숫자는 글자수임!(0,1,2,3,4)
		
		//문자열에서 @ 기준 전만 출력하기 (아이디 출력)
		System.out.println(email.substring(0,email.indexOf("@")));
		//문자열에서 @ 기준 후만 출력하기 (도메인 출력)
		System.out.println(email.substring(email.indexOf("@")+1));
		
		//trim : 불필요한 공백삭제
		System.out.println("----trim----");
		System.out.println("      hello~! ^^   ".trim());
		
		//replace : 글자 치환(원하는 글자를 찾아서 자리를 바꿔줌)
		System.out.println("----replace----");
		System.out.println("Hello World".replace("W", "w"));
		System.out.println("Hello World".replace("World", "JAVA"));
		
		//split : 특정 값을 기준으로 나누기
		System.out.println("----split----");
		String str1 =  "dog,cat,tiger";
		String [] arr = str1.split(",");
		for(String tmp : arr) {
			System.out.println(tmp);
		}
		
		System.out.println(); //줄바꿈
		
		
		String num1 = "1";
		String num2 = "2";
		String sum = num1 + num2;
		System.out.println(sum);
		
		//parseInt : 문자를 숫자로 변환
		int num3 = Integer.parseInt(num1);
		System.out.println(num3);
		int num4 = Integer.parseInt(num2);
		System.out.println(num4);
		int sum1 = num3 + num4;
		System.out.println(sum1);

	}

}
