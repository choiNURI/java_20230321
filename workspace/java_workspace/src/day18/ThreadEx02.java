package day18;

class MyThread2 implements Runnable{
	
	public void run() {
		//반드시 run() 메서드를 구현해야 함.
		
		for(int i = 0 ; i<200 ; i++) {
			System.out.println(i+"번째");
		}
	}
}


public class ThreadEx02 {

	public static void main(String[] args) {
		// Runnable을 구현하는 방법 - 구현한run을 thread 안에넣는다
		
		//1번째방법
		MyThread2 mth = new MyThread2();
		Thread th1 = new Thread(mth);
		th1.start();
		
		try {
			th1.join();
		} catch (Exception e) {
			
		}
		

		//2번째방법
		Thread th2 = new Thread(new MyThread2());
		th2.start();
		
		System.out.println("main End!!!!"); 

	}

}
