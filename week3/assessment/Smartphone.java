package week3.assessment;

public class Smartphone extends Android
{
	@Override
	public void takeVideo() {
		System.out.println("video using smart phone");
	}

	
	public static void main(String[] args)
	{
		Smartphone sp  = new Smartphone();
		
		Android and = new Android();
		
		and.takeVideo();
		
		sp.takeVideo();
		
	}
}