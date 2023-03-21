package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BufferedReaderEx03 {

	public static void main(String[] args) throws FileNotFoundException, IOException  {
		/* 
		 * score.txt파일을 읽어들여 map에 저장 후 
		 * 이름 : 점수
		 * 전체합계 출력
		 * 
		 * map.put(name, score)
		 * */ 
		
		
		
		BufferedReader br = new BufferedReader(new FileReader("score.txt"));
		HashMap<String, Integer> map = new HashMap<>();
		
		while(true) {
			String line = br.readLine(); // 남예준 100
			if(line == null) {break;} //마지막 라인일경우 null 입력되면 반복문 빠져나감.
			
			// 남예준 100  			스타트index(포함),끝내는index(미포함)
			String name = line.substring(0, line.indexOf(" ")); //공백을찾아서 나누기
			int num = Integer.parseInt(line.substring(line.indexOf(" ")+1)); // end index를 안적으면 끝까지가져오란 뜻
			
			map.put(name, num);
	
		}
		
		//System.out.println(map);
		int sum = 0;
		
		for(String n : map.keySet()) {
			System.out.println(n+":"+map.get(n));
			sum += map.get(n);
		} System.out.println("총 합계 : "+sum+", 총 인원수 : "+map.size());
		
		
		
	}

}
