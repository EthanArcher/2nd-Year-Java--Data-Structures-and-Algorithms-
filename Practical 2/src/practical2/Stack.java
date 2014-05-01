package practical2;

/*@author Ethan Archer
 * 				40076614
 * 
 * 
 * 
 */

public class Stack extends Csc2001LinkedList{
		
	public void push(char c)	//push uses add first method to add at top
	{
		addFirst(c);
	}
	
	public char pop()					//pop uses remove first method 
	{
		return removeFirst();
	}
	
	public char peek()				// peek uses getHead method to view top character
	{
		char top = getHead().ch;
		return top;
	}
	
	public boolean empty()	// check is empty suing isEmpty()
	{
		return isEmpty();
	}
	
	public int count()		// count returns size
	{
		return size;
	}

}
