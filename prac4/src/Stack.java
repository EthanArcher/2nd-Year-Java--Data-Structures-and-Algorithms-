public class Stack extends Csc2001LinkedList{
		
	public void push(char c)
	{
		addFirst(c);
	}
	
	public char pop()
	{
		return removeFirst();
	}
	
	public char peek()
	{
		char top = getHead().ch;
		return top;
	}
	
	public boolean empty()
	{
		return isEmpty();
	}
	
	public int count()
	{
		return size;
	}

}
