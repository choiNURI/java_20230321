package day15;

public class StringBufferEx {

	public static void main(String[] args) {
		// String 객체 : 문자열을 표현
		// StringBuffer : 문자열을 추가하거나, 변경할때 주로 사용하는 객체
		// append : 문자열 추가 끝에 추가
		// insert : 특정 위치에 문자열 추가
		// substring : 문자열 추출
		
		
		StringBuffer sb = new StringBuffer(); // 멀티스레드 환경에서 안전성이 우수
		sb.append("hello");
		sb.append(" ");
		sb.append("YEJUN♡");
		System.out.println(sb.toString());
		String result = sb.toString();
		System.out.println(result);
		
		//System.out.println(sb);
		
		
		sb.insert(0, "hi");
		System.out.println(sb.toString());
		System.out.println(sb.substring(0,4)); 
		
		
		// 아래는 메모리 운영상 별로임 소모도 많이됨. 속도두 떨어짐.
		String str = "kawaii";
		str += " ";
		str += "yejun";
		System.out.println(str);
		
		System.out.println("------------");
		
		StringBuilder sb1 = new StringBuilder(); // 성능이 더 좋음.
		sb1.append("유하민");
		sb1.append(" ");
		sb1.append("고양이");
		
		System.out.println(sb1.toString());

	}

}                                                     // ㅗ
