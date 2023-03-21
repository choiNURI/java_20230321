package day03;

public class 과제 {

	public static void main(String[] args) {
		// char : 유니코드표에 따라 글자의 코드별로 글자를 표시
		
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);

		
		for(char ch1 = 'a'; ch1<='z' ; ch1++) {
			System.out.print(ch1+" ");
		}
			
		/* 
		 * 출력하시오..!!
		 * a
		 * ab
		 * abc
		 * abcd
		 * ...
		 * abcd...z
		 * */
		
		System.out.println();
		System.out.println();
		
		for(char i = 'a' ; i<='z' ; i++) {     
			for(char j='a';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
//		for(int i=1;i<=5;i++) {     
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	}

}
