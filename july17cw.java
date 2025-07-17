package julyclasstask;
import java.util.*;
class StudentUndo
{
	int s_id;
	String s_name;
	//constructor
	StudentUndo(int s_id,String s_name)
	{
		this.s_id=s_id;
		this.s_name=s_name;
	}
	void display()
	{
		System.out.println("ID:"+s_id+"\nName:"+s_name);
	}
}

public class july17cw 
{
	static int top=-1;
	static final int size=5; //there is no constant in java so we use final to prevent the any changes after the initialization
	
	static StudentUndo[]stu_undo_array=new StudentUndo[size];
	public static void push(StudentUndo s)
	{
		if(top==size-1)
		{
			System.out.println("The registraion is completed");
			
		}
		else
		{
			top=top+1;
			stu_undo_array[top]=s;
			System.out.println("The student with the data " + s.s_name + "is registered successfully");
			
		}
	}
	public static void pop()
	{
		if(top==-1)
		{
			System.out.println("No data is available");
			
		}
		else
		{
			System.out.println("The registration is cancelled");
			stu_undo_array[top--].display();
			
			
		}
	}
	public static void display()
	{
		if(top==size-1)
		{
			System.out.println("The data is not available");
			
		}
		else
		{
			System.out.println("The data of the registered students is:");
			for(int i=top;i>=0;i--)
			{
				stu_undo_array[i].display();
			}
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
		System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
		System.out.println("Chooce any operation");
		choice=sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the id");
			int s_id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name");
			
			String s_name=sc.next(); 
			push(new StudentUndo(s_id,s_name));
			break;
		case 2:
			pop();
			break;
		case 3:
			display();
			break;
		case 4:
			System.out.println("--System Exiting--");
			break;
		default:
			System.out.println("Invalid option is given");
		}
		
		
		}while(choice!=4);
	}

}

