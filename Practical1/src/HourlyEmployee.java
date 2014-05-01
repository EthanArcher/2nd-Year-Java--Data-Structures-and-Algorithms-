public class HourlyEmployee extends FullTimeEmployee

{

protected int hoursWorked;

protected double payRate, regularPay, overtimePay;

public HourlyEmployee (String name, int hoursWorked, double payRate)

{ 
	this.name=name;
	this.hoursWorked= hoursWorked;
	this.payRate= payRate;
	
	if (hoursWorked <= 40){
		regularPay = hoursWorked * payRate;
		grossPay = regularPay;
		
	}
	
	else if (hoursWorked > 40){
		regularPay = 40 *payRate;
		overtimePay = (hoursWorked - 40) * 1.5 * payRate;
		grossPay  = regularPay + overtimePay;
	}


}

public double getRegularPay(){

	return regularPay;	
	}


public double getOvertimePay(){
	
	return overtimePay;
	}

}
