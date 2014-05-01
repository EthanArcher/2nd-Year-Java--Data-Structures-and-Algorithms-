package practical2;

/*@author Ethan Archer
 * 				40076614
 * 
 * 
 * 
 */

public class StackTest {

	public static void main(String[] args) {
		
		Stack myStack = new Stack();										// create a new stack called myStack
		System.out.println("Is the Stack Empty?");			// check is the stack empty
		System.out.println(myStack.empty());						// check if empty
		System.out.println(" "); 												// print empty line
		
		myStack.push('c');															// push to stack
		myStack.push('d');															// push to stack
		myStack.push('e');															// push to stack
		System.out.println("This is the Stack");				// print line
		myStack.printList();														// print stack
		System.out.println(" "); 											  // print empty line
		
		System.out.println("Peek the top");							// print line
		System.out.println(myStack.peek());							// peek at the stack
		System.out.println(" "); 												// print empty line
		
		System.out.println("This is the Stack");				// print line
		myStack.printList();														// print stack
		System.out.println(" "); 												// print empty line
		
		System.out.println("Pop the top");							// print line
		System.out.println(myStack.pop());							// pops the stack
		System.out.println(" "); 												// print empty line
		
		System.out.println("This is the Stack");				// print line
		myStack.printList();														// print the stack
		System.out.println(" "); 												// print empty line
		
		System.out.println("Is the Stack Empty?");			// check is the stack empty
		System.out.println(myStack.empty());						// print true or false
		System.out.println(" "); 												// print empty line
		
		System.out.println("What size is the Stack");		// print line
		System.out.println(myStack.count());						// print the size
		

		

	}

}
