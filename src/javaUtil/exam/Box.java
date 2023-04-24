package javaUtil.exam;

public class Box <E> {
	private Object obj;
	
	public void setObj (E obj) {
		this.obj = obj;
	}
	
	public E getObj() {
		return (E) obj;
	}
}
