package queues;

import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.ArrayBlockingQueue.*;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class QueueTest 
{
	
	@Test
	public void inputtest1() //testing whether value gets stored in queue
	{
		Queue queue= new Queue();
		queue.enqueue(5);
		assertTrue(5==queue.dequeue());
	}
	
	@Test
	public void inputtest2()//testing whether the queue format is followed
	{
		Queue queue= new Queue();
		queue.enqueue(6);
		queue.enqueue(9);
		assertTrue(6==queue.dequeue());
	}
	
	@Test
	public void inputtest3() //testing if it works for negative values
	{
		Queue queue= new Queue();
		queue.enqueue(-2);
		queue.display();
		
		assertTrue(-2==queue.dequeue());
	}
	
	@Test
	public void inputtest4() //testing for empty queue
	{
		Queue queue= new Queue();
		queue.display();
		
		assertTrue(-1==queue.dequeue());
	}
	
	@Test
	public void inputtest5()//testing sequence of output
	{
		Queue queue= new Queue();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		queue.display();
		
		assertEquals(1,queue.dequeue());
		assertEquals(2,queue.dequeue());
		assertEquals(3,queue.dequeue());
	}
	
	@Test
	public void inputtest6()//testing for specific value
	{
		Queue queue= new Queue();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		//queue.display();
		
		boolean contains=false;
		
		for(int i=0;i<3;i++)
		{
			if(1==queue.dequeue())
			{
				contains=true;
			}
		}
		assertTrue(contains);
	}
	
	@Test
	public void inputtest7()//testing for size of queue
	{
		Queue queue= new Queue();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		//queue.display();
		
		int count=0;
		
		while(queue.dequeue()!=-1)
		{
			count++;
		}
		
		assertTrue(count==3);
	}
	
	
	@Test
	public void inputtest8() //checking if condition holds for dequeuing an empty stack
	{
		Queue queue= new Queue();
		queue.dequeue();
		
		assertTrue(-1==queue.dequeue());
	}
	
	@Test
	public void inputtest9() //testing whether value gets stored in queue
	{
		Queue queue= new Queue();
		for(int i=0;i<10000;i++)
		{
			queue.enqueue(i);
		}
		
		assertEquals(0,queue.head.key);
	}
	
	@Test
	public void inputtest10() //testing for size
	{
		Queue queue= new Queue();
		for(int i=0;i<10000;i++)
		{
			queue.enqueue(i);
		}
		
		assertEquals(10000,queue.size);
	}
	
	@Test
	public void inputtest11() 
	{
		Queue queue= new Queue();
		for(int i=0;i<10000;i++)
		{
			queue.enqueue(i);
		}
		
		Queue.Node contains=queue.head;
		
		for(int i=0;i<10000;i++)
		{
			assertEquals(i,contains.key);
			contains=contains.next;
		}
	}
	
	@Test
	public void inputtest12() //Exception case:testing whether the next node 
	{						  //is null or not
		Queue queue= new Queue();
		
		try 
		{
			queue.enqueue(5);
			queue.enqueue(4);
			queue.enqueue(3);
			
			queue.display();
			
			assertNull(Queue.head.next.next.next.key);
		}
		
		catch(Exception st)
		{
			System.out.println("Exception");
		}

		
	}
	
}
