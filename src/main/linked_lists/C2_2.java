package main.linked_lists;

import main.linked_lists.MyLinkedList.Node;


public class C2_2 {
	
	public static Node nthToLast(Node head, int n) {
		if ((head == null) || n < 1) {
			return null;
		}
		
		Node p1 = head;
		Node p2 = head;
		
		for (int j = 0; j < n - 1; j++) {
			if (p2 == null) {
				return null;
			}
			p2 = p2.next;
		}
		
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
	
	public static int i = 0;
	
	public static Node nthToLastRecursion(Node head, int n) {
		   if(head == null) {
			   return null;
		   }		    
		   else {
			   nthToLastRecursion(head.next, n);
		    if(++i == n) return head; 
		   }
		   return head;
	}

}