package day10;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		/*
		 * product 클래스 : 상품을 등록하는 클래스
		 * 상품명, 가격
		 * 상품등록 메서드 => inserProduct
		 * 출력메서드 = toString으로 출력
		 * getter, setter 만들기
		 * 
		 * */
		
		/* ProductMain
		 * product 배열 생성 [10]
		 * 
		 * 상품등록 후 리스트 출력
		 * 
		 * 스캐너를 통해서 상품 등록.
		 * 상품을 등록하시겠습니까? (y등록 n등록그만)
		 * y => 상품등록 / n => 그만...
		 * 상품이름과 가격을 등록받아 상품배열에 등록.
		 * n => 등록된 제품 리스트 출력
		 * */
		
		
		//Product p = new Product();
		
		Scanner scn = new Scanner(System.in);
		
		Product [] pro  = new Product[10];
		
		
		
		
		
		char str;
		int cnt =0;
		
		
			while (true) {
				
				
				
				System.out.println("상품을 등록하시겠습니까? (Y/N)");
				System.out.println("Y:계속 , N:종료");
				str = scn.next().charAt(0);
				
				
				 
				if(str == 'Y') {	
				 Product p = new Product();
				 System.out.println("상품명과 가격을 입력하세요.");
				 p.insertProduct(scn.next(),scn.nextInt());
				 pro[cnt]=p;
				 cnt++;
				 
				}else if(str == 'N') {
					System.out.println("종료합니다.");
					break;
				}
			
			}
				
			
			for(int i=0 ; i<cnt ; i++) {
				pro[i].printProduct();
			}
				
		
		 
	
	
	

	
		}
	
	
		 
		}
		
	







