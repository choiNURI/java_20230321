package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx01 {

	public static void main(String[] args) throws ParseException {
	
		
		//날짜를 문자열로 format 설정
		 Date date = new Date();
		 SimpleDateFormat sdf =  new SimpleDateFormat("yyy-MM-dd(E)"); //mm->분 MM->월 p.543
 	 	 String dateString = sdf.format(date);
		 System.out.println(dateString);
		 
		 
		 //문자열을 날짜로
		 String dateStr = "2023-10-09 12:12:12";
		 SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		 Date date2 = sdf2.parse(dateStr);
		 System.out.println(date2);
				 
		 
	}

}
