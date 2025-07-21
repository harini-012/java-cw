package julyclasstask;
class StackNode
{
	int data;
	StackNode next;
	//constructor->It will immediately initialize the memory of the variable when object is created instead of allocating at run time
	StackNode(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class july21cw {
	StackNode top;
	july21cw()
	{
		this.top=null;
	}
	public void push(int value)
	{
	StackNode newNode=new StackNode(value);
	newNode.next=top;//Since linked list we dont want to check for the capacity
	top=newNode;
	System.out.println("Inserted "+value+" successfully");
	}
	public void pop()
	{
		if(top==null)
		{
			System.out.println("The given Stack is empty");
			return;
		}
		int topValue=top.data;
		top=top.next;//Initialize other element as top that is next element after the removal
		System.out.println("The "+topValue+" is removed");
		
	}
	int peek()
	{
		if(top==null)
		{
			System.out.println("List is empty");
			return -1;
			
		}
		return top.data;
		
	}
	public void display()
	{
		if(top==null)
		{
			System.out.println("List is empty");
			return;
			
		}
		StackNode temp=top;
		System.out.println("***Elements in the stack is***");
		while(temp!=null)
		{
			System.out.println(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) 
	{
		july21cw st=new july21cw();
		st.push(100);
		st.push(101);
		st.push(102);
		st.push(103);
		System.out.println("After push operation");
		st.display();
		st.pop();
		System.out.println("After pop operation");
		st.display();
		System.out.println("After peek operation,The top element is:"+st.peek());
	
	}

}
