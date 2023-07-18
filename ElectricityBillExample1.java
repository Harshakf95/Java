// Java implementation to calculate the
// electricity bill


class ElectricityBillExample1 
{
	// Function to calculate the
	// electricity bill
	public static int calculateBill(int units)
	{

		// Condition to find the charges
		// bar in which the units consumed
		// is fall
		if(units<=100) 
        {
			return units*7;
		}
		else if(units<=200) 
        {
			return (100*7)+(units-100)*15;
		}
		else if(units<=300) 
        {
			return (100*7)+(100*14)+(units-200)*14;
		}
		else if(units>300) 
        {
			return (100*7)+(100*15)+(100*20)+(units-300)*25;
		}
		return 0;
	}
	// Driver Code
	public static void main(String args[])
	{
		int units=274;

		System.out.println(
			calculateBill(units));
	}
}