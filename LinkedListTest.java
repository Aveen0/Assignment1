package linklist;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import linklist.LinkedList.Node;

class LinkedListTest {
	
	@Test
	void inputtest1() 
	{
		LinkedList list = new LinkedList();
		
		list.popFront();
		list.pushBack(12);
		
		assertEquals(12,list.head.key);

	}
	
	@Test
	void inputtest2()
	{
		LinkedList list = new LinkedList();
		
		assertTrue(LinkedList.head==null);
		list.pushBack(12);
		list.pop(0);

	}

	@Test
	void inputtest3() 
	{
		LinkedList list = new LinkedList();
		
		list.popBack();
		list.pushFront(10);
		list.pushBack(12);
		list.pushFront(20);
		list.pushBack(22);

		//list.display();
		
		assertEquals(20,list.head.key);
	}
	
	@Test
	void inputtest4() 
	{
		LinkedList list = new LinkedList();
		
		list.pushFront(10);
		list.pushBack(12);
		list.pushFront(20);
		list.pushBack(22);

		//list.display();
		
		assertEquals(22,list.head.next.next.next.key);
	}
	
	@Test
	void inputtest5() //checking if all inputs are being stored in the list
	{
		LinkedList list = new LinkedList();
		
		list.pushFront(10);
		list.pushBack(12);
		list.pushFront(20);
		list.pushBack(22);

		//list.display();
		
		int count=0;

		Node temp=list.head;
		while(temp!=null){
			System.out.print(temp.key +  " ");
			temp=temp.next;
			count++;
		}
		assertEquals(4,count);
	}
	
	
	@Test
	void inputtest6() //Exception:test case for testing push
	{
		LinkedList list = new LinkedList();
		
		try 
		{
			LinkedList.pop(LinkedList.head.next.next.key);
		}

		catch(Exception st)
		{
			System.out.println("Exception");
		}
	}
	
	@Test
	void inputtest7() 
	{
		LinkedList list = new LinkedList();
		
		list.pushFront(10);
		list.pushBack(12);
		list.pushFront(20);
		list.pushBack(22);
		list.pop(3);
		
		//list.display();
		
		int count=0;

		Node temp=list.head;
		while(temp!=null){
			System.out.print(temp.key +  " ");
			temp=temp.next;
			count++;
		}
		assertEquals(3,count);
	}
	
	@Test
	void inputtest8() 
	{
		LinkedList list = new LinkedList();
		
		list.pushFront(10);
		list.pushBack(12);
		list.pushFront(20);
		list.pushBack(22);
		list.pop(3);
		
		//list.display();
		
		boolean contains=false;

		Node temp=list.head;
		while(temp!=null){
			System.out.print(temp.key +  " ");
			if(temp.key==20)
			{
				contains=true;
			}
			temp=temp.next;
		}
		assertTrue(contains);
	}
	
	@Test
	void inputtest9() //last value has changed or not
	{
		LinkedList list = new LinkedList();
		
		list.pushFront(10);
		list.pushBack(12);
		list.pushFront(20);
		list.pushBack(22);
		list.popBack();
		
		list.display();
		
		boolean contains=false;
		
		if(list.head.next.next.key==12)
		{
			contains=true;
		}
		assertTrue(contains);
		
	}
	
	@Test
	void inputtest10() //first value has changed or not
	{
		LinkedList list = new LinkedList();
		
		list.pushFront(10);
		list.pushBack(12);
		list.pushFront(20);
		list.pushBack(22);
		list.popFront();
		
		//list.display();
		
		boolean contains=false;
		
		if(list.head.key==10)
		{
			contains=true;
		}
		assertTrue(contains);
		
	}
	
	@Test
	void inputtest11() //empty or not
	{
		LinkedList list = new LinkedList();
		
		list.pushFront(10);
		list.pushBack(12);
		list.pushFront(20);
		list.pushBack(22);
		list.popFront();
		list.popFront();
		list.popFront();
		list.popFront();
		
		//list.display();
		
		assertTrue(list.head==null);
		
	}
	
	@Test
	void inputtest12() //empty or not
	{
		LinkedList list = new LinkedList();
		
		list.pushFront(10);
		list.pushBack(12);
		list.pushFront(20);
		list.pushBack(22);
		list.popBack();
		list.popBack();
		list.popBack();
		list.popBack();
		
		list.display();
		
		assertTrue(list.head==null);
		
	}
}
