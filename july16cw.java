package julyclasstask;
import java.util.*;
class Stack
{
	int top;
	int size;
	int[]sArray;
	public Stack(int size)//Constructor
	{
		this.size=size;
		sArray=new int[size];
		top-=1;
		
	}
	//push operation
	public void insert(int value)
	{
		if(top==size-1)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			top=top+1;
			sArray[top]=value;
			System.out.println(value+"is pushed successfully");
			
		}
	}
	//pop operation
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Cannot remove,stack is empty");
			
		}
		else 
		{
			System.out.println(sArray[top--]+"is removed");
		}
	}
	public void peek()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			
		}
		else 
		{
			System.out.println("Top element"+sArray[top]);
			
		}
	}
	public void display()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty...");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(sArray[i]);
			}
		}
	}
}
public class july16cw {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the capacity of the stack");
		int capacity=sc.nextInt();
		Stack s=new Stack(capacity);
		s.insert(1);
		s.insert(2);
		s.insert(3);
		s.insert(4);
		System.out.println("After insertion");
		s.peek();
		s.display();
		s.pop();
		System.out.println("---After pop operation---");
		s.peek();
		s.display();
	}

}
