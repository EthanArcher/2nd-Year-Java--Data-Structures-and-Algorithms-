package practical;

class Node<E>
{
	protected E data;
	protected Node<E> next;
 
	/**
   * Construct a node with the given character value 
   * @param c - The character 
    */
	
	public Node (E data)
	{
		this.data = data;
		this.next = null;
	}
}	

public class Csc2001LinkedListG<E>
{  /** A reference to the head of the list */
	protected Node<E> head;
	/**
   * Construct a new empty list 
    */
	
	public Csc2001LinkedListG()
	{		
   head = null;
	}
	
	public Node<E> getHead()
	{
		return head;
	}
	
/**
 *Insert the first object into the list
 *@param E The object to be inserted
 */

	public void addFirst(E data)
	{
		head=new Node<E>(data);			
	}
	
/**
 *Insert an object at the end of the list 
 *@param E The object to be inserted
 */

	public void addAtEnd(E data)
	{
		Node<E> temp = head;
		
		while (temp.next!= null){
			temp = temp.next;
		}
		temp.next = new Node<E> (data);
	}
	
/** check if the list is empty
 *@return true if the list is empty
 */
 public boolean isEmpty()
	{
	 	if (head == null){
	 		return true;
	 		
	 	}
	 	else return false;
	}
/**
 *removes the object from the head of the list 
 *@returns E The first object
*/
   	
	public E removeFirst() 
	{
		Node<E> temp = head;
		head = head.next;
		return temp.data;
	//your code here
	}
	
	/**
	 *Obtain a String representation of the list
	 *@return A String representation of the list
    */
    
	public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node p = head;
        if (p != null) {
            while (p.next != null) {
                sb.append(p.data.toString());
                sb.append(" ==> ");
                p = p.next;
            }
            sb.append(p.data.toString());
        }
        sb.append("]");
        return sb.toString();
    }

}

	


     

