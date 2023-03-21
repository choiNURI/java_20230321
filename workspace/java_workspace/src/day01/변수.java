package day01; // 어느 폴더안에 들어있는지 알려줌

public class 변수 {

	public static void main(String[] args) { //메인 메서드
		// 변수명, 클래스명 한글사용 가능.

		System.out.println("method 내부");
		System.out.println("야옹");

		
		//변수 : 리터럴값을 담는 메모리 공간
		//주석 - 한줄주석 : 코드에 영향을 미치지 않는 구문, 설명을 위해 사용
		/*여러줄
		 * 주석입니다.*/
		
		// 변수 선언 방법
		// 변수타입 변수명;
		
		int num1; // 선언만
		num1 = 123; // 값 지정
		
		int num2,num3,num4; // 선언만(같은 자료형일 경우 여러 변수 동시 선언)
		num2 = 456; // 값 지정

		int num5 = 789; // 선언 후 값 지정 (위 작업을 한번에)
		
		byte num6;
		char ch1;
		float fl1;
		boolean bool;
		// 노란밑줄 : 경고, 한번도 사용되지 않은 경우
		// 빨간밑줄 : error
		
		int appleCount ; //변수명은 의미 있게 지정(카멜표기)
		int applecount ; //대소문자 구문함. 위와 다른 변수.
		
		// int num; // 이미 선언한 변수는 동시 선언 불가 (중복선언 불가능)
		
		System.out.println("num1의 값 : "+num1);
		
		// a라는int의 변수를 선언 후 값을 지정하고, a변수의 값을 출력하라
		
		int a = 456;
		System.out.println("a는...."+a);
		
		
		//num1과 a변수의 값을 하나의 구문으로 출력
		
		System.out.println("num1 : "+num1+", a: "+a);
		
		//문자
		char ch = '\''; // ''는 1글자만 , ""는 문자열
		String str = "abc" ; // 여러글자는 String 클래스를 활용
		
		/*일반적인 class는 객체를 만들어서 객체로 사용. 
		 * String은 자주사용해서 자료형처럼 사용이 가능함.*/
		// 의미있는 특수문자를 나타낼땐 앞에 \ 를 붙여준다.
		
		System.out.println("ch : "+ch);
		System.out.println("str : "+str);

		
		int b = 10; //10진수의 수 10을 저장
		int c = 010; //8진수의 수 10을 저장 0~7까지 사용 8=10
		int d = 0x10; //16진수의 수 10을 저장 0~ABCDEF 16=10
		
		//int e = 123456789012; // int 영영의 범위를 넘었을 경우. error
		
		//long형으로 변수 선언
		//long형은 접미사 L을 필수로 써야 함.
		long e = 123456789012L;
		
		//기본 실수형은 double로 인식
		//float형의 실수값은 전미사 f F를 반드시 써야 함.
		float f = 1.234f;
		
		bool = true;
		boolean blool2=false;
		
		int kor = 100;
		int kor1 = kor;
		
		// = 의 이미는 대입. 오른쪽의 값(값을 가지고 있는 값, 변수)을 왼쪽(변수)에 담아라
		
		int g= 10, h=20, y=50; //선언과 값 저장을 동시에 가능
		int k, z=10;  // k의 값은 없고 , z의 값은 10으로 선언
		
	
	} // 메서드 (클래스 안에서 동작을 하게 만들어주는 것/반드시 클래스 안에..)

} // 클래스
