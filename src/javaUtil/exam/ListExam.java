package javaUtil.exam;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("kim");
		list.add("kang");
		list.add("kim");    //값저장
		
		System.out.println(list.size()); //컬렉션이 갖고 있는 메서드
		
	System.out.println("----");
		
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);  //값 꺼내오기
		} 
	}

}
