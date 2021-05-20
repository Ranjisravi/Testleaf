package week3.day2;

public class IOB implements RBI
{

	public void minimunbalance() 
	{
		System.out.println("Minimum Balance : 5000");
	
	}

	public void maxLoanAmount()
	{
		System.out.println("Maximun Loan Amount: 1000000");
	
	}
	public static void main(String[] args)
	{
		IOB iob = new IOB();
		
		iob.maxLoanAmount();
		
		iob.minimunbalance();
	}
}