package julyclasstask;
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int data)
	{
		this.data=data;
		this.next=null;
	}
}

public class july23cw 
{
	QueueNode front,rear;
	july23cw()
	{
		this.front=null;
		this.rear=null;
	}
	void enqueue(int value)
	{
		QueueNode newNode=new QueueNode(value);
		if(rear==null)//if list is empty
		{
			front=rear=newNode;
			
		}
		else
		{
			rear.next=newNode;
			rear=newNode;
		}
		System.out.println("The "+ value+" is inserted successfully");
		
		
	}
	void dequeue()
	{
		if(front==null)
		{
			System.out.println("List is empty");
			return;
			
		}
		int dValue=front.data;
		front=front.next;
		System.out.println("The current first data "+ dValue+" is deleted successfully");
		
	}
	int peek()
	{
		if(front==null)
		{
			System.out.println("There are no datas in the linked result");
			return -1;
			
		}
		return front.data;
	}
	void display()
	{
		if(front==null)
		{
			System.out.println("There are no datas in the list");
			return;
		}
		
		QueueNode temp=front;
		System.out.println("The datas in the linked list are:");
		while(temp!=null)
		{
			System.out.println("The data is:"+ temp.data);
			temp=temp.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) 
	{
		july23cw da=new july23cw();
		da.enqueue(0);
		da.enqueue(1);
		da.enqueue(3);
		da.enqueue(4);
		
		da.display();
		da.dequeue();
		
		da.display();
		int result=da.peek();
		System.out.println("The top element is:"+result);
		
		

	}

}
