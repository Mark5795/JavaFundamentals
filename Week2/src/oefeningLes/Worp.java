package oefeningLes;

//set of dice == model
public class Worp extends Observable
{
	private Dobbelsteen[] stenen;
	
	Dobbelsteen dobbelsteen = new Dobbelsteen();
	
	public Worp(int aantal)
	{
		stenen = new Dobbelsteen[aantal];
		
		for( int i = 0; i < aantal; i++ )
		{
			stenen[i] = new Dobbelsteen();
		}
		
		werp();
	}
	
	//hij werpt al
	public void werp() 
	{
		dobbelsteen.werp();
	}
	
	public int getWaarde() 
	{
		return dobbelsteen.getWaarde();
	}
	
	public int getAantalStenen() 
	{ 
		int aantal = 0;
		for (int i = 0; i < stenen.length; i++)
		{
			aantal++;
		}
		return aantal;
	}
	
	public Dobbelsteen getDobbelsteen(int nummer) 
	{  
		return stenen[nummer];
	}
}
