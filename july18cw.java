package julyclasstask;

import java.util.Stack;
public class july18cw {
	public static int evaluatePostfix(String postfix)
	{
		Stack <Integer> stack=new Stack<>();
		for (int i=0;i<postfix.length();i++)
		{
		    char ch=postfix.charAt(i);//fetching each character
		    if(Character.isDigit(ch))
		    {
		        stack.push(ch-'0');//0 --unicode--48....1--unicode--49....
		        //stack.push(Integer.parseInt(Character.toString(ch)))
		    }
		    else
		    {
		        int v1=stack.pop();
		        int v2=stack.pop();
		        switch(ch)
		        {
		            case '+':
		                stack.push(v1+v2);
		                break;
		            case '-':
		                stack.push(v1-v2);
		                break;
		            case '*':
		                stack.push(v1*v2);
		                break;
		            case '/':
		                stack.push(v1/v2);
		                break;
		          
		        }
		    }
		    
		}
		    return stack.pop();
	}

	public static void main(String[] args) 
	{
		String expression="231*+9-";
		int result=evaluatePostfix(expression);
		System.out.println("Answer is:"+result);
		

	}

}
