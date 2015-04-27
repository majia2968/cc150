package main.linked_lists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class C2_1 {
	
	public static List<Integer> removeDuplicatesWithBuffer(LinkedList<Integer> list) {
		
		Iterator it = list.iterator();
		Set<Integer> tempSet = new HashSet<Integer>();
		
		while (it.hasNext()) {
			Integer in = (Integer) it.next();
			if (tempSet.contains(in)) {
				it.remove();
			}
			else {
				tempSet.add(in);
			}
		}
		
		return list;
	}
	
	public static LinkedListNode removeDuplicates(LinkedListNode head) {
		
		LinkedListNode current = head;	
		
		while (current != null) {
			LinkedListNode next = current.next;
			while (next != null) {
				if (current.data == next.data) {
		            current.next = next.next;
		            break;
		        }
				next = next.next;
			}
			current = current.next;
		}
		return head;
	}
}

class LinkedListNode {  
    public int data;  
    public LinkedListNode next;  

    public LinkedListNode(int data) {  
        this.data = data;    
    }  
}
