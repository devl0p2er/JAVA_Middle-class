package test;

import java.util.*;

public class CalendarTest{
    public String hundredDaysAfter(){
        //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
   
        Calendar cal = Calendar.getInstance();
        
        cal.add(Calendar.DATE, 100);
        
        int yyyy = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int date = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        
        String cals = yyyy+ "년" + month + "월" + date +"일";
        
        return cals;
        
    }
    public static void main(String[] args){
        CalendarTest CE = new CalendarTest();
        String str = CE.hundredDaysAfter();
        System.out.println(CE.hundredDaysAfter());
    }
}