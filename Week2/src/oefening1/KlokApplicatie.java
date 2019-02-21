package oefening1;

import java.util.Scanner;

import javax.swing.Timer;

public class KlokApplicatie
{

	public static void main(String[] args)
	{
//		Normale klok
//		KlokModel klokModel = new KlokModel();
//		KlokConsoleView view = new KlokConsoleView(klokModel);
//
//		klokModel.addObserver(view);
//
//		Timer tijd = new Timer(1000, new TimeController(klokModel));
//
//		tijd.start();
		
//		Wereld klok
		WereldKlokModel klokModel = new WereldKlokModel();
		klokModel.setUren(klokModel.gmtVerschil);
		KlokConsoleView view = new KlokConsoleView(klokModel);
		
		klokModel.addObserver(view);

		Timer tijd = new Timer(1000, new TimeController(klokModel));

		tijd.start();

		waitForEnter();
	}

	@SuppressWarnings("resource")
	private static void waitForEnter()
	{
		new Scanner(System.in).nextLine();
		System.exit(0);
	}
}
