package test.linked_lists;

import static org.junit.Assert.*;
import main.linked_lists.HLinkedList;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test() {
		HLinkedList list = new HLinkedList();
		list.add(4);
		list.add(5);
		System.out.println(list.toString());
		System.out.println("ddd");

	}

}
