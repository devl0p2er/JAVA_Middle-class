package javaUtil.exam;

public class BoxExam {

	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj(new Object());
//		Object obj = box.getObj(); //리턴값을 사용할 수 있도록 변수 obj 생성 
//		
//		box.setObj("hello"); //box 에 스트링 값을 넣고 싶어요 
//		String str = (String)box.getObj(); //리턴시 object타입으로 반환, 따라서 형변환 
//		System.out.println (str);
//		
//		box.setObj(1);
//		int value = (int)box.getObj(); // 리턴시 object타입으로 반환, 따라서 형변환 

		
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("hello");
		String str = box2.getObj(); //형변환 할 필요 없음
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(4);
		int v2 = box3.getObj();
	}

}
