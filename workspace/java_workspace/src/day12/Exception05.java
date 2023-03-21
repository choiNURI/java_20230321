package day12;

public class Exception05 {

	public static void main(String[] args) {
		
		

		int max = 10;
		int min = 1;
		int size = 5;
		
		int arr[];
		Exception05 ex05 = new Exception05();

		try {
			//예외 발생가능성이 있는 구문
			
			int arr1[] = ex05.createArr(0, 0, 0);
			
			
		} catch (Exception e) {

			System.out.println(e.getMessage());
			
		}
		//System.out.println("종료");
		
		

	}




// 매서드 생성
/* 기능 : 배열의 길이(size)가 주어지면 길이만큼 배열을 생성해서 배열을 돌려주는 메서드
 * 값은 random으로 반환 => random의 범위는 max, min으로 받아 처리
 * - size가 0보다 작다면 예외발생
 * - max가 0보다 작다면 예외발생
 * */
	
	public int[] createArr(int max, int min, int size){
		
		if(size <= 0) {
			throw new  RuntimeException("배열의 길이가 0보다 작습니다.");
		}if (max <= 0) {
			throw new  RuntimeException("랜덤범위가 0보다 작습니다.");
		}
		
		
		int arr [] =  new int[size];
		for(int i = 0; i<arr.length ; i++) {
			arr[i]=(int)(Math.random()*(max-min+1))+min;
		}
		return arr;
		
	}

	
	//throw new  RuntimeException("num2는 0이 될 수 없 어 ");
	
	
	/* 배열을 받아서 배열에 랜덤값을 채우는 메서드
	 * 랜덤값은 max, min 받아서 처리
	 * - 배열이 null일 경우
	 * - 배열의 길이다 0보다 작을 경우*/
	
	
	public void createArre2(int arr[], int max, int min)throws Exception{
		 
		if(arr == null) {
			throw new  Exception("배열이 null입니다.");
		}
		if(arr.length == 0)
			throw new  Exception("배열의 길이가 0입니다.");
	
		for(int i = 0; i<arr.length ; i++) {
			arr[i]=(int)(Math.random()*(max-min+1))+min;
		}
	}
	
	
	}
	
	
	
