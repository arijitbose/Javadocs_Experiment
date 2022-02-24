

import java.io.*;
import java.util.*;
/** 
Java code for stack implementation
*/ 
public class Test
{
	/**
	* Pushing element on the top of the stack
	* @param stack stack element to be pushed the top of the stack
	*/ 
	public static void stack_push(Stack<Integer> stack)
	{
		for(int i = 0; i < 5; i++)
		{
			stack.push(i);
		}
	}
	
	/**
	* Popping element from the top of the stack
	* @param stack element retrieved from  the top of the stack
	*/ 
	public static void stack_pop(Stack<Integer> stack)
	{
		System.out.println("Pop Operation:");

		for(int i = 0; i < 5; i++)
		{
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	}

	/**
	* Displaying element on the top of the stack
	* @param stack element retrieved from  the top of the stack
	*/
	 
	public static void stack_peek(Stack<Integer> stack)
	{
		Integer element = (Integer) stack.peek();
		System.out.println("Element on stack top: " + element);
	}
	
	/**
	*Searching element in the stack
	* @param stack element to be searched in the stack
	*/ 
	public static void stack_search(Stack<Integer> stack, int element)
	{
		Integer pos = (Integer) stack.search(element);

		if(pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is found at position: " + pos);
	}

	/**
	Driver Code
	 */
	public static void main (String[] args)
	{
		Stack<Integer> stack = new Stack<Integer>();

		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack, 2);
		stack_search(stack, 6);
	}
}
