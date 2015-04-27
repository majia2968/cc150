package main.linked_lists;

public class C2_2 {
	
	public static LinkedListNode nthToLast(LinkedListNode head, int n) {
		if ((head == null) || n < 1) {
			return null;
		}
		
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		
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
	public static LinkedListNode nthToLastRecursion(LinkedListNode head, int n) {
		   if(head == null) {
			   return null; 
		   }		    
		   else {
			   nthToLastRecursion(head.next, n);
		    if(++i == n) return head; 
		    return null; 
		   }
	}

}




//class LinkedListNode {  
//    public int data;  
//    public LinkedListNode next;  
//
//    public LinkedListNode(int data) {  
//        this.data = data;    
//    }  
//}