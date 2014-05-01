
public class Practical1 {
	
	public static void main (String[] args){
		
		FullTimeEmployee emp1, emp4;
		
		emp1 = new FullTimeEmployee();
		emp4 = new FullTimeEmployee();
		
		System.out.println(emp4.toString());
		System.out.println(emp1.toString());
		
		HourlyEmployee jim = new HourlyEmployee("Jim", 70, 5.50);

		System.out.println(jim.toString());

		System.out.println("Regular Pay : " +jim.getRegularPay() + " Overtime Pay : " + jim.getOvertimePay());

		Manager joe = new Manager("Joe", 'D');

		System.out.println(joe.toString());

		HourlyEmployee jane = new HourlyEmployee("Jane", 30, 5.00);

		System.out.println(jane.toString());

		System.out.println("Regular Pay : " +jane.getRegularPay() + " Overtime Pay : " + jane.getOvertimePay());

		Manager jill = new Manager("Jill", 'A');

		System.out.println(jill.toString());
		
	}

}
