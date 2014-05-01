public class findsqroot 
{
	
	public void sqroot(double n)
	{
		double low = 0;
		double high = n;
		double mid = n/2;
		double check = (high - low);
		
		while (check > 0.0001)
		{	
			for (int i=0; i<10; i++)
			{
				
				if ((mid*mid) > (n))
				{
					high = (mid);
					mid = low + ((high - low)/2);
				}
				else if ((mid*mid) < (n))
				{
					low = mid;
					mid = mid + ((high-mid)/2);
				}
			}
			check = (high - low);
		}
		System.out.println("square root of " + n + " is " + mid);
	}
	
	double low = 0;
	double high = 0;

	public double squroot(double n, double guess)
	{
		if ((Math.abs((guess*guess) - n)) > 0.001)
		{	
			if ((guess*guess) > n)
			{
				high = guess;
				return squroot(n, low + ((high - low)/2));
			}
			else if ((guess*guess) < n)
			{
				low = guess;
				return squroot(n, guess + ((high-guess)/2));
			}
		}
		return guess;
	}

}
