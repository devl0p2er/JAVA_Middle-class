package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("001", "kim");
		map.put("002", "lee");
		map.put("003", "choi");
		
		map.put("001", "kang");
		
		System.out.println(map.size()); //데이터 개수 확인 : 3
		
		System.out.println(map.get("001"));  //	값 하나씩 꺼내기 : kang 
		
		Set<String> keys = map.keySet();
		//모두 다 꺼내는 방법 
		
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key +":"+ value); 
		}
		
	}

}
