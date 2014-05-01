
public class Queue {

	char[] holder;
	int front, maxsize, back, count;
	
	public Queue(int maxsize)
	{
		this.maxsize = maxsize;
		holder = new char[maxsize];
	}
	
	public void enQueue(char c)
	{
		if(back <= maxsize-1)
		{
//			System.out.println("empty");
			holder[back] = c;
			back++;
			count++;
		}
		else
		{
			System.out.println("full");
			
		}
	}
	
	public char deQueue()
	{
		char temp = holder[0];
		
		for (int i =0; i<count; i++)
		{
			holder[i] = holder[i+1];
		}
		
		back--;
		count--;
		return temp;
	}
	
	public boolean empty()
	{
		if(count == 0) return true;
		else return false;
	}
	
	public char front()
	{
		
		if (count != 0)
			{
			return holder[0];
			}
		else return ('?');
	}
	
	public int size()
	{
		return count;
	}
	
	public void print()
	{
		for (int i=0; i<count; i++)
		{
			System.out.println(holder[i]);
		}
	}
	
	public static void main(String[] args)
	{
		Queue ADT = new Queue(10);
		Stack myStack = new Stack();
		System.out.println(ADT.empty());
		ADT.enQueue('a');
		System.out.println(ADT.front());
		ADT.enQueue('b');
		ADT.enQueue('c');
		System.out.println(ADT.size());
		ADT.print();
		System.out.println(ADT.deQueue());
		ADT.print();
		ADT.print();
		System.out.println(ADT.deQueue());
		ADT.print();
		ADT.print();
		
		
		
		
	}

}
