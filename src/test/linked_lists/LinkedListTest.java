package test.linked_lists;

import static org.junit.Assert.*;
import main.linked_lists.HLinkedList;
import main.linked_lists.MyStack;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test() {
		HLinkedList list = new HLinkedList();
		list.add(4);
		list.add(5);
		list.add(9);

		System.out.println(list.toString());
		System.out.println("ddd");
		
		MyStack ms = new MyStack();
		ms.push(4);
		ms.push(7);
		ms.push(8);

//		ms.pop();
		System.out.println(ms.toString());
		System.out.println(ms.length());

		

	}

}
