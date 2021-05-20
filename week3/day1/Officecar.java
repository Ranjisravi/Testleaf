package week3.day1;

public class Officecar
{
	
	public void soundHorn()
	{
		System.out.println("sound horn");

	}

	public static void main(String[] args)
	{
		
		Owncar oc = new Owncar();
		oc.applyBrake();
		
		Officecar offCar = new Officecar();
		offCar.soundHorn();
	}
}