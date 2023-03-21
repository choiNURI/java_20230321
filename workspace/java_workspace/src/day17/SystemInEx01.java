package day17;

import java.io.IOException;

public class SystemInEx01 {

	public static void main(String[] args) {
		/* 알파벳 하나를 쓰고 Enter를 누르면 알파벳을 콘솔에 출력*/
		
		System.out.println("알파벳 여러개를 쓰고 Enter");
		int i ;
		try {
			
			//read는 하나의 문자만 출력가능 여러 글자를 출력하려면 while문 사용
			while((i = System.in.read())!= '\n') {
				
			
			//i = System.in.read();   //입력받기
			//System.out.println(i);  //문자입력->숫자로출력됨
			System.out.print((char)i); //문자로출력
			
			
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
