package day12;

public class Exception04 {

	public static void main(String[] args) {
		/*
		 * try{
		 *  코드
		 * } catch (예외클래스명 객체){
		 * 	처리문;
		 * } catch (예외클래스명 객체){
		 *  처리문;
		 * } catch (예외클래스명 객체){
		 *   처리문
		 * }
		 * 
		 * */
		
		double res = 0;
		
		try {
			
			
			//res = 1/0;	
			
			//int arr[] = null;
			
			int arr[] = new int[3];
			arr[5] = 10;
			
			
			
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("예..외...발...생....");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("배열의 범위가..........넘.어.가.다..");
		} catch (Exception e) { // 최고 조상.. 항상 마지막!! (=디폴드)
			e.printStackTrace();
		}
		System.out.println("END.");

	}

}
