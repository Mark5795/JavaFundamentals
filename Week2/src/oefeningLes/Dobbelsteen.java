package oefeningLes;

import java.util.Random;

public class Dobbelsteen 
{
	
	private int waarde;
	private static final Random generator = new Random();
	
	public Dobbelsteen()
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
