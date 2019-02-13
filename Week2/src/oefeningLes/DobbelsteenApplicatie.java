package oefeningLes;

import java.util.Scanner;

public class DobbelsteenApplicatie
{
	
	public DobbelsteenApplicatie()
	{
		Dobbelsteen steen = new Dobbelsteen();
		//DobbelsteenConsoleView view = new DobbelsteenConsoleView(steen);
		
		
		Worp worp = new Worp(5);
		
		WorpView view = new WorpView(worp);
//		
//		while (true)
//		{
//			worp.werp();
//			view.refresh();
//		}
//		
		waitForEnter();
	}
	
	public static void main( String[] args )
	{
		new DobbelsteenApplicatie();
		
	}
	
	private void waitForEnter()
	{
		new Scanner(System.in).nextLine();
		System.exit(0);
	}
}
