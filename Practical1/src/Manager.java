public class Manager extends FullTimeEmployee

{

protected double annualSalary;

public Manager (String name, char Q) {
	
	this.name = name;
	char qual = Q;
	
	if (qual == 'D'){
		annualSalary = 40000;	
	}
	
	if (qual == 'A'){
		annualSalary = 35000;		
	}
	
	if (qual == 'G'){
		annualSalary = 30000 ;		
	}
	
	grossPay = annualSalary / 52;
	
}

}
