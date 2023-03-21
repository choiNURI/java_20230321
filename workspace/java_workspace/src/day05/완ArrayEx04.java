package day05;

public class 완ArrayEx04 {

	public static void main(String[] args) {
		/* 
		 * 2차원 배열
		 * 자료형 배열명[][] = new 자료형[길이][길이];
		 * 
		 * */
		
		int arr[][] = new int[5][3];
		int cnt = 1;
		// 행개수 : 5개
		for(int i = 0 ; i<arr.length; i++) { // 0번지~4번지. 5개
			// 열개수 : 3개
			for(int j = 0; j<arr[0].length ; j++) { // 0번지라인에있는 열의 개수
				arr[i][j]=cnt;
				cnt++;
				System.out.printf("%3d",arr[i][j]); //줄맞출때사용
			}System.out.println(); // 줄바꿈
			
		}


	}

}
