/*
 * Author: Ethan Archer
 * Student Number: 40076614
 * 
 */

public class TestSetInt
{
	public TestSetInt()
	{
		SetInt test1 = new SetInt();
		SetInt test2 = new SetInt();
//		adding numbers to the 2 sets
		for(int i = 2; i<49;i=i+3)
			test1.add(i);
		System.out.println();
//		testing printing
		System.out.println("The first set is  " );
		test1.printNumbers();
		
		for(int i = 2; i<49;i=i+4)
			test2.add(i);
		System.out.println();
		test2.add(49);
		System.out.println("The second set is  " );
			test2.printNumbers();
		System.out.println();
//		testing set size
		int card = test2.size();
		System.out.println("The cardinality of the second set is : " + card);
		System.out.println();
//		testing in		
	    if (test2.in(4))
	    	System.out.println("4 is in the set");
	    else
	    	System.out.println("4 is not in the set");
	    	
//		testing min	    	
		int minimum = test2.min();
		System.out.println("The smallest value in the second set is : " + minimum);
		System.out.println();
//		testing intersection			
		SetInt interx = new SetInt();
		interx=test2.intersection(test1);
		System.out.println("The intersection of the first and second set is : ");
		interx.printNumbers();
		System.out.println();
//		testing union		
		SetInt unionx = test1.union(test2);
		System.out.println("The union of the first and second set is : ");
		unionx.printNumbers();
		System.out.println();
//		testing remove		
		for(int i = 2; i<49;i=i+3)
		test1.remove(i);
		if (test1.size()==0) System.out.println("The first set is now empty");
	
	}

	public static void main (String args[])
	{
		TestSetInt prac2 = new TestSetInt();	
	}
}
