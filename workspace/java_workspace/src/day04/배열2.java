package day04;

public class 배열2 {

	public static void main(String[] args) {
		/* 5개 값을 담는 배열을 생성하여 1~5까지의 값을 입력하고 출력
		 * 입력과 출력은 for문을 활용
		 * 출력모양 => 배열이름[번지]=값
		 * arr[0]=1*/
		
		
		int arr[] = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("arr["+i+"]=");
			arr[i]=i+1;			
			System.out.println(arr[i]);
				
		}

		System.out.println();
		
		/* 10개 값 배열 생성 후 짝수만 저장하고 출력*/
		
	int arr1[] = new int[10];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=(i+1)*2;	
	
			System.out.printf("arr1[%d]=%d\n",i,arr1[i]);
		}
		
		
	}

}
