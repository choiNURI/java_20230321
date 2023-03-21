package day08;

public class MethodOverloading {

	public static void main(String[] args) {
		/* 메서드 오버로딩
		 * - 동일한 미을므 가지는 메서드를 여러개 만드는 경우
		 *  1. 매개변수의 개수가 다르면 가능
		 *  2. 매개변수의 종류(타입,개수)가 다르면 가능.
		 * 리턴타입은 상관없다. 매개변수 이름도 상관없음.
		 * */
		
		System.out.println(sum(1, 2));
		System.out.println(sum(1.2, 3.4));
	
		
		
		System.out.println(sum(1,2,3,4,5,6,7,8,3,9));

	}

	/* 더하기 하는 메서드 생성
	 * int num1, num2를 매개변수로받아 연산한 결과를 리턴
	 */
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	
	public static int sum(int ...num) {  //숫자를 여러개 넣을수있음..
		int sum=0;
		for(int i =0 ; i <num.length ; i++) {
			sum=sum+num[i];
		}return sum;
	}
	
	
	
	
}
