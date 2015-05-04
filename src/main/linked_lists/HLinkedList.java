package main.linked_lists;

public class HLinkedList<T> {

	private Node<T> head;
	private int listCount;
	
	public HLinkedList() {
		head = new Node<T>(null);
		listCount = 0;
	}
	
	public int getListCount() {
		return listCount;
	}
	
	public void setListCount(int listCount) {
		this.listCount = listCount;
	}
	
	public void add(T data) {
		Node<T> current = head;
		Node<T> node = new Node<T>(data);

		while (current.next != null) {
			current = current.next;
		}
		listCount++;
		current.next = node;		
	}
	
	public void addToFirst(T data) {
		Node<T> node = new Node<T>(data);
		node.next = head.next;
		head.next = node;
		listCount++;
		
	}
	
	public void deleteFirst() {
		Node<T> current = head;
		current = current.next;
		listCount--;
	}
	
	public void remove(T data) {
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<T> current = head.next;
		
		while (current != null) {
			sb.append(current.data + " ");
			current = current.next;
		}
		return sb.toString();
	}
	

	public static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			next = null;
			this.data = data;
		}

		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

	}

}
