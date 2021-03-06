package groteOefening;

import java.util.Random;

public class LifeModel 
{
	//Geef de klasse LifeModel een attribuut grid voor het	opslaan van de cellen.
	//Gebruik voor grid een boolean-array met 20 rijen van 30 cellen.
	boolean grid[][] = new boolean[20][30];
	boolean newGrid[][] = new boolean[20][30];
	
	public LifeModel()
	{
		Random generator = new Random();
		for (int i = 0; i < grid.length; i++) 
		{
			for (int j = 1; j < grid[i].length - 1; j++) 
			{
				//boolean cel = generator.nextBoolean();
				// 20% kans op true bron: https://stackoverflow.com/questions/17359834/random-boolean-with-weight-or-bias
				boolean cel = (generator.nextInt(5) == 0) ? true : false; 
				grid[i][j] = cel;
			}
		}
		volgendeGeneratie();
	}
	
	//Geef de klasse LifeModel een boolean-methode isLevend om te bepalen of een bepaalde cel in leven is.
	public boolean isLevend(int rij, int kolom)
	{
		if (grid[rij][kolom]) 
		{
			return true;	
		}
		return false;
	}
	
	//Geef de klasse LifeModel een methode toon() om het grid in de console te tonen.
	//Maak hierbij gebruik van de methode isLevend van de klasse LifeModel.
	//X = leven, . = dood
	public void toon()
	{
        for (int i=0; i<grid.length; i++) 
        { 
            for (int j=0; j<grid[i].length; j++)
            {
            	if (grid[i][j]) 
            	{
					System.out.print(" X ");
				}
            	else 
            	{
            		System.out.print(" . ");
				}
            }
            System.out.println(); 
        }
        
        System.out.println();         
        
        for (int rij=0; rij<newGrid.length; rij++) 
        { 
            for (int kolom=0; kolom<newGrid[rij].length; kolom++)
            {
            	if (newGrid[rij][kolom]) 
            	{
					System.out.print(" X ");
				}
            	else 
            	{
            		System.out.print(" . ");
				}
            }
            System.out.println(); 
        }
	}
	
	//Maak een hulp-methode telBuren.
	private int telBuren( int rij, int kolom )
	{
		
		int levendeBuren = 0;
        for (int i = rij - 1 ; i <= rij + 1; i++) 
        { 
        	// moet ik alleen buren tellen bij een levende cel?
        	//if (isLevend(rij, kolom)) 
        	//{
        		if (i >= 0 && i < grid.length)
            	{
            		for (int j = kolom -1; j <= kolom + 1; j++)
                    {
                    	if (j >= 0 && j < grid[i].length) 
                    	{
                    		if (i != rij || j != kolom) 
                    		{
    							if (grid[i][j] == true) 
    							{
    								levendeBuren++;
    							}
    						}
    					}
                    }
            	}    
			//}
        }
		return levendeBuren;
	}
	
	public void test() 
	{
        for (int rij=0; rij<grid.length; rij++) 
        { 
            for (int kolom=0; kolom<grid[rij].length; kolom++)
            {
            	System.out.println("rij: " + rij + ", kolom: " + kolom + ", buren " + telBuren(rij, kolom));
            	System.out.println("oud: " + isLevend(rij, kolom) + ", nieuw: " +  evolueer( rij, kolom ));
            }
        }
	}
	
	//Deze methode retourneert de nieuwe toestand van een cel (dood of levend).
	private boolean evolueer( int rij, int kolom ) 
	{
		if (isLevend(rij, kolom)) {
			if (telBuren(rij, kolom) == 2 || telBuren(rij, kolom) == 3) 
			{
				return true;
			}
		}
		else {
			if (telBuren(rij, kolom) == 3) 
			{
				return true;
			}
		}
		return false;
	}
	
	//In deze methode implementeren we het algoritme voor het genereren van een volgende generatie.
	public void volgendeGeneratie()
	{
		for (int rij = 0; rij < grid.length; rij++) 
		{
			for (int kolom = 0; kolom < grid[rij].length; kolom++) 
			{
				if (evolueer(rij, kolom)) 
				{
					newGrid[rij][kolom] = true;
				}
				else 
				{
					newGrid[rij][kolom] = false;
				}
			}
		}
	}
}
