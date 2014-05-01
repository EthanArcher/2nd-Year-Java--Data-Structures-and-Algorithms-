public class FullTimeEmployee implements Employee
{   
    protected String name;

    protected double grossPay;
    
    protected static int count = 0;

         
    /**
     *  Initializes this FullTimeEmployee object to have an empty string for the
     *  name and 0.00 for the gross pay. Increments count.
     * 
     */    
    public FullTimeEmployee()
    {
         final String EMPTY_STRING = "";

         name = EMPTY_STRING;
         grossPay = 0.00;
         count++;
    } // default constructor 

     
    /**
     *   Returns the name of this FullTimeEmployee object.     
     *
     *  @return the name of this FullTimeEmployee object.
     * 
     */
    public String getName()
    {
        return name;
    } // method getName
    
    
    /**
     *   Returns the gross pay of this FullTimeEmployee object.     
     *
     *  @return the gross pay of this FullTimeEmployee object.
     * 
     */
    public double getGrossPay()
    {
        return grossPay;
    } // method getGrossPay

    
    /**
     *   Returns the count of employees.     
     *
     *  @return count.
     * 
     */
    public int getCount()
    {
        return count;
    } // method getGrossPay


    /**
     *  Returns a String representation of this FullTimeEmployee object with the 
     *  name followed by a space followed by a dollar sign followed by the gross 
     *  weekly pay, with two fractional digits (rounded), followed by "  FULL TIME".
     *
     *  @return a String representation of this FullTimeEmployee object.
     *
     */  
    public String toString()
    {       
       final String EMPLOYMENT_STATUS = " FULL TIME";
        
         return name + MONEY.format (grossPay) + EMPLOYMENT_STATUS +" Employee Count  " + getCount(); 
         // the format method returns a String representation of grossPay.   
    } // method toString

} // class FullTimeEmployee
