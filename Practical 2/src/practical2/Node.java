package practical2;

/*@author Ethan Archer
 * 				40076614
 * 
 * 
 * 
 */

public class Node
{

	protected char ch;				//creates protected char ch
	protected Node next;			//creates protected Node next
	protected Node previous;	//creates protected Node previous

	public Node (char ch)			// constructor
	{
		this.ch = ch;						// ch = ch
		this.next = null;				// next set to null
		this.previous = null;		// previous set to null
	}
}	
