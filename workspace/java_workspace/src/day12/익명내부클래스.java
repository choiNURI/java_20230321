package day12;

public class 익명내부클래스 {

	public static void main(String[] args) {
		/*내부 클래스*/
		
		Outer out = new Outer();
		out.getRunnable(10);
		Runnable runner = out.getRunnable(10);
		runner.run();

	}

}


class Outer{
	
	
	int outNum = 10;
	static int sNum = 20;
	
	Runnable getRunnable(int i) { //메서드 내부에서 클래스 선언 => local 
		
		
		int num = 100;
		class MyRunnable implements Runnable{

			int localNum = 1000;
			//매개변수와 지역변수는 값이 들어올때 final로 변경되어 들어옴.
			

			@Override
			public void run() {
				//i=10;    //error
				//num = 1; //error
				System.out.println("매개변수 i = "+i);
				System.out.println("메서드 안 num = "+num);
				System.out.println("in클래스 안 localNum = "+localNum);
				
				System.out.println("out클래스 outNum = "+outNum);
				System.out.println("out클래스 sNum = "+sNum);
				
				
			}
			
			
		}
	return new MyRunnable();
	}

}
