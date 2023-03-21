package day18;


class Bank{
	//계좌의 돈
	private int money = 50000;
	
	//입금
	public synchronized void saveMoney(int save) {
		int m = this.money;
		
		try {
			Thread.sleep(3000); //3초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m+save);
		
	}


	//출금
	
	public synchronized void minusMoney(int minus) {
		
		int m = this.money;
		
		try {
			Thread.sleep(200); //3초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m-minus);
		
	}
	
	

	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}

	class Yejun extends Thread{
		public void run() { //입금
			System.out.println("입금시작~!");
			SyncMain.myBank.saveMoney(3000); //3000원 입금
			System.out.println("3천원 입금 후 : "+SyncMain.myBank.getMoney());
			
		}
	}
	
	class Hamin extends Thread{
		public void run() { //출금
			System.out.println("출금시작~!");
			SyncMain.myBank.minusMoney(1000); //1000원 출금
			System.out.println("1천원 출금 후 : " + SyncMain.myBank.getMoney());
			
		}
		
	}
	
	
	




public class SyncMain {
	
	public static Bank myBank = new Bank(); //공유영역설정

	public static void main(String[] args) {
		
		Yejun y = new Yejun();
		y.start();
		
		
		Hamin h = new Hamin();
		h.start();
		
		
		
	}

}
