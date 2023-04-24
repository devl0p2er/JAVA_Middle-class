package test;

import java.util.*;

public class setTest{
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        
        Iterator<String> iter = set.iterator();
        
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
            }
        //iter를 이용해서 set의 내용을 출력하세요.
    }
}