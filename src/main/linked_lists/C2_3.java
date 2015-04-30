package main.linked_lists;

import main.linked_lists.MyLinkedList.Node;

public class C2_3 {
	
	public static boolean deleteMiddleElement(Node n) {
		
		if (n == null || n.next ==null) {
			return false;
		}
		else {
			Node next = n.next;
			n.data = next.data;
			n.next = next.next;
			return true;
		}
		
	}

}
