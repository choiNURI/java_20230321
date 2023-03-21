package day11;

public class CustomerMain {

	public static void main(String[] args) {
		
		
		
		Customer[] customerList = new Customer[10];
		Customer A = new Customer(1001,"최수정");
		Customer B = new GoldCustomer(1002,"윤민영");
		Customer C = new VIPCustomer(1003,"최누리",100);
		
		
		// 다운캐스팅 => 반드시 병시적으로 형변환..
		//instanceof : 원래 인스턴스의 형이 맞는 여부를 체크하는 명령어 맞으면 true/false 
		 if(C instanceof VIPCustomer) {
			 
			 VIPCustomer vCustomer = (VIPCustomer)C;
			 System.out.println(vCustomer.getAgentID());
		 }else if (C instanceof GoldCustomer) {
			 GoldCustomer vCustomer = (GoldCustomer)C;
			 System.out.println(vCustomer.getCustomerID());
		 }
		
		
		int cnt = 0;
		customerList[cnt] = A;
		cnt++;
		customerList[cnt] = B;
		cnt++;
		customerList[cnt] = C;
		cnt++;
		
		System.out.println("고객정보출력");
		//for문 이용해 고객정보 출력
		
		for(int i = 0; i < cnt ; i++) {
			System.out.println(customerList[i].customerInfo());
		}
		
		System.out.println("--할인율과 포인트 계산--");
		int price = 100000;
		//for문을 활용하여 할인율과 포인트 계산 내역 출력
		
		for(int i = 0 ; i < cnt ; i++) {
			System.out.println(customerList[i].getCustomerName()+"님이 지불하실 금액은"+
					customerList[i].calcPrice(price)+"원입니다.");
			System.out.println(customerList[i].getCustomerName()+"님의 현재 보너스 포인트는"+customerList[i].bonusPoint+"점 입니다.");
			
			
			
//			if(customerList[i].getCustomerGrade().equals("Silver")) {
//				A.calcPrice(price);
			}
			 
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Customer sMIN = new Customer(10001,"윤민영"); 
//		
//		sMIN.calcPrice(0);	
//		System.out.println(sMIN.customerInfo());		
//
//		
//		
//		Customer gCHOI = new GoldCustomer(10002,"최수정");
//		gCHOI.calcPrice(900);
//		System.out.println(gCHOI.customerInfo());
//		gCHOI.calcPrice(5000);
//		
//		
//		Customer vCHOI = new VIPCustomer(10003,"최누리",1111);
//		vCHOI.calcPrice(100000);
//		System.out.println(vCHOI.customerInfo());
//		vCHOI.calcPrice(500000);
//		
//		
//		System.out.println();
//		
//		System.out.println("============= 할인율과 포인트 계산 =============");
//		
//		System.out.println();
//		
//		int price = 1000;
//		int cost = sMIN.calcPrice(price);
//		System.out.println(sMIN.getCustomerName()+"님이 지불하실 금액은"+cost+"원입니다.");
//		System.out.println(sMIN.getCustomerName()+"님의 현재 포인트는"+sMIN.bonusPoint+"점입니다");
//		
//		System.out.println();
//		
//		int price1 = 100000;
//		int cost1 = gCHOI.calcPrice(price1);
//		System.out.println(gCHOI.getCustomerName()+"님이 지불하실 금액은"+cost1+"원입니다.");
//		System.out.println(gCHOI.getCustomerName()+"님의 현재 포인트는"+gCHOI.bonusPoint+"점입니다");
//		
//		System.out.println();
//		
//		int price2 = 1000000000;
//		int cost2 = vCHOI.calcPrice(price2);
//		System.out.println(vCHOI.getCustomerName()+"님이 지불하실 금액은"+cost2+"원입니다.");
//		System.out.println(vCHOI.getCustomerName()+"님의 현재 포인트는"+vCHOI.bonusPoint+"점입니다");
//		

		

	}


