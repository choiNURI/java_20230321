package day09;

public class CardPackMain {  // 3.카드를 출력해줌...;

	public static void main(String[] args) {
		/*카드 생성*/
		
		Card c= new Card(); 
		//c.Print();	
		// c = cp.pick(); //가장위에 있는카드 한장을 pick c객체에 저장
		// c.Print();
		
		CardPack cp= new CardPack(); 
//		tmp = cp.pick();  = cp.pick();		
//		tmp.Print();
//		tmp = cp.pick();
//		tmp.Print();
		
		//모양대로 4열횡대
		//한 모양이 끝나면 줄바꿈	
		
		Card tmp;	
		for(int i=0 ; i<4 ; i++) {
			for(int j=0 ; j<13 ; j++) {
				tmp = cp.pick();
				tmp.Print();
				System.out.print(" ");			
			}
			System.out.println();
		}
		
		System.out.println("-----------------");	
		//cp.init();
		cp.shuffle();
		for(int i=0 ; i<4 ; i++) {
			for(int j=0 ; j<13 ; j++) {
				tmp = cp.pick();
				if(tmp != null) {
				tmp.Print();
				System.out.print(" ");
				} else{
					System.out.print("카드가 없습니다. 초기화하세요.");
					break;
				}
			}
			System.out.println();
			
		}
		

		
		
	}
}

	
