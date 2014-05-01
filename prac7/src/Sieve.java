/*
 * Author: Ethan Archer
 * Student Number: 40076614
 * 
 */

public class Sieve {
	
		static final int LOWERRANGE = 1;
		static final int UPPERRANGE = 50;
		static final int NOTAMEMBER = 0;	
		SetInt primes = new SetInt();
		SetInt interx = new SetInt();
		
	public Sieve()
	{
		for(int i = 2; i<49;i=i+1)
		{
			primes.add(i);																		// add all values from 2-49
		}
		
		for(int j = 2; j*j<UPPERRANGE; j++)									//for each of the possible factors
		{
			if (primes.in(j))																	// if the factor is still in the prime set
			{
				for (int mult= j; j*mult <= UPPERRANGE; mult++)	// for each multiple of the factor
				{
					primes.remove(j*mult);												// remove all multiples of the factor
				}
			}
		}
		
		System.out.println("The primes are  " );						// print out the primes
		primes.printNumbers();
		
	}
	
	public void factors(int a)
	{
		if ((a <= UPPERRANGE) && (a >= LOWERRANGE))				// if a is less than the UPPERRANGE and greater than LOWERRANGE
		{
			SetInt factors = new SetInt();
			if(primes.in(a))																// if a is a prime number 
			{
				System.out.print("Factors are " + LOWERRANGE + " " + a); // factors are 1 and a 
				System.out.println("");
			}
			else
			{
					for(int i=1; i<=a; i++)
					{
						if (a%i == 0)																	// if a is completely divisable by i
						{
							factors.add(i);															// add i to the list of factors
						}
					}
					System.out.println("The factors are ");					
					factors.printNumbers();													// print out the factors
					System.out.println("");
					System.out.println("The prime factors are ");
					interx=factors.intersection(primes);						// set interx to be the factors which are prime
					interx.printNumbers();													// print prime factors
					System.out.println("");
			}
		}

	}
	
	public static void main (String args[])
	{
		int a = 0;
		String input = "";
		
		Sieve primeSet = new Sieve();
		System.out.println("");
		
		while(true)
		{
			System.out.println("Insert a number  " );
			a = getScannerInput.anInt(input);							// set a to be he inserted number
			System.out.println("Inserted " + a);
			primeSet.factors(a);													// print the factors of a
		}
	}
}
