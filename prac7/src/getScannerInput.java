
import java.util.*;

public class getScannerInput
{  
static Scanner in = new Scanner(System.in);
public static String aString(String s)
{
	System.out.print(s);
	String name = "";  
	if (in.hasNextLine()) 
		name = in.nextLine();
	return name;
	
}

public static int anInt(String s)
{
	System.out.print(s);
	int age = 0;  
	if (in.hasNextLine()) 
	{
		String inputAge = in.nextLine();
		age = Integer.parseInt(inputAge);
	}
	return age;
}

public static double aDouble(String s)
{
	System.out.print(s);
	double d = 0.0;  
	if (in.hasNextLine()) 
	{
		String inputDouble = in.nextLine();
		d = Double.parseDouble(inputDouble);
	}
	return d;
}
}