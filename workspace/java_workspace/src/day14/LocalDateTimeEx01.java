package day14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx01 {

	public static void main(String[] args) {
	

		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		String curr = today.toString();
		System.out.println(curr);
		
		//2023-02-17 T15:30:01.233735300
		//날짜만 분리시켜 추출하여 찍기
		//subString, indexOf 사용
		
		
		String date = curr.substring(0,curr.indexOf("T"));
		System.out.println(date);
		
		String time = curr.substring(curr.indexOf("T")+1, curr.indexOf("."));
		System.out.println(time);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(2023,10,9,8,30);
		System.out.println(sDate);
		
		
		
		
		
		
	
		
		
		
		
	}

}
