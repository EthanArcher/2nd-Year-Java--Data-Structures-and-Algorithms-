
public class Palindrome {
	
	public static void main(String[] args)
	{
		Queue ADT = new Queue(10);
		Stack myStack = new Stack();
		
		ADT.enQueue('n');
		ADT.enQueue('a');
		ADT.enQueue('v');
		ADT.enQueue('a');
		ADT.enQueue('n');
		
		myStack.push('n');
		myStack.push('a');
		myStack.push('v');
		myStack.push('a');
		myStack.push('n');
		
		System.out.println(isPalindrome(ADT, myStack));
	}
	
	public static boolean isPalindrome(Queue aQueue, Stack aStack)
	{
		int check = 0;
		int total = aQueue.size();
		
		for (int i=0; i<total;i++)
		{
			if (aQueue.deQueue() == aStack.pop())
			{
				System.out.println("same");
				check++;
			}
			else System.out.println("Different");
		}
		
		if (check == total) return true;
		else return false;
	}
	
	
	

}
