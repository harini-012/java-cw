package julyclasstask;
class TreeNode
{
	int data;
	TreeNode left,right;
	public TreeNode(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
		
	}
}
public class july25cw 
{
	TreeNode root;
	//in-order traversal
	void inorder(TreeNode node)
	{
		if(node!=null)
		{
			inorder(node.left);
			System.out.println(node.data+"->");//visit left subtree 
			inorder(node.right);
			//visit right subtree
			
		}
		
	}
	public static void main(String[] args) 
	{
		july25cw tt=new july25cw();
		tt.root=new TreeNode(1);
		tt.root.left=new TreeNode(2);
		tt.root.right=new TreeNode(3);
		tt.root.left.left=new TreeNode(4);
		tt.root.left.right=new TreeNode(5);
		System.out.println("The tree structure is:");
		tt.inorder(tt.root);
		System.out.println("NULL");
		

	}

}
