package day14;

import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		/* 날짜시간 클래스
		 * Calendar 클래스 사용 => 추상클래스
		 * 직접 객체를 생성 할 수 없음.
		 *  > new 연산자를 통해 객체 구현 X
		 * getInstance()를 이용하여 구현한 클래스를 통해 인스턴스를 얻어 옴.
		 * 
		 * month : 0월 ~ 11월 +1
		 * week : 1=일, 2=월, 3=화 ...
		 * am_pm : am = 0 , pm = 1
		 * 
		 * */
		
//		Date d = new Date();
//		d.getDate();      // deprecated 비권장
//		System.out.println(d.getMinutes());
		
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = now.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);

		
		System.out.println(year+"-"+month+"-"+day);
		
		
		//hour , minute, second
		int hour = now.get(Calendar.HOUR);
		System.out.println(hour);
		
		int minute = now.get(Calendar.MINUTE);
		System.out.println(minute);
		
		int second = now.get(Calendar.SECOND);
		System.out.println(second);
		
		System.out.println(hour+":"+minute+":"+second);
		
		int apm = now.get(Calendar.AM_PM);
		System.out.println(apm);
	
		
		//2023-02-17(금)
		// 오후 2:42 
		

		System.out.println();
		
		
		String week2 = null;
		switch(week) {
			case 1 : week2 = "일"; break;
			case 2 : week2 = "월"; break;
			case 3 : week2 = "화"; break;		
			case 4 : week2 = "수"; break;
			case 5 : week2 = "목"; break;		
			case 6 : week2 = "금"; break;
			case 7 : week2 = "토"; break;	
		} 
		
		
//		String aapp = " ";
//		switch(apm) {
//			case 1 : aapp = "오후"; break;
//			case 0 : aapp = "오전"; break;	
//		} 
	
		String aapp = null;
		if(apm==0) {
			aapp = "오전";
		} else aapp="오후";		
		
		
		System.out.println(year+"-"+month+"-"+day+"("+week2+")");
		System.out.println(aapp+" "+hour+":"+minute);
		
		System.out.println((apm==0?"오전 ":"오후 ")+hour+":"+minute);
		
		
	}

}
