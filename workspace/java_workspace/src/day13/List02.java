package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02 {
	
	public static void main(String[] args) {
		/* --메뉴판--
		 * 1.돈가스 : 10,000원
		 * 2.떡볶이 :  7,000원
		 * 3.햄버거 :  5,900원
		 * 4.피 자 : 19,800원
		 * 5.음 료 : 2,000원
		 * 6.프로그램종료
		 * 
		 * 메뉴를 선택해주세요. 1, 수량을 선택해주세요. 2
		 * =>1번메뉴 돈가스, 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요
		 * 메뉴를 선택해주세요. 2, 수량을선택해주세요. 1
		 * => 2번메뉴 음료, 1개 주문
		 * 주문을 끝내시려면 0을 눌러주세요. 0
		 * 
		 * --선택한 메뉴
		 * 돈가스2개, 음료1개 선택 총 지불금액 : 22,000원
		 * 
		 * 
		 * */
		FoodManager fm = new FoodManager();
		
		ArrayList<Integer> order = new ArrayList<Integer>();
		
		fm.add();
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		//int count = 0;
		
		
		do {
			fm.printMenu();
			menu=scan.nextInt();
			if(menu==6){
				System.out.println("프로그램종료◔_◔");
				break;
		}
		if(menu != 0) {
			if(menu < 6) {
				System.out.println("수량 : ");
				int count = scan.nextInt();
				fm.sale(menu,count);
				order.add(menu);
				order.add(count);
				
				
				System.out.println(" ▶ 주문 종료 => 0번");
			} else {
				System.out.println("◥(ฅº￦ºฅ)◤ 잘못된 메뉴~!!◥(ฅº￦ºฅ)◤");
				System.out.println();
			}
		 }
		} while(menu!=0);
		
		
		System.out.println(" ─=≡Σ((( つ•̀ω•́)つ 주문 확인 !! ");
		System.out.println("──────────────>>");
		for(int i = 0 ; i <order.size(); i=i+2) {			
			System.out.print(fm.getList1().get(order.get(i)-1)+" "); //돈가스의 저주
			System.out.print(order.get(i+1)+"개 ");
		}  
		System.out.println("최종가격은? " + fm.getTotSum() + "원");
		System.out.println("　　　　/ᐠ .ᆺ. ᐟ\\ﾉ Thx ~☆");
		System.out.println("<<──────────────");
		
	}
	}






class FoodManager {
	
	private ArrayList<String> list1 = new ArrayList<String>();
	private List<Integer> list2 = new ArrayList<Integer>();
	
	private int sum;
	private int totSum;
	
	
	
	
	
	
	
	public ArrayList<String> getList1() {
		return list1;
	}


	public void setList1(ArrayList<String> list1) {
		this.list1 = list1;
	}


	public List<Integer> getList2() {
		return list2;
	}


	public void setList2(List<Integer> list2) {
		this.list2 = list2;
	}


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public int getTotSum() {
		return totSum;
	}


	public void setTotSum(int totSum) {
		this.totSum = totSum;
	}


	public void printMenu() {
		System.out.println(" ─=≡Σ((( つ•̀ω•́)つ 메뉴판 도착 !! ");
		System.out.println("────────────────────");
		System.out.println(" 1.돈가스 : 10,000원");
		System.out.println(" 2.떡볶이 :  7,000원");
		System.out.println(" 3.햄버거 :  5,900원");
		System.out.println(" 4.피 자 : 19,800원");
		System.out.println(" 5.음 료 :  2,000원");
		System.out.println("────────────────────");
		System.out.println("메뉴를 골라주세요 ◔_◔ ");	
	}
	
	
	public void add() {
		
		list1.add("돈가스");
		list1.add("떡볶이");
		list1.add("햄버거");
		list1.add("피 자");
		list1.add("음 료");
		
		list2.add(10000);
		list2.add(7000);
		list2.add(5900);
		list2.add(19800);
		list2.add(2000);
		
		
	}
	
	public void sale(int menu, int count) {
		
		sum = list2.get(menu-1) * count;
		totSum += sum;
		System.out.println("『");
		System.out.println("(*☌ᴗ☌)｡ﾟ━☆ﾟ.*･｡ﾟ 선택하신 메뉴는 "+list1.get(menu-1)+" "+count + "개입니당!");
		System.out.println("｡ﾟ☆* 금액은 !? "+sum+"원~☆.*･｡ﾟ[τ̲̅н̲̅a̲̅и̲̅κ̲̅ ч̲̅o̲̅u̲̅]ᴗ͈ₒᴗ͈♡");
		System.out.println("』");
		
		}
	}

	



