package main.linked_lists;

public class MyStack<T> {
	
	private HLinkedList<T> hll = new HLinkedList<T>();

	public void push(T data) {
		hll.addToFirst(data);
	}
	
	public void pop() {
		hll.deleteFirst();
	}
	
	public String toString() {
		return hll.toString();
	}
	
	public int length() {
		return hll.getListCount();
	}

}
