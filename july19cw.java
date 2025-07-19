package julyclasstask;
class Queue
{
	int front,rear,capacity;
	int QArray[];
	Queue(int size)//constructor
	{
		front=rear=0;
		capacity=size;
		QArray=new int[capacity];
	}
	public  void enqueue(int value)
	{
		if(rear==capacity)
		{
			System.out.println("Queue is full");
			
		}
		else
		{
		
			QArray[rear++]=value;
			System.out.println(value+"is inserted");
		}
	}
	public void dequeue()
	{
		if(front==rear)
		{
			System.out.println("The queue is empty");
			
		}
		else
		{
			System.out.println(QArray[front] + "is removed");
			for(int i=0;i<rear-1;i++)
			{
				QArray[i]=QArray[i+1];
				
			}
			rear=rear-1;
		}
	}
	void display()
	{
		if(front==rear)
		{
			System.out.println("The que is empty");
			return;
		}
		else
		{
			System.out.println("The queue is:");
			
			for(int i=front;i<rear;i++)
			{
				System.out.println(QArray[i]);
			}
			
		}
	}
}
public class july19cw
{

	public static void main(String[] args)
	{
		Queue q=new Queue(5);
		q.enqueue(1);
		q.enqueue(10);
		q.enqueue(100);
		q.enqueue(1000);
		q.enqueue(10000);
		System.out.println("After enqueue");
		q.display();
		System.out.println("After dequeue");
		q.dequeue();
		q.display();
		
		
		

	}

}
