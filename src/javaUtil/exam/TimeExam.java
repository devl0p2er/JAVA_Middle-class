package javaUtil.exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

	public static void main(String[] args) {
		LocalDateTime timePoint = LocalDateTime.now(); //현재 날짜와 시간을 가진 객체 생성함. 
		System.out.println(timePoint); //현재
		
		//내가 원하는 시간의 정보를 설정할 수 있음. 
		
		LocalDate ld1 = LocalDate.of(2025, Month.JULY, 17);
		System.out.println(ld1);
		
		LocalTime lt1 = LocalTime.of(10, 10, 10); //시간만 갖고 있는 객체 생성 
		System.out.println(lt1);
		
		LocalTime lt2 = LocalTime.parse("10:10:30");
		System.out.println(lt2);
		
		LocalDate theDate = timePoint.toLocalDate();
		System.out.println(theDate);
		Month month = timePoint.getMonth();
		System.out.println(timePoint.getMonth());
		System.out.println(month.getValue());
		System.out.println(timePoint.getHour());
		System.out.println(timePoint.getMinute());
	
	}

}
