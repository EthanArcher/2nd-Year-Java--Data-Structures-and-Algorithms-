import java.util.*;

 
public class CompareEmployeesTest{
 
	public static void main(String args[]){
 

		List<HourlyEmployee> employeelist = new ArrayList<HourlyEmployee>();
 //Create 10 new HourlyEmployees
		HourlyEmployee emp1 = new HourlyEmployee("Joe", 20, 6.0);
		HourlyEmployee emp2 = new HourlyEmployee("al", 30, 4.0);
		HourlyEmployee emp3 = new HourlyEmployee("Maire", 15, 5.5);
		HourlyEmployee emp4 = new HourlyEmployee("Xavier", 12, 5.5);
		HourlyEmployee emp5 = new HourlyEmployee("Alice", 17, 6.0);
		HourlyEmployee emp6 = new HourlyEmployee("Adam", 18, 6.0);
		HourlyEmployee emp7 = new HourlyEmployee("Ken", 27, 5);
		HourlyEmployee emp8 = new HourlyEmployee("Zandra",30, 4.5 );
		HourlyEmployee emp9 = new HourlyEmployee("Rian", 30, 4.5);
		HourlyEmployee emp10 = new HourlyEmployee("Michael", 17, 6.0);
	
	
//add them to the ArrayList
		employeelist.add(emp1);
		employeelist.add(emp2);
		employeelist.add(emp3);
		employeelist.add(emp4);
		employeelist.add(emp5);
		employeelist.add(emp6);
		employeelist.add(emp7);
		employeelist.add(emp8);
		employeelist.add(emp9);
		employeelist.add(emp10);
//print out unsorted list
		for(HourlyEmployee temp: employeelist)
		{
		    System.out.print(temp.toString());
			System.out.println("\t\t" + temp.getHoursWorked());
		}			
//sort the ArrayList
       Collections.sort(employeelist);
//print out sorted list
		for(HourlyEmployee temp: employeelist)
		{
		    System.out.print(temp.toString());
			System.out.println("\t\t" + temp.getHoursWorked());
		}
		
 
	}
}	
