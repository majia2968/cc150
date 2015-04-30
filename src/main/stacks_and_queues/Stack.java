package main.stacks_and_queues;

import main.linked_lists.MyLinkedList.Node;

class Stack {
	
	Node top;
	Node pop() {
		if (top != null) {
			Object item = top.data;
			top = top.next;
			return (Node) item;
		}
		return null;
	}
	
	void push(Object item) {
		Node t = new Node(item);
		t.next = top;
		top = t;
	}

}

