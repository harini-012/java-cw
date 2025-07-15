package julyclasstask;

class CartItem
{
    String itemName;
    int quantity;
    double price;
    CartItem prev;
    CartItem next;
    public CartItem(String itemName,int quantity,double price)
    {
        this.itemName=itemName;
        this.quantity=quantity;
        this.price=price;
        this.prev=null;
        this.next=null;
        
        
    }
}
class ShoppingCart
{
    private CartItem head=null;
    public void insertAtEnd(String itemName,int quantity,double price)
    {
        CartItem newItem=new CartItem(itemName,quantity,price);
        if(head==null)
        {
            head=newItem;
            head.next=head;
            head.prev=head;
            
        }
        else
        {
            CartItem tail=head.prev;//To get the last node
            tail.next=newItem;
            newItem.prev=tail;
            newItem.next=head;
            head.prev=newItem;
        }
        System.out.println(itemName+" "+ "is inserted at the end");
    }
        public void display()
        {
            if(head==null)
            {
                System.out.println("The data is empty");
                return;
            }
            System.out.println("The list data is");
            CartItem current=head;
            do
            {
                System.out.println("Item:"+current.itemName+" ,Quantity:"+current.quantity+" ,Price:"+current.price);
                current=current.next;
                
            }while(current!=head);
        }
        
    }

public class july15
{
    public static void main(String[]args)
    {
        ShoppingCart cart=new ShoppingCart();
        cart.insertAtEnd("Milk",2,40);
        cart.insertAtEnd("Butter",5,100);
        cart.insertAtEnd("Ghee",3,80);
        cart.display();
        
    }
}