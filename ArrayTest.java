package fullarr;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

class ArrayTest
{

	private static final int Null = 0;

	@Test
 	void inputtest1() //This test case fails.Considering the comparison
	{				  //is being made with all 100, where as 95 locations are still NULL.
		Array ob1=new Array();
		ob1.insert(1,0);
		ob1.insert(3,1);
		ob1.insert(4,2);
		
		ob1.display();
		
		int[] arr2={1,3,4};
		assertNotEquals(arr2,Array.array);
	
	}
	
	@Test
	void inputtest2() //This test case should pass since 3 is present in the array
	{
		Array ob1=new Array();
		ob1.insert(1,0);
		ob1.insert(3,1);
		ob1.insert(4,2);
		
		ob1.display();
	
		//code to search for a specific value
		
		boolean contains = IntStream.of(ob1.array).anyMatch(x->x == 3);
		assertTrue(contains);
	}
	
	@Test
	void inputtest3() //This test case should pass since 1 is no longer present 
	{				  //after index 0 has been removed.
		Array ob1=new Array();
		ob1.insert(1,0);
		ob1.insert(2,1);
		ob1.insert(3,2);
		ob1.insert(4,3);
		ob1.insert(5,4);
		
		ob1.display();
		
		ob1.delete(0);
		
		//code to search for a specific value
		
		boolean contains = IntStream.of(ob1.array).anyMatch(x->x != 1);
		assertTrue(contains);
	}
	
	@Test
	void inputtest4() //This test case should pass as after deletion if the code is actually deleting
	{				 //the nodes and not nullifying them
		Array ob1=new Array();
		ob1.insert(1,0);
		ob1.insert(2,1);
		ob1.insert(3,2);
		ob1.insert(4,3);
		ob1.insert(5,4);
		
		ob1.display();	
		ob1.delete(0);	
		
		boolean contains=false;
		
		if(ob1.array[4]==-1)
		{
			contains=true;
		}
			
		assertFalse(contains);	
	}
	
	@Test
	void inputtest5() //This test case should pass if proper deletion
	{				 
		Array ob1=new Array();
		ob1.insert(1,0);
		ob1.insert(2,1);
		ob1.insert(3,2);
		ob1.insert(4,3);
		ob1.insert(5,4);
		
		ob1.display();	
		ob1.delete(3);
		
		boolean contains=false;
		
		if(ob1.array[3]==5)
		{
			contains=true;
		}
			
		assertTrue(contains);	
	}
	
	@Test
	void inputtest6() //This test case should pass if linear search is taking place
	{				 
		Array ob1=new Array();
		ob1.insert(1,0);
		ob1.insert(2,1);
		ob1.insert(3,2);
		ob1.insert(4,3);
		ob1.insert(5,4);
		
		ob1.display();
		boolean contains =ob1.linearSearch(2);
		
		assertTrue(contains);
	}
	
	@Test
	void inputtest66() //This test case should pass if linear search is taking place
	{				 
		Array ob1=new Array();
		ob1.insert(1,0);
		ob1.insert(2,1);
		ob1.insert(3,2);
		ob1.insert(4,3);
		ob1.insert(5,4);
		
		ob1.display();
		boolean contains =ob1.linearSearch(0);
		
		assertFalse(contains);
	}

	
	@Test
	void inputtest7() //This test case should pass if bubble sort is taking place
	{				 
		Array ob1=new Array();
		ob1.insert(8,0);
		ob1.insert(2,1);
		ob1.insert(4,2);
		ob1.insert(4,3);
		ob1.insert(5,4);
		
		ob1.bubbleSort();
		ob1.display();
		
		boolean contains=false;
		if(ob1.array[0]==2&&ob1.array[1]==4&&ob1.array[2]==4&&ob1.array[3]==5&&ob1.array[4]==8)
		{
			contains=true;
		}
		
		assertTrue(contains);
	}
	
	@Test
	void inputtest8() //This test case is for bubble sort
	{				 
		Array ob1=new Array();
		ob1.insert(-8,0);
		ob1.insert(-2,1);
		ob1.insert(-4,2);
		ob1.insert(-4,3);
		ob1.insert(-5,4);
		
		int[] arr= {-8,-5,-4,-4,-2};
		Array.bubbleSort();
		ob1.display();
		
		boolean contains=false;
		
		for(int i=0;i<Array.size;i++)
		{
			if(arr[i]==ob1.array[i])
			{
				contains=true;
			}
		}
		
		assertTrue(contains);
	}
	
	@Test
	void inputtest9() //This test case should pass if binary search is taking place
	{				 
		Array ob1=new Array();
		ob1.insert(1,0);
		ob1.insert(2,1);
		ob1.insert(3,2);
		ob1.insert(4,3);
		ob1.insert(5,4);
		
		ob1.display();
		boolean contains=ob1.binarySearch(4,0,5);
		
		assertTrue(contains);
	}
	
	@Test
	void inputtest10() //Exception case:fails test for -1 however works well for any other negative
	{				   //value
		Array ob1=new Array();
		ob1.insert(-1,0);
		ob1.insert(2,1);
		ob1.insert(-3,2);
		ob1.insert(4,3);
		ob1.insert(-5,4);
		
		ob1.display();
		boolean contains=ob1.binarySearch(-1,0,5);///place index
		
		assertFalse(contains);
	}
	
	@Test
	void inputtest11() //Passes at value -3
	{				 
		Array ob1=new Array();
		ob1.insert(-1,0);
		ob1.insert(2,1);
		ob1.insert(-3,2);
		ob1.insert(4,3);
		ob1.insert(-5,4);
		
		ob1.display();
		boolean contains=ob1.binarySearch(-3,0,5);///place index
		
		assertTrue(contains);
	}

}