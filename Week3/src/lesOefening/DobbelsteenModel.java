package lesOefening;

import java.util.Random;

//model
public class DobbelsteenModel
{
	
	private int waarde;
	private static final Random generator = new Random();
	
	public DobbelsteenModel()
	{
		werp();
	}
	
	public void werp()
	{
		waarde = generator.nextInt( 6 ) + 1;
	}
	
	public int getWaarde()
	{
		return waarde;
	}
}
