package week3.day2;

public class PNB implements RBI, CIBILScore 
{

	public void creditScore() {
		System.out.println("Credit score: 8");
		
	}

	public void minimunbalance() 
	{
		System.out.println("Minimun balance: 3000");
	}

	public void maxLoanAmount() 
	{
		System.out.println("Maximun Loan AMount: 250000");
	}
	
	public static void main(String[] args)
	{
		PNB pnb = new PNB();
		
		pnb.creditScore();
		pnb.maxLoanAmount();
		pnb.minimunbalance();
	}
}