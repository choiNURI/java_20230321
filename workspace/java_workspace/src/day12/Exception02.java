package day12;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		//num1, num2, 연산자 입력하여 메서드 실행
		//예외처리
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		try {
			//예외 발생가능성이 있는 구문
			System.out.println(calc(4,0,'$'));
			System.out.println(calc(4,0,'+'));
			System.out.println(calc(4,0,'-'));
			System.out.println(calc(4,0,'*'));
			System.out.println(calc(4,0,'/'));
			System.out.println(calc(4,0,'%'));
			
		} catch (Exception e) {
			//예외 문구 출력
			
			System.out.println(e.getMessage());
			//e.printStackTrace(); // 원래가지고있는 빨간 오류 메세지
		}
		System.out.println("계산기 반듓씌!!!!!! 종료");
		
		
//		System.out.println("두 숫자와 연산자를 입력하시오!!!");		
//		int num = scan.nextInt();
//		int num2 = scan.nextInt();
//		char op = scan.next().charAt(0);
//
//		try {
//			calc(num, num2, op);
//			
//		} catch (Exception e) {
//			System.out.println("어이어이 소코마데다");
//			
//		}
		
		
	}


	
	
	
	
	
	//기능 : 두 수를 입력받고, 연산자를 입력받아 4칙연산의 결과를 리턴하는 메서드 생성
	//throw를 발생시키게 되면 예외를 메서드를 호출하는 객체에게 넘기는 현상이 발생됨.
	//throw를 발생시키면 메서드 선언부 끝에 throws 발생할 수 있는 예외를 반드시 적어야 함.
	//throws RuntimeException의 경우 생략가능.
	public static double calc(int num, int num2, char op)throws RuntimeException {
		double res = 0;
		if((op== '/' || op == '%') && num2 ==0){
			throw new  RuntimeException("num2는 0이 될 수 없 어 ");
		}
		switch(op) {
		case '+': res = num+num2; break;
		case '-': res = num-num2; break;
		case '*': res = num*num2; break;
		case '/': res = num/num2; break;
		case '%': res = num%num2; break;
		default : 
			throw new  RuntimeException(op+"는 산술연신자가 아닙니다.아닙니다.아닙니다.아닙니다.아닙니다.아닙니다.아닙니다.아닙니다.아닙니다.아닙니다.아닙니다.");
		}
		return res;
	}
	}
	
	
	
//	public static void result(int num, int num2, char op) {
//		
//		switch(op) {
//		case '+': System.out.println(num+num2); break;
//		case '-': System.out.println(num-num2); break;
//		case '*': System.out.println(num*num2); break;
//		case '/': System.out.println(num/num2); break;
//		default : System.out.println("연산자오류"); break;	
//		}	
//	}






