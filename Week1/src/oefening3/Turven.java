package oefening3;

import java.util.Random;

public class Turven {

	public static void main(String[] args) 
	{
		//Maak een integer-array en noem dit array aantalKeer. 
		//Elk hokje van dit array wordt gebruikt voor het turven van een bepaald aantal ogen.		
		//int aantalKeer[][] = new int[18][];
		int aantalKeer[] = new int[18];
		
		//Simuleer 200 random worpen met 3 dobbelstenen en turf de waarden m.b.v. het array aantalKeer.
		Random generator = new Random();
		int dice = generator.nextInt( 6) + 1;
		for (int i = 0; i < 200; i++)
		{
			int gegooid = 0;
			
			for (int j = 0; j < 3; j++) 
			{
				dice = generator.nextInt( 6) + 1;
				gegooid = dice + gegooid;
			}
			aantalKeer[gegooid - 1] += 1;
		}
		
		//Toon de geturfde waarden in de console, waarbij elk kruisje een worp voorstelt.
		int nummer = 1;
		for (int i = 0; i < aantalKeer.length; i++) 
		{			
			System.out.print(nummer + " :");
			nummer++;
			for (int j = 0; j < aantalKeer[i]; j++) 
			{
				System.out.print(" X ");
			}
			System.out.println();
		}
	}
}
