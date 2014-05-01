/*
 * Author: Ethan Archer
 * Student Number: 40076614
 * 
 */

public class SetInt {

	static final int LOWERRANGE = 1;
	static final int UPPERRANGE = 50;
	static final int NOTAMEMBER = 0;
	protected int[] setArray;
	protected int[] intersection = new int[UPPERRANGE];

	public SetInt()
	{
		setArray = new int[UPPERRANGE]; 						//create an array setArray of size UPPERRANGE 
	}

	/*returns the number of ints in this set
	 *@returns an int count
	 */

	public int size()
	{
		int count = 0;
		
		for (int i : setArray)
		{
			if (setArray[i] != NOTAMEMBER)					// if a member is found increment count
			{
				count++;															// increment count
			}
		}
		return count;															// return count which will now hold the size
	}

	/* testing if a value is a member of the set
	 *@param a the value we are looking for
	 *@return true if a is in the set, false otherwise
	 */

	public boolean in(int a)
	{
		int tester;

		for (int i : setArray)
		{
			if (setArray[i] != NOTAMEMBER)
			{
				tester = setArray[i];					// set tester to the value held in a
				
				if (tester == a)
				{
					return true;								// if tester is a then return true
				}
			}
		}
		return false;											// a was not found
	}

	/* add a to the set in the correct position
	 *@param a the value to be added
	 **/	

	public void add(int a)
	{
		if ((a<=UPPERRANGE) && (a>=LOWERRANGE))						// if a is inside the range of the array
		{
			setArray[a] = a; 																// set the position of a to hold the value of a
		}
	}

	/*	 prints the set of numbers currently in the set
	 */
	public void printNumbers()
	{
		for (int i : setArray)
		{
			if (setArray[i] != NOTAMEMBER)
			{
				System.out.print(setArray[i] + " ");				// if there is a value held in the array then print it
			}
		}
	}

	/* remove an int from the set
	 * @param a the int to be removed
	 */

	public void remove(int a)
	{
		for (int i : setArray)
		{
			if (setArray[i] != NOTAMEMBER)
			{					
				if (a == (int) setArray[i])						// if a is the value held in the array	
				{
					setArray[i] = NOTAMEMBER;						// set the value of a to NOTAMEMBER
				}
			}
		}
	}	

	/* return the minimum value in the set
	 * @return the minimum value
	 */

	public int min()
	{
		for (int i : setArray)	
		{
			if (setArray[i] != NOTAMEMBER)				// if there is a value held
			{
				return setArray[i];									// return the first value held as this will be the smallest
			}
		}
		return NOTAMEMBER;											// if the array is empty
	}
	
	/* returns the set of ints common to both
	 * the set passed in as an argument and the set the
	 * method is called on
	 * @param anySet - the set to be intersected
	 * @return a set containing the result of the intersection
	*/
		
	public SetInt intersection(SetInt anySet)
	{
		SetInt intersection = new SetInt();			// creates an set to hold the values of intersection
		
		for (int i : setArray)									// for each value in the setArray
		{
			if (setArray[i] != NOTAMEMBER)				// if NOTAMEMBER
			{
				if (anySet.in((int) setArray[i]))				// if the value held in the array is in anySet
				{
					intersection.add((int) setArray[i]);	//add to the set intersection
				}
			}
		}
		return intersection;										// return the intersection set
	}
	
	/* returns the set of ints which are in either the 
	 * set passed in as an argument or the set the method
	 * is called on
	 * @param anySet - one of the sets in the union
	 * @return a set containing the result of the union
	*/
	
	public SetInt union(SetInt anySet)
	{
		SetInt union = new SetInt();
		union = anySet;												// union is now the same as the set passed in

		for (int i : setArray)
		{
			if (setArray[i] != NOTAMEMBER)
			{
				union.add((int) setArray[i]);			// add the value in the array to the set union
			}
		}
		return union;													// return the set union
	}
}
