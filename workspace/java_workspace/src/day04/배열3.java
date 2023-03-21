package day04;
import java.util.Scanner;
public class 배열3 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아서 배열에 저장하고,
		 * 그 점수의 합계와 평균을 출력
		 * 합계 :
		 * 평균 : 
		 * 
		 * */

		
		

		
		
		Scanner scan = new Scanner(System.in);
		int size = 5;
		int arr[] = new int[size];
		int sum = 0;
		double avg = 0;
		int max= 0;
		int min = 999;
		;
			
		System.out.println("성적을 입력하세요");		
		for(int i=0 ; i<arr.length ; i++) {

			  arr[i]=scan.nextInt();	// arr[i]에 스캔값을 받겠다.			  
			  sum = sum +arr[i]; // 스캔받은 값을 합쳐준다.			  
			
			  if(arr[i]> max) {
				  max = arr[i];
				  
			  }if(arr[i]< min){
				  min = arr[i];
			  }
			  
			  
			  
			
			  
//		max=Math.max(max,  arr[i]); 
			  

	}
			

		avg = (double)sum/arr.length;
		System.out.println("성적의 합계는 : "+sum);
		System.out.println("성적의 평균은 : "+avg);
		System.out.println();	
		//System.out.printf("성적의 합계는 : %d%n",sum);
		//System.out.printf("성적의 평균은 : %.2f%n",avg);
		 // 비교..
		System.out.println("최고값은"+max);
		System.out.println("최소값은"+min);

	
			  
			  

		}

	


}
