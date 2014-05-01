package practical2;

/*@author Ethan Archer
 * 				40076614
 * 
 * 
 * 
 */

import java.io.*;

public class Reverser {

	public static void main(String[] args)
	{
		Stack aStack = new Stack();												// new stack aStack
		
		try
		{
			File inputFile = new File("fruit.txt");					// find file fruit.txt
			FileReader in = new FileReader(inputFile);			// in set as reader for the file
			
			int temp = in.read();														// temp to hold value from in.read
			char c = (char) temp;														// cast temp to a char
		
			 while (temp != -1)															// while not at the end of the file
			 {
				 aStack.push(c);															// push to the stack
				 temp = in.read();														// read next int
				 c = (char) temp;															// cast that the the char
			 }

			 in.close();																		// close the file 
			 
		while (aStack.count() != 0)												// while the stack isnt empty
		{
			System.out.print(aStack.pop());									//print the popped char
		}
		}
		
		catch (IOException e)															// catch if file not found
		{
			System.out.println("Bad!");											// print bad
		}
	}	
}
