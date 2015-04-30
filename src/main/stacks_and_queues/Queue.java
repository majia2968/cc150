package main.stacks_and_queues;

import main.linked_lists.MyLinkedList.Node;

class Queue {
	Node first, last;
	
	void enqueue(Object item) {
		Node back = new Node(item);

		if (first != null)	{
			first = back;
		}
		else {
			back.next = new Node(item);
			back = back.next;
		}
	}
}
