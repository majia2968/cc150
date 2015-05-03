package main.linked_lists;

public class HLinkedList<T> {

	private Node<T> head;
	
	public HLinkedList() {
		head = new Node(null);
	}
	public void add(T data) {
		Node<T> current = head;
		Node<T> node = new Node<T>(data);

		while (current.next != null) {
			current = current.next;
		}
		
		current.next = node;		
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

		public Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

	}

}
