package week3.day2;

public class SBI implements RBI
{

	public void minimunbalance() 
	{
		System.out.println("Minimun balance: 1000");
	}

	public void maxLoanAmount() 
	{
		System.out.println("Maximun Loan AMount: 200000");
	}
	
	public static void main(String[] args)
	{
		SBI sbi = new SBI();
		
		sbi.maxLoanAmount();
		
		sbi.minimunbalance();
	}
}