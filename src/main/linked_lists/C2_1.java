package main.linked_lists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import main.linked_lists.MyLinkedList;
import main.linked_lists.MyLinkedList.Node;

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
	
	public static void removeDuplicates(MyLinkedList linkedListNode) {
		Node head = linkedListNode.get(1);
		Node current = head;	
		
		while (current != null) {
			Node next = current.next;
			int i = 2;
			while (next != null) {
				if (current.data.toString() == next.data.toString()) {
//		            current.next = next.next;
			    	linkedListNode.remove(i);
		            break;
		        }
				next = next.next;
				i++;

			}
			current = current.next;
		}
	}

}


