package test.linked_lists;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import main.linked_lists.C2_1;

import org.junit.Test;

public class C2_1Test {

	@Test
	public void test() {
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
