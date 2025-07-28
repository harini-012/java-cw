package julyclasstask;
class TraverseNode
{
	int data;
	TraverseNode left,right;
	//constructor
	public TraverseNode(int value)
	{
		data=value;
		this.left=null;
		this.right=null;
	}	
}
public class july28cw 
{
	TraverseNode root;
	//pre-order traversal --> Root left right
	void preorder(TraverseNode node)
	{
		if(node==null)
		{
			return;
		}
		System.out.println(node.data+"->");//root
		preorder(node.left);
		preorder(node.right);
	}
	//post order--> Left right root
	void postorder(TraverseNode node)
	{
		if(node==null)
		{
			return;
		}
		postorder(node.left);//recursive call until it reaches null
		postorder(node.right);//recursive call until it reaches null
		System.out.println(node.data+"->");
	}

	
		
	public static void main(String[] args) 
	{
		july28cw tt=new july28cw();
		tt.root=new TraverseNode(1);
		tt.root.left=new TraverseNode(2);
		tt.root.right=new TraverseNode(3);
		tt.root.left.left=new TraverseNode(4);
		tt.root.left.right=new TraverseNode(5);
		tt.root.right.right=new TraverseNode(6);
		System.out.println("The preorder traversal:");
		tt.preorder(tt.root);
		System.out.println("The postorder traversal:");
		tt.postorder(tt.root);
	}

}
