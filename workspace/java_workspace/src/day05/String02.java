package day05;

public class String02 {

	public static void main(String[] args) {
		/* 이것이자바다.txt 파일에서 파일명과 확장자를 분리하여 출력.
		 * 파일명 : 이것이자바가
		 * 확장자 : txt*/

		
		String name = "이것이자바다.txt";

		System.out.println("파일명 : " + name.substring(0,name.indexOf(".")));
		System.out.println("확장자 : " + name.substring(name.indexOf(".")+1));
		
		
		System.out.println("---------------");
		
		String fileName = name.substring(0,name.indexOf("."));
		System.out.println("file : "+fileName);
		
		String txt = name.substring(name.indexOf(".")+1);
		System.out.println("확장자 : "+txt);
		
		System.out.println("---------------");
		
		//contains(str) : 해당 글자가 초함되어있는지를 체크 boolean
		System.out.println(name.contains("java"));
		
		
		
		
		
		
		
		
	}

}
