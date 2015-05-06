package test.stacks_and_queues;

import static org.junit.Assert.*;
import main.stacks_and_queues.C3_1;

import org.junit.Test;

public class C3_1Test {

	@Test
	public void test() {
		C3_1 stack = new C3_1();
		stack.push(0, 1);
		stack.push(0, 2);
		stack.push(0, 3);
		stack.push(1, 4);
		stack.push(1, 5);
		stack.push(1, 6);
		assertEquals(stack.peek(1), 6);
		System.out.println(stack.toString());
		assertEquals(stack.pop(1), 6);
		assertEquals(stack.peek(1), 5);
	}

}
