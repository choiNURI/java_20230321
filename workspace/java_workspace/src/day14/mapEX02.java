package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class mapEX02 {

	Scanner scan = new Scanner(System.in);
	int exit = 1;
	int count=0;
	
	public static void main(String[] args) {
		// map에 상품명과 가격을 입력받고, 출력
		// 입력 => 메서드로, 출력 =>메서드로 구현
		// 상품 총 지불가격도 출력^^;

		HashMap<String,Integer> map = new HashMap<>();
		mapEX02 ex02 = new mapEX02();
		ex02.make(map);
		ex02.print(map);
		


		

	}

	//입력메서드
	public void make(HashMap<String,Integer>map) {
		int size=3;
		while(map.size()<size) {
			System.out.println("상품명:");
			String product =scan.next();
			System.out.println("가격:");
			int price =scan.nextInt();
			
			map.put(product, price);
		}
	}

	
	
	public void print(HashMap<String,Integer>map) {
		Iterator<String> it = map.keySet().iterator();
		int sum=0;
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			sum += value;
			System.out.println(key + ":" + value) ;
		}
		System.out.println("합계:" + sum);
	}
	
}



//public void map() {
//System.out.println("상품등록을 시작합니다~");
//while(exit != 0) {
//	count++;
//	System.out.print("상품:");
//	String product = scan.next();
//	System.out.print("가격:");
//	int price = scan.nextInt();			
//	map.put(product, price);
//	 System.out.println("계속:1, 종료:0");
//	  exit = scan.nextInt();
//		if(exit>1 || exit <0) {
//			System.out.println("오류났습니다.종료합니다.");
//			break;
//		}
//	}		
//}


//public void print() {		
//int sum =0;
//Iterator<String> it = map.keySet().iterator();
//while(it.hasNext()) {
//	String product = (String)it.next(); 
//	int price = map.get(product); 
//	System.out.println("삼품 : "+product+" 가격 : "+price);
//	sum += price;
//}System.out.println("=====================================");
//System.out.println("상품갯수는 "+count+"개! 상품의 총 합계는 " + sum+"원^^*");	
//}
