package stacks;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class StackTest {

	@Test
	public void inputtest1() //testing if program follows stack format
	{
		Stack stack = new Stack(); 
		stack.push(10);           
		stack.push(20);            
		stack.push(30);          

		stack.display();
		
		assertEquals(30,stack.pop());
		assertEquals(20,stack.pop());
		assertEquals(10,stack.pop());
	}
	
	@Test
	public void inputtest2() //testing if program follows stack format
	{
		Stack stack = new Stack(); 
		stack.push(10);           
		stack.push(20);            
		stack.push(30);          

		stack.display();
		
		assertFalse(10==stack.pop());
	}
	
	@Test
	public void inputtest3() 
	{
		Stack stack = new Stack(); 
		
		stack.display();
		
		assertTrue(-1==stack.pop());
	}
	
	@Test
	public void inputtest4() 
	{
		Stack stack = new Stack(); 
		
		stack.display();
		
		assertTrue(-1==stack.top());
	}

	@Test
	public void inputtest5() 
	{
		Stack stack = new Stack(); 
		
		stack.display();
		
		assertTrue(0==stack.getSize());
	}
	
	@Test
	public void inputtest6() 
	{
		Stack stack = new Stack(); 
		stack.push(10);           
		stack.push(20);            
		stack.push(30);          

		stack.display();
		
		assertTrue(3==stack.getSize());
	}
	
	@Test
	public void inputtest7() 
	{
		Stack stack = new Stack(); 
		stack.push(10);           
		stack.push(20);            
		stack.push(30);          

		stack.display();
		
		boolean contains = false;
		for(int i=0;i<3;i++)
		{
			if(10==stack.top())
			{
				contains=true;
			}
			stack.pop();
		}
		
		assertEquals(true,contains);

	}
	
	@Test
	public void inputtest8() //order of output is reverse of input
	{
		Stack stack = new Stack(); 
		stack.push(10);           
		stack.push(20);            
		stack.push(30);          

		stack.display();
		
		boolean contains=false;
	
			if(stack.pop()==30)
			{
				if(stack.pop()==20)
				{
					if(stack.pop()==10)
					{
						contains=true;
					}
				}
			}
		
		assertTrue(contains);	
	}
	
	@Test
	public void inputtest9() //checking if condition holds for empty stack
	{
		Stack stack = new Stack(); 
		stack.push(10);           
		stack.push(20);            
		stack.push(30);          

		stack.display();
		
		stack.pop();
		stack.pop();
		stack.pop();
		
		assertTrue(-1==stack.pop());
		
	}
	
	
	@Test
	public void inputtest10() //Exception case:testing whether the next node 
	{						  //is null or not
		Stack stack = new Stack(); 
		
		try 
		{
			stack.push(10);           
			stack.push(20);            
			stack.push(30);          
			
			stack.display();
			
			assertNull(Stack.head.next.next.next.key);
		}
		
		catch(Exception st)
		{
			System.out.println("Exception");
		}
	}
	
}
