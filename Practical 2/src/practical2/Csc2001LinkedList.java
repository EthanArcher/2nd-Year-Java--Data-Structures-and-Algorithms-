package practical2;

/*@author Ethan Archer
 * 				40076614
 * 
 * 
 * 
 */



public class Csc2001LinkedList 
{

	protected Node head;						//creates a head referecne
	protected Node tail;						// creates a tail reference 

	protected int size = 0;				//sets initial size of list to zero

	public Csc2001LinkedList()
	{
		head = null;								// sets head as null
		tail = null;								// sets tail as null
	}

	public Node getHead()					// method to return protected head
	{
		return head;							// return head
	}

	public Node getTail()				//method to return protected tail
	{
		return tail;											// return tail
	}

	public void addFirst(char c)			//method to add at the start of the list
	{
		if (head == null)								// if the list is empty
		{
			head = tail = new Node(c);			// head and tail are equal to the new node
			size++;													// increase size by 1
		}
		else														// if the list isnt empty
		{
			Node temp = new Node(c);				//set temp as the new node
			temp.previous = null;						// previous of new node is null
			temp.next = head;								// next of new node is head
			head = temp;										// set head to be new node temp

			if (head.next != null) 				// if there is a node after head
			{
				head.next.previous = temp;		// set the node after head to have a previous link to temp
			}
			size++;													// increase size of the list by 1
		}
	}

	public void addAtEnd(char c)		// method to add at the end of the list
	{
		
		if (head == null)								// if the list is empty
		{
			head = tail = new Node(c);			// head and tail are equal to the new node
			size++;													// increase size by 1
		}
		
		Node temp = head;								//temp node equal to head
		Node incoming = new Node(c);		// incoming node equal to new node

		while (temp.next != null)			// while not at end of list 
		{
			temp = temp.next;						//temp equals next temp
		}

		temp.next = incoming;						//last node is now incoming
		incoming.previous = temp;				// previous of incoming is temp (previous end)
		incoming.next = null;						// incoming.next is set to null as end of list
		tail = incoming;								// tail is equal to the incoming ie last node
		size++;													//increase size by 1
	}

	public void addInOrder(char ch)			//method to add in alphabetical order
	{
		Node temp = head;									//new node temp is equal to head
		Node last = null;									//new node last is null
		Node incoming = new Node (ch);		//new incoming node set as ch 
		int position;											// int to hold position

		if(isEmpty())											// if the list is empty
		{
			addFirst(ch);										// add this character first
			size++;													// increase size by 1
		}

		else															// if not empty
		{
			for (position = 0; position < size; position++) 		//find where to insert
			{

				if(ch > temp.ch)						// if the incoming character is greater than the held character
				{
					last = temp;							//used as the previous state
					temp = temp.next; 				// this is the next state
				}

			}

			last.next = incoming; 				//insert new char after last state 
			incoming.next = temp; 				//set new nodes next to next which holds the next letter
			incoming.previous = last;			// sets previous as the last value
			size++;												//increase size by 1
		}

	}

	public boolean isEmpty()				//method to chcek if empty
	{
		return (head == null);				// return true if empty, false if not
	}

	public char removeFirst()			//method to remove first
	{
		if (!isEmpty())								//if the list isnt empty 
		{
			Node temp = head.next;			//temp set to node is pos 2
			char removed = head.ch;			// set a char called removed to the char held in pos 1
			head = temp;								// set head to temp which is second position
			size--;											// reduce size by 1
			return removed;							// return removed character
		}
		else																				// else if list is empty
		{
			System.out.println("List is empty");			// print list is empty
			return '?';																//return a ? mark
		}	
	}

	public char removeLast()										//method to remove last character
	{
		if (!isEmpty())														//if the list isnt empty
		{
			Node temp = tail.previous;							// set temp to the node before the end
			char removed = tail.ch;									// set removed as the last character 
			tail = temp;														// tail set to the node before tail
			size --;																// decrease size by 1
			return removed;													// return removed character
		}
		else																			// if the list is empty
		{
			System.out.println("List is empty");		// print that the list is empty
			return '?';															// return a ?
		}
	}

	public void printList()											// method to print the list
	{
		Node temp = head;													// set a temp node as head 
		for (int i = 0; i < size; i++)						// run while there is nodes in the list
		{
			System.out.print(temp.ch + " ");				// print the character of temp
			temp = temp.next;												// set temp to the next node
		}

		System.out.println(" ");									// print a space between characters
	}	

}
