public class Csc2001LinkedList 
{
	
	protected Node head;
	protected Node tail;
	
	protected int size = 0;
	
	public Csc2001LinkedList()
	{
		head = null;
	}
	
	public Node getHead()
	{
		return head;
	}
	
	public Node getTail()
	{
		return tail;
	}
	
	public void addFirst(char c)
	{
		if (head == null)
		{
			head = tail = new Node(c, null);
			size++;
		}
		else
		{
		Node temp = new Node(c, null);
		temp.previous = null;
		temp.next = head;
		head = temp;
		
		if (head.next != null) 
			{
			head.next.previous = temp;
			}
		size++;
		}
	}
	
	public void addAtEnd(char c)
	{
		Node temp = head;
		Node incoming = new Node(c,null);
		
		while (temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = incoming;
		incoming.previous = temp;
		incoming.next = null;
		tail = incoming;
		size++;
	}
	
	public void addInOrder(char ch)
	{
		Node temp = head;
		Node last = null;
		Node incoming = new Node (ch,null);
		int position;
		
		if(isEmpty())
		{
			addFirst(ch);
		}
		
		else
		{
			for (position = 0; position < size; position++) //find where to insert
			{
			
				if(ch > temp.ch)
				{
					last = temp;		//used as the previous state
					temp = temp.next; // this is the next state
				}
			
			}

			last.next = incoming; //insert new char after previous 
			incoming.next = temp; //set new nodes next
			size++;
		}
		
	}
	
	public boolean isEmpty()
	{
		return (head == null);
	}
	
	public char removeFirst()
	{
		if (!isEmpty())
		{
			Node temp = head.next;
			char removed = head.ch;
			head = temp;
			size--;
			return removed;
		}
		else
		{
			System.out.println("List is empty");
			return '?';
		}	
	}
	
	public char removeLast()
	{
		if (!isEmpty())
		{
			Node temp = tail.previous;
			char removed = tail.ch;
			tail = temp;
			size --;
			return removed;
		}
		else
		{
			System.out.println("List is empty");
			return '?';
		}
	}
	
	public void printList()
	{
		Node temp = head;
		for (int i = 0; i < size; i++)
		{
			System.out.print(temp.ch + " ");	
			temp = temp.next;
		}
		
		System.out.println(" ");
	}	
	
}
