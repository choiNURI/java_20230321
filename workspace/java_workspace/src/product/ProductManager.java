package product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements ProductInterface {

	
	 /*
	   - 메뉴추가기능
	   - 메뉴리스트 출력
	   - 제품 주문
	   - 주문내역 출력
	   
	   */
	   
	   
	
	
	private ArrayList<Product> menu = new ArrayList<>();
	private ArrayList<Order> order = new ArrayList<>();
	
	//List<String> list = new ArrayList<String>(); // ★★★
	
	
	public void addMenu() {
		//list.add("연습"); // ★★★
		menu.add(new Product ("예준누드김밥",10000));
		menu.add(new Product ("하민파인애플피자",12000));
		menu.add(new Product ("도으노도넛",3000));
		menu.add(new Product ("봉구스밥버거",5000));
		menu.add(new Product ("노아단무지",100));
	}
	
	
	
	




	@Override
	public void add(Scanner scan) {
		System.out.println("추가할메뉴를골라용용용가리");
		String menu = scan.next();
		System.out.println("메뉴의가격을적으세용용가리");
		int price = scan.nextInt();
		this.menu.add(new Product(menu,price));	
	}




//	@Override
//	public void printProduct() {
//		System.out.println("---menu---");
//		for(Product p : menu) {
//			System.out.println(p); // product 클래스의 toString호출
//			//만약 print메서드를 따로 만들었다면 sysout 하지말고
//			// p.print메서드명(); 을 하면 된다.
//		} System.out.println("----------");
//		 
//	}
	
	
	
	public void printProduct() {
		System.out.println("----메뉴판----");
		for(int i = 0 ; i < menu.size() ; i ++) {
			System.out.println(menu.get(i).getMenu() + menu.get(i).getPrice());
		}
		
	}




	@Override
	public void orderPick(String name, int count) {
		
		// 매개변수로 입력받을 경우  scan으로 입력받으면 됨.
		
		for(int i=0;i<menu.size();i++) {
			if(menu.get(i).getMenu().equals(name)) {
				int price = menu.get(i).getPrice(); // 입력한 메뉴와 기존 메뉴와 같으면 그 가격을가져와
				
				Order order = new Order(); //주문객체만들기
				
				order.setMenu(name);
				order.setPrice(price);
				order.setCount(count);
				order.setTotal(price);
				this.order.add(order);
				
				
			}
		}
		
	}




	@Override
	public void printOrder() {
	
		int sum=0;
		System.out.println("---주문내역----");
		for(int i = 0; i < order.size();i++) {
			order.get(i).print();
			sum += order.get(i).getTotal();
		} 
		System.out.println("----------");
		System.out.println("지불하실 총 금액:"+sum);
	}



	@Override
	public void delete(Scanner scan) {	
		
		int index = -1;		
		System.out.println("삭제할메뉴를선택하시오");
		String name = scan.next();
		
		if(menu==null) {
			System.out.println("없어요.");
			return;
		}		
		for(int i=0 ; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
			index = i;
			menu.remove(index);
		
			}
		}
	}
	
		
//		//메뉴 삭제
//		System.out.println("삭제할메뉴를선택하시오");
//		String delname = scan.next();
//		
//		//menu List에서 menu를 찾아서 remove
//		// remove(index) , remove(Object)
//		int index = -1;
//		for(int i=0 ; i<menu.size(); i++) {
//		if(menu.get(i).getMenu().equals(delname)) {
//			index = i; //메뉴위치추출
//			menu.remove(index);
//			
//			//menu.remove(i) // index로 삭제
//			menu.remove(menu.get(i)); // Object로 삭제
//			System.out.println("삭제완료~!");
//			return;
//		} 
//		
//		if(index == -1) {
//			System.out.println("찾는 메뉴가 없습니다.");
//		}
//		}
		
		
		

	

	
	






	


	@Override
	public void update(Scanner scan) {
		
//		System.out.println("가격을변경할메뉴를선택하시오");
//		String upName = scan.next();
//		
//		System.out.println("가격:");
//		int upPrice = scan.nextInt();
//				
//		for(int i=0 ; i<menu.size(); i++) {
//			if(menu.get(i).getMenu().equals(upName)) {			
//			int price = scan.nextInt();
//			
//			//menu.get(i).setPrice(upPrice); //가격만 수정
//			
//			Product p = new Product(upName,upPrice);
//			menu.set(i, p); //메뉴명과 가격을 둘다 수정 가능
//			
//			System.out.println("수정완료!");
//			return;
//			}	
		
		
		int index = -1;	
		
		System.out.println("가격을변경할메뉴를선택하시오");
		String upname = scan.next();
		
			
		for(int i=0 ; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(upname)) {
			index = i;
			int price = scan.nextInt();
			menu.get(index).setPrice(price);
			}	
			
			if(index == -1) {
				System.out.println("없어요.");
				return;
			}	
		
		}
	}

}


		
	
	
 
	