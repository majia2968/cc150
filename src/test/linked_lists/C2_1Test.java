package test.linked_lists;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import main.linked_lists.C2_1;
import main.linked_lists.MyLinkedList;
import main.linked_lists.MyLinkedList.Node;

import org.junit.Test;

public class C2_1Test {

	@Test
	public void test() {
		
		MyLinkedList linkedListNode = new MyLinkedList();

	    linkedListNode.add("1");
	    linkedListNode.add("2");
	    linkedListNode.add("3");


	    
	    

	    
	    System.out.println(linkedListNode.size());
	    Node head = linkedListNode.
	    while (head != null) {
	    	head = head.next;
		    System.out.println(head.data);

	    }
	    

//	    C2_1.removeDuplicates(linkedListNode);
	    
	    System.out.println(linkedListNode.size());
	    
	    
		
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> result = new LinkedList<Integer>();

	    list.add(9);
	    list.add(1);
	    list.add(3);
	    list.add(2);
	    list.add(5);
	    list.add(7);
	    list.add(8);
	    list.add(3);
	    list.add(1);
	    list.add(8);
	    
	    result.add(9);
	    result.add(1);
	    result.add(3);
	    result.add(2);
	    result.add(5);
	    result.add(7);
	    result.add(8);
	    	    
	    assertEquals(C2_1.removeDuplicatesWithBuffer(list), result);
	    

	    
	}

}
