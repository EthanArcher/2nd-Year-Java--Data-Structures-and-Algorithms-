
class Node
{
	protected char ch;
	protected Node next;
 
	/**
   * Construct a node with the given character value 
   * @param c - The character 
    */
	public Node (char c)
	{
		this.ch = c;
		this.next = null;
	}
}	

public class csc2001LinkedList
{  /** A reference to the head of the list */
	
	protected Node head;
	/**
   * Construct a new empty list 
    */
	public csc2001LinkedList()
	{
		head=null;
	}
	
	public Node getHead()
	{
		return head;
	}
	
/**
 *Set c as first node in the list
 *@param c The character to be inserted
 */

	public void addFirst(char c)
	{
		head=new Node(c);			
	}
	
	/**
 *Add a character to the end of the list 
 *@param c The character to be inserted
 */

	public void addAtEnd(char c)
	{
		Node n= new Node(c);
		Node temp = head;
		while (temp.next != null)
		temp = temp.next;
		temp.next=n;		
	}
	
	/**
	 *Add a character in alphabetical order into the list 
     *@param c The character to be inserted
    */
	
	public void addInOrder(char c)
	{

		Node n= new Node(c);

		if(isEmpty())
		{
			addFirst(c);
		}
		else
		{
		Node pre=head;
		Node succ= head.next;
		if (n.ch < pre.ch)
			{
			    n.next =head;// join the node n to the list at the head
				head = n;// head now refers to n
			}
		else
		{
		
		while(succ!=null && n.ch > succ.ch)
		{	// find the position to insert the node
			pre = succ;
			succ = pre.next;
				
		}	//rearrange pointers	
	   n.next = succ;
       pre.next = n;
		}
		}
	}
	/**
	 *Test to see if this list is empty 
     *@returns true or false
    */	
	public boolean isEmpty()
	{
		return (head == null);
	}
	
	
	/**
	 *removes a node from the head of the list 
     *@returns c The character from the removed node
    */
	public char removeFirst() 
	{
		if(!isEmpty())
		{
	// a temporary pointer to enable return of the char being removed
			Node temp = head;
			head = head.next;	//	move head pointer along the list
			return temp.ch;
		}
		else 
		{
			System.out.println("List is empty");
			return '?'; //to indicate that the list is empty
		}
	}
	/**
	 *prints the characters in the list
    */
	public void printList()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.ch + " ");
			temp=temp.next;
		}
	}
	
	public void recursePrintList(Node next)
	{
		if (next == null)
		{
			System.out.println("end of list");
		}
		else 
		{
			System.out.println(next.ch + " ");
			recursePrintList(next.next);
		}
		
	}	
	
	public void reversePrintList(Node next)
	{
		if (next != null)
		{
			reversePrintList(next.next);
			System.out.println(next.ch);
		}
		else 
		{
			System.out.println("");
		}
	}	

	public int length(Node next)
	{	
		if (next == null)
		{	
			return 0;
		}
		
		else
		{	
			return 1 + length(next.next);
		}
	}
	
	int length = 0;
	public int lengthI(Node next)
	{
		Node temp = next;
		while (temp !=null)
		{
			length++;
			temp = temp.next;
		}
		return length;
	}
}

