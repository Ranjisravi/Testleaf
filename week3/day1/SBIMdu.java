package week3.day1;

public class SBIMdu extends SBIHO
{
	public void fixedDeposit() {
		System.out.println("10%");
	}

	public static void main(String[] args) {
		SBIMdu sm = new SBIMdu();
		
		SBIHO sh = new SBIHO();
		
		sh.fixedDeposit();
		
		sm.fixedDeposit();

	}


}
