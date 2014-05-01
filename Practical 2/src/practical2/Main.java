package practical2;

/*@author Ethan Archer
 * 				40076614
 * 
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		Csc2001LinkedList myList = new Csc2001LinkedList();		// make a new list called myList
		
		System.out.println("Is the List Empty?");							// check is the list empty
		System.out.println(myList.isEmpty());									// check is the list empty
		System.out.println(" "); 															// print empty line
		
		myList.addFirst('b');																	// add the the start of the list
		myList.addFirst('a');																	// add the the start of the list
		System.out.println("This is the List");								// print line
		myList.printList();																		// print whats in the list
		System.out.println(" "); 															// print empty line
		
		System.out.println("This is adding to the end of the list");				// print line
		System.out.println("This is the List");								// print line
		myList.addAtEnd('c');																	// add at the end of the list
		myList.printList();																		// print whats in the list
		System.out.println(" "); 															// print empty line
		
		System.out.println("This is adding to the end of the list");				// print line
		System.out.println("This is the List");								// print line
		myList.addAtEnd('e');																	// add at the end of the list
		myList.addAtEnd('f');																	// add at the end of the list
		myList.printList();																		// print whats in the list
		System.out.println(" "); 															// print empty line

		System.out.println("This is adding in order to the list");				// print line
		System.out.println("This is the List");								// print line
		myList.addInOrder('d');																// add the letter d in order
		myList.printList();																		// print whats in the list
		System.out.println(" "); 															// print empty line
		
		System.out.println("This is the removing bit");				// print line
		System.out.println("Next line shows character that should be removed" );		// print line
		System.out.println(myList.removeFirst());							// remove first charcter
		System.out.println("This is the List");								// print line
		myList.printList();																		// print whats in the list
		System.out.println("Next line shows character that should be removed" );		// print line
		System.out.println(myList.removeLast());							// remove the last character
		System.out.println("This is the List");								// print line
		myList.printList();																		// print whats in the list
		System.out.println("Character in Head is " + myList.getHead().ch);	// print line
		System.out.println("Character in Tail is " + myList.getTail().ch);	// print line

	}

}
