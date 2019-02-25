package groteOefening;

import java.util.Scanner;

import javax.swing.Timer;

public class LifeApplication
{

	public static void main(String[] args)
	{
//		//Maak een instantie van de klasse LifeModel
		LifeModel lifeModel = new LifeModel();
//		
//		//Toon het gegenereerde grid in de console.
//		lifeModel.toon();
//		
//		//lifeModel.test();

//		Maak een instantie van de klasse LifeConsoleView op basis van het model en noem deze view.
		LifeConsoleView view = new LifeConsoleView(lifeModel);

//		In de loop in je main kan je nu volstaan met het afwisselen aanroepen van
//		model.volgendeGeneratie() en view.refresh().
//		view.refresh();
//		lifeModel.volgendeGeneratie();
		
		lifeModel.setRow(20);
		lifeModel.setColumn(30);
		lifeModel.initialize();
		
		
//		for (int i = 0; i < 5; i++)
//		{
//			view.refresh();
//			lifeModel.volgendeGeneratie();
//			System.out.println();
//			view.refresh();
//		}
		
//		In de loop in je main moet je nog wel een view aanmaken, maar je hoeft hem niet meer te refreshen. Dit
//		gebeurt nu nl. vanzelf via het Observer-Pattern.
//		for (int i = 0; i < 5; i++)
//		{
//			lifeModel.volgendeGeneratie();
//			System.out.println();
//		}
		
//		Maak een Timer aan, die luistert naar onze nieuwe LifeController.
		Timer tick = new Timer(1000, new LifeController(lifeModel));
		tick.start();
		waitForEnter();
	}
	
	@SuppressWarnings("resource")
	private static void waitForEnter()
	{
		new Scanner(System.in).nextLine();
		System.exit(0);
	}

}
